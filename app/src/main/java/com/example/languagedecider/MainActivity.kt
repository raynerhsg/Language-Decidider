package com.example.languagedecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var languageList = arrayListOf("Python", "Java", "Kotlin", "Dart", "Swift", "Django")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
          val radom = Random()
            val radomFood = radom.nextInt(languageList.count())
            languageTxt.text = languageList[radomFood]
        }

        addLanguageBtn.setOnClickListener {
            val newLanguage = addLanguageTxt.text.toString()
            languageList.add(newLanguage)
            addLanguageTxt.text.clear()
        }
    }

}