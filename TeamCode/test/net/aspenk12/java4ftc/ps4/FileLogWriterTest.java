package net.aspenk12.java4ftc.ps4;
import net.aspenk12.java4ftc.ps4.GridLogger;
import net.aspenk12.java4ftc.ps4.TestClock;
import net.aspenk12.java4ftc.ps4.TestWriter;
import org.junit.jupiter.api.Test;



class FileLogWriterTest {
    @Test
    void FileLogWriterTest() {
        //FileLogWriter fileLogWriter = new FileLogWriter();
        SystemClock clock = new SystemClock();
        LogWriter writer = new FileLogWriter("Desktop\\GridLogTest.csv");
        GridLogger gridLogger = new GridLogger(writer, clock);
//        gridLogger.setColumnHeaders(new String[]{"RobotX", "RobotY"});
        gridLogger.add("RobotX", 2.4);
        gridLogger.add("RobotY", 3.2);
        gridLogger.writeRow();
        gridLogger.add("RobotX", 5.8);
        gridLogger.add("RobotY", 10.3);
        gridLogger.writeRow();
        gridLogger.add("RobotX", 18.3);
        gridLogger.add("RobotY", 9.8);
        gridLogger.writeRow();
        gridLogger.add("RobotX", 60.2);
        gridLogger.add("RobotY", 30.5);
        gridLogger.writeRow();
        gridLogger.add("RobotX", 83.4);
        gridLogger.add("RobotY", 101.1);
        gridLogger.writeRow();
    }}