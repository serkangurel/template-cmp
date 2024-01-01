import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    desktopAppInit()
    Window(onCloseRequest = ::exitApplication, title = "template-cmp") {
        App(
            darkTheme = false,
            dynamicColor = false
        )
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App(
        darkTheme = false,
        dynamicColor = false
    )
}