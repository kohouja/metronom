package com.example.jk.metronom

import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView

/**
 * TODO CLASS_DESCRIPTION
 *
 * @author [Jan Šíma](mailto:jan.sima@infinitemate.cz)
 */
 
@BindingAdapter("android:visibility")
fun setVisibility(view : ImageView, show : Boolean){
    view.visibility = if (show) View.VISIBLE else View.GONE
}