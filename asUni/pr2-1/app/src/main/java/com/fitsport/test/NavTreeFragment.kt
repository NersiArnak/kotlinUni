package com.fitsport.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fitsport.test.databinding.FragmentNavOneBinding
import com.fitsport.test.databinding.FragmentNavTreeBinding

class NavTreeFragment : Fragment() {
    lateinit var binding: FragmentNavTreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNavTreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NavTreeFragment()
    }
}