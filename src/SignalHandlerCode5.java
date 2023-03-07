/***
 * The class SignalHandlerCode5 handles signal code 5.
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
class SignalHandlerCode5 implements SignalHandler {
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1, 100);
        algo.submitToMarket();
        algo.doAlgo();
    }
}
