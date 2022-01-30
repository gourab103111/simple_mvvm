package com.example.practisekotline.presentation.ui.Firstscreen

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import com.example.practisekotline.databinding.ActivityStartBinding
import com.example.practisekotline.presentation.model.StartActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import toast

@AndroidEntryPoint
class StartActivity : AppCompatActivity(), StartViewModelInterface {

    private lateinit var binding: ActivityStartBinding
    private val bindableViewModel: StartActivityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viemodel = bindableViewModel;
        bindableViewModel.startViewModelInterface = this



    }

    override fun afterValidationSuccess(value: String) {
         toast(" Login Button Clicked $value");
    }




}