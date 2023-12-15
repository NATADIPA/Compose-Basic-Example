import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ForgetPassword
import com.example.composedemo.Loginscreen
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
    }
}