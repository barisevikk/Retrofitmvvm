package com.example.reetrofittmvvmprojectt.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.reetrofittmvvmprojectt.adapter.Adapter
import com.example.reetrofittmvvmprojectt.viewmodel.AnasayfaViewModel
import com.example.reetrofittmvvmprojectt.R
import com.example.reetrofittmvvmprojectt.databinding.FragmentAnasayfaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var vmodel: AnasayfaViewModel
    private lateinit var bindinggg: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindinggg = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        vmodel.livedataa.observe(viewLifecycleOwner) {
            val adapterr = Adapter(requireContext(), it)

            bindinggg.adapterap = adapterr



        }
        return bindinggg.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewmodel: AnasayfaViewModel by viewModels()
        vmodel = viewmodel
        viewmodel.rdata()


    }




}