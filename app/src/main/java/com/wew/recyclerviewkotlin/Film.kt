package com.wew.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Film(
    val imgFilm: Int,
    val nameFilm: String,
    val descFilm: String
) : Parcelable
