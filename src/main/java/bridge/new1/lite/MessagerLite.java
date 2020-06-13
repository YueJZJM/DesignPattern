package bridge.new1.lite;

import bridge.new1.MessageImp;
import bridge.new1.Messager;

public class MessagerLite extends Messager {

    public MessagerLite(MessageImp messageImp) {
        this.mMessageImp = messageImp;
    }

    public void login(String username, String password) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerLite:login:" + username);
        mMessageImp.connect();
    }

    public void sendMessage(String message) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerLite:sendMessage:" + message);
        mMessageImp.writeText();
    }

    public void SendPicture(String url) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerLite:SendPicture:" + url);
        mMessageImp.drawShape();
    }
}
