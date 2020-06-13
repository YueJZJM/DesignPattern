package observer.old;

public class MainForm {
    public void buttonClick() {
        MyProgressBar progressBar = new MyProgressBar();
        FileSplitter fileSplitter = new FileSplitter("path", 5, progressBar);
        fileSplitter.split();
    }

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.buttonClick();
    }
}
