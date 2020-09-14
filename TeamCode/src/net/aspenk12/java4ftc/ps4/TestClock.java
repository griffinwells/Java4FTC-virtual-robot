package net.aspenk12.java4ftc.ps4;

public class TestClock implements Clock {
    double testTime;
    public TestClock(){


    }

    public void setTime(){
        testTime = 10;
    }

    public double getCurrentTime(){
        return testTime;
    }



}
