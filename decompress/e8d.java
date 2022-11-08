import android.graphics.Rect;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8d implements f8d
{
    public final efk a;
    public final zph b;
    public final h8d c;
    public final lyr<Boolean> d;
    public y7d e;
    public d8d f;
    public g8d g;
    public a8d h;
    public bnb i;
    public List<c8d> j;
    public boolean k;
    
    public e8d(final zph b, final efk a, final lyr<Boolean> lyr) {
        final nyr$a a2 = nyr.a;
        this.b = b;
        this.a = a;
        this.c = new h8d();
        this.d = (lyr<Boolean>)a2;
    }
    
    public final void a(final h8d h8d, final int n) {
        if (this.k) {
            final CopyOnWriteArrayList j = this.j;
            if (j != null) {
                if (!j.isEmpty()) {
                    final Iterator iterator = this.j.iterator();
                    while (iterator.hasNext()) {
                        ((c8d)iterator.next()).a();
                    }
                }
            }
        }
    }
    
    public final void b(final h8d h8d, final int v) {
        h8d.v = v;
        if (this.k) {
            final CopyOnWriteArrayList j = this.j;
            if (j != null) {
                if (!j.isEmpty()) {
                    if (v == 3) {
                        final anp f = ((tb)this.a).f;
                        if (f != null && ((ke9)f).b() != null) {
                            final Rect bounds = ((ke9)f).b().getBounds();
                            this.c.s = bounds.width();
                            this.c.t = bounds.height();
                        }
                    }
                    final Iterator iterator = this.j.iterator();
                    while (iterator.hasNext()) {
                        ((c8d)iterator.next()).b();
                    }
                }
            }
        }
    }
    
    public final void c(final boolean k) {
        this.k = k;
        if (k) {
            if (this.h == null) {
                this.h = new a8d(this.b, this.c, (f8d)this, (lyr)this.d);
            }
            if (this.g == null) {
                this.g = new g8d(this.b, this.c);
            }
            if (this.f == null) {
                this.f = new d8d(this.c, this);
            }
            final y7d e = this.e;
            if (e == null) {
                this.e = new y7d(((tb)this.a).h, (x7d)this.f);
            }
            else {
                e.a = ((tb)this.a).h;
            }
            if (this.i == null) {
                this.i = new bnb(new som[] { this.g, (som)this.e });
            }
            final d8d f = this.f;
            if (f != null) {
                this.a.E((x7d)f);
            }
            final a8d h = this.h;
            if (h != null) {
                final tmb e2 = ((tb)this.a).e;
                synchronized (e2) {
                    e2.C0.add(h);
                }
            }
            final bnb i = this.i;
            if (i != null) {
                this.a.F((som)i);
            }
        }
        else {
            final d8d f2 = this.f;
            Label_0327: {
                if (f2 != null) {
                    final efk a = this.a;
                    synchronized (a) {
                        final x7d e3 = a.E;
                        if (e3 instanceof wmb) {
                            final wmb wmb = (wmb)e3;
                            synchronized (wmb) {
                                wmb.a.remove(f2);
                                break Label_0327;
                            }
                        }
                        if (e3 == f2) {
                            a.E = null;
                        }
                    }
                }
            }
            final a8d h2 = this.h;
            if (h2 != null) {
                final tmb e4 = ((tb)this.a).e;
                synchronized (e4) {
                    final int index = e4.C0.indexOf(h2);
                    if (index != -1) {
                        e4.C0.remove(index);
                    }
                }
            }
            final bnb j = this.i;
            if (j != null) {
                this.a.K((som)j);
            }
        }
    }
}
