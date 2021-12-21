package ru.mrroot.my_test_7.presenter

import ru.mrroot.my_test_7.repository.RepositoryCallback

internal interface RepositoryContract {
    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )
}
