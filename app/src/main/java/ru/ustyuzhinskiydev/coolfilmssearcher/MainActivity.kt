package ru.ustyuzhinskiydev.coolfilmssearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Плейлист", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }*/
        initNavigation()


//       initButtons()
    }

    fun initNavigation() {
        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Плейлист", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
    /* fun initButtons(){
         button0.setOnClickListener {
             Toast.makeText(this,"Меню",Toast.LENGTH_SHORT).show()
         }
         button1.setOnClickListener {
             Toast.makeText(this,"Избранное",Toast.LENGTH_SHORT).show()
         }
         button2.setOnClickListener {
             Toast.makeText(this,"Посмотреть позже",Toast.LENGTH_SHORT).show()
         }
         button3.setOnClickListener {
             Toast.makeText(this,"Плейлист",Toast.LENGTH_SHORT).show()
         }
         button4.setOnClickListener {
             Toast.makeText(this,"Настройки",Toast.LENGTH_SHORT).show()
         }
     }*/

}