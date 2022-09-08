package com.example.reetrofittmvvmprojectt.retrofit

class Apiutilss {
    companion object{
        var Baseurl="https://raw.githubusercontent.com/"
        fun retrofitdao(): Retrofitdao {
            return Retrofitclient.getclient(Baseurl).create(Retrofitdao::class.java)
        }
    }
}




















