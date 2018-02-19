package com.maplonki.popularmovieskotlin.presentation.view.fragment

import android.app.Fragment
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maplonki.popularmovieskotlin.R
import com.maplonki.popularmovieskotlin.databinding.FragmentMovieGridBinding
import com.maplonki.popularmovieskotlin.presentation.model.MovieModel
import com.maplonki.popularmovieskotlin.presentation.presenter.MoviePresenter
import com.maplonki.popularmovieskotlin.presentation.view.MovieGrid
import com.maplonki.popularmovieskotlin.presentation.view.adapter.MovieGridAdapter
import com.maplonki.popularmovieskotlin.util.extensions.inflate

/**
 * Created by hugo on 2/8/18.
 */
class MovieGridFragment : Fragment(), MovieGrid {

    val gridAdapter: MovieGridAdapter by lazy { MovieGridAdapter(activity) }
    lateinit var recyclerView: RecyclerView
    lateinit var movieGridPresenter: MoviePresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container!!.inflate(R.layout.fragment_movie_grid)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = DataBindingUtil.bind<FragmentMovieGridBinding>(view!!)
        recyclerView = binding.movieGridRecyclerView
        recyclerView.apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = GridLayoutManager(activity, 3)
            recyclerView.adapter = gridAdapter
        }

        movieGridPresenter = MoviePresenter(this)
        movieGridPresenter.initialize()

    }

    companion object {
        fun newInstance() = MovieGridFragment()
    }

    override fun toggleProgress(visible: Boolean) {
    }

    override fun renderMovieGrid(movieList: List<MovieModel>) {
        gridAdapter.movieList = movieList
        gridAdapter.notifyDataSetChanged()
    }
}