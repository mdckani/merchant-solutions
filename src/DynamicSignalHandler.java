
/***
* The class DynamicSignalHandler helps to handle signal codes that have been implemented in SignalHandleCodeXX classes. 
* XX - integer from 1 to 30
* If the SignalHandlerCodeXX class does not exist then error message is printed.
* @version 1.0.0
* @author kduraikannu
***/
import java.lang.reflect.InvocationTargetException;

public class DynamicSignalHandler implements SignalHandler {
    public void handleSignal(int signal) {
        {
            try {
                /**
                 * Dynamical forming the SignalHandlerCodeXX class name and creating new object
                 * instance for the class
                 **/
                SignalHandler signalHandler = (SignalHandler) Class.forName("SignalHandlerCode" + signal)
                        .getDeclaredConstructor().newInstance();
                signalHandler.handleSignal(signal);
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException
                    | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                System.err.print("Signal " + signal + " is not implemented");
            }
        }
    }
}
