package worker;

public class MyInterfaceTaskError {
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
}
