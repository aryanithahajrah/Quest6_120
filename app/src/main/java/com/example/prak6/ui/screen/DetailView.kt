package com.example.prak6.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak6.model.Mahasiswa
import com.example.prak6.model.RencanaStudi

@Composable
fun DatailView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit,
    onResetButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Detail Mahasiswa", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Menampilkan data Mahasiswa NIM dan Email
            DetailRow(label = "NIM", value = mahasiswa.nim)
            DetailRow(label = "Email", value = mahasiswa.email)
        }
        // Menampilkan data Mahasiswa Nama
        DetailRow(label = "Nama", value = mahasiswa.nama)

        Spacer(modifier = Modifier.padding(8.dp))

        // Menampilkan Rencana Studi
        Text("Rencana Studi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        DetailRow(label = "Mata Kuliah", value = rencanaStudi.mataKuliah)
        DetailRow(label = "Kelas", value = rencanaStudi.kelas)

        Spacer(modifier = Modifier.padding(8.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            // Tombol Navigasi
            Button(onClick = onBackButtonClicked) {
                Text("Kembali")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = onResetButtonClicked) {
                Text("Reset")
            }
        }
    }
}

@Composable
fun DetailRow(label: String, value: String) {
    Column(modifier = Modifier.padding(bottom = 8.dp)) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Text(
            text = value,
            fontSize = 14.sp
        )
    }
}