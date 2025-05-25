package dev.danielsantiago.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.danielsantiago.aluvery.R
import dev.danielsantiago.aluvery.model.Product
import java.math.BigDecimal

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
        Row (
            modifier = Modifier
                .padding(top = 8.dp)
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier.width(0.dp))
            products.forEach {
                ProductItem(it)
            }
            Spacer(Modifier.width(0.dp))
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun ProductSectionPreview() {
    ProductSection(
        products = listOf(
            Product(
                name = "Hamburgui",
                value = BigDecimal("20.50"),
                image = R.drawable.burger
            ),Product(
                name = "Pizza",
                value = BigDecimal("20.50"),
                image = R.drawable.pizza
            ), Product(
                name = "Fritas",
                value = BigDecimal("20.50"),
                image = R.drawable.fries
            )
        )
    )
}