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

        var cmpanyName = intent.getStringExtra("companyName")
        var cmpanyDetails = intent.getStringExtra("companyDetails")
        var cmpanyLogo = intent.getIntExtra("companyLogo", R.drawable.niyamatunity)

        binding.cName.text = cmpanyName.toString()
        binding.cDesc.text = cmpanyDetails.toString()
        binding.logo.setImageResource(cmpanyLogo)
    }
}