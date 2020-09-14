package net.aspenk12.java4ftc;

import net.aspenk12.java4ftc.ps4.GridLogger;
import net.aspenk12.java4ftc.ps4.TestClock;
import net.aspenk12.java4ftc.ps4.TestWriter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GridLoggerTest {
    @Test

    public void writeLn() {
        TestClock clock = new TestClock();
        TestWriter writer = new TestWriter();
        GridLogger gridLogger = new GridLogger(writer, clock);
//        gridLogger.setColumnHeaders(new String[]{"RobotX", "RobotY"});
        gridLogger.add("RobotX", 2.4);
        gridLogger.add("RobotY", 3.2);







//        private HashMap<String, String> rowData = new HashMap<>();



 //       rowData.put("RobotX", String.valueOf(2.4));
 //       rowData.put("RobotY", String.valueOf(3.2));

        gridLogger.writeRow();
//        gridLogger.add("RobotX", 4.8);
//        gridLogger.add("RobotY", 7.3);
//        gridLogger.writeRow();

        List<String> lines = writer.getLines();
        assertEquals("RobotX,RobotY", lines.get(0));
        assertEquals("2.4,3.2", lines.get(1));

    }

}


