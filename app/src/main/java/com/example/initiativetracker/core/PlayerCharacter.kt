package com.example.initiativetracker.core

import kotlin.random.Random

class PlayerCharacter(
    name: String,
    modifier: Int = 0,
    dice: Int = 20
) : com.example.initiativetracker.core.Character(name, modifier, dice) {
}