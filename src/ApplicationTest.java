
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(value = Parameterized.class)
public class ApplicationTest {

    private int signalCode;

    // Inject via constructor
    public ApplicationTest(int signalCode) {
        this.signalCode = signalCode;
    }

    // name attribute is optional, provide an unique name for test
    // multiple parameters, uses Collection<Object[]>
    @Parameters(name = "{index}: test HandleSignal({0})")
    public static Collection<Object[]> data() {
        var signals = new Object[10][1];
        for (int i = 0; i < 10; i++) {
            signals[i][0] = i + 1;
        }
        return Arrays.asList(signals);
    }

    // Test all the signal code
    @Test
    public void testHandleSignal() {
        Application applicationMock = mock(Application.class);
        applicationMock.handleSignal(signalCode);
        verify(applicationMock).handleSignal(signalCode);
    }
}
