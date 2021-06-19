package com.example.campingapplication

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.GravityCompat
import com.example.campingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        //navi
        binding.hamburgerMain.setOnClickListener {
            binding.drawer.openDrawer(GravityCompat.START)
        }




        var locationData = listOf("-위치-", "서울", "경기도", "강원도", "충청도", "전라도", "경상도", "제주도")
        var locationAdapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, locationData)

        binding.mainTvLocationSpinner.adapter = locationAdapter

        binding.mainTvLocationSpinner.onItemSelectedListener = object : AdapterView.
            OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                    locationData.get(position)
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }

        var peopleData = listOf("-인원-", "1명", "2명", "3명", "4명", "5명이상")
        var peopleAdapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, peopleData)

        binding.mainTvPeopleSpinner.adapter = peopleAdapter

//        binding.mainTvPeopleSpinner.onItemSelectedListener = object : AdapterView.
//            OnItemSelectedListener {
//
//            }

        var checkinData = listOf("체크인", "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월")
        var checkinAdapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, checkinData)

        binding.mainTvCheckinSpinner.adapter = checkinAdapter



        var checkoutData = listOf("체크아웃", "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월")
        var checkoutAdapater = ArrayAdapter<String>(this, R.layout.simple_list_item_1, checkoutData)

        binding.mainTvCheckoutSpinner.adapter = checkoutAdapater

    }
}