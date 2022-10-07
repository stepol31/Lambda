package worker;

public class Worker {
    private MyInterfaceTaskDone.OnTaskDoneListener callback;
    private MyInterfaceTaskError.OnTaskErrorListener errorCallback;

    public Worker(MyInterfaceTaskDone.OnTaskDoneListener callback, MyInterfaceTaskError.OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                System.out.println("Error");
            }
        }

    }
}
