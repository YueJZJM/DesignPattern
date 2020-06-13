package bridge.new1;

public abstract class Messager {

    protected MessageImp mMessageImp;

    public abstract void login(String username,String password);

    public abstract void sendMessage(String message);

    public abstract void SendPicture(String url);
}
