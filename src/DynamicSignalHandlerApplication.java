/***
 * The class DynamicSignalHandlerApplication to run example DynamicSignalHandler
 * for different codes 1 to 4
 * 
 * @version 1.0.0
 * @author kduraikannu
 ***/
public class DynamicSignalHandlerApplication {
    public static void main(String args[]) {
        DynamicSignalHandler dynamicSignalHandler = new DynamicSignalHandler();
        dynamicSignalHandler.handleSignal(1);
        dynamicSignalHandler.handleSignal(2);
        dynamicSignalHandler.handleSignal(3);
        dynamicSignalHandler.handleSignal(4);
        dynamicSignalHandler.handleSignal(15);
    }
}
