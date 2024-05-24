package com.example.lv5.ui.screen.addpoi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lv5.ui.screen.PoiViewModel

@Composable
fun AddPoiScreen(editViewModel: EditViewModel = viewModel(),
                 poiViewModel: PoiViewModel,
                 navigateToList: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val modifier = Modifier.padding(6.dp)
        OutlinedTextField(
            modifier = modifier,
            value = editViewModel.name,
            onValueChange = { editViewModel.name = it },
            label = { Text("Name") })
        OutlinedTextField(
            modifier = modifier,
            value = editViewModel.address,
            onValueChange = {editViewModel.address = it },
            label = { Text("Address") })
        Button(modifier = modifier, onClick = {
            //TODO:Pozvati dodavanje poi-a u Firebase Firestore
            editViewModel.reset()
            navigateToList()
        }) {
            Text(text = "Add Poi")
        }
    }
}
