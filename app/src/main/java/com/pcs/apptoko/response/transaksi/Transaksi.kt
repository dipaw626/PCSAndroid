package com.pcs.apptoko.response.transaksi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class Transaksi(
    val admin_id: String,
    val id: String,
    val tanggal: String,
    val total: String
)
