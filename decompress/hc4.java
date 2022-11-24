import java.util.logging.Level;
import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hc4 implements eah
{
    public static final Logger a;
    
    static {
        a = Logger.getLogger(hc4.class.getName());
    }
    
    public final InputStream a(final String s) {
        final InputStream resourceAsStream = hc4.class.getResourceAsStream(s);
        if (resourceAsStream == null) {
            hc4.a.log(Level.WARNING, String.format("File %s not found", s));
        }
        return resourceAsStream;
    }
}
