package com.github.datasnap.controller;

import org.apache.http.HttpHost;
import org.apache.commons.lang3.StringUtils;

import com.github.datasnap.utils.Defaults;

/**
 * Configuration options for DataSnap Client
 * 
 */
public class DataSendingConfig {

	/**
	 * The REST API
	 */
	private String host;

	/**
	 * Id assigned to the organisation
	 */
	private String organisationId;

	/**
	 * Id assigned to the project
	 */
	private String projectId;

	/**
	 * After reaching this capacity stop sending messages
	 */
	private int maxQueueSize;

	/**
	 * milliseconds that pass before a request is marked as timed out
	 */
	private int timeout;

	/**
	 * Amount of times to retry the request.
	 */

	private int retries;

	/**
	 * Time in milliseconds between retries.
	 */

	private int requestRetryWait;

	/**
	 * Optional proxy host connection.
	 */
	private HttpHost proxy;

	public DataSendingConfig() {
		this(Defaults.HOST, Defaults.MAX_QUEUE_SIZE, Defaults.TIMEOUT,
				Defaults.RETRIES, Defaults.BACKOFF, Defaults.ORGANISATION_ID,
				Defaults.PROJECT_ID);
	}

	/**
	 * Creates a config for data sending
	 * 
	 */
	DataSendingConfig(String host, int maxQueueSize, int timeout, int retries,
			int requestRetryWait, String organisationId, String projectId) {
		setHost(host);
		setMaxQueueSize(maxQueueSize);
		setTimeout(timeout);
		setRetries(retries);
		setRequestRetryWait(requestRetryWait);
		setOrganisationId(organisationId);
		setProjectId(projectId);
	}

	public String getHost() {
		return host;
	}

	public int getMaxQueueSize() {
		return maxQueueSize;
	}

	public HttpHost getProxy() {
		return proxy;
	}

	public int getTimeout() {
		return timeout;
	}

	public int getRetries() {
		return retries;
	}

	public int getBackoff() {
		return requestRetryWait;
	}

	public DataSendingConfig setMaxQueueSize(int maxQueueSize) {
		if (maxQueueSize < 1)
			throw new IllegalArgumentException(
					"DataSnap MaxQueueSize must be greater than 0.");

		this.maxQueueSize = maxQueueSize;
		return this;
	}

	public DataSendingConfig setProxy(HttpHost proxy) {
		this.proxy = proxy;
		return this;
	}

	public DataSendingConfig setHost(String host) {
		if (StringUtils.isEmpty(host))
			throw new IllegalArgumentException(
					"DataSnap Host must be a valid host");

		this.host = host;
		return this;
	}

	public DataSendingConfig setTimeout(int timeout) {
		if (timeout < 1000)
			throw new IllegalArgumentException(
					"DataSnap#option#timeout must be at least 1000 milliseconds.");

		this.timeout = timeout;
		return this;
	}

	public DataSendingConfig setRetries(int retries) {
		if (retries < 0)
			throw new IllegalArgumentException(
					"DataSnap#option#retries must be greater or equal to 0.");

		this.retries = retries;
		return this;
	}

	public DataSendingConfig setRequestRetryWait(int requestRetryWait) {
		if (requestRetryWait < 0)
			throw new IllegalArgumentException(
					"DataSnap RequestRetryWait must be greater or equal to 0 milliseconds.");
		this.requestRetryWait = requestRetryWait;
		return this;
	}

	public String getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
}
