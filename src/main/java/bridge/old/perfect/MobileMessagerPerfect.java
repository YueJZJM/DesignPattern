package bridge.old.perfect;

import bridge.old.base.MobileMessagerBase;

public class MobileMessagerPerfect extends MobileMessagerBase {
    public void login(String username, String password) {
        super.playSound();
        //做一些操作
        super.connect();
    }

    public void sendMessage(String message) {
        super.playSound();
        //做一些操作
        super.writeText();
    }

    public void SendPicture(String url) {
        super.playSound();
        //做一些操作
        super.drawShape();
    }
}
