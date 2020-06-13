package bridge.new1.perfect;

import bridge.new1.MessageImp;
import bridge.new1.Messager;

public class MessagerPerfect extends Messager {

    public MessagerPerfect(MessageImp messageImp) {
        this.mMessageImp = messageImp;
    }

    public void login(String username, String password) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerPerfect:login:" + username);
        mMessageImp.connect();
    }

    public void sendMessage(String message) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerPerfect:sendMessage:" + message);
        mMessageImp.writeText();
    }

    public void SendPicture(String url) {
        mMessageImp.playSound();
        //做一些操作
        System.out.println("MessagerPerfect:SendPicture:" + url);
        mMessageImp.drawShape();
    }
}
