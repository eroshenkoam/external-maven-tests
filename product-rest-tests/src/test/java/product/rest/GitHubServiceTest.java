package product.rest;

import io.qameta.samples.GitHubService;
import io.qameta.samples.Repository;
import org.testng.annotations.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

/**
 * eroshenkoam
 * 16.03.17
 */

public class GitHubServiceTest {

    @Test(groups = "regression")
    public void testRepository() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build();

        GitHubService gitHub = retrofit.create(GitHubService.class);
        List<Repository> repositories = gitHub.listRepos("eroshenkoam").execute().body();
        for (Repository repository : repositories) {
            System.out.println(repository.getName());
        }
    }
}
