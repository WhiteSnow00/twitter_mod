import android.view.WindowManager$LayoutParams;
import java.util.Iterator;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.util.InvalidDataException;
import java.util.UUID;
import java.util.Objects;
import com.twitter.media.av.autoplay.ui.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vxw implements y49
{
    public final i59 a;
    public final h69 b;
    public final rd6 c;
    public final bra<i1, x5x> d;
    public final r69 e;
    public final xxw f;
    public final cyw g;
    public final String h;
    public final eyw i;
    public final qav j;
    public final dyw k;
    public gyw l;
    public wxw m;
    public a n;
    public i1 o;
    public boolean p;
    
    public vxw(final byw byw, final i1 o, final bra<i1, x5x> d, final i59 a, final r69 e, final xxw f, final t59 t59, final e59 e2, final cyw g, final eyw i, final dyw k, final qav j) {
        this.b = new h69();
        final rd6 c = new rd6();
        this.c = c;
        this.a = a;
        Objects.requireNonNull(t59);
        c.a(a.e.a().map((qtb)new ue8((Object)a, 9)).subscribe((fk6)new qcs((Object)t59, (Object)this, 14)));
        Objects.requireNonNull(e2);
        c.a((j29)((b5j)a.c.H0.I0).map((qtb)new yga((Object)this, 10)).subscribeWith((wbj)new d59(e2)));
        Objects.requireNonNull(byw);
        this.h = UUID.randomUUID().toString();
        this.o = o;
        this.d = d;
        this.g = g;
        this.l = g.a;
        this.e = e;
        this.f = f;
        this.i = i;
        this.k = k;
        this.j = j;
    }
    
    public final void a(final a a) {
        Object o;
        if (this.l.a) {
            o = drz.F0;
        }
        else {
            o = drz.E0;
        }
        a.b((zkk)o, (x5x)this.d.a((Object)this.o));
        this.i.b(this.o);
        final i59 a2 = this.a;
        a2.e(a2.d);
        final dyw k = this.k;
        final u4 h = this.h();
        Objects.requireNonNull(k);
        zzd.f((Object)h, "attachment");
        k.e = h;
        if (k.d.isEmpty() ^ true) {
            e9a.d((Throwable)new InvalidDataException("Should not register AVEventListeners without unregistering first"));
            h.e.Z((Collection)k.d);
            k.d.clear();
        }
        k.d.add(new xx0(h, (xx0$a)k));
        final ArrayList d = k.d;
        final p87 c = k.a.c();
        zzd.e((Object)c, "closedCaptionsController.closedCaptionsListener");
        d.add(c);
        k.d.add(new cvh((cvh$a)new l71((Object)k, 12)));
        k.d.addAll(k.c);
        h.e.k((Collection)k.d);
        this.p = true;
    }
    
    public final y49 b() {
        final i59 a = this.a;
        if (!a.j) {
            final k80 g0 = ((w59)a.c).G0;
            a.i = new PointF((float)((WindowManager$LayoutParams)g0).x, (float)((WindowManager$LayoutParams)g0).y);
            a.c.c(a.a);
            a.j = true;
        }
        for (final v4q next : ((ql1)this.b).a) {
            if (next instanceof v4q) {
                next.o3();
            }
        }
        if ("pause".equals(dta.b().l("vod_docking_resume_action", "dismiss")) && this.k()) {
            this.h().j(2);
        }
        this.l = this.j();
        if (this.p) {
            final a n = this.n;
            pf8.r(n);
            this.g(n);
        }
        return (y49)this;
    }
    
    public final y49 c() {
        for (final uij next : ((ql1)this.b).a) {
            if (next instanceof uij) {
                next.a();
            }
        }
        final wxw f = this.f.f(this.h);
        this.m = f;
        f.c.c((j29)new rd6(new j29[] { f.b.q().subscribe((fk6)new shd((Object)f, 1)), f.b.j().subscribe((fk6)new gdm((Object)f, 1)), f.b.b().subscribe((fk6)new pcs((Object)f, 3)) }));
        return (y49)this;
    }
    
    public final boolean d() {
        return this.a.j;
    }
    
    public final y49 destroy() {
        for (final khj next : ((ql1)this.b).a) {
            if (next instanceof khj) {
                next.a();
            }
        }
        this.c.dispose();
        final wxw m = this.m;
        pf8.r(m);
        m.c.a();
        return (y49)this;
    }
    
    public final String e() {
        return this.h;
    }
    
    public final w59 f() {
        return (w59)this.a.c;
    }
    
    public final void g(final a a) {
        if (this.k()) {
            final dyw k = this.k;
            final u4 h = this.h();
            Objects.requireNonNull(k);
            zzd.f((Object)h, "attachment");
            h.e.Z((Collection)k.d);
            k.d.clear();
        }
        a.d();
        this.p = false;
    }
    
    public final u4 h() {
        final a n = this.n;
        pf8.r(n);
        final u4 e = n.e();
        pf8.r(e);
        return e;
    }
    
    public final String i() {
        return j78.r(this.o);
    }
    
    public final gyw j() {
        final boolean k = this.k();
        boolean b = true;
        final boolean b2 = k && this.h().b.l1;
        if (!this.k() || !this.h().c()) {
            b = false;
        }
        return new gyw(b2, b);
    }
    
    public final boolean k() {
        final a n = this.n;
        return n != null && n.e() != null;
    }
    
    public final void l(final i1 o) {
        final a n = this.n;
        if (n != null) {
            this.g(n);
        }
        final a n2 = (a)((yqa)this.e).a((Object)o, (Object)((w59)this.a.c).D0, (Object)this.j);
        this.n = n2;
        this.o = o;
        this.a(n2);
        this.n.j1();
    }
    
    public final y49 show() {
        final i59 a = this.a;
        if (a.j) {
            a.k = false;
            a.j = false;
            a.d.set(a.b.a());
            a.f();
            a.c.e(a.a);
            final PointF i = a.i;
            if (i != null) {
                a.g(i);
            }
        }
        for (final v4q next : ((ql1)this.b).a) {
            if (next instanceof v4q) {
                next.q3();
            }
        }
        if (this.n == null) {
            this.n = (a)((yqa)this.e).a((Object)this.o, (Object)((w59)this.a.c).D0, (Object)this.j);
        }
        if (!this.p) {
            this.a(this.n);
        }
        this.n.h();
        return (y49)this;
    }
}
