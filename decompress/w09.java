import java.util.Collection;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public interface w09
{
    b C(final String p0, final Object p1) throws IOException;
    
    long a(final String p0) throws IOException;
    
    void b();
    
    boolean c(final String p0, final Object p1) throws IOException;
    
    long d(final a p0) throws IOException;
    
    boolean e(final String p0, final Object p1) throws IOException;
    
    bya f(final String p0, final Object p1) throws IOException;
    
    Collection<a> g() throws IOException;
    
    void h() throws IOException;
    
    boolean isExternal();
    
    public interface a
    {
        long b();
        
        String getId();
        
        long getSize();
    }
    
    public interface b
    {
    }
}
