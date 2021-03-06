package net.aspenk12.java4ftc.ps4;

import java.util.ArrayList;
import java.util.HashMap;

public class GridLogger {

    public boolean firstLine;

    public HashMap<String, String> rowData = new HashMap<>();
//    private TestWriter writer;

    public ArrayList<String> ColumnHeaders = new ArrayList<>();


    public LogWriter writer;
    public Clock clock;
    public long startTime;

    public GridLogger(LogWriter writer, Clock clock) {
        //wait(1000, 0);
        //startTime = System.currentTimeMillis();
        firstLine = true;
        this.writer = writer;
        this.clock = clock;
        clock.setTime();

    }

    /**
     * Define grid column header names
     * @param columns
     */
    //public void setColumnHeaders(String[] columns) {
    //    ColumnHeaders.add(0, columns[0]);
    //    ColumnHeaders.add(1, columns[1]);
    //}

    /**
     * Add a value to the logger under the specified column
     *
     * @param column
     * @param value
     */
    public void add(String column, double value) {
        if (firstLine == true && !ColumnHeaders.contains(column)) {
            ColumnHeaders.add(column);
        }





        rowData.put(column, String.valueOf(value));
    }


    /**
     * Write a line of data to the log.  If this is the first call to writeRow, a row of comma-separated
     * column names are written first.  A row of comma-separated data values that were added with the add()
     * method is written next.  Once the data row is written, the logger is reset
     * and calls to add() will add values to the next line of data.
     */
    public void writeRow() {
        if (firstLine == true) {
            StringBuilder builder = new StringBuilder();
                builder.append("Time, ");
            for (int i = 0; i < ColumnHeaders.size(); i++) {
                //try {
                //    wait(10,0);
                //} catch (InterruptedException e) {
                //    e.printStackTrace();
                //}
                builder.append(ColumnHeaders.get(i));
                //builder.append("?");
                if (i < ColumnHeaders.size() - 1) {
                    builder.append(", ");
                }
            }
            writer.writeLine(builder.toString());
            firstLine = false;
        }
        StringBuilder builder2 = new StringBuilder();
            builder2.append(clock.getCurrentTime() + ", ");
        for (int i = 0; i < ColumnHeaders.size(); i++) {
            builder2.append(rowData.get(ColumnHeaders.get(i)));
            //builder.append("?");
            if (i < ColumnHeaders.size() - 1) {
                builder2.append(", ");
            }


            //writer.writeLine("something");


        }
        writer.writeLine(builder2.toString());
        rowData.clear();


    }
    public void stop(){
        writer.stop();
    }

    }

