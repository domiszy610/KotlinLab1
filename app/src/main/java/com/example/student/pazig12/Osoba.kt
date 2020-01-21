package com.example.student.pazig12

import android.content.Context

/**
 * Created by student on 2019-12-18.
 */
open abstract class Osoba(var imie:String, var nazwisko :String, var wiek:Int, var wzrost: Int, var context: Context){
    open fun pobierzInformacje(osoba: Osoba):String {
         var a ="oooo"
        return a
    }
}