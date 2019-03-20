package com.example.ehu.sample_bug_of_recycleview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.ehu.sample_bug_of_recycleview.databinding.FragmentListViewBinding

class ListViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListViewBinding>(
            inflater,
            R.layout.fragment_list_view,
            container,
            false
        )

        //listのセット
        val list = (0..100).map { it.toString() }
        binding.listView.apply {
            adapter = ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, list)
            addHeaderView(getHederView(R.layout.header_item))
        }

        return binding.root
    }

    fun getHederView(resorce:Int):View{
        return LayoutInflater.from(context)
            .inflate(resorce,null)
    }

}
