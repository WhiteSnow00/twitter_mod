import android.graphics.Rect;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k8d implements l8d
{
    public final xfk a;
    public final uqh b;
    public final n8d c;
    public final zzr<Boolean> d;
    public e8d e;
    public j8d f;
    public m8d g;
    public g8d h;
    public anb i;
    public List<i8d> j;
    public boolean k;
    
    public k8d(final uqh b, final xfk a, final zzr<Boolean> zzr) {
        final b0s$a a2 = b0s.a;
        this.b = b;
        this.a = a;
        this.c = new n8d();
        this.d = (zzr<Boolean>)a2;
    }
    
    public final void a(final n8d n8d, final int n) {
        if (this.k) {
            final CopyOnWriteArrayList j = this.j;
            if (j != null) {
                if (!j.isEmpty()) {
                    final Iterator iterator = this.j.iterator();
                    while (iterator.hasNext()) {
                        ((i8d)iterator.next()).a();
                    }
                }
            }
        }
    }
    
    public final void b(final n8d n8d, final int v) {
        n8d.v = v;
        if (this.k) {
            final CopyOnWriteArrayList j = this.j;
            if (j != null) {
                if (!j.isEmpty()) {
                    if (v == 3) {
                        final nop f = ((sb)this.a).f;
                        if (f != null && f.c() != null) {
                            final Rect bounds = f.c().getBounds();
                            this.c.s = bounds.width();
                            this.c.t = bounds.height();
                        }
                    }
                    final Iterator iterator = this.j.iterator();
                    while (iterator.hasNext()) {
                        ((i8d)iterator.next()).b();
                    }
                }
            }
        }
    }
    
    public final void c(final boolean k) {
        this.k = k;
        if (k) {
            if (this.h == null) {
                this.h = new g8d(this.b, this.c, (l8d)this, (zzr)this.d);
            }
            if (this.g == null) {
                this.g = new m8d(this.b, this.c);
            }
            if (this.f == null) {
                this.f = new j8d(this.c, this);
            }
            final e8d e = this.e;
            if (e == null) {
                this.e = new e8d(((sb)this.a).h, (d8d)this.f);
            }
            else {
                e.a = ((sb)this.a).h;
            }
            if (this.i == null) {
                this.i = new anb(new ypm[] { (ypm)this.g, this.e });
            }
            final j8d f = this.f;
            if (f != null) {
                this.a.E((d8d)f);
            }
            final g8d h = this.h;
            if (h != null) {
                final smb<INFO> e2 = ((sb)this.a).e;
                synchronized (e2) {
                    e2.F0.add(h);
                }
            }
            final anb i = this.i;
            if (i != null) {
                this.a.F((ypm)i);
            }
        }
        else {
            final j8d f2 = this.f;
            Label_0343: {
                if (f2 != null) {
                    final xfk a = this.a;
                    synchronized (a) {
                        final d8d e3 = a.E;
                        if (e3 instanceof vmb) {
                            final vmb vmb = (vmb)e3;
                            synchronized (vmb) {
                                vmb.a.remove(f2);
                                break Label_0343;
                            }
                        }
                        if (e3 == f2) {
                            a.E = null;
                        }
                    }
                }
            }
            final g8d h2 = this.h;
            if (h2 != null) {
                final smb<INFO> e4 = ((sb)this.a).e;
                synchronized (e4) {
                    final int index = e4.F0.indexOf(h2);
                    if (index != -1) {
                        e4.F0.remove(index);
                    }
                }
            }
            final anb j = this.i;
            if (j != null) {
                this.a.K((ypm)j);
            }
        }
    }
}
