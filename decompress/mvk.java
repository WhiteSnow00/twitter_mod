import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mvk
{
    public final SharedPreferences a;
    
    public mvk(final Context context) {
        this.a = context.getSharedPreferences("openback.prefs", 0);
    }
    
    public final boolean a(final String s, final boolean b) {
        try {
            return this.a.getBoolean(s, b);
        }
        catch (final Exception ex) {
            return b;
        }
    }
    
    public final String b(String string, final String s) {
        try {
            string = this.a.getString(string, s);
            return string;
        }
        catch (final Exception ex) {
            return s;
        }
    }
    
    public final boolean c(final String s) {
        try {
            return this.a.contains(s);
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final void d(final boolean b) {
        try {
            synchronized (mvk.class) {
                this.a.edit().putBoolean("Started", b).apply();
            }
        }
        catch (final Exception ex) {}
    }
    
    public final void e(final long n) {
        try {
            synchronized (mvk.class) {
                this.a.edit().putLong("message_sensors", n).apply();
            }
        }
        catch (final Exception ex) {}
    }
    
    public final void f(final String s, final String s2) {
        try {
            synchronized (mvk.class) {
                this.a.edit().putString(s, s2).apply();
            }
        }
        catch (final Exception ex) {}
    }
}
