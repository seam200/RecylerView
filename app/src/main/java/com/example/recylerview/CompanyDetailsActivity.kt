package com.example.recylerview

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recylerview.databinding.ActivityCompanyDetailsBinding

class CompanyDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityCompanyDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company_details)
        binding = ActivityCompanyDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cmpanyName = intent.getStringExtra("companyName")
        val cmpanyDetails = intent.getStringExtra("companyDetails")
        val cmpanyLogo = intent.getIntExtra("companyLogo", 0)

        binding.cName.text = cmpanyName
        binding.cDesc.text = cmpanyDetails
        binding.logo.setImageResource(cmpanyLogo)
    }
}