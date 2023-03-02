// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * A storage credential represents an authentication and authorization mechanism
 * for accessing data stored on your cloud tenant. Each storage credential is
 * subject to Unity Catalog access-control policies that control which users and
 * groups can access the credential. If a user does not have access to a storage
 * credential in Unity Catalog, the request fails and Unity Catalog does not
 * attempt to authenticate to your cloud tenant on the user’s behalf.
 * 
 * Databricks recommends using external locations rather than using storage
 * credentials directly.
 * 
 * To create storage credentials, you must be a Databricks account admin. The
 * account admin who creates the storage credential can delegate ownership to
 * another user or group to manage permissions on it.
 */
@Generated("databricks-sdk-generator")
public class StorageCredentialsAPI implements StorageCredentialsService {
    private final ApiClient apiClient;

    public StorageCredentialsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a storage credential.
     * 
     * Creates a new storage credential. The request object is specific to the
     * cloud:
     * 
     * * **AwsIamRole** for AWS credentials * **AzureServicePrincipal** for
     * Azure credentials * **GcpServiceAcountKey** for GCP credentials.
     * 
     * The caller must be a metastore admin and have the
     * **CREATE_STORAGE_CREDENTIAL** privilege on the metastore.
     */
    @Override
    public StorageCredentialInfo create(CreateStorageCredential request) {
        String path = "/api/2.1/unity-catalog/storage-credentials";
        return apiClient.POST(path, request, StorageCredentialInfo.class);
    }
    
	/**
     * Delete a credential.
     * 
     * Deletes a storage credential from the metastore. The caller must be an
     * owner of the storage credential.
     */
    @Override
    public void delete(DeleteStorageCredentialRequest request) {
        String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a credential.
     * 
     * Gets a storage credential from the metastore. The caller must be a
     * metastore admin, the owner of the storage credential, or have some
     * permission on the storage credential.
     */
    @Override
    public StorageCredentialInfo get(GetStorageCredentialRequest request) {
        String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
        return apiClient.GET(path, request, StorageCredentialInfo.class);
    }
    
	/**
     * List credentials.
     * 
     * Gets an array of storage credentials (as __StorageCredentialInfo__
     * objects). The array is limited to only those storage credentials the
     * caller has permission to access. If the caller is a metastore admin, all
     * storage credentials will be retrieved. There is no guarantee of a
     * specific ordering of the elements in the array.
     */
    @Override
    public List<StorageCredentialInfo> list() {
        String path = "/api/2.1/unity-catalog/storage-credentials";
        return apiClient.GET(path, List.class);
    }
    
	/**
     * Update a credential.
     * 
     * Updates a storage credential on the metastore. The caller must be the
     * owner of the storage credential or a metastore admin. If the caller is a
     * metastore admin, only the __owner__ credential can be changed.
     */
    @Override
    public StorageCredentialInfo update(UpdateStorageCredential request) {
        String path = String.format("/api/2.1/unity-catalog/storage-credentials/%s", request.getName());
        return apiClient.PATCH(path, request, StorageCredentialInfo.class);
    }
    
	/**
     * Validate a storage credential.
     * 
     * Validates a storage credential. At least one of
     * __external_location_name__ and __url__ need to be provided. If only one
     * of them is provided, it will be used for validation. And if both are
     * provided, the __url__ will be used for validation, and
     * __external_location_name__ will be ignored when checking overlapping
     * urls.
     * 
     * Either the __storage_credential_name__ or the cloud-specific credential
     * must be provided.
     * 
     * The caller must be a metastore admin or the storage credential owner or
     * have the **CREATE_EXTERNAL_LOCATION** privilege on the metastore and the
     * storage credential.
     */
    @Override
    public ValidateStorageCredentialResponse validate(ValidateStorageCredential request) {
        String path = "/api/2.1/unity-catalog/validate-storage-credentials";
        return apiClient.POST(path, request, ValidateStorageCredentialResponse.class);
    }
    
}