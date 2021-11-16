package hu.bartabalazs.Stack;

public class StackFullException extends RuntimeException {

    public StackFullException() {
        System.out.println("A verem tele van, nem lehet további elemet hozzáadni!");
    }
}
