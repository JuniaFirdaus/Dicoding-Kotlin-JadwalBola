package com.dicoding.jadwalsepakbola.MAIN

import com.dicoding.jadwalsepakbola.MODEL.Team

/**
 * Created by ${JUNIA} on 8/30/2018.
 */
interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}