package com.example.ravn.model

import java.io.Serializable

public class Informacion(text1: String, text2: String):Serializable {
   val textt:String
    val textt2:String


    init {
        this.textt = text1
        this.textt2 = text2

       }
    }