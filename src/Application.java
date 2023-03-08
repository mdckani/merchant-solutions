import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Application implements SignalHandler {

    private static Map<Integer, Consumer<Integer>> SIGNALS;
    {
        SignalHandlerImp signalHandlerImp = new SignalHandlerImp();

        /*
         * Add the signal to the signals map with the call to the corresponding
         * handleSignalCode method as Consumer
         */

        Map<Integer, Consumer<Integer>> signals = new HashMap<>();
        signals.put(1, (signal) -> {
            signalHandlerImp.handleSignalCode1(signal);
        });
        signals.put(2, (signal) -> {
            signalHandlerImp.handleSignalCode2(signal);
        });
        signals.put(3, (signal) -> {
            signalHandlerImp.handleSignalCode3(signal);
        });
        signals.put(4, (signal) -> {
            signalHandlerImp.handleSignalCode4(signal);
        });
        signals.put(5, (signal) -> {
            signalHandlerImp.handleSignalCode5(signal);
        });
        signals.put(6, (signal) -> {
            signalHandlerImp.handleSignalCode6(signal);
        });
        signals.put(7, (signal) -> {
            signalHandlerImp.handleSignalCode7(signal);
        });
        signals.put(8, (signal) -> {
            signalHandlerImp.handleSignalCode8(signal);
        });
        signals.put(9, (signal) -> {
            signalHandlerImp.handleSignalCode9(signal);
        });
        signals.put(10, (signal) -> {
            signalHandlerImp.handleSignalCode10(signal);
        });
        SIGNALS = Collections.unmodifiableMap(signals);
    }

    public void handleSignal(int signal) {
        /*
         * Get the Consumer function for the signal code
         */
        Consumer<Integer> signalHandler = SIGNALS.get(signal);

        /*
         * Check if the signal key existed if not throw exception
         */
        if (signalHandler == null) {
            throw new IllegalArgumentException("Signal type: "
                    + signal + " not implemented.");
        }

        /*
         * Execute the Consumer of the signal key
         */
        signalHandler.accept(signal);
    }

    public static void main(String[] args) {
        Application app = new Application();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Invoking signal : " + i);
            app.handleSignal(i);
        }
    }
}