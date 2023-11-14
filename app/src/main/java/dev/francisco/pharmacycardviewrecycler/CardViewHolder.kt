package dev.francisco.pharmacycardviewrecycler

import androidx.recyclerview.widget.RecyclerView
import dev.francisco.pharmacycardviewrecycler.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: DrugClickListener
)   : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindDrugs(drugs: Drugs)
    {
      cardCellBinding.cover.setImageResource(drugs.cover)
        cardCellBinding.title.text = drugs.title
        cardCellBinding.fabricante.text = drugs.fabricante

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(drugs)
        }



    }
}