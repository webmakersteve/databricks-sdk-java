// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SubmitRunResponse {
    /**
     * The canonical identifier for the newly submitted run.
     */
    @JsonProperty("run_id")
    private Long runId;
    
    public SubmitRunResponse setRunId(Long runId) {
        this.runId = runId;
        return this;
    }

    public Long getRunId() {
        return runId;
    }
    
}