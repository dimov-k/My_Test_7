package ru.mrroot.my_test_7.presenter.details

import ru.mrroot.my_test_7.presenter.PresenterContract

internal interface PresenterDetailsContract : PresenterContract {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
