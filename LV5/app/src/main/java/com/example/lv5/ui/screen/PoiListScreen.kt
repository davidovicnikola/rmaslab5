package com.example.lv5.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lv5.model.Poi

@Composable
fun PoiListScreen(list: List<Poi>, navigateToViewPoi: () -> Unit, setSelectedPoi: (Poi) -> Unit) {

    LazyColumn {
        items(list) {
            PoiPreview(poi = it, navigateToViewPoi, setSelectedPoi)
        }
    }
}

@Composable
fun PoiPreview(poi:Poi, navigateToViewPoi: () -> Unit, setSelectedPoi: (Poi) -> Unit){
    Card(modifier = Modifier
        .padding(12.dp)
        .fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                modifier = Modifier.padding(6.dp),
                text = "${poi.name}, ${poi.address}"
            )
            Spacer(
                Modifier
                    .weight(1f)
                    .fillMaxHeight())

            ElevatedButton(modifier = Modifier.padding(6.dp) ,onClick = {
                setSelectedPoi(poi)
                navigateToViewPoi()
            }) {
                Text(text = "View")
            }
        }
    }
}