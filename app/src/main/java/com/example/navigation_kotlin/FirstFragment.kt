package com.example.navigation_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation_kotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       val view= inflater.inflate(R.layout.fragment_first, container, false)
        view.textView1.setOnClickListener {
            val action=FirstFragmentDirections.actionFirstFragmentToSecondFragment2(22)
            Navigation.findNavController(view)
                .navigate(action)
        }
            return view
        }
    }

