import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public interface v88<T>
{
    boolean a();
    
    float b();
    
    void c(final b98<T> p0, final Executor p1);
    
    boolean close();
    
    T d();
    
    Map<String, Object> getExtras();
    
    boolean isClosed();
}
