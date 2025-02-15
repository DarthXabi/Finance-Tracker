package com.xabier.financetracker.model

import java.time.LocalDate

class TransactionProvider {
    companion object {
        fun getList(): TransactionModel {
            return transactions[0]
        }
        private val transactions = listOf(
            TransactionModel(
                name = "Spotify",
                category = "Subscriptions",
                amount = 10.99,
                purchaseDate = LocalDate.of(2025,2,9),
                shopLogo = null
            )
        )
    }
}