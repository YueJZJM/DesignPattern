package bridge.old.base;

import bridge.old.Messager;

public abstract class PCMessagerBase extends Messager {
    public void playSound() {
        System.out.println("PCMessagerBase.PlaySound");
    }

    public void drawShape() {
        System.out.println("PCMessagerBase.DrawShape");
    }

    public void writeText() {
        System.out.println("PCMessagerBase.WriteText");
    }

    public void connect() {
        System.out.println("PCMessagerBase.Connect");
    }
}
