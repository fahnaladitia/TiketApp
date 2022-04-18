package com.pahnal.tiketapp.ui.main.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pahnal.customcomponents.fragment.sharedViewModels
import com.pahnal.customcomponents.fragment.viewInflateBinding
import com.pahnal.tiketapp.databinding.FragmentMoviesBinding
import com.pahnal.tiketapp.ui.main.MainViewModel


class MoviesFragment : Fragment() {

    private val viewModel: MainViewModel by sharedViewModels()
    private val binding by viewInflateBinding(FragmentMoviesBinding::inflate)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return binding.root
    }

}