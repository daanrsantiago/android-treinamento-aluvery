package dev.danielsantiago.aluvery.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.danielsantiago.aluvery.model.Product
import dev.danielsantiago.aluvery.sampledata.SampleData
import dev.danielsantiago.aluvery.ui.components.ProductSection


@Composable
fun HomeScreen(
    sections: Map<String, List<Product>> = SampleData.sampleSections
) {

    Surface(
        Modifier
            .padding(top = 40.dp)
    ) {
        LazyColumn (
            Modifier
                .fillMaxHeight(),
            contentPadding = PaddingValues( vertical = 16.dp )
        ) {
            for ((title, products) in sections) {
                item {
                    ProductSection(
                        name = title,
                        products = products
                    )
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}