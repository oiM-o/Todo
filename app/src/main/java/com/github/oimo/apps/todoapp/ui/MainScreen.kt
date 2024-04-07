package com.github.oimo.apps.todoapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.oimo.apps.todoapp.ui.theme.TodoAppTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun createMainScreen(){
    Scaffold (
        modifier = Modifier,
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,),
                title = {
                    Text("Todo App")
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = {Text(text = "Add Todo")},
                icon = { Icon(Icons.Filled.Edit,"Extended floating action button.") },
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(16.dp)
            )
        }
        
    ){ contentPadding: PaddingValues ->
        Column(
            modifier = Modifier.padding(contentPadding)
        ) {
            Text(text = "Hello, Mio!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    createMainScreen()
}