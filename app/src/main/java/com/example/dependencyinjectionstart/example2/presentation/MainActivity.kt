package com.example.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example1.Activity
import com.example.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerApplicationComponent.create().inject(this)
        viewModel.method()
    }
}