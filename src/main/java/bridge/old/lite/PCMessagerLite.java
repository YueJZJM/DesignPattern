package bridge.old.lite;

import bridge.old.base.PCMessagerBase;

//业务抽象，pc 平台精简版实现
public class PCMessagerLite extends PCMessagerBase {

    public void login(String username, String password) {
        super.connect();
        //登录操作
    }

    public void sendMessage(String message) {
        super.writeText();
        //发送消息
    }

    public void SendPicture(String url) {
        super.drawShape();
        //发送图片
    }
}
