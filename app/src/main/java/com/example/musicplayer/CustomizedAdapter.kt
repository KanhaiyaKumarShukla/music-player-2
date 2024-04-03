package com.example.musicplayer

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class CustomizedAdapter(val context: Context, fm:FragmentManager):
FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 1
    }

    override fun getItem(postion:Int): Fragment {
        return SingerFragment()
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Singers"
    }
}