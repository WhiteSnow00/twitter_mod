import android.content.SharedPreferences;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrx extends gah
{
    public final Context c;
    
    public lrx(final Context c) {
        super(9, 10);
        this.c = c;
    }
    
    public final void a(tyr tyr) {
        zzd.f((Object)tyr, "database");
        tyr = tyr;
        ((qqb)tyr).x("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        final SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        Label_0150: {
            if (!sharedPreferences.contains("reschedule_needed") && !sharedPreferences.contains("last_cancel_all_time_ms")) {
                break Label_0150;
            }
            long n = 0L;
            final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                n = 1L;
            }
            ((qqb)tyr).u();
            try {
                ((qqb)tyr).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "last_cancel_all_time_ms", long1 });
                ((qqb)tyr).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", n });
                sharedPreferences.edit().clear().apply();
                ((qqb)tyr).A();
                ((qqb)tyr).B();
                final Context c = this.c;
                zzd.f((Object)c, "context");
                final SharedPreferences sharedPreferences2 = c.getSharedPreferences("androidx.work.util.id", 0);
                if (!sharedPreferences2.contains("next_job_scheduler_id") && !sharedPreferences2.contains("next_job_scheduler_id")) {
                    return;
                }
                final int int1 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                final int int2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                ((qqb)tyr).u();
                try {
                    ((qqb)tyr).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", int1 });
                    ((qqb)tyr).G0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", int2 });
                    sharedPreferences2.edit().clear().apply();
                    ((qqb)tyr).A();
                }
                finally {
                    ((qqb)tyr).B();
                }
            }
            finally {
                ((qqb)tyr).B();
            }
        }
    }
}
