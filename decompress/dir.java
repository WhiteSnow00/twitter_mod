import java.text.DateFormat;
import j$.util.DesugarTimeZone;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dir
{
    public static final m4s a;
    
    static {
        ((DateFormat)(a = new m4s("EEE MMM dd HH:mm:ss Z yyyy", Locale.US))).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
}
