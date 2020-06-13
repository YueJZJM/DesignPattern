package observer.new1;


public class MainForm implements IProgressBar {

    public void buttonClick() {
       FileSplitter fileSplitter = new FileSplitter("path", 5);
        ConsoleNotifier consoleNotifier = new ConsoleNotifier();
       fileSplitter.addIProgress(this);
       fileSplitter.addIProgress(consoleNotifier);
       fileSplitter.split();
       fileSplitter.removeIProgress(this);
       fileSplitter.removeIProgress(consoleNotifier);
    }

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();

        mainForm.buttonClick();
    }

    public void doProgress(float value) {
        System.out.println("MainForm:doProgress");
    }
}
