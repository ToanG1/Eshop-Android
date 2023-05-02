package com.nguyenvansapplication.app.modules.categoriestwo.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosecategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTops: String? = MyApp.getInstance().resources.getString(R.string.lbl_tops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShirtsBlouse: String? = MyApp.getInstance().resources.getString(R.string.msg_shirts_blouse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardigansSwe: String? = MyApp.getInstance().resources.getString(R.string.msg_cardigans_swe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKnitwear: String? = MyApp.getInstance().resources.getString(R.string.lbl_knitwear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlazers: String? = MyApp.getInstance().resources.getString(R.string.lbl_blazers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOuterwear: String? = MyApp.getInstance().resources.getString(R.string.lbl_outerwear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPants: String? = MyApp.getInstance().resources.getString(R.string.lbl_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJeans: String? = MyApp.getInstance().resources.getString(R.string.lbl_jeans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShorts: String? = MyApp.getInstance().resources.getString(R.string.lbl_shorts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkirts: String? = MyApp.getInstance().resources.getString(R.string.lbl_skirts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDresses: String? = MyApp.getInstance().resources.getString(R.string.lbl_dresses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
