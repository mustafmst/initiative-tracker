package com.example.initiativetracker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.LinkedList

class Tracker {
    var characters: LinkedList<com.example.initiativetracker.core.Character> =
        LinkedList<com.example.initiativetracker.core.Character>()

    fun addCharacter(character: com.example.initiativetracker.core.Character) {
        this.characters.add(character)
    }

    @Composable
    fun DisplayTracker() {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier
            ) {
                Text(
                    text = "Postacie:",
                    fontSize = 30.sp
                    )
            }
            characters.forEach {
                Row {
                    it.DisplayCharacter()
                }
            }
        }
    }
}