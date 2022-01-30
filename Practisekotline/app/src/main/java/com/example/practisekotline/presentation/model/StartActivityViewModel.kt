package com.example.practisekotline.presentation.model


import android.view.View
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import com.example.practisekotline.presentation.ui.Firstscreen.StartViewModelInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class StartActivityViewModel  @Inject constructor() : ViewModel() {



    var mobileNumbe : MutableLiveData<String> = MutableLiveData<String>()
    var startViewModelInterface : StartViewModelInterface?= null



    init {
        mobileNumbe.value = "7278476247"
    }

    fun validateMobileNumber(view: View){
      startViewModelInterface?.afterValidationSuccess(mobileNumbe.value.toString())
    }



}