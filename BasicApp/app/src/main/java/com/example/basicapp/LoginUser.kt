package com.example.basicapp

import android.util.Patterns

data class LoginUser(private val emailAddr:String ,private val pswd:String){

    public fun getEmail():String{
        return emailAddr
    }

    public fun getPswd():String{
        return pswd
    }


    public fun isEmailValid():Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
    }

    public fun isPasswordValid():Boolean{
        return getPswd().length>6
    }

}
