**1.Splash Screen Jetpack compose Code
Link: https://github.com/Sainathhiwale/JetpackCompose_BootCamp_2025/pull/1**


**2.TextView Jetpack Code
Link: https://github.com/Sainathhiwale/JetpackCompose_BootCamp_2025/pull/5**



# What is Jetpack compose?
Jetpack Compose is Android’s modern, declarative UI toolkit used to build native Android user interfaces.
It allows developers to create UI using Kotlin code instead of XML, making UI development simpler, faster, and more maintainable.
# Example
```
setContent{
  displayText("Android")
}

@Composable
fun displayText(name:String){
 Text(text ="Hello $name")
}
```
# Note: When importing classes related to Jetpack Compose in this project, use those from:
- androidx.compose.* for compiler and runtime classes.
- androidx.compose.ui.* for UI toolkit and libraries.


# When using Jetpack Compose:

 # 1️⃣ No XML layouts required
 - UI is written completely in Kotlin, so XML layouts are not needed.

 # 2️⃣ No need for multiple Activities
 - Recommended approach is Single Activity Architecture.
 - UI screens are handled using Composable functions and Navigation Compose.

# 3️⃣ Fragments are not required
- Compose replaces Fragments with Composable screens.
- Navigation and lifecycle are handled by Compose itself.

# 4️⃣ No Data Binding / View Binding required
- Compose directly works with state.
- No findViewById, DataBinding, or ViewBinding needed.
