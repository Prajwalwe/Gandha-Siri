package com.gandhasiri.domain

class MaturityCalculator {
    fun getYearsToMaturity(girthCm: Double): Int {
        return when {
            girthCm < 30.0 -> 15
            girthCm < 45.0 -> 10
            girthCm < 60.0 -> 5
            else -> 0 
        }
    }

    fun getHealthStatus(girth: Double, ageInYears: Int): String {
        val growthRate = girth / ageInYears
        return if (growthRate > 2.0) "Healthy" else "Needs Attention"
    }
}
