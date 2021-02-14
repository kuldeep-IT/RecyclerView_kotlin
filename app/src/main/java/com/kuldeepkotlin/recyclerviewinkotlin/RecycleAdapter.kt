package com.kuldeepkotlin.recyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapter(var context: Context, var arrayList: ArrayList<DataClass>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var productView = LayoutInflater.from(context).inflate(R.layout.raw_data_recycler_view,parent,false)

        return ProductViewHolder(productView)
    }

    override fun getItemCount(): Int {

        return arrayList.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

//        casting holder as ProductViewHolder
        (holder as ProductViewHolder).initializeUIComponent(arrayList[position].id,
                                                            arrayList[position].name,
                                                            arrayList[position].price,
                                                            arrayList[position].image)

    }

    //on bind view is also extends from viewholder as well as inner class ProductViewHolder is also extends from viewholder
    inner class ProductViewHolder(myView: View): RecyclerView.ViewHolder(myView)
    {
        var pIdTextView = myView.findViewById<TextView>(R.id.rec_txtId)
        var pNameTextView = myView.findViewById<TextView>(R.id.rec_txtName)
        var pPriceTextView = myView.findViewById<TextView>(R.id.rec_txtPrice)
        var pimageImageView = myView.findViewById<ImageView>(R.id.rec_imageView)

        fun initializeUIComponent(pId: Int, pName: String, pPrice: Int, pImage: Int)
        {
            pIdTextView.text = pId.toString()
            pNameTextView.text = pName
            pPriceTextView.text = pPrice.toString()
            pimageImageView.setImageResource(pImage)
        }
    }
}