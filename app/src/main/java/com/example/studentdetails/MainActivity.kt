package com.example.studentdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun reg(view: View) {
        var getname=findViewById<EditText>(R.id.name)
        var getrno=findViewById<EditText>(R.id.rno)
        var getadmno=findViewById<EditText>(R.id.admno)
        var getclg=findViewById<EditText>(R.id.clg)
        var getpname=findViewById<EditText>(R.id.pname)
        var getpmail=findViewById<EditText>(R.id.pmail)
        var getpmob=findViewById<EditText>(R.id.pmob)
        var getuname=findViewById<EditText>(R.id.uname)
        var getpass=findViewById<EditText>(R.id.pass)
        var getconfirm=findViewById<EditText>(R.id.conpass)
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getrno.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getadmno.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getclg.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getpname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getpmail.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getpmob.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getuname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getpass.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getconfirm.text.toString(),Toast.LENGTH_SHORT).show()

    }
}