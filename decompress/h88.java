import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public interface h88<T>
{
    boolean a();
    
    float b();
    
    void c(final n88<T> p0, final Executor p1);
    
    boolean close();
    
    T d();
    
    Map<String, Object> getExtras();
    
    boolean isClosed();
}
