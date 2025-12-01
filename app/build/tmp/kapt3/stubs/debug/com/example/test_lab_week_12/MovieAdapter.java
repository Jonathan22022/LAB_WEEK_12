package com.example.test_lab_week_12;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/test_lab_week_12/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/test_lab_week_12/MovieAdapter$MovieViewHolder;", "clickListener", "Lcom/example/test_lab_week_12/MovieAdapter$MovieClickListener;", "(Lcom/example/test_lab_week_12/MovieAdapter$MovieClickListener;)V", "movies", "", "Lcom/example/test_lab_week_12/model/Movie;", "addMovies", "", "movieList", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieClickListener", "MovieViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.test_lab_week_12.MovieAdapter.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.test_lab_week_12.MovieAdapter.MovieClickListener clickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.test_lab_week_12.model.Movie> movies = null;
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.MovieAdapter.MovieClickListener clickListener) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.test_lab_week_12.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.test_lab_week_12.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    public final void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.test_lab_week_12.model.Movie> movieList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/test_lab_week_12/MovieAdapter$MovieClickListener;", "", "onMovieClick", "", "movie", "Lcom/example/test_lab_week_12/model/Movie;", "app_debug"})
    public static abstract interface MovieClickListener {
        
        public abstract void onMovieClick(@org.jetbrains.annotations.NotNull()
        com.example.test_lab_week_12.model.Movie movie);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/test_lab_week_12/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageUrl", "", "poster", "Landroid/widget/ImageView;", "getPoster", "()Landroid/widget/ImageView;", "poster$delegate", "Lkotlin/Lazy;", "titleText", "Landroid/widget/TextView;", "getTitleText", "()Landroid/widget/TextView;", "titleText$delegate", "bind", "", "movie", "Lcom/example/test_lab_week_12/model/Movie;", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String imageUrl = "https://image.tmdb.org/t/p/w185/";
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy titleText$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy poster$delegate = null;
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        private final android.widget.TextView getTitleText() {
            return null;
        }
        
        private final android.widget.ImageView getPoster() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.test_lab_week_12.model.Movie movie) {
        }
    }
}