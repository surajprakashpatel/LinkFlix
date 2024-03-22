package com.srsoft.linkflix.ui.fragments

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.srsoft.linkflix.R
import com.srsoft.linkflix.databinding.FragmentSplashBinding



class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialization()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root

    }

    private fun initialization(){
        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {

              findNavController().navigate(R.id.action_splashFragment_to_welcomeFragment)
            }
        }.start()
    }

}