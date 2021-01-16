package com.repositories.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.repositories.R
import com.repositories.domain.model.ItemModel
import com.repositories.domain.model.ResponseStatus
import kotlinx.android.synthetic.main.activity_repositories.*
import org.koin.android.viewmodel.ext.android.viewModel

class GitHubRepositoriesActivity : AppCompatActivity() {
    private val repositoriesViewModel: GithubRepositoriesViewModel by viewModel()
    private lateinit var reposAdapter: GithubRepositoriesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repositories)
        searchForRepo()
        initRepositoriesLiveData()
    }

    private fun searchForRepo() {
        btn_search.setOnClickListener {
            repositoriesViewModel.getRepositories(et_search.text.toString())
        }

        et_search.doOnTextChanged { text, _, _, _ ->
            repositoriesViewModel.getRepositories(text.toString())
        }
    }

    private fun initRepositoriesLiveData() {
        with(repositoriesViewModel) {
            githubRepositoriesLiveData.observe(
                this@GitHubRepositoriesActivity,
                Observer { response ->
                    when (response.responseStatus) {
                        ResponseStatus.Loading -> {
                            showLoading()
                            hideError()
                        }
                        ResponseStatus.Success -> {
                            hideLoading()
                            hideError()
                            fillRepositoriesList(response.data)
                        }
                        ResponseStatus.Error -> {
                            showError()
                            hideLoading()
                        }
                    }
                })
        }
    }

    private fun hideError() {
        tv_error.visibility = View.GONE
        rv_repos.visibility = View.VISIBLE
    }

    private fun showError() {
        tv_error.visibility = View.VISIBLE
        rv_repos.visibility = View.INVISIBLE

    }

    private fun hideLoading() {
        progress_circular.visibility = View.GONE
    }

    private fun showLoading() {
        progress_circular.visibility = View.VISIBLE
        rv_repos.visibility = View.GONE

    }

    private fun fillRepositoriesList(repos: MutableList<ItemModel>?) {
        reposAdapter = GithubRepositoriesAdapter(repos ?: mutableListOf())
        rv_repos?.adapter = reposAdapter

    }
}