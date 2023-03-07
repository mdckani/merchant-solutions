/***
 * The class SignalHandlerCode2 handles signal code 2.
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
class SignalHandlerCode2 implements SignalHandler {

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1, 80);
        algo.submitToMarket();
        algo.doAlgo();
    }
}
