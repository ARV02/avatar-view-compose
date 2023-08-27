package com.example.avatarview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isUnspecified

@Composable
fun AvatarView(
    size: Dp,
    backgroundColor: Color = AvatarViewDefaults.backgroundColor,
    icon: Painter? = null,
    borderEnabled: Boolean = true,
    borderWidth: Dp = AvatarViewDefaults.borderSize,
    borderColor: Color = AvatarViewDefaults.borderColor,
    textColor: Color = AvatarViewDefaults.textColor,
    text: String? = null,
    textStyle: TextStyle = MaterialTheme.typography.displaySmall
) {
    var resizedTextStyle by remember { mutableStateOf(textStyle) }
    var shouldDraw by remember { mutableStateOf(false) }

    val fontSize = MaterialTheme.typography.displaySmall.fontSize

    Surface(
        shape = RoundedCornerShape(percent = 50),
        border = if (borderEnabled) BorderStroke(borderWidth, borderColor) else BorderStroke(0.dp, Color.Transparent),
        color = backgroundColor
    ) {
        Row(
            modifier = Modifier
                .size(size),
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
                Text(text = text!!,
                    modifier = Modifier.drawWithContent {
                        if(shouldDraw) {
                            drawContent()
                        }
                    },
                    color = textColor,
                    softWrap = false,
                    style = resizedTextStyle,
                    onTextLayout = {result ->
                        if(result.didOverflowWidth) {
                            if(textStyle.fontSize.isUnspecified) {
                                resizedTextStyle = resizedTextStyle.copy(
                                    fontSize = fontSize
                                )
                            }
                            resizedTextStyle = resizedTextStyle.copy(
                                fontSize = resizedTextStyle.fontSize * 0.95
                            )
                        } else {
                            shouldDraw = true
                        }
                    }
                )
            }
        }
    }
}

object AvatarViewDefaults {

    val textColor = Color.White

    val backgroundColor = Color.Black

    val borderColor = Color.White

    val borderSize = 1.dp
}