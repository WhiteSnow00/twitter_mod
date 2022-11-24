import android.os.Handler;
import android.os.BaseBundle;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class b6y extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    public volatile boolean G0;
    public final AtomicReference<t5y> H0;
    public final d6y I0;
    public final r5c J0;
    
    public b6y(final rbf rbf) {
        final r5c e = r5c.e;
        super(rbf);
        this.H0 = new AtomicReference<t5y>(null);
        this.I0 = new d6y(Looper.getMainLooper());
        this.J0 = e;
    }
    
    @Override
    public final void d(int n, final int n2, final Intent intent) {
        final t5y t5y = this.H0.get();
        if (n != 1) {
            if (n == 2) {
                n = this.J0.d((Context)this.b());
                if (n == 0) {
                    this.m();
                    return;
                }
                if (t5y == null) {
                    return;
                }
                if (t5y.b.G0 == 18 && n == 18) {
                    return;
                }
            }
        }
        else {
            if (n2 == -1) {
                this.m();
                return;
            }
            if (n2 == 0) {
                if (t5y == null) {
                    return;
                }
                n = 13;
                if (intent != null) {
                    n = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.j(new bi6(n, (PendingIntent)null, t5y.b.toString()), t5y.a);
                return;
            }
        }
        if (t5y != null) {
            this.j(t5y.b, t5y.a);
        }
    }
    
    @Override
    public final void e(final Bundle bundle) {
        if (bundle != null) {
            final AtomicReference<t5y> h0 = this.H0;
            final boolean boolean1 = bundle.getBoolean("resolving_error", false);
            t5y t5y = null;
            if (boolean1) {
                t5y = new t5y(new bi6(((BaseBundle)bundle).getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"), (String)null), ((BaseBundle)bundle).getInt("failed_client_id", -1));
            }
            h0.set(t5y);
        }
    }
    
    @Override
    public final void g(final Bundle bundle) {
        final t5y t5y = this.H0.get();
        if (t5y == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        ((BaseBundle)bundle).putInt("failed_client_id", t5y.a);
        ((BaseBundle)bundle).putInt("failed_status", t5y.b.G0);
        bundle.putParcelable("failed_resolution", (Parcelable)t5y.b.H0);
    }
    
    public final void j(final bi6 bi6, final int n) {
        this.H0.set(null);
        this.k(bi6, n);
    }
    
    public abstract void k(final bi6 p0, final int p1);
    
    public abstract void l();
    
    public final void m() {
        this.H0.set(null);
        this.l();
    }
    
    public final void n(final bi6 bi6, final int n) {
        final t5y t5y = new t5y(bi6, n);
        if (this.H0.compareAndSet(null, t5y)) {
            ((Handler)this.I0).post((Runnable)new y5y(this, t5y));
        }
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final bi6 bi6 = new bi6(13, (PendingIntent)null, (String)null);
        final t5y t5y = this.H0.get();
        int a;
        if (t5y == null) {
            a = -1;
        }
        else {
            a = t5y.a;
        }
        this.j(bi6, a);
    }
}
