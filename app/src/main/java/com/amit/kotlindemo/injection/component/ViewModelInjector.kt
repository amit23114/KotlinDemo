package com.amit.kotlindemo.injection.component

import com.amit.kotlindemo.network.NetworkModule
import com.amit.kotlindemo.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    interface Builder{
        fun build() : ViewModelInjector

        fun networkModule(networkModule : NetworkModule) : Builder
    }
}