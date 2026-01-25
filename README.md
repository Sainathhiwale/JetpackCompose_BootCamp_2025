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

# Jetpack Compose mainly has 3 core layouts (Row, Column, Box), Lazy layouts for lists, ConstraintLayout for complex UI, and Scaffold-based layouts for app structure.
- These are the most commonly used building blocks:
  - **Column Layout** – Places children vertically
  - **Row Layout** – Places children horizontally
  - **Box Layout** – Stacks children on top of each other (like FrameLayout)
    
    <img width="566" height="277" alt="image" src="https://github.com/user-attachments/assets/d550ddbd-4542-44f7-95ab-7166ba209924" />

# Column Layout
  - The Column layout arranges UI components in a vertical linear manner, placing them one below another.
  
    <img width="536" height="269" alt="image" src="https://github.com/user-attachments/assets/1347c67f-37fc-4df1-a1f9-8649d0045819" />
    
    - Example
      
     ```
      setContent {
          JetpackCompose_BootCamp_2025Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                rowAndColumnLearn()
            }

          }
        }
      
      @Composable
     fun rowAndColumnLearn(){
      Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
         Text("Hello Jetpack Compose 1")
         Text("Hello Jetpack Compose 2")
      }
     }
     
     ```
# Row Layout
  - The Row layout arranges UI components in a horizontal linear manner, placing them beside each other.

    <img width="592" height="279" alt="image" src="https://github.com/user-attachments/assets/92947f49-f1a8-4adf-ae7b-30b34416b99c" />

   - Example

     ```
     setContent {
          JetpackCompose_BootCamp_2025Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                rowAndColumnLearn()
            }

          }
        }
      
      @Composable
     fun rowAndColumnLearn(){
       Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
        Text("row layout 1")
        Spacer(modifier = Modifier.width(16.dp))
        Text("row layout 2")
       }
     }
      
     ```

# Box Layout

    <img width="1088" height="560" alt="Screenshot 2026-01-26 014433" src="https://github.com/user-attachments/assets/0ea56770-9d39-4e5a-8660-ac9842137a1a" />

    


