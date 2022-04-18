package com.pahnal.customcomponents.fragment

import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding


inline fun <reified VM : ViewModel> Fragment.sharedViewModels() = activityViewModels<VM>()


inline fun <reified VB : ViewBinding> Fragment.viewBinding(
    crossinline viewBindingFactory: (View) -> VB,
    noinline cleanUp: ((VB?) -> Unit)? = null,
) = FragmentViewBindingDelegate(this, { f -> viewBindingFactory(f.requireView()) }, cleanUp)

inline fun <VB : ViewBinding> Fragment.viewInflateBinding(
    crossinline bindingInflater: (LayoutInflater) -> VB,
    noinline cleanUp: ((VB?) -> Unit)? = null,
) = FragmentViewBindingDelegate(this, { f -> bindingInflater(f.layoutInflater) }, cleanUp)

