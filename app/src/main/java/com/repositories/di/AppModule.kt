package com.repositories.di

import com.repositories.data.GitHubRepositoriesRepoImp
import com.repositories.domain.GitHubRepositoriesRepo
import com.repositories.presentation.GithubRepositoriesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import repoSource.RepoDataSourceImp
import repoSource.createGetRepositoriesUseCase

val AppModule = module {
    viewModel { GithubRepositoriesViewModel(get()) }
    single { createGetRepositoriesUseCase(get()) }
    single { createRepos(get()) }
}

fun createRepos(dataSource: RepoDataSourceImp): GitHubRepositoriesRepo {
    return GitHubRepositoriesRepoImp(dataSource)
}