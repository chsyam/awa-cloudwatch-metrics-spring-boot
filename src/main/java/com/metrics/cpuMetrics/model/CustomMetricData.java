package com.metrics.cpuMetrics.model;

import java.time.Instant;
import java.util.List;


public class CustomMetricData {
	private String metricName;
	private List<Instant> timestamps;
	private List<Double> values;

	public CustomMetricData() {
	}

	public String getMetricName() {
		return metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public List<Instant> getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(List<Instant> timestamps) {
		this.timestamps = timestamps;
	}

	public List<Double> getValues() {
		return values;
	}

	public void setValues(List<Double> values) {
		this.values = values;
	}
	
}
