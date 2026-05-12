package com.gandhasiri.domain

/**
 * Business logic for Sandalwood growth cycles.
 * Calculated based on Karnataka Forest Department guidelines for girth.
 */
object MaturityCalculator {
    fun calculateHeartwoodReady(girthCm: Double): Double {
        // Standard formula: Heartwood volume starts significantly after 45cm girth
        return if (girthCm < 15.0) 0.0 else (girthCm * 0.15) 
    }

    fun getGrowthAdvice(girthCm: Double): String {
        return when {
            girthCm < 20 -> "Focus on host plant (e.g., Red Sanders or Neem) for nitrogen."
            girthCm < 45 -> "Active growth phase. Monitor for stem borers."
            else -> "Maturity reached. Consult Forest Department for harvesting permit."
        }
    }
}
