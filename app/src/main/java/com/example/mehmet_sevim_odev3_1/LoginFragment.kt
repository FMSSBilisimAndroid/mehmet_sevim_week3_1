package com.example.mehmet_sevim_odev3_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mehmet_sevim_odev3_1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    /**
     * nested graph arasında geçiş yapıyoruz
     * bunu yaparken nav_graph içersinde loginNested içerisinde action'a popUpTo ve popUpToInclusive
     * kullanarak tekrar dönülmesini engelliyoruz
     */
    private lateinit var fragmentLoginBinding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding=FragmentLoginBinding.inflate(inflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            buttonLogIn.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_mainFragment2)
            }
        }
    }

}