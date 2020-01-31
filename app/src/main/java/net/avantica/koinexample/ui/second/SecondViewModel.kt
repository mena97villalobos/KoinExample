package net.avantica.koinexample.ui.second

import androidx.lifecycle.ViewModel
import org.koin.java.KoinJavaComponent.inject

class SecondViewModel(val number: Int) : ViewModel() {

    val dummyClass: DummyClass by inject(DummyClass::class.java)

}
