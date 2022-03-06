package com.example.viewpager2_demo_v2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2_demo_v2.screens.FirstFragment
import com.example.viewpager2_demo_v2.screens.SecondFragment
import com.example.viewpager2_demo_v2.screens.ThreeFragment

class PageAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThreeFragment()
        }
    }
}