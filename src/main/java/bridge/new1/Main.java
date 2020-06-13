package bridge.new1;

import bridge.new1.base.PCMessagerImp;
import bridge.new1.lite.MessagerLite;

public class Main {
    public static void main(String[] args) {
        MessageImp messageImp = new PCMessagerImp();
        Messager messager = new MessagerLite(messageImp);
        messager.login("a","c");
    }
}
