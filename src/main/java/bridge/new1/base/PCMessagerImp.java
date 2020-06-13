package bridge.new1.base;

import bridge.new1.MessageImp;

public class PCMessagerImp extends MessageImp {
    public void playSound() {
        System.out.println("PCMessagerImp.PlaySound");
    }

    public void drawShape() {
        System.out.println("PCMessagerImp.drawShape");
    }

    public void writeText() {
        System.out.println("PCMessagerImp.writeText");
    }

    public void connect() {
        System.out.println("PCMessagerImp.connect");
    }
}
