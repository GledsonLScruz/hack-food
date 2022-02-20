package com.example.ifood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ifood.databinding.FragmentBagBinding
import com.example.ifood.databinding.FragmentMarketBinding

class BagFragment : Fragment() {
    private var binding: FragmentBagBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentBagBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.bagFragment = this
    }
    fun gonextscreen(){
        findNavController().navigate(R.id.action_bagFragment_to_receitaFragment)
    }
}