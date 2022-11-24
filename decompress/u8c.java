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

public final class u8c implements cxo, rrx, gga
{
    public static final String O0;
    public final Context F0;
    public final rsx G0;
    public final srx H0;
    public final Set<ktx> I0;
    public dn8 J0;
    public boolean K0;
    public final Object L0;
    public final y8r M0;
    public Boolean N0;
    
    static {
        O0 = jag.g("GreedyScheduler");
    }
    
    public u8c(final Context f0, final a a, final ixt ixt, final rsx g0) {
        this.I0 = new HashSet();
        this.M0 = new y8r(0);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = new srx(ixt, (rrx)this);
        this.J0 = new dn8(this, a.e);
        this.L0 = new Object();
    }
    
    public final void a(final List<ktx> list) {
        final Iterator<ktx> iterator = list.iterator();
        while (iterator.hasNext()) {
            final gsx o = eg8.O(iterator.next());
            final jag e = jag.e();
            final String o2 = u8c.O0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Constraints not met: Cancelling work ID ");
            sb.append(o);
            e.a(o2, sb.toString());
            final x8r e2 = this.M0.e(o);
            if (e2 != null) {
                this.G0.m(e2);
            }
        }
    }
    
    public final void b(final gsx gsx, final boolean b) {
        this.M0.e(gsx);
        synchronized (this.L0) {
            for (final ktx ktx : this.I0) {
                if (eg8.O(ktx).equals((Object)gsx)) {
                    final jag e = jag.e();
                    final String o0 = u8c.O0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Stopping tracking for ");
                    sb.append(gsx);
                    e.a(o0, sb.toString());
                    this.I0.remove(ktx);
                    this.H0.d(this.I0);
                    break;
                }
            }
        }
    }
    
    public final void c(final String s) {
        if (this.N0 == null) {
            this.N0 = f1l.a(this.F0, this.G0.b);
        }
        if (!this.N0) {
            jag.e().f(u8c.O0, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.K0) {
            this.G0.f.a((gga)this);
            this.K0 = true;
        }
        final jag e = jag.e();
        final String o0 = u8c.O0;
        final StringBuilder sb = new StringBuilder();
        sb.append("Cancelling work ID ");
        sb.append(s);
        e.a(o0, sb.toString());
        final dn8 j0 = this.J0;
        if (j0 != null) {
            final Runnable runnable = j0.c.remove(s);
            if (runnable != null) {
                ((Handler)j0.b.F0).removeCallbacks(runnable);
            }
        }
        final Iterator iterator = this.M0.g(s).iterator();
        while (iterator.hasNext()) {
            this.G0.m((x8r)iterator.next());
        }
    }
    
    public final void d(final ktx... array) {
        if (this.N0 == null) {
            this.N0 = f1l.a(this.F0, this.G0.b);
        }
        if (!this.N0) {
            jag.e().f(u8c.O0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.K0) {
            this.G0.f.a((gga)this);
            this.K0 = true;
        }
        final HashSet<ktx> set = new HashSet<ktx>();
        final HashSet<String> set2 = new HashSet<String>();
        for (final ktx ktx : array) {
            final long a = ktx.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (ktx.b == hsx$a.F0) {
                if (currentTimeMillis < a) {
                    final dn8 j0 = this.J0;
                    if (j0 != null) {
                        final Runnable runnable = j0.c.remove(ktx.a);
                        if (runnable != null) {
                            ((Handler)j0.b.F0).removeCallbacks(runnable);
                        }
                        final cn8 cn8 = new cn8(j0, ktx);
                        j0.c.put(ktx.a, cn8);
                        ((Handler)j0.b.F0).postDelayed((Runnable)cn8, ktx.a() - System.currentTimeMillis());
                    }
                }
                else if (ktx.c()) {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 23 && ktx.j.c) {
                        final jag e = jag.e();
                        final String o0 = u8c.O0;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Ignoring ");
                        sb.append(ktx);
                        sb.append(". Requires device idle.");
                        e.a(o0, sb.toString());
                    }
                    else if (sdk_INT >= 24 && ktx.j.a()) {
                        final jag e2 = jag.e();
                        final String o2 = u8c.O0;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Ignoring ");
                        sb2.append(ktx);
                        sb2.append(". Requires ContentUri triggers.");
                        e2.a(o2, sb2.toString());
                    }
                    else {
                        set.add(ktx);
                        set2.add(ktx.a);
                    }
                }
                else {
                    final jag e3 = jag.e();
                    final String o3 = u8c.O0;
                    final StringBuilder f = ehk.f("Starting work for ");
                    f.append(ktx.a);
                    e3.a(o3, f.toString());
                    final rsx g0 = this.G0;
                    final y8r m0 = this.M0;
                    Objects.requireNonNull(m0);
                    ((tsx)g0.d).a((Runnable)new z8r(g0, m0.h(eg8.O(ktx)), (WorkerParameters$a)null));
                }
            }
        }
        synchronized (this.L0) {
            if (!set.isEmpty()) {
                final String join = TextUtils.join((CharSequence)",", (Iterable)set2);
                final jag e4 = jag.e();
                final String o4 = u8c.O0;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Starting tracking for ");
                sb3.append(join);
                e4.a(o4, sb3.toString());
                this.I0.addAll(set);
                this.H0.d(this.I0);
            }
        }
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f(final List<ktx> list) {
        final Iterator iterator = ((ArrayList)list).iterator();
        while (iterator.hasNext()) {
            final gsx o = eg8.O((ktx)iterator.next());
            final jag e = jag.e();
            final String o2 = u8c.O0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Constraints met: Scheduling work ID ");
            sb.append(o);
            e.a(o2, sb.toString());
            final rsx g0 = this.G0;
            ((tsx)g0.d).a((Runnable)new z8r(g0, this.M0.h(o), (WorkerParameters$a)null));
        }
    }
}
