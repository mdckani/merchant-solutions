/***
 * The class SignalHandlerCode1 handles signal code 1.
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
class SignalHandlerCode1 implements SignalHandler {

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}
