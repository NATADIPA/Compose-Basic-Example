import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ForgetPassword
import com.example.composedemo.Loginscreen
import com.example.composedemo.NextScreen
import com.example.composedemo.SignUp
import com.example.composedemo.ui.theme.Routes

@Composable
fun ScreenMain(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Login.routes ){
        composable(Routes.Login.routes){
            Loginscreen(navController = navController)
        }
        composable(Routes.SignUp.routes) {
            SignUp(navController = navController)
        }
        composable(Routes.ForgetPassword.routes) {
            ForgetPassword(navController = navController)
        }
        composable(Routes.NextScreen.routes + "/{username}/{password}") { navBackStackEntry ->
            // Retrieve username and password from arguments
            val username = navBackStackEntry.arguments?.getString("username") ?:""
            val password = navBackStackEntry.arguments?.getString("password") ?: ""

            // Display the data in the NextScreen
            NextScreen(username = username, password = password, navController=navController)
        }
    }
}