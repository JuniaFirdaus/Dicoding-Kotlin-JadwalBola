package com.dicoding.jadwalsepakbola.MAIN

import com.dicoding.jadwalsepakbola.API.ApiRespository
import com.dicoding.jadwalsepakbola.API.TheSportDBApi
import com.dicoding.jadwalsepakbola.MODEL.TeamResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by ${JUNIA} on 8/30/2018.
 */
class MainPresenter(private val view: MainView,
                    private val apiRepository: ApiRespository,
                    private val gson: Gson) {

    fun getTeamList(league: String?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getTeam(league)),
                    TeamResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }

}