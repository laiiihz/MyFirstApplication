package xyz.laihz.myfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun jumpAct(view:View){
        val intent =Intent()
        var bundle =Bundle()
        intent.setClass(this,Jump2Activity::class.java)
        var editText=findViewById<EditText>(R.id.editText_1)
        var string_into=editText_1.text.toString()
        bundle.putString("text",string_into)
        intent.putExtras(bundle)
        startActivity(intent)
    }
    fun makeToastMain(view: View){
        var editText=findViewById<EditText>(R.id.editText_1)
        Toast.makeText(this,editText_1.text,Toast.LENGTH_SHORT).show()
    }
}
