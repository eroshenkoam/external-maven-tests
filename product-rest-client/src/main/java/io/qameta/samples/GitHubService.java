package io.qameta.samples;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * eroshenkoam
 * 16.03.17
 */
public interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepos(@Path("user") String user);
}