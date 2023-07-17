// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of WorkspaceBindings */
@Generated
class WorkspaceBindingsImpl implements WorkspaceBindingsService {
  private final ApiClient apiClient;

  public WorkspaceBindingsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CurrentWorkspaceBindings get(GetWorkspaceBindingRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    return apiClient.GET(path, request, CurrentWorkspaceBindings.class);
  }

  @Override
  public CurrentWorkspaceBindings update(UpdateWorkspaceBindings request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspace-bindings/catalogs/%s", request.getName());
    return apiClient.PATCH(path, request, CurrentWorkspaceBindings.class);
  }
}