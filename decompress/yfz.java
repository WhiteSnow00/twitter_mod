import android.os.BaseBundle;
import android.os.SystemClock;
import java.util.Objects;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.annotation.TargetApi;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(14)
public final class yfz implements Application$ActivityLifecycleCallbacks
{
    public final bgz D0;
    
    public yfz(final bgz d0) {
        this.D0 = d0;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        while (true) {
            while (true) {
                try {
                    ((pbz)this.D0).D0.b().Q0.a("onActivityCreated");
                    final Intent intent = activity.getIntent();
                    n8z n8z;
                    if (intent == null) {
                        n8z = ((pbz)this.D0).D0;
                    }
                    else {
                        final Uri data = intent.getData();
                        if (data != null && data.isHierarchical()) {
                            ((pbz)this.D0).D0.B();
                            final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            final boolean equals = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra);
                            boolean b = true;
                            String s;
                            if (!equals && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                                s = "auto";
                            }
                            else {
                                s = "gs";
                            }
                            final String queryParameter = data.getQueryParameter("referrer");
                            if (bundle != null) {
                                b = false;
                            }
                            ((pbz)this.D0).D0.a().q((Runnable)new vez(this, b, data, s, queryParameter));
                            n8z = ((pbz)this.D0).D0;
                        }
                        else {
                            n8z = ((pbz)this.D0).D0;
                        }
                    }
                    n8z.y().p(activity, bundle);
                    return;
                }
                catch (final RuntimeException ex) {}
                finally {
                    break;
                }
                final Throwable t;
                ((pbz)this.D0).D0.b().I0.b("Throwable caught in onActivityCreated", (Object)t);
                n8z n8z = ((pbz)this.D0).D0;
                continue;
            }
        }
        ((pbz)this.D0).D0.y().p(activity, bundle);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        final whz y = ((pbz)this.D0).D0.y();
        synchronized (y.O0) {
            if (activity == y.J0) {
                y.J0 = null;
            }
            monitorexit(y.O0);
            if (((pbz)y).D0.J0.v()) {
                y.I0.remove((Object)activity);
            }
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        final whz y = ((pbz)this.D0).D0.y();
        synchronized (y.O0) {
            y.N0 = false;
            y.K0 = true;
            monitorexit(y.O0);
            Objects.requireNonNull(((pbz)y).D0.Q0);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!((pbz)y).D0.J0.v()) {
                y.F0 = null;
                ((pbz)y).D0.a().q((Runnable)new mny((axy)y, elapsedRealtime, 2));
            }
            else {
                final sgz r = y.r(activity);
                y.G0 = y.F0;
                y.F0 = null;
                ((pbz)y).D0.a().q(new rhz(y, r, elapsedRealtime));
            }
            final nmz a = ((pbz)this.D0).D0.A();
            Objects.requireNonNull(((pbz)a).D0.Q0);
            ((pbz)a).D0.a().q(new ydz((x1z)a, SystemClock.elapsedRealtime(), 1));
        }
    }
    
    public final void onActivityResumed(final Activity j0) {
        final nmz a = ((pbz)this.D0).D0.A();
        Objects.requireNonNull(((pbz)a).D0.Q0);
        ((pbz)a).D0.a().q((Runnable)new xlz(a, SystemClock.elapsedRealtime()));
        final whz y = ((pbz)this.D0).D0.y();
        synchronized (y.O0) {
            y.N0 = true;
            if (j0 != y.J0) {
                Object o = y.O0;
                synchronized (o) {
                    y.J0 = j0;
                    y.K0 = false;
                    monitorexit(o);
                    if (((pbz)y).D0.J0.v()) {
                        y.L0 = null;
                        o = ((pbz)y).D0.a();
                        ((d8z)o).q((Runnable)new thz((Object)y, 0));
                    }
                }
            }
            monitorexit(y.O0);
            if (!((pbz)y).D0.J0.v()) {
                y.F0 = y.L0;
                ((pbz)y).D0.a().q((Runnable)new l2y((Object)y, 2));
            }
            else {
                y.k(j0, y.r(j0), false);
                final ksy o2 = ((pbz)y).D0.o();
                Objects.requireNonNull(((pbz)o2).D0.Q0);
                ((pbz)o2).D0.a().q((Runnable)new mny((axy)o2, SystemClock.elapsedRealtime(), 0));
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        final whz y = ((pbz)this.D0).D0.y();
        if (((pbz)y).D0.J0.v()) {
            if (bundle != null) {
                final sgz sgz = (sgz)y.I0.get((Object)activity);
                if (sgz != null) {
                    final Bundle bundle2 = new Bundle();
                    ((BaseBundle)bundle2).putLong("id", sgz.c);
                    ((BaseBundle)bundle2).putString("name", sgz.a);
                    ((BaseBundle)bundle2).putString("referrer_name", sgz.b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
            }
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
