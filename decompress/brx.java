import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brx implements gi6$a
{
    public final arx a;
    public final gi6<?>[] b;
    public final Object c;
    
    public brx(final rwt rwt, final arx a) {
        czd.f((Object)rwt, "trackers");
        final rs1 rs1 = new rs1((ki6)rwt.a);
        final ys1 ys1 = new ys1((zs1)rwt.d);
        final tir tir = new tir((ki6)rwt.c);
        final mci mci = new mci((ki6<udi>)rwt.b);
        final bei bei = new bei((ki6)rwt.b);
        final idi idi = new idi((ki6)rwt.b);
        final ddi ddi = new ddi((ki6)rwt.b);
        this.a = a;
        this.b = (gi6<?>[])new gi6[] { (gi6)rs1, ys1, (gi6)tir, mci, (gi6)bei, (gi6)idi, (gi6)ddi };
        this.c = new Object();
    }
    
    public final void a(final List<rsx> list) {
        czd.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final ArrayList list2 = new ArrayList();
            for (final rsx next : list) {
                if (this.c(next.a)) {
                    list2.add(next);
                }
            }
            for (final rsx rsx : list2) {
                final o9g e = o9g.e();
                final String a = crx.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Constraints met for ");
                sb.append(rsx);
                e.a(a, sb.toString());
            }
            final arx a2 = this.a;
            if (a2 != null) {
                a2.f((List)list2);
            }
        }
    }
    
    public final void b(final List<rsx> list) {
        czd.f((Object)list, "workSpecs");
        synchronized (this.c) {
            final arx a = this.a;
            if (a != null) {
                a.a((List)list);
            }
        }
    }
    
    public final boolean c(final String s) {
        czd.f((Object)s, "workSpecId");
        synchronized (this.c) {
            final gi6<?>[] b = this.b;
            final int length = b.length;
            boolean b2 = false;
            while (true) {
                for (final gi6 gi6 : b) {
                    Objects.requireNonNull(gi6);
                    final Object d = gi6.d;
                    if (d != null && gi6.c(d) && gi6.c.contains(s)) {
                        if (gi6 != null) {
                            final o9g e = o9g.e();
                            final String a = crx.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Work ");
                            sb.append(s);
                            sb.append(" constrained by ");
                            sb.append(gi6.getClass().getSimpleName());
                            e.a(a, sb.toString());
                        }
                        if (gi6 == null) {
                            b2 = true;
                        }
                        return b2;
                    }
                }
                gi6 gi6 = null;
                continue;
            }
        }
    }
    
    public final void d(final Iterable<rsx> iterable) {
        czd.f((Object)iterable, "workSpecs");
        synchronized (this.c) {
            final gi6<?>[] b = this.b;
            final int length = b.length;
            final int n = 0;
            for (final gi6<?> gi6 : b) {
                if (gi6.e != null) {
                    gi6.e(gi6.e = null, gi6.d);
                }
            }
            final gi6<?>[] b2 = this.b;
            for (int length2 = b2.length, j = 0; j < length2; ++j) {
                b2[j].d((Iterable)iterable);
            }
            final gi6<?>[] b3 = this.b;
            for (int length3 = b3.length, k = n; k < length3; ++k) {
                final gi6<?> gi7 = b3[k];
                if (gi7.e != this) {
                    gi7.e(gi7.e = (gi6$a)this, gi7.d);
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this.c) {
            final gi6<?>[] b = this.b;
            for (int i = 0; i < b.length; ++i) {
                final gi6<?> gi6 = b[i];
                if (gi6.b.isEmpty() ^ true) {
                    gi6.b.clear();
                    gi6.a.b((ji6)gi6);
                }
            }
        }
    }
}
