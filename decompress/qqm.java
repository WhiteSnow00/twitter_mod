import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qqm extends yah
{
    public final Context c;
    
    public qqm(final Context c, final int n, final int n2) {
        super(n, n2);
        this.c = c;
    }
    
    public final void a(final h0s h0s) {
        e0e.f((Object)h0s, "database");
        if (super.b >= 10) {
            ((oqb)h0s).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", 1 });
        }
        else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
