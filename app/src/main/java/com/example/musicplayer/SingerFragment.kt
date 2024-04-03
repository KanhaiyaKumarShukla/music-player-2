package com.example.musicplayer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class SingerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView=inflater.inflate(R.layout.singers_list, container, false)
        val singers= arrayListOf(
            Singer(R.drawable.arijit_i, "Arijit Singh"),
            Singer(R.drawable.sonu_i, "Sonu Nigam"),
            Singer(R.drawable.shreya_i, "Shreya Ghoshal"),
            Singer(R.drawable.sunidhi_i, "Sunidhi Chauhan"),
            Singer(R.drawable.honey_i, "Yo Yo Honey Singh"),
            Singer(R.drawable.armaan_i, "Armaan Malik"),
            Singer(R.drawable.javed_i, "Javed Ali"),
            Singer(R.drawable.jubin_i,"Jubin Nautiyal"),
            Singer(R.drawable.kk_i,"KK"),
            Singer(R.drawable.neha_i,"Neha Kakkar"),
            Singer(R.drawable.rahman_i,"A. R. Rahman"),
            Singer(R.drawable.badshah_i,"Badshah"),
            Singer(R.drawable.diljit_i,"Diljit Dosanjh")
        )
        val SingersLayout=rootView?.findViewById<ListView>(R.id.singersListView)
        val SingerAdaper=Custom_Adapter(requireActivity(), singers)
        SingersLayout?.adapter=SingerAdaper
        return rootView
    }

}