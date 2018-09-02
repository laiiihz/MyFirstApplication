package xyz.laihz.myfirstapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Jump2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jump2)
        var bundle=this.intent.extras
        var string_2=bundle.get("text").toString()
        var textView=findViewById<TextView>(R.id.textView_2)
        textView.setText(string_2)
    }
}
