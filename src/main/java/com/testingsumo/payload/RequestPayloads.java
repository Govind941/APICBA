package com.testingsumo.payload;

import com.google.gson.Gson;
import com.testingsumo.pojos.GitHubRepo;
import com.testingsumo.utils.TestUtils;

public class RequestPayloads {

	protected Gson gson = new Gson();

	public String getRepoCreatePayLoad() {
		GitHubRepo gitHubRepo = new GitHubRepo();

		// Use DTO
		gitHubRepo.setName(TestUtils.generateUniqueCode("cba1"));
		gitHubRepo.setDescription("cba1_1");
		gitHubRepo.setHomepage("cba1_2");
		gitHubRepo.setPrivate(true);
		gitHubRepo.setHasWiki(true);
		gitHubRepo.setHasIssues(true);
		gitHubRepo.setHasProjects(true);
		return gson.toJson(gitHubRepo);
	}
}
