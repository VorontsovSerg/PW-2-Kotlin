package com.example.pw2kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pw2kotlin.databinding.Fragment3Binding

class Fragment3 : Fragment() {

    private lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(inflater, container, false)

        binding.buttonGotoFragment2.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, Fragment2())
                .addToBackStack(null)
                .commit()
        }

        binding.buttonGotoFragment1.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, Fragment1())
                .addToBackStack(null)
                .commit()
        }

        return binding.root
    }
}
