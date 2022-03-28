package kg.geektech.android3.data.remote;

import java.util.List;

import kg.geektech.android3.data.models.Film;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FilmApi {

    @GET("/films")
    Call<List<Film>> getFilms();

    @GET("/films/{id}")
    Call<Film> getFilmById(
           @Path("id") String id
    );

}
