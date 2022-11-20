import android.content.Context;
import android.app.PendingIntent;
import android.util.Log;
import android.content.ComponentName;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6z implements Runnable
{
    public final int D0;
    public final Object E0;
    
    public q6z(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public q6z(final mnz e0) {
        this.D0 = 2;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final glz f0 = ((dlz)this.E0).F0;
                final Context d0 = ((pbz)f0).D0.D0;
                Objects.requireNonNull(((pbz)((dlz)this.E0).F0).D0);
                glz.x(f0, new ComponentName(d0, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            }
            case 2: {
                final long a = ((mnz)this.E0).a();
                if (a != -1L && System.currentTimeMillis() > a) {
                    final Context a2 = ((mnz)this.E0).a;
                    if (!a2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
                        final String value = String.valueOf(a2.getPackageName());
                        String concat;
                        if (value.length() != 0) {
                            concat = "Failed to clear app set ID generated for App ".concat(value);
                        }
                        else {
                            concat = new String("Failed to clear app set ID generated for App ");
                        }
                        Log.e("AppSet", concat);
                    }
                    if (!a2.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        final String value2 = String.valueOf(a2.getPackageName());
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "Failed to clear app set ID last used time for App ".concat(value2);
                        }
                        else {
                            concat2 = new String("Failed to clear app set ID last used time for App ");
                        }
                        Log.e("AppSet", concat2);
                    }
                }
                return;
            }
            case 1: {
                ((s2y)((o3y)this.E0).g).b(new vg6(4, null, null));
                return;
            }
            case 0: {
                ((fqz)this.E0).a(2, "Service disconnected");
            }
        }
    }
}
