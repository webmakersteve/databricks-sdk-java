// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateMetastoreAssignment {
    /**
     * The name of the default catalog for the metastore.
     */
    @JsonProperty("default_catalog_name")
    private String defaultCatalogName;
    
    /**
     * The unique ID of the metastore.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Workspace ID.
     */
    
    private Long workspaceId;
    
    public UpdateMetastoreAssignment setDefaultCatalogName(String defaultCatalogName) {
        this.defaultCatalogName = defaultCatalogName;
        return this;
    }

    public String getDefaultCatalogName() {
        return defaultCatalogName;
    }
    
    public UpdateMetastoreAssignment setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public UpdateMetastoreAssignment setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Long getWorkspaceId() {
        return workspaceId;
    }
    
}