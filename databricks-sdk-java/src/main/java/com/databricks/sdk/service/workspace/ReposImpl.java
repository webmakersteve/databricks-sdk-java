// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspace;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Repos */
class ReposImpl implements ReposService {
  private final ApiClient apiClient;

  public ReposImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RepoInfo create(CreateRepo request) {
    String path = "/api/2.0/repos";
    return apiClient.POST(path, request, RepoInfo.class);
  }

  @Override
  public void delete(DeleteRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public RepoInfo get(GetRepoRequest request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    return apiClient.GET(path, request, RepoInfo.class);
  }

  @Override
  public ListReposResponse list(ListReposRequest request) {
    String path = "/api/2.0/repos";
    return apiClient.GET(path, request, ListReposResponse.class);
  }

  @Override
  public void update(UpdateRepo request) {
    String path = String.format("/api/2.0/repos/%s", request.getRepoId());
    apiClient.PATCH(path, request, Void.class);
  }
}