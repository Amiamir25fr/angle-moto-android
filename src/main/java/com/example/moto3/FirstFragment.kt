package com.example.moto3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FirstFragment : Fragment() {
    private var mButton: Button? = null
    private var mSecondFragment: SecondFragment? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Get the button from the layout
        mButton = view.findViewById(R.id.button)

        // Set a click listener for the button
        mButton!!.setOnClickListener { updateText() }

        // Get the second fragment from the fragment manager
        mSecondFragment =
            parentFragmentManager.findFragmentById(R.id.fragment_second) as SecondFragment?
        return view
    }

    private fun updateText() {
        if (mSecondFragment != null) {
            mSecondFragment!!.updateText("Text updated from FirstFragment")
        }
    }
}