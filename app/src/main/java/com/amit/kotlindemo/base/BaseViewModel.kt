package com.amit.kotlindemo.base

import androidx.lifecycle.ViewModel
import com.amit.kotlindemo.injection.component.DaggerViewModelInjector
import com.amit.kotlindemo.injection.component.ViewModelInjector
import com.amit.kotlindemo.network.NetworkModule
import com.amit.kotlindemo.ui.post.PostListViewModel

abstract class BaseViewModel : ViewModel(){

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }

}