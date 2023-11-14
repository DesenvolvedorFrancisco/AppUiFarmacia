package dev.francisco.pharmacycardviewrecycler

var drugList = mutableListOf<Drugs>()

val DRUG_ID_EXTRA = "drugExtra"

class Drugs (
    var cover: Int,
    var fabricante:String,
    var title: String,
    var referencia: String,
    val id: Int? = drugList.size
)