import androidx.preference.f;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7l
{
    public static final a Companion;
    public final SharedPreferences a;
    
    static {
        Companion = new a();
    }
    
    public r7l(final SharedPreferences a) {
        this.a = a;
    }
    
    public static final class a
    {
        public final r7l a(final Context context) {
            e0e.f((Object)context, "context");
            final SharedPreferences sharedPreferences = context.getSharedPreferences(f.a(context), 0);
            e0e.e((Object)sharedPreferences, "getDefaultSharedPreferences(context)");
            return new r7l(sharedPreferences);
        }
    }
}
