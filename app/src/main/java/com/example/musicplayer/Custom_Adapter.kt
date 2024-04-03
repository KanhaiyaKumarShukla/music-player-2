package com.example.musicplayer

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Custom_Adapter(context:Activity, singers:ArrayList<Singer>):ArrayAdapter<Singer>(context, 0, singers) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var SingersList=convertView
        if(SingersList==null){
            SingersList=LayoutInflater.from(context).inflate(
                R.layout.singer_item, parent, false
            )
        }
        val currentSinger=getItem(position)
        val singerImage=SingersList!!.findViewById<ImageView>(R.id.singer_iv)
        val singerImageRes=currentSinger!!.getSingerImage()
        singerImage.setImageResource(singerImageRes)

        val singerNameView= SingersList.findViewById<TextView>(R.id.singer_tv)
        val singerName= currentSinger.getSingerName()
        singerNameView.text=singerName
        return SingersList
    }
}