package Controller;

import java.util.Stack;


public class CommandHistory {
    private Stack<Command> history = new Stack<Command>();
    private Stack<Command> redoStack = new Stack<Command>();

    public void push(Command c) {
        history.push(c);
        redoStack.clear();
    }

    public Command pop() {
        Command c = history.pop();
        redoStack.push(c);
        return c;
    }
    public Command redo() {
        if (redoStack.isEmpty()) return null;
        Command c = redoStack.pop();
        history.push(c);
        return c;
    }
    public boolean isEmpty() { return history.isEmpty(); }

}