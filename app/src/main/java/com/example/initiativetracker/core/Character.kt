package com.example.initiativetracker.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

    @Composable
    fun DisplayCharacter() {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = name)
            Text(text = "$initiative")
        }
    }
}