// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateJob {
    /**
     * Remove top-level fields in the job settings. Removing nested fields is
     * not supported. This field is optional.
     */
    @JsonProperty("fields_to_remove")
    private java.util.List<String> fieldsToRemove;
    
    /**
     * The canonical identifier of the job to update. This field is required.
     */
    @JsonProperty("job_id")
    private Long jobId;
    
    /**
     * The new settings for the job. Any top-level fields specified in
     * `new_settings` are completely replaced. Partially updating nested fields
     * is not supported.
     * 
     * Changes to the field `JobSettings.timeout_seconds` are applied to active
     * runs. Changes to other fields are applied to future runs only.
     */
    @JsonProperty("new_settings")
    private JobSettings newSettings;
    
    public UpdateJob setFieldsToRemove(java.util.List<String> fieldsToRemove) {
        this.fieldsToRemove = fieldsToRemove;
        return this;
    }

    public java.util.List<String> getFieldsToRemove() {
        return fieldsToRemove;
    }
    
    public UpdateJob setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Long getJobId() {
        return jobId;
    }
    
    public UpdateJob setNewSettings(JobSettings newSettings) {
        this.newSettings = newSettings;
        return this;
    }

    public JobSettings getNewSettings() {
        return newSettings;
    }
    
}