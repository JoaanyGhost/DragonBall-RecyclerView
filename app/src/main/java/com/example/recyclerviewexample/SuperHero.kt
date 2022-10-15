package com.example.recyclerviewexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class SuperHero(val nameSuperHero: String, val publisher: String, val realName: String, val desc: String, val image: String): Parcelable

