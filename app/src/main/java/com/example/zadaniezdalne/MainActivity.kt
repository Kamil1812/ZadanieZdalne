package com.example.zadaniezdalne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.TextView;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val P1View = findViewById<CheckedTextView>(R.id.P1)

            if (P1View.isChecked)
            {
                 findViewById<TextView>(R.id.ChlebText).text = "Chleb znajduje się na twojej liście zakupów"
            }
            else
            {
                findViewById<TextView>(R.id.ChlebText).text = "Nie jest to na twojej liście zakupów."
            }

            val P2View = findViewById<CheckedTextView>(R.id.P2)

            if (P2View.isChecked)
            {
                findViewById<TextView>(R.id.ChlebText).text = "Mleko znajduje się na twojej liście zakupów"
            }

            else
            {
                findViewById<TextView>(R.id.ChlebText).text = "Nie jest to na twojej liście zakupów."
            }


            val P3View = findViewById<CheckedTextView>(R.id.P3)

            if (P3View.isChecked)
            {
                findViewById<TextView>(R.id.ChlebText).text = "Masło znajduje się na twojej liście zakupów"
            }
            else
            {
                findViewById<TextView>(R.id.ChlebText).text = "Nie jest to na twojej liście zakupów."
            }


            val P4View = findViewById<CheckedTextView>(R.id.P4)

            if (P4View.isChecked)
            {
                findViewById<TextView>(R.id.ChlebText).text = "Herbata znajduje się na twojej liście zakupów"
            }
            else
            {
                findViewById<TextView>(R.id.ChlebText).text = "Nie jest to na twojej liście zakupów."
            }

        }
    }


