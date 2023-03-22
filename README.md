# Metrics App

This is a sample application that demonstrates how to use the io.dropwizard.metrics library to collect and export metrics data to a Prometheus server.

### Prometheus Server

To access the metrics data collected by the application, you can run a Prometheus server. You can download the latest version of Prometheus from the official Prometheus website: https://prometheus.io/download/

Once you have downloaded Prometheus, navigate to the directory where you extracted the files and run the following command to start the Prometheus server:

`cd /Users/suraj/Development/prometheus-2.43.0.darwin-amd64
./prometheus`

This will start the Prometheus server on the default port of 9090. You should make sure that your io.dropwizard.metrics application is configured to export metrics data to this port.

Once the Prometheus server is running, you can access the metrics data in Prometheus and visualize it in Grafana, as described in the next section.

### Grafana Dashboard

A Grafana dashboard is available to visualize the metrics data collected by the application. You can access the Grafana dashboard at http://localhost:3000. The default username and password for Grafana are:

Username: admin

Password: Pspsb@664

To add the Prometheus data source to Grafana, follow these steps:

* Log in to Grafana using the above credentials.

* Click on "Add data source" in the Grafana sidebar.


* Select "Prometheus" as the data source type, and enter the URL for your Prometheus server in the "HTTP URL" field. The default URL for a local Prometheus server is http://localhost:9090.


* Click the "Save & Test" button to test the connection to your Prometheus server.

* Once you have added the Prometheus data source, you can create a new dashboard in Grafana to visualize the metrics data collected by the application.

Additional Resources
For more information on how to use the io.dropwizard.metrics library to collect and export metrics data, refer to the official documentation:

Dropwizard Metrics Documentation
For more information on how to use Prometheus and Grafana to visualize metrics data, refer to the official documentation:

Prometheus Documentation
Grafana Documentation

### Running Grafana

To run Grafana, navigate to the directory where you extracted the files and run the following command:

`cd /Users/suraj/Development/grafana-9.4.7
./bin/grafana-server web`

This will start Grafana on the default port of 3000. You can access Grafana by opening a web browser and navigating to http://localhost:3000
