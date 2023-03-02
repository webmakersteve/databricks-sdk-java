// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The repair history item type. Indicates whether a run is the original run or
 * a repair run.
 */
public enum RepairHistoryItemType{
    ORIGINAL,
    REPAIR,
    
}