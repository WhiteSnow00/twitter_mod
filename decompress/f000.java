import java.util.Iterator;
import java.util.Collection;
import android.os.Bundle;
import android.content.Intent;
import java.util.LinkedHashSet;
import android.os.Looper;
import android.content.IntentFilter;
import android.content.Context;
import java.util.Set;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f000 extends rny<o2r>
{
    public static f000 j;
    public final Handler g;
    public final n6z h;
    public final Set<p2r> i;
    
    public f000(final Context context) {
        final ftz d0 = ftz.D0;
        super(new f3a("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = (n6z)d0;
    }
    
    public static f000 d(final Context context) {
        synchronized (f000.class) {
            if (f000.j == null) {
                final ftz d0 = ftz.D0;
                f000.j = new f000(context);
            }
            return f000.j;
        }
    }
    
    @Override
    public final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        final o2r m = o2r.m(bundleExtra);
        super.a.i("ListenerRegistryBroadcastReceiver.onReceive: %s", m);
        final paz b = ((ftz)this.h).b();
        final j9y j9y = (j9y)m;
        if (j9y.b == 3 && b != null) {
            b.a(j9y.i, (b2z)new q80(this, m, intent, context));
            return;
        }
        this.e(m);
    }
    
    public final void e(final o2r o2r) {
        synchronized (this) {
            final Iterator iterator = new LinkedHashSet(this.i).iterator();
            while (iterator.hasNext()) {
                ((o9r<o2r>)iterator.next()).a(o2r);
            }
            this.c(o2r);
        }
    }
}
