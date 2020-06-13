package bridge.new1.base;

import bridge.new1.MessageImp;

public class MobileMessagerImp extends MessageImp {
    public void playSound() {
        System.out.println("MobileMessagerImp.PlaySound");
    }

    public void drawShape() {
        System.out.println("MobileMessagerImp.drawShape");
    }

    public void writeText() {
        System.out.println("MobileMessagerImp.writeText");
    }

    public void connect() {
        System.out.println("MobileMessagerImp.connect");
    }
}
