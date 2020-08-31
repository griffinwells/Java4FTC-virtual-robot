package net.aspenk12.java4ftc.ps4;

import org.junit.jupiter.api.Test;



class FileLogWriterTest {
    @Test
    void FileLogWriterTest() {
        //FileLogWriter fileLogWriter = new FileLogWriter();
        LogWriter writer = new FileLogWriter("Desktop\\GridLogTest.csv");
        GridLogger gridLogger = new GridLogger(writer);
//        gridLogger.setColumnHeaders(new String[]{"RobotX", "RobotY"});
        gridLogger.add("RobotX", 2.4);
        gridLogger.add("RobotY", 3.2);
        gridLogger.writeRow();
        //gridLogger.add("RobotX", 5.8);
        //gridLogger.add("RobotY", 10.3);
        //gridLogger.writeRow();






    }
}


