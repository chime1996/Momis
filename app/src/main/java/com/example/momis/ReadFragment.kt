package com.example.momis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.momis.databinding.FragmentReadBinding


class ReadFragment : Fragment() {


    private var _binding : FragmentReadBinding? = null
    private val binding : FragmentReadBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentReadBinding.inflate(inflater,container,false)
        return binding.root

     //   return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}