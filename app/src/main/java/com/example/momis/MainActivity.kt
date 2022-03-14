package com.example.momis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.momis.databinding.ActivityMainBinding
import com.example.momis.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
         binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // initialising document
        val homeFragment = HomeFragment()
        val hospitalFragment = HospitalFragment()
        val profileFragment = ProfileFragment()
        val readFragment = ReadFragment()

        // setting the current fragment

        setCurrentFragment(homeFragment)

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){


                R.id.nav_home -> setCurrentFragment(homeFragment)
                R.id.nav_hospital -> setCurrentFragment(hospitalFragment)
                R.id.nav_profile -> setCurrentFragment(profileFragment)
                R.id.nav_read -> setCurrentFragment(readFragment)

            }
            true

        }
    }

    private fun setCurrentFragment(fragment : Fragment) = supportFragmentManager.beginTransaction().apply {

        replace(R.id.frame_fragment,fragment)
        commit()
    }
}