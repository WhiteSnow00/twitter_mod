import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5f
{
    public static final SimpleDateFormat a;
    
    static {
        (a = new SimpleDateFormat("yyyy-MM-dd-HH", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }
}
