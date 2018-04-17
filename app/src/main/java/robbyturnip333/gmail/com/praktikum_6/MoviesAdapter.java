package robbyturnip333.gmail.com.praktikum_6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by robby on t11/04/18.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> moviesList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public RatingBar bintang;
        public ImageView cover;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            bintang= (RatingBar) view.findViewById(R.id.rating);
            cover=(ImageView) view.findViewById(R.id.cover);
        }
    }
    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;}
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MyViewHolder(itemView);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.bintang.setRating(Float.parseFloat(movie.getBintang()));
        holder.cover.setImageResource(movie.getCover());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }}