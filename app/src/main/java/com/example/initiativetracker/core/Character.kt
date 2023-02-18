package com.example.initiativetracker.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.LinkedList
import kotlin.random.Random

open class Character(val name: String) {
    var initiative: Int = 0

    fun setInitiativeValue(initiative: Int) {
        this.initiative = initiative
    }

    @Composable
    fun DisplayCharacter(modifier: Modifier = Modifier) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = name,
                fontSize = 30.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(text = "$initiative",
                fontSize = 30.sp,
                modifier = Modifier.padding(end = 20.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CharacterTabPreview() {
    val character = Character("test")
    character.DisplayCharacter()
}
