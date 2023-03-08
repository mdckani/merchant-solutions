
/***
 * The class SignalHandlerCode_1_3_Imp is abstact class and contains the methods
 * to handle different
 * signal code from integers 1 to 3
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
abstract class SignalHandlerCode_1_3_Imp {
    public void handleSignalCode1(int signal) {
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode2(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1, 80);
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode3(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}
