package com.example.prak6.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak6.ui.screen.DatailView
import com.example.prak6.ui.screen.MahasiswaFormView
import com.example.prak6.ui.screen.RencanaStudyView
import com.example.prak6.ui.screen.SplashView
import com.example.prak6.ui.viewmodel.MahasiswaViewModel
import com.example.prak6.ui.viewmodel.RencanaStudyViewModel



enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}
