package com.pahnal.customcomponents.activity

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

inline fun <VB : ViewBinding> AppCompatActivity.viewInflateBinding(
    crossinline bindingInflater: (LayoutInflater) -> VB,
) = lazy(LazyThreadSafetyMode.NONE) { bindingInflater.invoke(layoutInflater) }