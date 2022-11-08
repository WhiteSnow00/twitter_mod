import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqx implements aj6$a
{
    public final hqx a;
    public final aj6<?>[] b;
    public final Object c;
    
    public iqx(final bwt bwt, final hqx a) {
        zzd.f((Object)bwt, "trackers");
        final vs1 vs1 = new vs1((ej6)bwt.a);
        final ct1 ct1 = new ct1((dt1)bwt.d);
        final zhr zhr = new zhr((ej6<Boolean>)bwt.c);
        final kci kci = new kci((ej6<rdi>)bwt.b);
        final ydi ydi = new ydi((ej6)bwt.b);
        final gdi gdi = new gdi((ej6)bwt.b);
        final bdi bdi = new bdi((ej6)bwt.b);
        this.a = a;
        this.b = (aj6<?>[])new aj6[] { (aj6)vs1, (aj6)ct1, zhr, kci, (aj6)ydi, (aj6)gdi, (aj6)bdi };
        this.c = new Object();
    }
    
    public final void a(final List<bsx> list) {
        zzd.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final ArrayList list2 = new ArrayList();
            for (final bsx next : list) {
                if (this.c(next.a)) {
                    list2.add(next);
                }
            }
            for (final bsx bsx : list2) {
                final y9g e = y9g.e();
                final String a = jqx.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Constraints met for ");
                sb.append(bsx);
                e.a(a, sb.toString());
            }
            final hqx a2 = this.a;
            if (a2 != null) {
                a2.f((List)list2);
            }
        }
    }
    
    public final void b(final List<bsx> list) {
        zzd.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final hqx a = this.a;
            if (a != null) {
                a.a((List)list);
            }
        }
    }
    
    public final boolean c(final String s) {
        zzd.f((Object)s, "workSpecId");
        synchronized (this.c) {
            final aj6<?>[] b = this.b;
            final int length = b.length;
            boolean b2 = false;
            while (true) {
                for (final aj6 aj6 : b) {
                    Objects.requireNonNull(aj6);
                    final Object d = aj6.d;
                    if (d != null && aj6.c(d) && aj6.c.contains(s)) {
                        if (aj6 != null) {
                            final y9g e = y9g.e();
                            final String a = jqx.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Work ");
                            sb.append(s);
                            sb.append(" constrained by ");
                            sb.append(aj6.getClass().getSimpleName());
                            e.a(a, sb.toString());
                        }
                        if (aj6 == null) {
                            b2 = true;
                        }
                        return b2;
                    }
                }
                aj6 aj6 = null;
                continue;
            }
        }
    }
    
    public final void d(final Iterable<bsx> iterable) {
        zzd.f((Object)iterable, "workSpecs");
        synchronized (this.c) {
            final aj6<?>[] b = this.b;
            final int length = b.length;
            final int n = 0;
            for (final aj6<?> aj6 : b) {
                if (aj6.e != null) {
                    aj6.e(aj6.e = null, aj6.d);
                }
            }
            final aj6<?>[] b2 = this.b;
            for (int length2 = b2.length, j = 0; j < length2; ++j) {
                b2[j].d((Iterable)iterable);
            }
            final aj6<?>[] b3 = this.b;
            for (int length3 = b3.length, k = n; k < length3; ++k) {
                final aj6<?> aj7 = b3[k];
                if (aj7.e != this) {
                    aj7.e(aj7.e = (aj6$a)this, aj7.d);
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this.c) {
            final aj6<?>[] b = this.b;
            for (int i = 0; i < b.length; ++i) {
                final aj6<?> aj6 = b[i];
                if (aj6.b.isEmpty() ^ true) {
                    aj6.b.clear();
                    aj6.a.b((dj6)aj6);
                }
            }
        }
    }
}
