package worker;

public class MyInterfaceTaskDone {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
}
