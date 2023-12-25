package com.akshayashokcode.unittestingapp

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MyCalcTest{
    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnCorrectResult(){

        val result = myCalc.calculateCircumference(2.1)
        assertEquals(13.188,result, 0.01)
    }
    @Test
    fun calculateCircumference_ZeroRadius_returnCorrectResult(){

        val result = myCalc.calculateCircumference(0.0)
        assertEquals(0.0,result, 0.01)
    }

    @Test
    fun calculateArea_radiusGiven_returnCorrectResult(){
        val result = myCalc.calculateArea(2.0)
        assertEquals(12.56,result, 0.01)
    }

    @Test
    fun calculateArea_zeroRadius_returnCorrectResult(){
        val result = myCalc.calculateArea(0.0)
        assertEquals(0.0,result, 0.01)
    }
}