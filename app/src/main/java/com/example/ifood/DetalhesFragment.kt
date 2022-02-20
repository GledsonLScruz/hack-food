package com.example.ifood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.ifood.databinding.FragmentDetalhesBinding
import com.example.ifood.databinding.FragmentMarketBinding

class DetalhesFragment : Fragment() {

    private var binding: FragmentDetalhesBinding? = null

    private val sharedViewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentDetalhesBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Specify the fragment as the lifecycle owner
            lifecycleOwner = viewLifecycleOwner

            // Assign the view model to a property in the binding class
            viewModel = sharedViewModel

            // Assign the fragment
            detalhesFragment = this@DetalhesFragment
        }

    }
    fun gonextscreen(){
        findNavController().navigate(R.id.action_detalhesFragment_to_ultimoFragment)
    }
}