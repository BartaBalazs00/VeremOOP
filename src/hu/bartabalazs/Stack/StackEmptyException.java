package hu.bartabalazs.Stack;

public class StackEmptyException extends RuntimeException{
    public StackEmptyException() {
        System.out.println("A verem üres, nem lehet kivenni belőle!");
    }
}
