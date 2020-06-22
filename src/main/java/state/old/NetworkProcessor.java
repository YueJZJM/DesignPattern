package state.old;

import static state.old.NetworkState.Network_Close;
import static state.old.NetworkState.Network_Connect;
import static state.old.NetworkState.Network_Open;

public class NetworkProcessor {
    NetworkState state;

    public void operation1() {
        if (state == Network_Open){

            //**********
            state = Network_Close;
        }
        else if (state == Network_Close){

            //..........
            state = Network_Connect;
        }
        else if (state == Network_Connect){

            //$$$$$$$$$$
            state = Network_Open;
        }
    }

    public void operation2() {
        if (state == Network_Open){

            //**********
            state = Network_Connect;
        }
        else if (state == Network_Close){

            //.....
            state = Network_Open;
        }
        else if (state == Network_Connect){

            //$$$$$$$$$$
            state = Network_Close;
        }
    }
}
