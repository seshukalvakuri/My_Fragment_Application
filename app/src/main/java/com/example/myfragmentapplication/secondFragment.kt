package com.example.myfragmentapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_second.*


class secondFragment : Fragment() {

    interface getUserDetails {
        fun showDetails(firstname:String,lastname:String)

    }
    lateinit var userDetails:getUserDetails

    lateinit var firstname_et:EditText
    lateinit var lastname_et:EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        var showdetail_btn = view.findViewById<Button>(R.id.showdetail_btn)
//        firstname_et = view.findViewById(R.id.firstname_et)
//        lastname_et = view.findViewById(R.id.lastname_et)
        showdetail_btn.setOnClickListener(View.OnClickListener {
            userDetails.showDetails(firstname_et.text.toString(),lastname_et.text.toString())
        }

        )
        return view
    }


}
