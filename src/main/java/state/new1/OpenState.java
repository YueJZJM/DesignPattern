package state.new1;

import state.new1.base.NetworkState;

public class OpenState extends NetworkState {

    private OpenState() {

    }

    private static class Holder {
        private static OpenState INSTANCE = new OpenState();
    }


    public static OpenState getInstance() {
       return Holder.INSTANCE;
    }

    public NetworkState operation1() {
        //........
        return CloseState.getInstance();
    }

    public NetworkState operation2() {
        //........
        return ConnectState.getInstance();
    }

    public NetworkState operation3() {
        //........
        return OpenState.getInstance();
    }
}
