package com.example.myfragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_second.*

class MainActivity : AppCompatActivity(), secondFragment.getUserDetails {
    val TAG = "fragment&activity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "==>onCreate()")
        loadFragment()
    }
    private fun loadFragment(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = secondFragment()
        secondFragment.userDetails= this
        fragmentTransaction.add(R.id.framelayoutid,secondFragment)
        fragmentTransaction.commit()


    }

    override fun showDetails(firstname:String,lastname:String) {
        val firstFragment : FirstFragment = firstfragment as FirstFragment
        firstFragment.showdetails(firstname, lastname)

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

}
