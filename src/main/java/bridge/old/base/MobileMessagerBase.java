package bridge.old.base;


import bridge.old.Messager;

public abstract class MobileMessagerBase extends Messager {
    public void playSound() {
        System.out.println("MobileMessagerBase.PlaySound");
    }

    public void drawShape() {
        System.out.println("MobileMessagerBase.DrawShape");
    }

    public void writeText() {
        System.out.println("MobileMessagerBase.WriteText");
    }

    public void connect() {
        System.out.println("MobileMessagerBase.Connect");
    }
}
