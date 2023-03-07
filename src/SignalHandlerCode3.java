/***
 * The class SignalHandlerCode3 handles signal code 3.
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
class SignalHandlerCode3 implements SignalHandler {

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}
