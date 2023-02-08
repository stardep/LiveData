package com.example.livedata

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityLiveData:ViewModel(){

    private var myRandomNumber:MutableLiveData<String>? =null
    private var TAG= this::class.simpleName

    fun getNumber():MutableLiveData<String>?{

        Log.i(TAG, "Get Number function called")

        if(myRandomNumber==null)
        {
            Log.i(TAG, "getNumber: Called")
            generateNumber()
        }
        return myRandomNumber
    }

    private fun generateNumber():MutableLiveData<String>?
    {
        val RandomNumber = (Random.nextInt(10) +1).toString()
        Log.i(TAG, "Random Number Generated is: $myRandomNumber")
        myRandomNumber?.value =RandomNumber
        return myRandomNumber
    }
    override fun onCleared() {
        super.onCleared()
    }
}