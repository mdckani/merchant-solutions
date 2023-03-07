/***
 * The class SignalHandlerCode4 handles signal code 4.
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
class SignalHandlerCode4 implements SignalHandler {

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1, 100);
        algo.submitToMarket();
        algo.doAlgo();
    }
}
