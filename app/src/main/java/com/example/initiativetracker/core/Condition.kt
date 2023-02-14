package com.example.initiativetracker.core

class Condition(val name: String, val description: String, roundCounter: Int?) {
    var roundsLeft: Int = roundCounter ?: 9999

    fun nextRound() {
        if (roundsLeft > 0) {
            roundsLeft--
        }
    }

    fun shouldBeRemoved(): Boolean {
        return roundsLeft < 1
    }
}