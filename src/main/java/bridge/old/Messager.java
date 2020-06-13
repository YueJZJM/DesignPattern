package bridge.old;

//消息基类
public abstract class Messager {
    public abstract void login(String username,String password);

    public abstract void sendMessage(String message);

    public abstract void SendPicture(String url);

    public abstract void playSound();
    public abstract void drawShape();
    public abstract void writeText();
    public abstract void connect();
}
