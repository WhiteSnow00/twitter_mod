import java.util.ArrayList;
import java.util.Collection;
import android.text.TextUtils;
import androidx.work.WorkerParameters$a;
import java.util.Objects;
import android.os.Build$VERSION;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import androidx.work.a;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s7c implements hwo, arx, yea
{
    public static final String M0;
    public final Context D0;
    public final zrx E0;
    public final brx F0;
    public final Set<rsx> G0;
    public xl8 H0;
    public boolean I0;
    public final Object J0;
    public final a8r K0;
    public Boolean L0;
    
    static {
        M0 = o9g.g("GreedyScheduler");
    }
    
    public s7c(final Context d0, final a a, final rwt rwt, final zrx e0) {
        this.G0 = new HashSet();
        this.K0 = new a8r(0);
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = new brx(rwt, (arx)this);
        this.H0 = new xl8(this, a.e);
        this.J0 = new Object();
    }
    
    public final void a(final List<rsx> list) {
        final Iterator<rsx> iterator = list.iterator();
        while (iterator.hasNext()) {
            final prx p = rp9.P(iterator.next());
            final o9g e = o9g.e();
            final String m0 = s7c.M0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Constraints not met: Cancelling work ID ");
            sb.append(p);
            e.a(m0, sb.toString());
            final z7r d = this.K0.d(p);
            if (d != null) {
                this.E0.m(d);
            }
        }
    }
    
    public final void b(final prx prx, final boolean b) {
        this.K0.d(prx);
        synchronized (this.J0) {
            for (final rsx rsx : this.G0) {
                if (rp9.P(rsx).equals((Object)prx)) {
                    final o9g e = o9g.e();
                    final String m0 = s7c.M0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Stopping tracking for ");
                    sb.append(prx);
                    e.a(m0, sb.toString());
                    this.G0.remove(rsx);
                    this.F0.d(this.G0);
                    break;
                }
            }
        }
    }
    
    public final void c(final String s) {
        if (this.L0 == null) {
            this.L0 = r0l.a(this.D0, this.E0.b);
        }
        if (!this.L0) {
            o9g.e().f(s7c.M0, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.I0) {
            this.E0.f.a((yea)this);
            this.I0 = true;
        }
        final o9g e = o9g.e();
        final String m0 = s7c.M0;
        final StringBuilder sb = new StringBuilder();
        sb.append("Cancelling work ID ");
        sb.append(s);
        e.a(m0, sb.toString());
        final xl8 h0 = this.H0;
        if (h0 != null) {
            final Runnable runnable = h0.c.remove(s);
            if (runnable != null) {
                ((Handler)h0.b.D0).removeCallbacks(runnable);
            }
        }
        final Iterator iterator = this.K0.e(s).iterator();
        while (iterator.hasNext()) {
            this.E0.m((z7r)iterator.next());
        }
    }
    
    public final void d(final rsx... array) {
        if (this.L0 == null) {
            this.L0 = r0l.a(this.D0, this.E0.b);
        }
        if (!this.L0) {
            o9g.e().f(s7c.M0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.I0) {
            this.E0.f.a((yea)this);
            this.I0 = true;
        }
        final HashSet<rsx> set = new HashSet<rsx>();
        final HashSet<String> set2 = new HashSet<String>();
        for (final rsx rsx : array) {
            final long a = rsx.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (rsx.b == qrx$a.D0) {
                if (currentTimeMillis < a) {
                    final xl8 h0 = this.H0;
                    if (h0 != null) {
                        final Runnable runnable = h0.c.remove(rsx.a);
                        if (runnable != null) {
                            ((Handler)h0.b.D0).removeCallbacks(runnable);
                        }
                        final wl8 wl8 = new wl8(h0, rsx);
                        h0.c.put(rsx.a, wl8);
                        ((Handler)h0.b.D0).postDelayed((Runnable)wl8, rsx.a() - System.currentTimeMillis());
                    }
                }
                else if (rsx.c()) {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 23 && rsx.j.c) {
                        final o9g e = o9g.e();
                        final String m0 = s7c.M0;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring ");
                        sb.append(rsx);
                        sb.append(". Requires device idle.");
                        e.a(m0, sb.toString());
                    }
                    else if (sdk_INT >= 24 && rsx.j.a()) {
                        final o9g e2 = o9g.e();
                        final String m2 = s7c.M0;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Ignoring ");
                        sb2.append(rsx);
                        sb2.append(". Requires ContentUri triggers.");
                        e2.a(m2, sb2.toString());
                    }
                    else {
                        set.add(rsx);
                        set2.add(rsx.a);
                    }
                }
                else {
                    final o9g e3 = o9g.e();
                    final String m3 = s7c.M0;
                    final StringBuilder j = fu8.j("Starting work for ");
                    j.append(rsx.a);
                    e3.a(m3, j.toString());
                    final zrx e4 = this.E0;
                    final a8r k0 = this.K0;
                    Objects.requireNonNull(k0);
                    ((bsx)e4.d).a((Runnable)new b8r(e4, k0.g(rp9.P(rsx)), (WorkerParameters$a)null));
                }
            }
        }
        synchronized (this.J0) {
            if (!set.isEmpty()) {
                final String join = TextUtils.join((CharSequence)",", (Iterable)set2);
                final o9g e5 = o9g.e();
                final String m4 = s7c.M0;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Starting tracking for ");
                sb3.append(join);
                e5.a(m4, sb3.toString());
                this.G0.addAll(set);
                this.F0.d(this.G0);
            }
        }
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f(final List<rsx> list) {
        final Iterator iterator = ((ArrayList)list).iterator();
        while (iterator.hasNext()) {
            final prx p = rp9.P((rsx)iterator.next());
            final o9g e = o9g.e();
            final String m0 = s7c.M0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Constraints met: Scheduling work ID ");
            sb.append(p);
            e.a(m0, sb.toString());
            final zrx e2 = this.E0;
            ((bsx)e2.d).a((Runnable)new b8r(e2, this.K0.g(p), (WorkerParameters$a)null));
        }
    }
}
