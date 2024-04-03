package com.example.musicplayer

class Singer(private val imageResourceId:Int,
             private val singerName:String) {

    fun getSingerImage():Int{
        return imageResourceId
    }
    fun getSingerName():String{
        return singerName
    }
}