package com.example.ahlangame.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.ahlangame.R
import com.example.ahlangame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var playerChose = ""
    private val dataComp = arrayOf(
        "gunting",
        "batu",
        "kertas",
        "gunting",
        "batu",
        "kertas",
        "gunting",
        "batu",
        "kertas"
    )

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgComBatu = findViewById<ImageView>(R.id.imageBatuComp)
        val imgComKertas = findViewById<ImageView>(R.id.imageKertasComp)
        val imgComGunting = findViewById<ImageView>(R.id.imageGuntingComp)

        binding.imageRefresh.setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }

        binding.imageBatu1.setOnClickListener {
            binding.imageBatu1.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    android.R.color.darker_gray
                )
            )
            playerChose = "batu"
            val result = dataComp.random()
            Log.d("TEST", result)
            val testStatus = findViewById<TextView>(R.id.statusWinner)
            if (result == "batu") {
                Log.d("TEST", "Anda Menang")
                testStatus.text = "DRAW"
                imgComBatu.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )

                testStatus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.holo_blue_bright
                    )
                )
            } else if (result == "kertas") {
                Log.d("TEST", "Anda Kalah")
                testStatus.text = "LOSE"
                imgComKertas.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )

                testStatus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        R.color.teal_200
                    )
                )
            } else {
                Log.d("TEST", "Anda Kalah")
                testStatus.text = "LOSE"
                imgComGunting.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )

                testStatus.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.holo_red_dark
                    )
                )
            }

            binding.imageBatu1.setOnClickListener {
                binding.imageBatu1.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.darker_gray
                    )
                )
                playerChose = "batu"
                val result = dataComp.random()
                Log.d("TEST", result)
                val testStatus = findViewById<TextView>(R.id.statusWinner)
                if (result == "batu") {
                    Log.d("TEST", "Anda Menang")
                    testStatus.text = "DRAW"
                    imgComBatu.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.darker_gray
                        )
                    )

                    testStatus.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.holo_blue_bright
                        )
                    )
                } else if (result == "kertas") {
                    Log.d("TEST", "Anda Kalah")
                    testStatus.text = "LOSE"
                    imgComKertas.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.darker_gray
                        )
                    )

                    testStatus.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            R.color.teal_200
                        )
                    )
                } else {
                    Log.d("TEST", "Anda Kalah")
                    testStatus.text = "LOSE"
                    imgComGunting.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.darker_gray
                        )
                    )

                    testStatus.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.holo_red_dark
                        )
                    )
                }

                binding.imageBatu1.setOnClickListener {
                    binding.imageBatu1.setBackgroundColor(
                        ContextCompat.getColor(
                            this,
                            android.R.color.darker_gray
                        )
                    )
                    playerChose = "batu"
                    val result = dataComp.random()
                    Log.d("TEST", result)
                    val testStatus = findViewById<TextView>(R.id.statusWinner)
                    if (result == "batu") {
                        Log.d("TEST", "Anda Menang")
                        testStatus.text = "DRAW"
                        imgComBatu.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.darker_gray
                            )
                        )

                        testStatus.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.holo_blue_bright
                            )
                        )
                    } else if (result == "kertas") {
                        Log.d("TEST", "Anda Kalah")
                        testStatus.text = "LOSE"
                        imgComKertas.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.darker_gray
                            )
                        )

                        testStatus.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                R.color.teal_200
                            )
                        )
                    } else {
                        Log.d("TEST", "Anda Kalah")
                        testStatus.text = "LOSE"
                        imgComGunting.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.darker_gray
                            )
                        )

                        testStatus.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.holo_red_dark
                            )
                        )
                    }

                    binding.imageBatu1.setOnClickListener {
                        binding.imageBatu1.setBackgroundColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.darker_gray
                            )
                        )
                        playerChose = "batu"
                        val result = dataComp.random()
                        Log.d("TEST", result)
                        val testStatus = findViewById<TextView>(R.id.statusWinner)
                        if (result == "batu") {
                            Log.d("TEST", "Anda Menang")
                            testStatus.text = "DRAW"
                            imgComBatu.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    android.R.color.darker_gray
                                )
                            )

                            testStatus.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    android.R.color.holo_blue_bright
                                )
                            )
                        } else if (result == "kertas") {
                            Log.d("TEST", "Anda Kalah")
                            testStatus.text = "LOSE"
                            imgComKertas.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    android.R.color.darker_gray
                                )
                            )

                            testStatus.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.teal_200
                                )
                            )
                        } else {
                            Log.d("TEST", "Anda Kalah")
                            testStatus.text = "LOSE"
                            imgComGunting.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    android.R.color.darker_gray
                                )
                            )

                            testStatus.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    android.R.color.holo_red_dark
                                )
                            )
                        }

                    }
    }
}

