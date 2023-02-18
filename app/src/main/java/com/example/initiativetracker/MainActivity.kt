package com.example.initiativetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.initiativetracker.core.Character
import com.example.initiativetracker.ui.theme.InitiativetrackerTheme


class MainActivity : ComponentActivity() {
    var tracker: Tracker = Tracker()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InitiativetrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    tracker.DisplayTracker()
                }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun DefaultPreview() {
        // initialize data for preview
        tracker.addCharacter(Character("test1"))
        tracker.addCharacter(Character("test2"))

        InitiativetrackerTheme {
            tracker.DisplayTracker()
        }
    }
}