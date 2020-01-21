package com.example.student.pazig12

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_Wys.setOnClickListener() {
            if (checkbox_Ucz.isChecked == true) {
                if (checkbox_Naucz.isChecked == false) {
                    var wzrost = et_Wzrost.getText().toString()
                    var wz = Integer.parseInt(wzrost)
                    var wie = et_Wiek.getText().toString()
                    var wiek = Integer.parseInt(wzrost)

                    var uczen1: Uczen = Uczen(et_Imie.text.toString(), et_Nazwisko.text.toString(), wiek, wz, this, et_Ocena_Stopien.text.toString())
                    var a: String = uczen1.pobierzInformacje(uczen1)
                    et_wys.text = a

                } else if (checkbox_Naucz.isChecked == true) {
                    et_wys.text = "Źleeee"

                }
            }
            else if (checkbox_Naucz.isChecked == true){
                if (checkbox_Ucz.isChecked == false) {
                    var wzrost = et_Wzrost.getText().toString()
                    var wz = Integer.parseInt(wzrost)
                    var wie = et_Wiek.getText().toString()
                    var wiek = Integer.parseInt(wzrost)

                    var nauczyciel1: Nauczyciel = Nauczyciel(et_Imie.text.toString(), et_Nazwisko.text.toString(), wiek, wz, this, et_Ocena_Stopien.text.toString())
                    var a: String = nauczyciel1.pobierzInformacje(nauczyciel1)
                    et_wys.text = a

                } else if (checkbox_Naucz.isChecked == true) {
                    et_wys.text = "Źleeee"

                }
            }
            else{
                et_wys.text = "Źleeee"
            }
        }

    }
}
