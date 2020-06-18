package proxy;

public class ClientApp {
    ISubject subject;

    ClientApp(ISubject subject) {
        this.subject = subject;
    }

    void doWork() {
        subject.process();
    }

}
