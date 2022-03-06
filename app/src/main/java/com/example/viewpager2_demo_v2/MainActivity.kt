package com.example.viewpager2_demo_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager2_demo_v2.adapter.PageAdapter
import com.example.viewpager2_demo_v2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        binding.viewPager.adapter = PageAdapter(this)
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager){
            tab, pos ->
            when(pos){
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_apartment_24)
                    tab.icon?.setTint(ContextCompat.getColor(this,
                        android.R.color.black
                    ))
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_attribution_24)
                    tab.icon?.setTint(ContextCompat.getColor(this,
                        android.R.color.black
                    ))
                }
                2 -> {
                    tab.setIcon(R.drawable.ic_baseline_car_repair_24)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.black))
                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 250
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 70
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}