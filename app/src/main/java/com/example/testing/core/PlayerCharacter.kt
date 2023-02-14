package com.example.testing.core

import kotlin.random.Random

class PlayerCharacter(
    name: String,
    modifier: Int = 0,
    dice: Int = 20
) : com.example.testing.core.Character(name, modifier, dice) {
}