package com.metrics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {
        MyMetrics metrics = new MyMetrics();

        // Handle some requests
        for (int i = 0; i < 2000; i++) {
            metrics.handleRequest();
            Thread.sleep(100);
        }

        // Output some metrics
        System.out.println("Total requests: " + metrics.requests.getCount());
        System.out.println("Requests per second: " + metrics.requestsPerSecond.getMeanRate());
        System.out.println("Request latency: " + metrics.requestLatency.getSnapshot().getMean());
    }

}
