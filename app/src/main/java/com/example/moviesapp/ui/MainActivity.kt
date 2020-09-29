package com.example.moviesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.movieapp.data.source.remoteapi.RetroFitConnection
import com.example.moviesapp.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.SchedulerSupport.IO
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Dispatcher

/**
 * Created by ali samy Mohamed on 4/4/2020.
 * alisamymohamed@outlook.com
 */


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this,
            R.id.nav_host_fragment
        )

        NavigationUI.setupWithNavController(bottomNavigationView,navController)



    }


}
