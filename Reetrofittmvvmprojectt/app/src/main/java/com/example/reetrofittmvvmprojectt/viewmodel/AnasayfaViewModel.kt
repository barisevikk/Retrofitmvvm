package com.example.reetrofittmvvmprojectt.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.reetrofittmvvmprojectt.model.Model
import com.example.reetrofittmvvmprojectt.retrofit.Retrofitdao
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var dao: Retrofitdao) : ViewModel() {
    //private val disposable = CompositeDisposable()
    var job: Job? = null

    var livedataa = MutableLiveData<List<Model>>()


    fun rdata() {

        job = CoroutineScope(Dispatchers.IO).launch {
            var response = dao.getdata()
            if (response.isSuccessful) {
                livedataa.postValue(response.body())

            }

        }
    }
}