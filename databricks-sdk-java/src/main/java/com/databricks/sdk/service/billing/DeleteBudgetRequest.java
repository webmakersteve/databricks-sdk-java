// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete budget
 */
@Generated("databricks-sdk-generator")
public class DeleteBudgetRequest {
    /**
     * Budget ID
     */
    
    private String budgetId;
    
    public DeleteBudgetRequest setBudgetId(String budgetId) {
        this.budgetId = budgetId;
        return this;
    }

    public String getBudgetId() {
        return budgetId;
    }
    
}