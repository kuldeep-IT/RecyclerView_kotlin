package com.kuldeepkotlin.recyclerviewinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myProductList = ArrayList<DataClass>()

        myProductList.add(DataClass(0,"image 1",100000,R.drawable.img4))
        myProductList.add(DataClass(1,"image 2",10,R.drawable.img11))
        myProductList.add(DataClass(2,"image 3",40560,R.drawable.img22))
        myProductList.add(DataClass(3,"image 4",789563 ,R.drawable.img32))
        myProductList.add(DataClass(3,"image 4",789563 ,R.drawable.img32))
        myProductList.add(DataClass(3,"image 4",789563 ,R.drawable.img32))
        myProductList.add(DataClass(3,"image 4",789563 ,R.drawable.img32))

        rexycle_view.layoutManager = LinearLayoutManager(this)

        var RVadapter = RecycleAdapter(this,myProductList)

        rexycle_view.adapter = RVadapter



    }
}