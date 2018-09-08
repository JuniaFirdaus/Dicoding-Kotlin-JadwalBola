package com.dicoding.jadwalsepakbola.API

import java.net.URL

/**
 * Created by ${JUNIA} on 8/30/2018.
 */
class ApiRespository{

    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}