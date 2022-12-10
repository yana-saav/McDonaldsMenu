package com.example.mcdonaldsmenu.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.mcdonaldsmenu.R
import com.example.mcdonaldsmenu.databinding.FragmentListBinding


class ListFragment : Fragment() {

    lateinit var adapter: ArticleAdapter
    lateinit var binding: FragmentListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ArticleAdapter{
            findNavController().navigate(ListFragmentDirections.actionListFragmentToAboutDishFragment(it))
        }
        val rv = view.findViewById<RecyclerView>(R.id.menu_recycler)
        rv.adapter = adapter
        adapter.setData(ArticleModel.createDefultData())
    }
}