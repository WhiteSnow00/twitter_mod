import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpm extends gah
{
    public final Context c;
    
    public lpm(final Context c, final int n, final int n2) {
        super(n, n2);
        this.c = c;
    }
    
    public final void a(final tyr tyr) {
        zzd.f((Object)tyr, "database");
        if (super.b >= 10) {
            ((qqb)tyr).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", 1 });
        }
        else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
