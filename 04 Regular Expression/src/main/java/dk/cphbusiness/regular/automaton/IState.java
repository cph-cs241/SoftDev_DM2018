package dk.cphbusiness.regular.automaton;

public interface IState {

    enum State {
        IDLE, FALSE_STATE, LOGIN, LIST_ITEMS, EDIT_ITEM, LOGOUT
    }
    
    
    enum Symbol {
        A, B, C, D;
    }
    State symbolToState(Symbol sym);
    State getState();
    boolean isFinal();
    int getIndex();
}
