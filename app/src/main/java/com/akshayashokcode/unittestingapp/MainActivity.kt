package com.akshayashokcode.unittestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.akshayashokcode.unittestingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CalcViewModel
    lateinit var factory: CalcViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        factory = CalcViewModelFactory(MyCalc())
        viewModel = ViewModelProvider(this, factory)[CalcViewModel::class.java]
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this
    }
}