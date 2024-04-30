package com.example.recylerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recylerview
        recyclerView.layoutManager = LinearLayoutManager(this)

        val companyList = ArrayList<Company>()
        companyList.add(Company("Ahosan Chowdhury", "Founder and Director", R.drawable.ahosan, "Ahosan Chowdhury is a Founder and Director at Niyamat Group of Companies. Niyamat Group of Companies is likely a conglomerate involved in various industries such as real estate, construction, manufacturing, or services. Chowdhury's role as a founder and director suggests that he plays a significant role in the company's leadership and decision-making processes."))
        companyList.add(Company("Niyamat IT", "Smart Business Easy and Better Solutions", R.drawable.niyamatit, "Niyamat IT offers innovative solutions designed to simplify and enhance business operations. With a focus on smart technology and user-friendly interfaces, we provide streamlined tools that empower businesses to thrive in today's digital landscape. Our goal is to make complex tasks easier and more efficient, enabling organizations to achieve their objectives with greater ease and effectiveness. At Niyamat IT, we're committed to delivering intelligent solutions that drive success and facilitate growth for businesses of all sizes."))
        companyList.add(Company("Niyamat B2B", "Wholesale Marketplace", R.drawable.b2b, "Niyamat B2B Wholesale Marketplace is a dynamic platform connecting businesses worldwide for seamless wholesale transactions. With an intuitive interface and robust features, it facilitates efficient buying and selling of products in bulk quantities. From electronics to fashion, it offers a diverse range of categories, fostering global trade opportunities and enhancing business growth."))
        companyList.add(Company("Niyamat Enterprise", "Export and Import", R.drawable.niyamatonline, "Niyamat Enterprise specializes in facilitating global trade through export and import services. With a focus on efficiency and reliability, we connect businesses worldwide, ensuring seamless transactions and fostering mutually beneficial partnerships. Our commitment to quality, integrity, and customer satisfaction drives us to deliver exceptional service while navigating the complexities of international commerce. At Niyamat Enterprise, we strive to be your trusted partner in expanding your reach across borders and maximizing opportunities in the global marketplace."))
        companyList.add(Company("Niyamat Unity", "Part of Management", R.drawable.niyamatunity, "Niyamat Unity is a collaborative platform designed to bring people together, fostering synergy and cooperation. With a focus on inclusivity and shared goals, we provide a space where individuals can connect, communicate, and collaborate effectively. Through Niyamat Unity, we aim to build strong relationships, empower communities, and drive positive change by harnessing the collective efforts and talents of all participants. Join us in creating a unified environment where diversity is celebrated, ideas are exchanged freely, and collective aspirations are realized."))
        companyList.add(Company("Niyamat Transport", "Transport Service", R.drawable.transport,"Niyamat Transport is a leading logistics provider, dedicated to delivering efficient and reliable transportation solutions. With a focus on customer satisfaction and operational excellence, we offer a wide range of services tailored to meet the diverse needs of businesses. Whether it's freight forwarding, warehousing, or distribution, we leverage our expertise and global network to ensure seamless movement of goods across various destinations. At Niyamat Transport, we are committed to delivering your cargo safely, on time, and within budget, helping you optimize your supply chain and achieve your business objectives."))
        companyList.add(Company("Niyamat Courier", "Home Delivery Service", R.drawable.courier,"Niyamat Courier is proud to announce our upcoming home delivery service, bringing convenience and reliability to your doorstep. With a commitment to promptness and security, we're poised to redefine the courier experience, ensuring your packages reach you safely and swiftly. Stay tuned as we launch our home delivery service, making your shipping needs our top priority. Trust Niyamat Courier for seamless delivery solutions that cater to your convenience."))
        companyList.add(Company("Niyamat Builders", "Real State Business", R.drawable.niyamatbuilder,"Niyamat Builders is excited to unveil its latest venture in real estate, coming soon. With a dedication to excellence and innovation, we are committed to crafting spaces that inspire and elevate living experiences. Stay tuned for our upcoming project, where thoughtful design meets unmatched quality, creating homes that exceed expectations and redefine modern living. Niyamat Builders invites you to be a part of our journey as we introduce a new standard of luxury and comfort in the real estate landscape."))
        companyList.add(Company("Ekhon Bazar", "For All Your Need, Ekhon Bazar Here Is", R.drawable.ekhonbazar, "Ekhon Bazar is your one-stop destination for all your needs. With a diverse range of products and services, Ekhon Bazar offers convenience and accessibility like never before. Whether you're looking for household essentials, electronics, fashion items, or professional services, Ekhon Bazar has it all. Our commitment to quality and customer satisfaction ensures a seamless shopping experience every time. Trust Ekhon Bazar to meet your needs promptly and efficiently, because here, everything you need is right at your fingertips."))
        companyList.add(Company("Peoples Marketing Company", "We Believe in Quality", R.drawable.pmc, "At Peoples Marketing Company, quality is at the core of everything we do. We're dedicated to delivering top-notch products and services that exceed expectations. With a commitment to excellence, integrity, and customer satisfaction, we strive to build lasting relationships and make a positive impact in the market. At Peoples Marketing Company, quality isn't just a goal – it's our promise."))

        var companyAdapter = CompanyAdapter(companyList)
        binding.recylerview.adapter = CompanyAdapter(companyList)
        companyAdapter.onClick = {
            val intent = Intent(this, CompanyDetailsActivity::class.java)
            intent.putExtra("companyName", it.companyName)
            intent.putExtra("companyDetails", it.companyLongDetails)
            intent.putExtra("companyLogo", it.companyLogo)
            startActivity(intent)
        }
    }
}

