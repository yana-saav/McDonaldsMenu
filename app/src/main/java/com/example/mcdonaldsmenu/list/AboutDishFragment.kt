package com.example.mcdonaldsmenu.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.mcdonaldsmenu.R


class AboutDishFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_dish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val h2 = view.findViewById<TextView>(R.id.h2_f2)
        val args : AboutDishFragmentArgs by navArgs()
        val text_h2 = args.dishItem.title
        h2.text=text_h2

        val price = view.findViewById<TextView>(R.id.price_f2)
        val text_price = args.dishItem.price
        price.text=text_price

        val dish_image = view.findViewById<ImageView>(R.id.dish_image_f2)
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(16))
        Glide.with(view.context).load(args.dishItem.image).apply(requestOptions).into(dish_image)
    }

}