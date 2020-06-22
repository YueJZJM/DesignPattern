package state.new1;

import state.new1.base.NetworkState;

public class CloseState extends NetworkState {

    private CloseState() {

    }

    private static class Holder {
        private static CloseState INSTANCE = new CloseState();
    }


    public static CloseState getInstance() {
        return CloseState.Holder.INSTANCE;
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
