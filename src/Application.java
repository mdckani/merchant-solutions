import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Application implements SignalHandler {

    private static Map<Integer, Consumer<Integer>> SIGNALS;
    {
        SignalHandlerImp signalHandlerImp = new SignalHandlerImp();

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
        SIGNALS = Collections.unmodifiableMap(signals);
    }

    public void handleSignal(int signal) {
        Consumer<Integer> signalHandler = SIGNALS.get(signal);
        if (signalHandler == null) {
            throw new IllegalArgumentException("Signal type: "
                    + signal + " not implemented.");
        }
        signalHandler.accept(signal);
    }

    public static void main(String[] args) {
        Application t = new Application();
        t.handleSignal(1);
    }
}