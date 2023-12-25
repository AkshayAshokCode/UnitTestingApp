package com.akshayashokcode.unittestingapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class CalcViewModelTest{

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        calculations=Mockito.mock(Calculations::class.java)
        Mockito.`when`(calculations.calculateArea(2.1)).thenReturn(13.8474)
        Mockito.`when`(calculations.calculateCircumference(2.0)).thenReturn(12.56)
        calcViewModel=CalcViewModel(calculations)
    }

    private lateinit var calcViewModel: CalcViewModel
    private lateinit var calculations: Calculations

    @Test
    fun calculateArea_radiusSent_updateLiveData(){
        calcViewModel.calculateArea(2.1)
        val result=calcViewModel.areaValue.value
        assertEquals("13.8474",result)
    }

    @Test
    fun calculateCircumference_radiusSent_updateLiveData(){
        calcViewModel.calculateCircumference(2.0)
        val result=calcViewModel.circumference.value
        assertEquals("12.56",result)
    }
}