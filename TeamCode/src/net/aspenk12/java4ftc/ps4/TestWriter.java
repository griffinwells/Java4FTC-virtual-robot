package net.aspenk12.java4ftc.ps4;

import java.util.ArrayList;
import java.util.List;


public class TestWriter implements LogWriter{

    public boolean stopCalled;

    private List<String> lines = new ArrayList<>();

    public TestWriter(){
        stopCalled = false;
    }

    public void writeLine(String line) {

        lines.add(line);
    }

    public List<String> getLines() {
        return lines;
    }

    public boolean isStopCalled(){
        return stopCalled;
    }

    public void stop(){
        stopCalled = true;
    }

}
