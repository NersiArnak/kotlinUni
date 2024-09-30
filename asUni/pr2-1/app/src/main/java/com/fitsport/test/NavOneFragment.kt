package com.fitsport.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fitsport.test.databinding.FragmentNavOneBinding
import com.fitsport.test.databinding.FragmentOneBinding

class NavOneFragment : Fragment() {
    lateinit var binding: FragmentNavOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNavOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            NavOneFragment()
    }
}