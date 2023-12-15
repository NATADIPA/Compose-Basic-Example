

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


val cornerRadius = 8.dp
val items = arrayOf("Street","Satellite")
@Preview
@Composable
fun Toggle(){
    var selectedIndex by remember {
        mutableStateOf(0)
    }
    Row(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        items.forEachIndexed { index, item ->
            OutlinedButton(
                onClick = { selectedIndex = index },
                shape = when (index) {
                    // left outer button
                    0 -> RoundedCornerShape(topStart = cornerRadius, topEnd = 0.dp, bottomStart = cornerRadius, bottomEnd = 0.dp)
                    // right outer button
                    items.size - 1 -> RoundedCornerShape(topStart = 0.dp, topEnd = cornerRadius, bottomStart = 0.dp, bottomEnd = cornerRadius)
                    // middle button
                    else -> RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 0.dp, bottomEnd = 0.dp)
                },
                border = BorderStroke(1.dp, if(selectedIndex == index) { Color(0, 136, 198, 0xFF) } else { Color(0, 136, 198, 0xFF)}),
                colors = if(selectedIndex == index) {
                    // selected colors
                    ButtonDefaults.outlinedButtonColors(Color(0, 136, 198, 0xFF), contentColor = Color(0, 136, 198, 0xFF))
                } else {
                    // not selected colors
                    ButtonDefaults.outlinedButtonColors(MaterialTheme.colorScheme.surface, contentColor = MaterialTheme.colorScheme.primary)

                },
            ) {
                Text(
                    text = item,
                    color = if(selectedIndex == index) { Color.White} else { Color(0, 136, 198, 0xFF)},
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    style= MaterialTheme.typography.bodyLarge,
                    lineHeight = 18.sp,
                )
            }
        }
    }
}
@Composable
@Preview
fun preview(){
    Toggle()
}
