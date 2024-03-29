import Foundation

typealias Reducer<State, Event> = (_ state: State, _ event: Event) -> State

class MVIViewModel<State, Intent, Event>: ObservableObject {
    private var reducer: Reducer<State, Event>
    @Published private(set) var state: State

    init(reducer: @escaping Reducer<State, Event>, initialState: State) {
        self.reducer = reducer
        state = initialState
    }

    func send(intent _: Intent) {
        fatalError("You must override the send method")
    }

    func send(event: Event) {
        Task {
            await MainActor.run {
                state = reducer(state, event)
            }
        }
    }
}
