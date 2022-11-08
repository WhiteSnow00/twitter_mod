import android.os.BaseBundle;
import android.text.TextUtils;
import android.os.Bundle;
import android.os.SystemClock;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xlz
{
    public final /* synthetic */ zlz a;
    
    public xlz(final zlz a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.g();
        final f4z u = this.a.C0.u();
        Objects.requireNonNull(this.a.C0.P0);
        if (u.s(System.currentTimeMillis())) {
            this.a.C0.u().M0.a(true);
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                this.a.C0.b().P0.a("Detected application was in foreground");
                Objects.requireNonNull(this.a.C0.P0);
                this.c(System.currentTimeMillis(), false);
            }
        }
    }
    
    public final void b(final long n, final boolean b) {
        this.a.g();
        this.a.k();
        if (this.a.C0.u().s(n)) {
            this.a.C0.u().M0.a(true);
            mvz.c();
            if (this.a.C0.I0.t(null, fzy.E0)) {
                this.a.C0.r().n();
            }
        }
        this.a.C0.u().P0.b(n);
        if (this.a.C0.u().M0.b()) {
            this.c(n, b);
        }
    }
    
    public final void c(final long n, final boolean b) {
        this.a.g();
        if (!this.a.C0.h()) {
            return;
        }
        this.a.C0.u().P0.b(n);
        Objects.requireNonNull(this.a.C0.P0);
        this.a.C0.b().P0.b("Session started, time", (Object)SystemClock.elapsedRealtime());
        final Long value = n / 1000L;
        this.a.C0.w().D("auto", "_sid", (Object)value, n);
        this.a.C0.u().M0.a(false);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_sid", (long)value);
        if (this.a.C0.I0.t(null, fzy.b0) && b) {
            ((BaseBundle)bundle).putLong("_aib", 1L);
        }
        this.a.C0.w().p("auto", "_s", n, bundle);
        htz.c();
        if (this.a.C0.I0.t(null, fzy.e0)) {
            final String a = this.a.C0.u().U0.a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("_ffr", a);
                this.a.C0.w().p("auto", "_ssr", n, bundle2);
            }
        }
    }
}
