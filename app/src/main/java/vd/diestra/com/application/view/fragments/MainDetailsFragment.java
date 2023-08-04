package vd.diestra.com.application.view.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vd.diestra.com.R;
import vd.diestra.com.application.view.adapters.MovieListAdapter;
import vd.diestra.com.domain.entity.Movie;

public class MainDetailsFragment extends Fragment {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieListAdapter movieListAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_details, container, false);

        movieList.add(new Movie("Movie 1", "Description of Movie nandoo"));
        movieList.add(new Movie("Movie 2", "Description of Movie 2"));
        movieList.add(new Movie("Movie 3", "Description of Movie 3"));

        // Obtener el RecyclerView desde el layout XML
        recyclerView = rootView.findViewById(R.id.recyclerView);

        // Configurar el RecyclerView con el LinearLayoutManager y el adaptador
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        movieListAdapter = new MovieListAdapter(movieList);
        recyclerView.setAdapter(movieListAdapter);

        return rootView;
    }
}