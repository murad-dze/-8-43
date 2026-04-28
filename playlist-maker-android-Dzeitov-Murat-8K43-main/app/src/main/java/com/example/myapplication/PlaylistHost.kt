package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.ui.activity.MainScreen
import com.example.myapplication.ui.search.SearchScreen
import com.example.myapplication.ui.settings.SettingsScreen
import com.example.myapplication.ui.settings.MediaLibraryScreen
import com.example.myapplication.ui.settings.FavoritesScreen

@Composable
fun PlaylistHost(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Main.name
    ) {
        // 1. Главный экран
        composable(Screen.Main.name) {
            MainScreen(
                onSearchClick = { navController.navigate(Screen.Search.name) },
                onSettingsClick = { navController.navigate(Screen.Settings.name) },
                onLibraryClick = { navController.navigate(Screen.MediaLibrary.name) }, // Новый переход
                onFavoritesClick = { navController.navigate(Screen.Favorites.name) }   // Новый переход
            )
        }

        // 2. Экран Поиска
        composable(Screen.Search.name) {
            SearchScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // 3. Экран Настроек
        composable(Screen.Settings.name) {
            SettingsScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // 4. Экран Медиатеки
        composable(Screen.MediaLibrary.name) {
            MediaLibraryScreen()
        }

        // 5. Экран Избранного
        composable(Screen.Favorites.name) {
            FavoritesScreen()
        }
    }
}