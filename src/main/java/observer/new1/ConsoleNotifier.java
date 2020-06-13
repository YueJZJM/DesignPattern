package observer.new1;

public class ConsoleNotifier implements IProgressBar {

    public void doProgress(float value) {
        System.out.println("ConsoleNotifier:doProgress");
    }
}
