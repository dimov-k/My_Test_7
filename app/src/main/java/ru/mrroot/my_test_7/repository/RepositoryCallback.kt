package ru.mrroot.my_test_7.repository

import ru.mrroot.my_test_7.model.SearchResponse
import retrofit2.Response

interface RepositoryCallback {
    fun handleGitHubResponse(response: Response<SearchResponse?>?)
    fun handleGitHubError()
}
