package com.assproject.assdesenvolvimentointerface.ui.formacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.assproject.assdesenvolvimentointerface.R

class FormacaoFragment : Fragment() {

    private lateinit var formacaoViewModel: FormacaoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        formacaoViewModel =
                ViewModelProvider(this).get(FormacaoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_formacao, container, false)

        return root
    }
}