import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class srx implements mj6$a
{
    public final rrx a;
    public final mj6<?>[] b;
    public final Object c;
    
    public srx(final ixt ixt, final rrx a) {
        e0e.f((Object)ixt, "trackers");
        final ys1 ys1 = new ys1((qj6<Boolean>)ixt.a);
        final ft1 ft1 = new ft1((gt1)ixt.d);
        final pjr pjr = new pjr((qj6<Boolean>)ixt.c);
        final ddi ddi = new ddi((qj6)ixt.b);
        final tei tei = new tei((qj6)ixt.b);
        final aei aei = new aei((qj6)ixt.b);
        final vdi vdi = new vdi((qj6)ixt.b);
        this.a = a;
        this.b = (mj6<?>[])new mj6[] { ys1, ft1, pjr, (mj6)ddi, (mj6)tei, (mj6)aei, (mj6)vdi };
        this.c = new Object();
    }
    
    public final void a(final List<ktx> list) {
        e0e.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final ArrayList list2 = new ArrayList();
            for (final ktx next : list) {
                if (this.c(next.a)) {
                    list2.add(next);
                }
            }
            for (final ktx ktx : list2) {
                final jag e = jag.e();
                final String a = trx.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Constraints met for ");
                sb.append(ktx);
                e.a(a, sb.toString());
            }
            final rrx a2 = this.a;
            if (a2 != null) {
                a2.f((List)list2);
            }
        }
    }
    
    public final void b(final List<ktx> list) {
        e0e.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final rrx a = this.a;
            if (a != null) {
                a.a((List)list);
            }
        }
    }
    
    public final boolean c(final String s) {
        e0e.f((Object)s, "workSpecId");
        synchronized (this.c) {
            final mj6<?>[] b = this.b;
            final int length = b.length;
            boolean b2 = false;
            while (true) {
                for (final mj6 mj6 : b) {
                    Objects.requireNonNull(mj6);
                    final Object d = mj6.d;
                    if (d != null && mj6.c(d) && mj6.c.contains(s)) {
                        if (mj6 != null) {
                            final jag e = jag.e();
                            final String a = trx.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Work ");
                            sb.append(s);
                            sb.append(" constrained by ");
                            sb.append(mj6.getClass().getSimpleName());
                            e.a(a, sb.toString());
                        }
                        if (mj6 == null) {
                            b2 = true;
                        }
                        return b2;
                    }
                }
                mj6 mj6 = null;
                continue;
            }
        }
    }
    
    public final void d(final Iterable<ktx> iterable) {
        e0e.f((Object)iterable, "workSpecs");
        synchronized (this.c) {
            final mj6<?>[] b = this.b;
            final int length = b.length;
            final int n = 0;
            for (final mj6<?> mj6 : b) {
                if (mj6.e != null) {
                    mj6.e(mj6.e = null, mj6.d);
                }
            }
            final mj6<?>[] b2 = this.b;
            for (int length2 = b2.length, j = 0; j < length2; ++j) {
                b2[j].d((Iterable)iterable);
            }
            final mj6<?>[] b3 = this.b;
            for (int length3 = b3.length, k = n; k < length3; ++k) {
                final mj6<?> mj7 = b3[k];
                if (mj7.e != this) {
                    mj7.e(mj7.e = (mj6$a)this, mj7.d);
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this.c) {
            final mj6<?>[] b = this.b;
            for (int i = 0; i < b.length; ++i) {
                final mj6<?> mj6 = b[i];
                if (mj6.b.isEmpty() ^ true) {
                    mj6.b.clear();
                    mj6.a.b((pj6)mj6);
                }
            }
        }
    }
}
