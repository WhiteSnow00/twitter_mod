import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public interface dw0<S>
{
    S a();
    
    S b() throws InterruptedException;
    
    aw0<S> c();
    
    Runnable d(final aw0 p0) throws InterruptedException;
    
    void e(final ptm<S> p0);
    
    void f();
    
    gw0 getMetrics();
    
    void j(final ptm<S> p0);
    
    dw0<S> o(final a<S> p0);
    
    UserIdentifier r();
    
    String s();
    
    void w();
    
    List<a<S>> y();
    
    public interface a<S>
    {
        void a(final ptm<S> p0);
        
        void b();
        
        void c();
    }
}
