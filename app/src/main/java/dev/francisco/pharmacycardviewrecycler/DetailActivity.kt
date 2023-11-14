package dev.francisco.pharmacycardviewrecycler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.pharmacycardviewrecycler.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonComprar.setOnClickListener {
            startActivity(Intent(this, LoadingActivity::class.java))
        }
        val drugID = intent.getIntExtra(DRUG_ID_EXTRA, -1)
        val drugs = drugFromID(drugID)
        if (drugs != null)
        {
            binding.cover.setImageResource(drugs.cover)
            binding.title.text = drugs.title
            binding.referencia.text = drugs.referencia
            binding.fabricante.text = drugs.fabricante


        }

    }
            private fun drugFromID(drugID: Int): Drugs ?
            {

                for (drug in drugList)
                {
                    if (drug.id == drugID)
                        return drug
                }

                return null

            }
        }



