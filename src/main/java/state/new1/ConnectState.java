package state.new1;

import state.new1.base.NetworkState;

public class ConnectState extends NetworkState {

    private ConnectState() {

    }

    private static class Holder {
        private static ConnectState INSTANCE = new ConnectState();
    }


    public static ConnectState getInstance() {
        return ConnectState.Holder.INSTANCE;
    }

    public NetworkState operation1() {
        return null;
    }

    public NetworkState operation2() {
        return null;
    }

    public NetworkState operation3() {
        return null;
    }
}
