package net.aspenk12.java4ftc.ps4;
import org.junit.jupiter.api.Test;
import net.aspenk12.java4ftc.ps4.GridLogger;
import net.aspenk12.java4ftc.ps4.TestClock;
import net.aspenk12.java4ftc.ps4.TestWriter;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestWriterTest {
    @Test
    public void TestWriterTest() {
        TestWriter writer = new TestWriter();
        Clock testClock = new TestClock();
        GridLogger gridLogger = new GridLogger(writer, testClock);

        gridLogger.stop();

        assertEquals(true, writer.isStopCalled());

    }
}