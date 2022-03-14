package com.example.momis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.momis.databinding.FragmentHospitalBinding



class HospitalFragment : Fragment() {


    private var _binding : FragmentHospitalBinding? = null
    private val binding : FragmentHospitalBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentHospitalBinding.inflate(inflater,container,false)
        return binding.root

     //   return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}