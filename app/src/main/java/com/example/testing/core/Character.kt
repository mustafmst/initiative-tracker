package com.example.testing.core

import java.util.LinkedList
import kotlin.random.Random

open class Character(val name: String, val modifier: Int = 0, val dice: Int = 20) {
    var initiative: Int = 0
    var conditions: LinkedList<Condition> = LinkedList<Condition>()

    fun addCondition(newCondition: Condition) {
        this.conditions.add(newCondition)
    }

    fun checkConditions() {
        this.conditions.forEach {
            if (it.shouldBeRemoved()) {
                this.conditions.remove(it)
            }
        }
    }

    fun setInitiativeValue(initiative: Int) {
        this.initiative = initiative
    }

    fun rollForInitiative(){
        this.initiative = Random.nextInt(1, this.dice) + this.modifier
    }
}