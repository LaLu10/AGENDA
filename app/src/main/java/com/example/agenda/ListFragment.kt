package com.example.agenda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.agenda.databinding.FragmentListBinding


class ListFragment : Fragment() {
    private var _binding: FragmentListBinding?=null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val manager= LinearLayoutManager(this.context)
        val decoration=DividerItemDecoration(this.context,manager.orientation)
        binding.recyclerContacts.layoutManager=manager
        binding.recyclerContacts.adapter= ContactsAdapter(ContactsProvider.contactslist)
    }
}