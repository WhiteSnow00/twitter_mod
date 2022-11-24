import android.os.IInterface;
import java.util.concurrent.Callable;
import android.os.IBinder;
import android.content.ComponentName;
import com.android.billingclient.api.b;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocy implements ServiceConnection
{
    public final Object F0;
    public pw1 G0;
    public final b H0;
    
    public ocy(final b h0, final pw1 g0) {
        this.H0 = h0;
        this.F0 = new Object();
        this.G0 = g0;
    }
    
    public final void a(final vx1 vx1) {
        synchronized (this.F0) {
            final pw1 g0 = this.G0;
            if (g0 != null) {
                g0.a(vx1);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        p9y.e("BillingClient", "Billing service connected.");
        final b h0 = this.H0;
        final int a = foy.a;
        Object f;
        if (binder == null) {
            f = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof fty) {
                f = queryLocalInterface;
            }
            else {
                f = new tiy(binder);
            }
        }
        h0.f = (fty)f;
        final b h2 = this.H0;
        if (h2.e((Callable)new gcy((Object)this, 0), 30000L, (Runnable)new wby(this), h2.b()) == null) {
            this.a(this.H0.d());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        p9y.f("BillingClient", "Billing service disconnected.");
        this.H0.f = null;
        this.H0.a = 0;
        synchronized (this.F0) {
            final pw1 g0 = this.G0;
            if (g0 != null) {
                g0.b();
            }
        }
    }
}
