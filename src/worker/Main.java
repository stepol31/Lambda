package worker;

public class Main {
    public static void main(String[] args) {
        MyInterfaceTaskDone.OnTaskDoneListener listener = System.out::println;
        MyInterfaceTaskError.OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();

    }
}
