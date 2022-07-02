package com.devbenadate.numbersrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.recyclerview.widget.LinearLayoutManager
import com.devbenadate.numbersrecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var num=displayNumbers(100)
        println(num)
        binding.rvNumbers.adapter=NameRecyclerViewAdapter(num)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
//
    }
    fun displayNumbers(size: Int):List<Int>{
     var num2=ArrayList<Int>()
     var num3=1
     var num4=0
     var b=0
     while (b<=size){
         println(num3)
         var sum=num3+num4
         num4=num3
         num3=sum
         b++
         num2+=sum
     }
     return num2
    }
}