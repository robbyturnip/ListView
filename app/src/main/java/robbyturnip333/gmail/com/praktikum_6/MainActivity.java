package robbyturnip333.gmail.com.praktikum_6;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RatingBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }
    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015", "3.5", R.drawable.aa);
                movieList.add(movie);
        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015", "4", R.drawable.bb);
                movieList.add(movie);
        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015", "5", R.drawable.cc);
                movieList.add(movie);
        movie = new Movie("Shaun the Sheep", "Animation","2014", "3",R.drawable.dd);
                movieList.add(movie);
        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015", "3.5", R.drawable.ee);
                movieList.add(movie);
        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015","5", R.drawable.ff);
                movieList.add(movie);
        movie = new Movie("Up", "Animation", "2009","4.5", R.drawable.gg);
                movieList.add(movie);
        movie = new Movie("Star Trek", "Science Fiction", "2009","4.5",R.drawable.hh);
                movieList.add(movie);
        movie = new Movie("The LEGO Movie", "Animation", "2008","4", R.drawable.ii );
                movieList.add(movie);
        movie = new Movie("Iron Man", "Action & Adventure", "2000","4.5", R.drawable.jj);
                movieList.add(movie);
        movie = new Movie("Aliens", "Science Fiction","1986","4", R.drawable.kk);
                movieList.add(movie);
        movie = new Movie("Chicken Run", "Animation","2015","3.5", R.drawable.ll);
                movieList.add(movie);
        movie = new Movie("Back to the Future", "Science Fiction", "1985","2.5", R.drawable.mm);
                movieList.add(movie);
        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981", "2.5", R.drawable.nn);
                movieList.add(movie);
        movie = new Movie("Goldfinger", "Action & Adventure", "1965","2", R.drawable.oo);
                movieList.add(movie);
        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014","5", R.drawable.pp);
                movieList.add(movie);
        mAdapter.notifyDataSetChanged();
    }
}