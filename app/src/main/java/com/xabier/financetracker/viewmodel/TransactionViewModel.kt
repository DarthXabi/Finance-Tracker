package com.xabier.financetracker.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xabier.financetracker.model.TransactionModel
import com.xabier.financetracker.model.TransactionProvider

class TransactionViewModel : ViewModel() {

    val transactionModel = MutableLiveData<TransactionModel>()

    fun getAllTransactions() {
         val currentT = TransactionProvider.getList()
        transactionModel.postValue(currentT)
    }
}