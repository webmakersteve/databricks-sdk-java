// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a network configuration
 */
@Generated("databricks-sdk-generator")
public class GetNetworkRequest {
    /**
     * Databricks Account API network configuration ID.
     */
    
    private String networkId;
    
    public GetNetworkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    public String getNetworkId() {
        return networkId;
    }
    
}