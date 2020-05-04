package com.nineleaps.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nineleaps.events.GithubProject;

//@Repository
public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long>{

	GithubProject findByRepoName(String repoName);
}
