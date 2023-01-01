package com.example.mon3hom7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mon3hom7.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var  binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val name = arguments?.getString(FirstFragment.USER)
        val status = arguments?.getString(FirstFragment.STATUS)
        val image = arguments?.getInt(FirstFragment.IMAGE)
        binding.status.text = status.toString()
        binding.name.text = name.toString()
        binding.imageCharacter.loadImage(image.toString())








    }

}