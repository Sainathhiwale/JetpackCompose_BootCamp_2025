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

# Column is used when UI elements must appear top to bottom.
📱 # Real production use cases
- Login & signup forms
- Profile details page
- Settings screen
- Product description
- Chat messages
- Bottom sheets & dialogs
- Screens
- Sections
- Forms
- Detail pages

  
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

# Row is used when UI elements must appear side-by-side. 
📱 # Real production use cases
- Icon + Text (toolbar, list items)
- Button with icon and label
- Profile image + name + action button
- Rating stars ⭐⭐⭐⭐⭐
- Horizontal chips / filters
- Bottom navigation item (icon + text)
- Recycler/list items
- Toolbars
- Cards
- Forms

# Combine Example of Row and Column

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
      
   Column {
        Text("Order Summary")

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Total")
            Text("₹1200")
        }
    }

  ```
<img width="197" height="46" alt="image" src="https://github.com/user-attachments/assets/3573eb30-0f08-4b51-b390-123c0c99ea6f" />

# Alignment & Arrangement Row and Column in Jetpack Compose 
- What is Alignment
  
Alignment refers to the positioning of a composable element within it's parent container, specifying how it should be placed relative to the
Available space along the horizontal and vertical axes.  

 - Alignment - Cross Axis
   - Column = Horizontal 
   - Row = Vertical
  
- What is Arrangements
  
 Arrangements defines the distribution of multiple composables within container determining their placement along the Main axis.

- Arrangements - Main Axis 
  - Column = Vertical  
  - Row - Horizontal

<img width="528" height="226" alt="image" src="https://github.com/user-attachments/assets/21128242-9fe8-4cf0-aed3-6ef505727ad8" />

<img width="546" height="243" alt="image" src="https://github.com/user-attachments/assets/0224d580-4805-4a23-bcdb-75f8b51ba012" />

<img width="531" height="235" alt="image" src="https://github.com/user-attachments/assets/a184041c-5a15-4614-a841-8c4a70df4b77" />


- Example Arrangements Alignment

   ```
// Alignment : Cross Axis (Row = Vertically , Column = Horizontally)
// Arrangement : Main Axis (Row = Horizontally , Column = Vertically)
@Composable
fun arrangementAlignmentLearn() {
    // RowAlignment : Top, CenterVertically, Bottom
    // RowArrangement : Start, CenterHorizontally, End, spaceBetween, spaceEvenly, spaceAround, spaceBetween
                      // Absolute.Left, Absolute.Right, Absolute.Top, Absolute.center
                      // Absolute.spaceBetween, Absolute.spaceEvenly, Absolute.spaceAround

    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        Text("Row Alignment Arrangement")
    }
    // ColumnAlignment : Start, CenterHorizontally, End
    // ColumnArrangement : Top, CenterVertically, Bottom
    Spacer(modifier = Modifier.height(20.dp))

   Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){
       Text("Column Alignment Arrangement")
       Text("Column Alignment Arrangement")
   }
    Spacer(modifier = Modifier.height(20.dp))

    // BoxAlignment : Start, CenterHorizontally, End, Top, CenterVertically, Bottom, BottomEnd, BottomStart, TopEnd, TopStart, Center
    // BoxArrangement : Top, CenterVertically, Bottom, Start, CenterHorizontally, End, spaceBetween, spaceEvenly, spaceAround, spaceBetween
    Box(contentAlignment = Alignment.TopEnd){
        Text("Box Alignment Arrangement")
    }

}


   ```

# Box Layout
 -Box is a layout that stacks its child composables on top of each other (Z-axis). The last child is drawn on top of the previous ones.
 
 <img width="532" height="275" alt="image" src="https://github.com/user-attachments/assets/a2b8369e-dc5a-4015-b707-7ecf70758e0a" />

  <img width="180" height="382" alt="image" src="https://github.com/user-attachments/assets/40b0f555-44f8-405e-97a2-61a1c9ad719c" />

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
      
     Box(modifier = Modifier.fillMaxSize().background(color = Color.Yellow), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.width(300.dp).height(300.dp).background(Color.Blue)) {
            Text("Hello Box layout", modifier = Modifier.align(Alignment.Center), Color.White, fontSize = 24.sp,textAlign = TextAlign.Center)
        }
    }
  
  ```

# What is State in jetpack compose?
In Jetpack compose the state refers to mutable variable that tiggers recomposition when its value changes, allowing the UI to automatically reflect the updated state without manual intervention. It is key of managing and updating UI elements dynamically. 

- STATE VS VARIABLES
Recomposition Trigger
•	State triggers recomposition when their values change, automatically updating the UI to reflect the new state.
•	Regular variables do not trigger recomposition and require manual UI updates.

Observability
•	State are observable, enabling the framework to efficiently track changes and optimize UI updates.
•	Regular variables lack this built-in observability.

 Immutable vs Mutable
•	State are designed to be mutable and allow modification within a composable function, while regular variables are typically immutable.

 Scoped to Composables
•	State are often scoped to composable functions, ensuring that the state is localized and specific to the UI component.
•	Regular variables may have a broader scope.

# What is remember?

In Jetpack Compose ‘remember’ is a function used to retains the state across recompositions, persisting its value between calls to the composable functions. It is particularly useful for preventing stateful data without recomputing or resetting during UI updates.
- What is mutableStateOf()?
•	In Jetpack Compose, mutableStateOf is a function that creates a mutable state variable.
•	It returns a pair containing the current value and a setter function, allowing modification of the state and triggering UI recomposition when the value changes.
Exmaple
var age by remember {
    mutableStateOf(0)
}
Column {
    Button(onClick = {age++}){
        Text(text = "I am $age years old")
    }
}

# ToolBar or App Bar Design using TopAppBar UI Compose.


Example Code:

<pre> ```
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
          JetpackCompose_BootCamp_2025Theme {
            Surface(
               // modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                appBarLearn()
            }

          }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appBarLearn(){
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text("WhatsApp") },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context, "whatsapp", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    painter = painterResource(id = R.drawable.whatsapp_icon),
                    contentDescription = "whatsapp",
                    tint = Color.Unspecified
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = GreenSG,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ), actions = {
            IconButton(onClick = { Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile", tint = Color.White)
            }
            IconButton(onClick = { Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Menu", tint = Color.White)
            }
        }
    )
}

kotlin Text("Tool bar") ``` </pre>


**# Color.kt**

<pre> ```
val GreenSG = Color(0xFF3FDC85)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

kotlin Text("Tool Bar") ``` </pre>


# Theme.kt

<pre> ```

private val DarkColorScheme = darkColorScheme(
    primary = GreenSG,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = GreenSG,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun JetpackCompose_BootCamp_2025Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = GreenSG.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }

    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

kotlin Text("Tool Bar") ``` </pre>
    


