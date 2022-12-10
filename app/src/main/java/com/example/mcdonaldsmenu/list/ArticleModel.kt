package com.example.mcdonaldsmenu.list

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArticleModel(
    val image: String,
    val title: String,
    val price: String
) : Parcelable {
    companion object {

        fun createDefultData(): List<ArticleModel> {
            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://d3tqkqn8yl74v5.cloudfront.net/TPO-chf_ua_3421_Big_Chicken_Cheese.png","Біг Чікен Чіз","181 грн"))
            list.add(ArticleModel("https://d3tqkqn8yl74v5.cloudfront.net/TPO-cso_ua_2403_MenuDoubleCheeseburger.png","Дабл Чізбургер Меню","157 грн"))
            list.add(ArticleModel("https://d3tqkqn8yl74v5.cloudfront.net/TPO-cso_ua_2133_nuggets20B.png","Чіккен Мак Наггетс 20шт.","236 грн"))
            list.add(ArticleModel("https://d3tqkqn8yl74v5.cloudfront.net/TPO-chf_ua_2303_HM_Cheeseburger.png","Хеппі Міл","132 грн"))
            list.add(ArticleModel("https://d3tqkqn8yl74v5.cloudfront.net/TPO-cso_ua_4163_Cheesecake%20Strawberry.png","Чізкейк з полуницею","99 грн"))
            return list
        }
    }
}