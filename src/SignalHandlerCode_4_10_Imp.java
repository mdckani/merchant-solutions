
/***
 * The class SignalHandlerCode_1_3_Imp contains the methods to handle different
 * signal code from integers 4 to 10
 * 
 * and further signal handling will be implemented in class files named as
 * SignalHandlerCode_STARTNUM_ENDNUM_Imp
 * 
 * 
 * 
 * @inherits SignalHandlerCode_1_3_Imp
 * @version 1.0.0
 * @author kduraikannu
 ***/
abstract class SignalHandlerCode_4_10_Imp extends SignalHandlerCode_1_3_Imp {
    public void handleSignalCode4(int signal) {
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode5(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1, 10);
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode6(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 10);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode7(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 9);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode8(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 60);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode9(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 5);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    public void handleSignalCode10(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1, 9);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}
