package com.example.initiativetracker.core

class NonPlayerCharacter(
    name: String,
    modifier: Int = 0,
    dice: Int = 20
) : com.example.initiativetracker.core.Character(name, modifier, dice) {
    init {
        this.rollForInitiative()
    }
}