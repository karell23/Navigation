package id.karell23.navigation

sealed class NavigationItems(var route: String, var icon: Int, var title: String)
{
    object Home : NavigationItems("home", R.drawable.ic_home, "Home")
    object Profile : NavigationItems("profile", R.drawable.ic_profile, "Profile")
    object Settings : NavigationItems("settings", R.drawable.ic_settings, "Settings")
}
