package com.example.mon3hom7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation.findNavController
import com.example.mon3hom7.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    companion object{
        const val USER = "USERNAME"
        const val STATUS = "STATUS"
        const val IMAGE = "IMAGE"
    }

    private var list =  arrayListOf<CharacterModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val adapter = CharacterViewHolder(list, this:: onClick)
        binding.recycleView.adapter =adapter


    }

    private fun loadData() {
        list.add(CharacterModel("", "", ""))
        list.add(CharacterModel("", "", ""))
        list.add(CharacterModel("", "", ""))
        list.add(CharacterModel("", "", ""))
    }

    private  fun onClick(position: Int){
    findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(R.id.tx_status, R.id.character_name))

    }
}
