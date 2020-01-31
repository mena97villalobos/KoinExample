package net.avantica.koinexample.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import net.avantica.koinexample.R
import net.avantica.koinexample.databinding.FirstFragmentBinding
import org.koin.android.viewmodel.ext.android.viewModel

class FirstFragment : Fragment() {

    // Inject the view model using the extension lazy function viewModel
    private val viewModel: FirstViewModel by viewModel()
    private lateinit var binding : FirstFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.first_fragment,
            container,
            false
        )

        binding.next.setOnClickListener(
            Navigation.createNavigateOnClickListener(FirstFragmentDirections.actionMainToHome())
        )

        return binding.root
    }

}
