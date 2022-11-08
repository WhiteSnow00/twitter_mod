import android.util.Log;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zmz implements go0
{
    public static zmz d;
    public final Context a;
    public boolean b;
    public final ExecutorService c;
    
    public zmz(final Context a) {
        this.b = false;
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = Executors.newSingleThreadExecutor();
        this.a = a;
        if (!this.b) {
            singleThreadScheduledExecutor.scheduleAtFixedRate((Runnable)new b6z(this), 0L, 86400L, TimeUnit.SECONDS);
            this.b = true;
        }
    }
    
    public static final SharedPreferences b(final Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }
    
    public static final void c(final Context context) throws bkz {
        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            final String value = String.valueOf(context.getPackageName());
            String concat;
            if (value.length() != 0) {
                concat = "Failed to store app set ID last used time for App ".concat(value);
            }
            else {
                concat = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", concat);
            throw new bkz("Failed to store the app set ID last used time.");
        }
    }
    
    public final long a() {
        final long long1 = b(this.a).getLong("app_set_id_last_used_time", -1L);
        if (long1 != -1L) {
            return long1 + 33696000000L;
        }
        return -1L;
    }
    
    public final zas<ho0> d() {
        final ebs ebs = new ebs();
        this.c.execute(new faz(this, ebs, 0));
        return (zas<ho0>)ebs.a;
    }
}
