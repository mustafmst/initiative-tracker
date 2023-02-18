package com.example.initiativetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.initiativetracker.core.Character
import com.example.initiativetracker.ui.theme.InitiativetrackerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InitiativetrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    // initialize data for preview
    val character1 = Character("test1")
    val character2 = Character("test2")

    InitiativetrackerTheme {
        Box(
            modifier = Modifier.padding(10.dp)
        ) {
            Column {
                character1.DisplayCharacter()
                character2.DisplayCharacter()
            }
        }
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    FloatingActionButton(
                        onClick = { /*TODO: open activity for party input*/ },
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Icon(imageVector = Icons.Rounded.Add, contentDescription = null)
                    }
                }
            }
        }
    }
}
