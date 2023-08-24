package com.example.avatarview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AvatarView(
    icon: Painter? = null,
    isBorder: Boolean = true,
    borderColor: Color = Color.LightGray,
    color:Color = MaterialTheme.colorScheme.surface,
    text: String? = null
) {
    Surface(
        shape = RoundedCornerShape(percent = 50),
        border = if(isBorder) BorderStroke(width = 1.dp, color = borderColor) else BorderStroke(width = 0.dp, color = Color.Unspecified),
        color = color
    ) {
        Row(
            modifier = Modifier
                .padding(2.dp)
                .size(64.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if(icon != null) {
                Icon(
                    painter = icon,
                    contentDescription = "Avatar View",
                    tint = Color.Unspecified
                )
            } else {
                Text(text = text!!, fontSize = 28.sp)
            }
        }
    }
}

@Composable
@Preview
fun PreviewAvatarView() {
    AvatarView(text = "AR")
}