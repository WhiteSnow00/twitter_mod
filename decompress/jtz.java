import android.os.Handler;
import android.os.BaseBundle;
import java.util.Iterator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.HashMap;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.Map;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtz implements ServiceConnection
{
    public final Map<ServiceConnection, ServiceConnection> D0;
    public int E0;
    public boolean F0;
    public IBinder G0;
    public final urz H0;
    public ComponentName I0;
    public final nxz J0;
    
    public jtz(final nxz j0, final urz h0) {
        this.J0 = j0;
        this.H0 = h0;
        this.D0 = new HashMap();
        this.E0 = 2;
    }
    
    public final void a(final String s, final Executor executor) {
        this.E0 = 3;
        final nxz j0 = this.J0;
        final yg6 g = j0.g;
        final Context e = j0.e;
        final urz h0 = this.H0;
        final String a = h0.a;
        Intent intent = null;
        final Intent intent2 = null;
        if (a != null) {
            if (h0.d) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("serviceActionBundleKey", h0.a);
                Bundle call;
                try {
                    call = e.getContentResolver().call(urz.e, "serviceIntentCall", (String)null, bundle);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(ex.toString()));
                    call = null;
                }
                Intent intent3;
                if (call == null) {
                    intent3 = intent2;
                }
                else {
                    intent3 = (Intent)call.getParcelable("serviceResponseIntentKey");
                }
                intent = intent3;
                if (intent3 == null) {
                    final String value = String.valueOf(h0.a);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Dynamic lookup for intent failed for action: ".concat(value);
                    }
                    else {
                        concat = new String("Dynamic lookup for intent failed for action: ");
                    }
                    Log.w("ConnectionStatusConfig", concat);
                    intent = intent3;
                }
            }
            if (intent == null) {
                intent = new Intent(h0.a).setPackage(h0.b);
            }
        }
        else {
            intent = new Intent().setComponent((ComponentName)null);
        }
        final boolean d = g.d(e, s, intent, (ServiceConnection)this, this.H0.c, executor);
        this.F0 = d;
        if (d) {
            ((Handler)this.J0.f).sendMessageDelayed(((Handler)this.J0.f).obtainMessage(1, (Object)this.H0), this.J0.i);
            return;
        }
        this.E0 = 2;
        try {
            final nxz j2 = this.J0;
            j2.g.c(j2.e, (ServiceConnection)this);
        }
        catch (final IllegalArgumentException ex2) {}
    }
    
    public final void onServiceConnected(final ComponentName i0, final IBinder g0) {
        synchronized (this.J0.d) {
            ((Handler)this.J0.f).removeMessages(1, (Object)this.H0);
            this.G0 = g0;
            this.I0 = i0;
            final Iterator iterator = this.D0.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceConnected(i0, g0);
            }
            this.E0 = 1;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName i0) {
        synchronized (this.J0.d) {
            ((Handler)this.J0.f).removeMessages(1, (Object)this.H0);
            this.G0 = null;
            this.I0 = i0;
            final Iterator iterator = this.D0.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceDisconnected(i0);
            }
            this.E0 = 2;
        }
    }
}
