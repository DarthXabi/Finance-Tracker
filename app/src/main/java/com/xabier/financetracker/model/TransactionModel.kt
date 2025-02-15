package com.xabier.financetracker.model

import java.time.LocalDate

data class TransactionModel(val name:String, val category:String, val purchaseDate: LocalDate, val amount:Double, val shopLogo: String? )
