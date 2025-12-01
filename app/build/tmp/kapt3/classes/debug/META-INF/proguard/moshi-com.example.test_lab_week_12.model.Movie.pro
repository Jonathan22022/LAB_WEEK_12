-if class com.example.test_lab_week_12.model.Movie
-keepnames class com.example.test_lab_week_12.model.Movie
-if class com.example.test_lab_week_12.model.Movie
-keep class com.example.test_lab_week_12.model.MovieJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.test_lab_week_12.model.Movie
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.test_lab_week_12.model.Movie
-keepclassmembers class com.example.test_lab_week_12.model.Movie {
    public synthetic <init>(boolean,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String,float,java.lang.String,java.lang.String,java.lang.String,boolean,float,int,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
