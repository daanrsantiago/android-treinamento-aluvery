package dev.danielsantiago.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.danielsantiago.aluvery.model.Product
import dev.danielsantiago.aluvery.numberFormat
import dev.danielsantiago.aluvery.ui.theme.Purple200
import dev.danielsantiago.aluvery.ui.theme.SeaGreen
import java.math.BigDecimal

@Composable
fun ProductItem(
    product: Product
) {

    val imageSize = 100.dp

    Surface(
        Modifier
            .width(200.dp),
        shadowElevation = 5.dp,
        shape = RoundedCornerShape( 15.dp ),
    ) {
        Column (
            Modifier
                .heightIn(min = 250.dp, max = 300.dp)
                .width(200.dp)
        ) {
            Box (
                Modifier
                    .fillMaxWidth()
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple200,
                                SeaGreen
                            )
                        )
                    )
            ) {
                Image(
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter),
                    painter = painterResource(id = product.image),
                    contentDescription = "imagem",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(Modifier.height(imageSize/2))
            Column(
                modifier = Modifier.padding(10.dp),
            ) {
                Text(
                    modifier = Modifier.padding( bottom = 8.dp),
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = Ellipsis
                )
                Text(
                    text = numberFormat.format(product.value),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }

    }

}

@Preview(
    showBackground = true
)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
            name = "Hamburgui",
            value = BigDecimal("20.50")
        )
    )
}