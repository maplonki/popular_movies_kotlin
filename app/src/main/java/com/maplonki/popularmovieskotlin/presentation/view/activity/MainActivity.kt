package com.maplonki.popularmovieskotlin.presentation.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.maplonki.popularmovieskotlin.R
import com.maplonki.popularmovieskotlin.presentation.view.fragment.MovieGridFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        fragmentManager.beginTransaction().add(R.id.activity_container, MovieGridFragment.newInstance()).commit()
    }
}
