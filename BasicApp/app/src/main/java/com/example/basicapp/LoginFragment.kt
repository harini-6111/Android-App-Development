package com.example.basicapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.basicapp.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class LoginFragment : Fragment() {
    lateinit var binding:FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)

        binding.button.setOnClickListener(){

            if(binding.editTextTextEmailAddress.text.isNullOrBlank() || binding.editTextTextPassword.text.isNullOrBlank())
            {
                Toast.makeText(view?.context,"Please fill the required Details", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(view?.context,"${binding.editTextTextEmailAddress.text} is logged in", Toast.LENGTH_SHORT).show()
                onClick(it)
            }

        }
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_login, container, false)

        return binding.root
    }

    fun onClick(view: View) {
        val action =
            LoginFragmentDirections.actionLoginFragmentToListFragment()
        view.findNavController().navigate(action)
    }


}