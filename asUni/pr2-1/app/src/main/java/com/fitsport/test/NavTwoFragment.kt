package com.fitsport.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fitsport.test.databinding.FragmentNavTwoBinding
import com.fitsport.test.databinding.FragmentOneBinding

class NavTwoFragment : Fragment() {
    lateinit var binding: FragmentNavTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNavTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            NavTwoFragment()
    }
}