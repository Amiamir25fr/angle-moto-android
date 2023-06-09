package com.example.moto3

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class SecondFragment : Fragment() {
    private var mTextView: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Get the TextView from the layout
        mTextView = view.findViewById(R.id.text_view)
        return view
    }

    fun updateText(text: String?) {
        if (mTextView != null) {
            mTextView!!.text = text
        }
    }
}