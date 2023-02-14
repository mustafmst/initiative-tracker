package com.example.testing.core

class NonPlayerCharacter(
    name: String,
    modifier: Int = 0,
    dice: Int = 20
) : com.example.testing.core.Character(name, modifier, dice) {
    init {
        this.rollForInitiative()
    }
}