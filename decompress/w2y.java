import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import android.app.PendingIntent;
import java.util.Objects;
import android.os.Message;
import android.os.Looper;
import android.content.Context;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "HandlerLeak" })
public final class w2y extends j5y
{
    public final Context a;
    public final p4c b;
    
    public w2y(final p4c b, final Context context) {
        this.b = b;
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        }
        else {
            looper = Looper.myLooper();
        }
        super(looper);
        this.a = context.getApplicationContext();
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        final boolean b = true;
        if (what != 1) {
            mw.A(50, "Don't know how to handle this message: ", what, "GoogleApiAvailability");
            return;
        }
        final int d = this.b.d(this.a);
        Objects.requireNonNull(this.b);
        final AtomicBoolean a = e5c.a;
        int n = b ? 1 : 0;
        if (d != 1) {
            n = (b ? 1 : 0);
            if (d != 2) {
                n = (b ? 1 : 0);
                if (d != 3) {
                    n = (b ? 1 : 0);
                    if (d != 9) {
                        n = 0;
                    }
                }
            }
        }
        if (n != 0) {
            final p4c b2 = this.b;
            final Context a2 = this.a;
            final Intent b3 = b2.b(a2, d, "n");
            PendingIntent activity = null;
            if (b3 != null) {
                activity = PendingIntent.getActivity(a2, 0, b3, fsy.a | 0x8000000);
            }
            b2.i(a2, d, activity);
        }
    }
}
