package com.example.student.pazig12

import android.content.Context

/**
 * Created by student on 2019-12-18.
 */
class Nauczyciel(imie: String, nazwisko :String, wiek:Int, wzrost: Int, context: Context, var tytul: String ): Osoba(imie, nazwisko, wiek, wzrost, context) {
    override fun pobierzInformacje(osoba: Osoba): String {

        var a = context.resources.getString(R.string.formatka, imie, nazwisko, wiek, wzrost, "uczniem", "tytuł ${tytul}" )
        return a
    }
}
