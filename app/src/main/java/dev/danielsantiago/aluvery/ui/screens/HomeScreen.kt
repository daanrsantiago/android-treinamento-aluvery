package dev.danielsantiago.aluvery.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.danielsantiago.aluvery.R
import dev.danielsantiago.aluvery.model.Product
import dev.danielsantiago.aluvery.ui.components.ProductSection
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    val products = listOf(
        Product(
            name = "Hamburgui",
            value = BigDecimal("20.50"),
            image = R.drawable.burger
        ), Product(
            name = "Pizza",
            value = BigDecimal("20.50"),
            image = R.drawable.pizza
        ), Product(
            name = "Fritas",
            value = BigDecimal("20.50"),
            image = R.drawable.fries
        )
    )

    Surface(
        Modifier
            .padding(top = 40.dp)
    ) {
        Column(
            Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {
            repeat(4) {
                ProductSection(products = products) 
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