import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class usx extends yah
{
    public final Context c;
    
    public usx(final Context c) {
        super(9, 10);
        this.c = c;
    }
    
    public final void a(h0s h0s) {
        e0e.f((Object)h0s, "database");
        h0s = h0s;
        ((oqb)h0s).y("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        final SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        Label_0159: {
            if (!sharedPreferences.contains("reschedule_needed") && !sharedPreferences.contains("last_cancel_all_time_ms")) {
                break Label_0159;
            }
            long n = 0L;
            final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                n = 1L;
            }
            ((oqb)h0s).v();
            try {
                ((oqb)h0s).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "last_cancel_all_time_ms", long1 });
                ((oqb)h0s).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", n });
                sharedPreferences.edit().clear().apply();
                ((oqb)h0s).A();
                ((oqb)h0s).B();
                final Context c = this.c;
                e0e.f((Object)c, "context");
                final SharedPreferences sharedPreferences2 = c.getSharedPreferences("androidx.work.util.id", 0);
                if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
                    return;
                }
                final int int1 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                final int int2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                ((oqb)h0s).v();
                try {
                    ((oqb)h0s).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", int1 });
                    ((oqb)h0s).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", int2 });
                    sharedPreferences2.edit().clear().apply();
                    ((oqb)h0s).A();
                }
                finally {
                    ((oqb)h0s).B();
                }
            }
            finally {
                ((oqb)h0s).B();
            }
        }
    }
}
