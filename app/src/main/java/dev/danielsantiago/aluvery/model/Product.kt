package dev.danielsantiago.aluvery.model

import androidx.annotation.DrawableRes
import dev.danielsantiago.aluvery.R
import java.math.BigDecimal

data class Product(
    val name: String,
    val value: BigDecimal,
    @DrawableRes val image: Int = R.drawable.ic_launcher_background
) {

}
