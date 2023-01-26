package com.example.basicapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LoginFragmentViewModel:ViewModel() {

//    var emailAddr:MutableLiveData<String>()
//    var pswd:MutableLiveData<String>()



    lateinit var userMutableLiveData:MutableLiveData<LoginUser>

    fun getUser():MutableLiveData<LoginUser>{
        if (userMutableLiveData == null) {
            userMutableLiveData = MutableLiveData()
        }
        return userMutableLiveData
    }



}