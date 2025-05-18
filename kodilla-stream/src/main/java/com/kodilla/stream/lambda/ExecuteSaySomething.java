package com.kodilla.stream.lambda;

public class ExecuteSaySomething implements Executor {
    public int processedTimes = 0;
    @Override
    public void process() {
        System.out.println("This is an example text.");
        processedTimes++;
    }
}
