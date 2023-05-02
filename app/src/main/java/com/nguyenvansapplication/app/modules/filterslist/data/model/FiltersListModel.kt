package com.nguyenvansapplication.app.modules.filterslist.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersListModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_brand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdidas: String? = MyApp.getInstance().resources.getString(R.string.lbl_adidas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdidasOriginal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adidas_original2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlend: String? = MyApp.getInstance().resources.getString(R.string.lbl_blend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoutiqueMoschi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_boutique_moschi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChampion: String? = MyApp.getInstance().resources.getString(R.string.lbl_champion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiesel: String? = MyApp.getInstance().resources.getString(R.string.lbl_diesel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJackJones: String? = MyApp.getInstance().resources.getString(R.string.lbl_jack_jones)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNafNaf: String? = MyApp.getInstance().resources.getString(R.string.lbl_naf_naf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRedValentino: String? = MyApp.getInstance().resources.getString(R.string.lbl_red_valentino)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_oliver)

)
