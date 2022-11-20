import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zec
{
    public static final a Companion;
    public final SharedPreferences a;
    
    static {
        Companion = new a();
    }
    
    public zec(final Context context) {
        czd.f((Object)context, "context");
        final SharedPreferences sharedPreferences = context.getSharedPreferences("hashflag_last_fetch_time", 0);
        czd.e((Object)sharedPreferences, "context.getSharedPrefere\u2026ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }
    
    public static final class a
    {
    }
}
