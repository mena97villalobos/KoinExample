package net.avantica.koinexample.ui.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import net.avantica.koinexample.R
import org.koin.android.viewmodel.ext.android.viewModel

class SecondFragment : Fragment() {

    private val viewModel: SecondViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

}
