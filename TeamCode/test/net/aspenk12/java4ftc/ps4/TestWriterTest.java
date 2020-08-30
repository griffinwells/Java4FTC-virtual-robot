package net.aspenk12.java4ftc.ps4;
import net.aspenk12.java4ftc.ps4.TestWriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestWriterTest {
    @Test
    public void callWriterStop() {
        TestWriter writer = new TestWriter();
        GridLogger gridLogger = new GridLogger(writer);
        gridLogger.stop();


    }
}