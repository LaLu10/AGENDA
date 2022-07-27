package com.example.agenda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agenda.databinding.FragmentDeleteBinding
import com.example.agenda.databinding.FragmentListBinding


class DeleteFragment : Fragment() {
    private var _binding: FragmentDeleteBinding?=null
    private val binding get()= _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDeleteBinding.inflate(inflater,container,false)
        return binding.root
    }



}