package dev.danielsantiago.aluvery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.danielsantiago.aluvery.model.Product
import dev.danielsantiago.aluvery.sampledata.SampleData

@Composable
fun ProductSection(
    name: String = "Promoção",
    products: List<Product>
) {
    Column {
        Text(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, bottom = 8.dp),
            text = name,
            fontWeight = FontWeight(400),
            fontSize = 20.sp
        )
        LazyRow (
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(products) { product ->
                ProductItem(product)
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun ProductSectionPreview() {
    ProductSection(
        products = SampleData.sampleProducts
    )
}