// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An optional specification for a remote repository containing the notebooks
 * used by this job's notebook tasks.
 */
@Generated("databricks-sdk-generator")
public class GitSource {
    /**
     * Name of the branch to be checked out and used by this job. This field
     * cannot be specified in conjunction with git_tag or git_commit.
     * 
     * The maximum length is 255 characters.
     */
    @JsonProperty("git_branch")
    private String gitBranch;
    
    /**
     * Commit to be checked out and used by this job. This field cannot be
     * specified in conjunction with git_branch or git_tag. The maximum length
     * is 64 characters.
     */
    @JsonProperty("git_commit")
    private String gitCommit;
    
    /**
     * Unique identifier of the service used to host the Git repository. The
     * value is case insensitive.
     */
    @JsonProperty("git_provider")
    private GitSourceGitProvider gitProvider;
    
    /**
     * Read-only state of the remote repository at the time the job was run.
     * This field is only included on job runs.
     */
    @JsonProperty("git_snapshot")
    private GitSnapshot gitSnapshot;
    
    /**
     * Name of the tag to be checked out and used by this job. This field cannot
     * be specified in conjunction with git_branch or git_commit.
     * 
     * The maximum length is 255 characters.
     */
    @JsonProperty("git_tag")
    private String gitTag;
    
    /**
     * URL of the repository to be cloned by this job. The maximum length is 300
     * characters.
     */
    @JsonProperty("git_url")
    private String gitUrl;
    
    public GitSource setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    public String getGitBranch() {
        return gitBranch;
    }
    
    public GitSource setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
        return this;
    }

    public String getGitCommit() {
        return gitCommit;
    }
    
    public GitSource setGitProvider(GitSourceGitProvider gitProvider) {
        this.gitProvider = gitProvider;
        return this;
    }

    public GitSourceGitProvider getGitProvider() {
        return gitProvider;
    }
    
    public GitSource setGitSnapshot(GitSnapshot gitSnapshot) {
        this.gitSnapshot = gitSnapshot;
        return this;
    }

    public GitSnapshot getGitSnapshot() {
        return gitSnapshot;
    }
    
    public GitSource setGitTag(String gitTag) {
        this.gitTag = gitTag;
        return this;
    }

    public String getGitTag() {
        return gitTag;
    }
    
    public GitSource setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }
    
}