// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a metastore
 */
@Generated("databricks-sdk-generator")
public class GetMetastoreRequest {
    /**
     * Unique ID of the metastore.
     */
    
    private String id;
    
    public GetMetastoreRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}