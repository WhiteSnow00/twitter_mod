import java.util.logging.Level;
import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eb4 implements n9h
{
    public static final Logger a;
    
    static {
        a = Logger.getLogger(eb4.class.getName());
    }
    
    public final InputStream a(final String s) {
        final InputStream resourceAsStream = eb4.class.getResourceAsStream(s);
        if (resourceAsStream == null) {
            eb4.a.log(Level.WARNING, String.format("File %s not found", s));
        }
        return resourceAsStream;
    }
}
