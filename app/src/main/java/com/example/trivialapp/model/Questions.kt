package com.example.trivialapp.model

class Questions {
    data class DificultatPreguntes(
        var preguntes: String,
        var respostes: List<String>,
        var respostaCorrecta: String
    )

    var preguntesFacil = listOf<DificultatPreguntes>(DificultatPreguntes("A quin continent ens trobem si som a Noruega?", listOf("Àsia, Àfrica, Amèrica, Europa"), "Europa"),
        DificultatPreguntes("Quina és la capital de Finlandia?", listOf("Oslo", "Helsinki", "Roma", "Lisboa"), "Helsinki"),
        DificultatPreguntes("D'on són originaris els Jocs Omlímpics?", listOf("Grècia", "Xina", "Itàlia", "Brasil"), "Grècia"),
        DificultatPreguntes("Quin tipus d'animal és la balena?", listOf("Ovípar", "Mamífer", "Hervíbor", "Totes són correctes"), "Mamífer"),
        DificultatPreguntes("Quin és el planeta més gran del Sistema Solar?", listOf("Venus", "Mart", "Júpiter", "Saturn"), "Júpiter"),
        DificultatPreguntes("Quin és l'animal terrestre més gran del món?", listOf("Elefant africà", "Balena blava", "Jirafa", "Rinoceront blanc"), "Balena blava"),
        DificultatPreguntes("A quin any es va celebrar la independència dels Estats units?", listOf("1776", "1789", "1812", "1492"), "1776"),
        DificultatPreguntes("Quin és el símbol químic de l'or?", listOf("Au", "Ag", "Fe", "Cu"), "Au"),
        DificultatPreguntes("Com es diu la moneda del Japó?", listOf("Yuan", "Won", "Ringgit", "Yen"), "Yen"),
        DificultatPreguntes("Quin és el metall líquid a temperatura ambient?", listOf("Ferro", "Or", "Mercuri", "Plata"), "Mercuri"),
    )


    var preguntesNormal = listOf<DificultatPreguntes>(DificultatPreguntes("A quin any va començar la Primera Guerra Mundial?", listOf("1939", "1905", "1914", "1921"), "1914"),
        DificultatPreguntes("Nom del famós pintor creador de la obra 'La nit estrellada'", listOf("Pablo Picasso", "Vicent Van Gogh", "Leonardo Da Vinci", "Claude Monet"), "Vicent Van Gogh"),
        DificultatPreguntes("Quan es vam inaugurar els Jocs Olímpics de la era moderna?", listOf("1886", "1896", "1906", "1916"), "1896"),
        DificultatPreguntes("Quina és la capital d'Angola?", listOf("Dakar", "Abiyán", "Luanda", "Maputo"), "Luanda"),
        DificultatPreguntes("Quin és el punt més alt d'Àfrica?", listOf("Ruwenzori", "Kilimanjaro", "Mont Kenia", "Atlas"), "Kilimanjaro"),
        DificultatPreguntes("Qui va ser el primer emperador de la Xina?", listOf("Ruang Mei", "Mao Zedong", "Qin Shi Huang", "Sung Jin Woo"), "Qin Shi Huang"),
        DificultatPreguntes("Quin és el nom del famós telescopi espacial creat per la NASA en 1990?", listOf("Hubble", "Kepler", "Spitzer", "Chandra"), "Hubble"),
        DificultatPreguntes("Quin dels seguents filòsofs grecs va ser deixeble de Sòcrates y mestre d'Aristòtil?", listOf("Plató", "Epicuro", "Zenón de Citilio", "Heràclit"), "Plató"),
        DificultatPreguntes("Element químic més abundant a l'univers?", listOf("Heli", "Oxígen", "Hidrògen", "Carboni"), "Hidrògen"),
        DificultatPreguntes("Qui va ser el president dels Estats Units d'Amèrica durant la Guerra Civil Americana?", listOf("Abraham Lincoln", "Andrew Johnson", "Ulysses S. Grant", "James A. Garfield"), "Abraham Lincoln"),
        )
    var preguntesDificil = listOf<DificultatPreguntes>(DificultatPreguntes("", listOf(), ""),
        DificultatPreguntes("Que matemàtic va desenvolupar la teoria dels conjunts?", listOf("Leonhard Euler", "Georg Cantor", "David Hilbert", "Kurt Gödel"), "Georg Cantor"),
        DificultatPreguntes("Element químic més pesat de la taula periòdica?", listOf("Urani", "Plutoni", "Californi", "Wolframi"), "Californi"),
        DificultatPreguntes("Quin tipus d'estrella es forma després d'una supernova?", listOf("Geganta vermella", "Petita blanca", "Púlsar", "Estrella de neutrons"), "Estrella de neutrons"),
        DificultatPreguntes("A quin any és va realitzar amb èxit el primer transplantament de cor?", listOf("1967", "1954", "1982", "1975"), "1967"),
        DificultatPreguntes("Quin fenòmen atmosfèric és el responsble de la refracció de llum que causa el arc de Sant Martí?", listOf("Aurora boreal", "Refracció", "Pluja Àcida", "Difracció"), "Difracció"),
        DificultatPreguntes("Quina és la funció principal dels ribosomes en una cèl·lula?", listOf("Síntesi de proteines", "Emmagatzemar energia", "Producció d'ATP", "Regulació del cicle cel·lular"), "Síntesi de proteines"),
        DificultatPreguntes("Quin tipus de radiació electromagnètica té una longitud d'ona més curta?", listOf("Raigs X", "Ultraviolada", "Infraroigs", "Microones"), "Raigs X"),
        DificultatPreguntes("Nom del científic que va proposar la teoria heliocèntrica?", listOf("Isaac Newton", "Galileo Galilei", "Nicolàs Copèrnic", "Johannes Kepler"), "Nicolàs Copèrnic"),
        DificultatPreguntes("Què s'entén per masa crítica en context de la fissió nuclear?", listOf("Masa necessària per mantenir la estabilitat de un reactor nuclear", "Quantitat mínima de material fisionable per iniciar una reacció en cadena", "Quantitat de masa que es converteix en energia en una reacció de fusió nuclear", "La masa total d'un núcli atòmic en un estat superexcitat"), "Quantitat mínima de material fisionable per iniciar una reacció en cadena"),
        )
}