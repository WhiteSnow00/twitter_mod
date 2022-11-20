import android.os.IInterface;
import java.util.concurrent.Callable;
import android.os.IBinder;
import android.content.ComponentName;
import com.android.billingclient.api.b;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uby implements ServiceConnection
{
    public final Object D0;
    public hw1 E0;
    public final b F0;
    
    public uby(final b f0, final hw1 e0) {
        this.F0 = f0;
        this.D0 = new Object();
        this.E0 = e0;
    }
    
    public final void a(final nx1 nx1) {
        synchronized (this.D0) {
            final hw1 e0 = this.E0;
            if (e0 != null) {
                e0.a(nx1);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        v8y.e("BillingClient", "Billing service connected.");
        final b f0 = this.F0;
        final int a = lny.a;
        Object f2;
        if (binder == null) {
            f2 = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof isy) {
                f2 = queryLocalInterface;
            }
            else {
                f2 = new zhy(binder);
            }
        }
        f0.f = (isy)f2;
        final b f3 = this.F0;
        if (f3.e((Callable)new mby((Object)this, 0), 30000L, (Runnable)new cby(this), f3.b()) == null) {
            this.a(this.F0.d());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        v8y.f("BillingClient", "Billing service disconnected.");
        this.F0.f = null;
        this.F0.a = 0;
        synchronized (this.D0) {
            final hw1 e0 = this.E0;
            if (e0 != null) {
                e0.b();
            }
        }
    }
}
