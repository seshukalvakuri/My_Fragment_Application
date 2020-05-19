package com.example.myfragmentapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FirstFragment : Fragment() {
    val TAG = "fragment&activity"
    lateinit var firstname_tv :TextView
    lateinit var lastname_tv :TextView

    public fun showdetails(firstname:String,lastname:String){
        firstname_tv.setText(firstname)
        lastname_tv.setText(lastname)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "fragment ==> onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "fragment==> onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        var firstname_tv = view.findViewById<TextView>(R.id.firstname_tv)
        var lastname_tv = view.findViewById<TextView>(R.id.lastname_tv)

        Log.d(TAG, "fragment==> onCreateView()")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "fragment==> onActivityCreated()")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "fragment==> onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "fragment==> onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "fragment==> onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "fragment==> onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "fragment==> onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "fragment==> onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "fragment==> onDetach()")
    }




}


