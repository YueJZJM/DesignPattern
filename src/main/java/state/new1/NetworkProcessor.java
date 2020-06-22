package state.new1;

import state.new1.base.NetworkState;

public class NetworkProcessor {
    NetworkState mState;

    NetworkProcessor(NetworkState state) {
        this.mState = state;
    }

    void operation1() {
        mState = mState.operation1();
    }

    void operation2() {
        mState = mState.operation2();
    }

    void operation3() {
        mState = mState.operation3();
    }
}
