package ru.mrroot.my_test_7.presenter.search

import ru.mrroot.my_test_7.presenter.PresenterContract

internal interface PresenterSearchContract : PresenterContract {
    fun searchGitHub(searchQuery: String)
}
