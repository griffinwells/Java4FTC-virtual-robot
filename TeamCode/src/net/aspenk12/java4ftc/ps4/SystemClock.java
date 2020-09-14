package net.aspenk12.java4ftc.ps4;

public class SystemClock implements Clock{
double startTime;
    public SystemClock(){


    }

    public void setTime(){
        startTime = System.currentTimeMillis();
    }

    public double getCurrentTime(){
        return System.currentTimeMillis()-startTime;
    }

}
