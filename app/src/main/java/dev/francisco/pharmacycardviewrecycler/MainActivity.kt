package dev.francisco.pharmacycardviewrecycler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import dev.francisco.pharmacycardviewrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), DrugClickListener

{

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populatedDrugs()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,3)
            adapter = CardAdapter(drugList, mainActivity)
        }
    }

    override fun onClick(drugs: Drugs) {
        val intent = Intent(applicationContext,DetailActivity::class.java)
        intent.putExtra(DRUG_ID_EXTRA, drugs.id)
        startActivity(intent)
    }

    private fun populatedDrugs()
    {
        val drug1 = Drugs(
            R.drawable.bisolvon,
            "Minsa",
            "BISOLVON",
            "Compreender a tosse e a constipação. Bisolvon® ajuda a cuidar de toda a sua família, protegendo-a da tosse e das constipações."
        )
        drugList.add(drug1)

        val drug2 = Drugs(
            R.drawable.ibuprofeno,
            "Minsa",
            "IBUPROFENO",
            " Ibuprofeno, nome que deriva das iniciais do ácido isobutilpropanoicofenólico, " +
                    "é um fármaco do grupo dos anti-inflamatórios não esteróides utilizado " +
                    "para o tratamento da dor, febre e inflamação"
        )
        drugList.add(drug2)

        val drug3 = Drugs(
            R.drawable.neolefrin,
            "Minsa",
            "NEOLEFRIN",
            "Indicado para o tratamento dos sintomas das gripes e resfriados, como dor, febre, " +
                    "congestão nasal e coriza."
        )
        drugList.add(drug3)

        val drug4 = Drugs(
            R.drawable.metronidazol,
            "Minsa",
            "METRONIDAZOL",
            "Indicado para o tratamento dos sintomas das gripes e resfriados, como dor, febre, " +
                    "congestão nasal e coriza."
        )
        drugList.add(drug4)

        val drug5 = Drugs(
            R.drawable.paracetamol,
            "Minsa",
            "PARACETAMOL",
            "O paracetamol, também conhecido por acetaminofeno, é um fármaco com propriedades analgésicas e antipiréticas utilizado essencialmente para tratar a febre e a dor leve e moderada, embora existam poucas evidências de que o seu uso seja realmente eficaz no alívio da febre em crianças."
        )
        drugList.add(drug5)

        val drug6 = Drugs(
            R.drawable.agemoxi,
            "Minsa",
            "AGEMOXI",
            "Indicado para cães e gatos; Ação contra bactérias Gram-positivas e Gram-negativas; Possui amoxicilina tri-hidratada e clavulanato de potássio; Indicado como preventivo de infecções no pós-operatório."
        )
        drugList.add(drug6)


        drugList.add(drug1)
        drugList.add(drug2)
        drugList.add(drug3)
        drugList.add(drug4)
        drugList.add(drug5)
        drugList.add(drug6)


    }


}