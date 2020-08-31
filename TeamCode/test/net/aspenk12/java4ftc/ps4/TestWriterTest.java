package net.aspenk12.java4ftc.ps4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestWriterTest {
    @Test
    public void TestWriterTest() {
        TestWriter writer = new TestWriter();
        GridLogger gridLogger = new GridLogger(writer);

        gridLogger.stop();

        assertEquals(true, writer.isStopCalled());

    }
}