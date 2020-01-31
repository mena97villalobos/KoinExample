package net.avantica.koinexample.di

import net.avantica.koinexample.ui.second.DummyClass
import net.avantica.koinexample.ui.second.SecondViewModel
import net.avantica.koinexample.ui.first.FirstViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

// Koin modules declaration
val appModules = module {

    // Declaring a singleton instance of this class
    // Dummy variable is used as a parameter, must use parametersOf()
    // in the injected class
    single { DummyClass() }

    // Declaring a view model instance
    viewModel { FirstViewModel() }

    // View model with a dependency on DummyClass, use get() to inject
    // the dependency from the singleton declaration on top
    viewModel { SecondViewModel(get()) }

}