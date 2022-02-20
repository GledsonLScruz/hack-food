package com.example.ifood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ifood.databinding.FragmentBagBinding
import com.example.ifood.databinding.FragmentUltimoBinding


class UltimoFragment : Fragment() {
    private var binding: FragmentUltimoBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentUltimoBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.ultimoFragment = this
    }
}