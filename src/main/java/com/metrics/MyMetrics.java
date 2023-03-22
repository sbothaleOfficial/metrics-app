package com.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

public class MyMetrics {

    private final MetricRegistry registry = new MetricRegistry();

    public final Counter requests = registry.counter("requests");
    public final Meter requestsPerSecond = registry.meter("requests-per-second");
    public final Timer requestLatency = registry.timer("request-latency");

    public void handleRequest() {
        requests.inc();
        requestsPerSecond.mark();

        final Timer.Context latencyContext = requestLatency.time();
        try {
            // Handle the request
        } finally {
            latencyContext.stop();
        }
    }
}
