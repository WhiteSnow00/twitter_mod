import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wdz
{
    public static final ws0 a;
    
    static {
        a = new ws0();
    }
    
    public static Uri a() {
        synchronized (wdz.class) {
            final ws0 a = wdz.a;
            final Uri uri = (Uri)a.getOrDefault((Object)"com.google.android.gms.measurement", (Object)null);
            if (uri == null) {
                final Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                a.put((Object)"com.google.android.gms.measurement", (Object)parse);
                return parse;
            }
            return uri;
        }
    }
}
