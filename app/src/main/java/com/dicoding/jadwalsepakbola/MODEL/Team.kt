package com.dicoding.jadwalsepakbola.MODEL

import com.google.gson.annotations.SerializedName

/**
 * Created by ${JUNIA} on 8/30/2018.
 */
data class Team(


        @SerializedName("strTeam")
        var teamName: String? = null,

        @SerializedName("strTeamBadge")
        var teamBadge: String? = null
)