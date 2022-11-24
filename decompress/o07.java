import android.os.BaseBundle;
import android.util.Log;
import java.util.Locale;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o07 implements pz$b
{
    public b00 a;
    public b00 b;
    
    public final void a(final int n, Bundle bundle) {
        final String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", n, bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, (Throwable)null);
        }
        final String string = ((BaseBundle)bundle).getString("name");
        if (string != null) {
            if ((bundle = bundle.getBundle("params")) == null) {
                bundle = new Bundle();
            }
            b00 b00;
            if ("clx".equals(((BaseBundle)bundle).getString("_o"))) {
                b00 = this.a;
            }
            else {
                b00 = this.b;
            }
            if (b00 != null) {
                b00.a(string, bundle);
            }
        }
    }
}
