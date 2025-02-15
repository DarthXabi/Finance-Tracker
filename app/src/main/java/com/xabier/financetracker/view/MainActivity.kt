package com.xabier.financetracker.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.xabier.financetracker.databinding.ActivityMainBinding
import com.xabier.financetracker.viewmodel.TransactionViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val transactionViewModel: TransactionViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        transactionViewModel.transactionModel.observe(this, Observer {
            binding.tvMonthSpend.text = "123.945€"
            binding.tvTransaction.text = it.name
        })
        binding.viewContainer.setOnClickListener() { transactionViewModel.getAllTransactions() }
    }
}