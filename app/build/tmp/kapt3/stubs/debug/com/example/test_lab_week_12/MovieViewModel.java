package com.example.test_lab_week_12;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/example/test_lab_week_12/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/test_lab_week_12/MovieRepository;", "(Lcom/example/test_lab_week_12/MovieRepository;)V", "error", "Landroidx/lifecycle/LiveData;", "", "getError", "()Landroidx/lifecycle/LiveData;", "popularMovies", "", "Lcom/example/test_lab_week_12/model/Movie;", "getPopularMovies", "fetchPopularMovies", "", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.test_lab_week_12.MovieRepository movieRepository = null;
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.test_lab_week_12.model.Movie>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    private final void fetchPopularMovies() {
    }
}