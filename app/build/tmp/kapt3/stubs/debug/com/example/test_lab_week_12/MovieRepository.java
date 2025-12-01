package com.example.test_lab_week_12;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/test_lab_week_12/MovieRepository;", "", "movieService", "Lcom/example/test_lab_week_12/api/MovieService;", "(Lcom/example/test_lab_week_12/api/MovieService;)V", "apiKey", "", "fetchMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/test_lab_week_12/model/Movie;", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.test_lab_week_12.api.MovieService movieService = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiKey = "8a6981ca2124ec65ed3fcfcb057f67d2";
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.api.MovieService movieService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.test_lab_week_12.model.Movie>> fetchMovies() {
        return null;
    }
}