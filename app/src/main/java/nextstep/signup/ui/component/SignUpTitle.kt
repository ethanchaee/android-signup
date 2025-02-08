package nextstep.signup.ui.component

import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import nextstep.signup.R
import nextstep.signup.ui.theme.Typography

@Composable
fun SignUpTitle(
    modifier: Modifier = Modifier,
    text: String = stringResource(R.string.sign_up_title),
) {
    Text(
        text = text,
        modifier = modifier.heightIn(min = 20.dp),
        style = Typography.titleLarge,
        fontWeight = FontWeight.Bold,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}

@Preview(showBackground = true)
@Composable
private fun SignUpTitlePreview() {
    SignUpTitle(
        text = stringResource(R.string.sign_up_title)
    )
}