import java.util.List;
import java.util.Objects;
import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.android.liveevent.dock.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzw
{
    public final com.twitter.android.liveevent.dock.b a;
    public final a b;
    public final LiveEventConfiguration c;
    public final wvf d;
    public final nxw e;
    public final m29 f;
    public final cn3 g;
    public final otk<qzf> h;
    public final rof i;
    public b j;
    public khj k;
    public snj<xx0> l;
    public snj<qzf> m;
    public snj<vxw> n;
    public dm3 o;
    public bra<String, khj> p;
    public boolean q;
    public boolean r;
    
    public mzw(final dm3 o, final com.twitter.android.liveevent.dock.b a, final a b, final LiveEventConfiguration c, final wvf d, final nxw e, final cn3 g, final bqf bqf, final otk<qzf> h, final ibm ibm, final rof i) {
        final m29 f = new m29();
        this.f = f;
        this.j = (b)mzw.b.h0;
        this.k = (khj)ihj.b;
        final snj b2 = snj.b;
        final int a2 = w4j.a;
        this.l = (snj<xx0>)b2;
        this.m = (snj<qzf>)b2;
        this.n = (snj<vxw>)b2;
        this.p = (bra<String, khj>)i1x.d;
        this.q = false;
        this.r = false;
        this.o = o;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        f.c(bqf.a().subscribe((fk6)new gdm((Object)this, 4)));
        ibm.i((rj)new lzw(this, 0));
    }
    
    public final boolean a(final u4 u4) {
        return u4 != null && (u4.e() || this.r);
    }
    
    public final boolean b() {
        return this.m.f() && this.a.d(((qzf)this.m.c()).getId());
    }
    
    public final boolean c() {
        return this.m.f();
    }
    
    public final void d(final u4 u4, final boolean b, final boolean b2, final boolean b3) {
        if (u4 != null) {
            final snj l = new snj((Object)new xx0(u4, (xx0$a)new mzw$a(this, b, u4, b3, b2)));
            this.l = (snj<xx0>)l;
            u4.e.g((e2)l.c());
        }
    }
    
    public final void e() {
        if (this.n.f()) {
            final h69 b = ((vxw)this.n.c()).b;
            final khj k = this.k;
            if (((ql1)b).b((Object)k)) {
                ((List)((ql1)b).a).remove(k);
            }
            final int a = w4j.a;
        }
    }
    
    public final void f() {
        final com.twitter.android.liveevent.dock.b a = this.a;
        Objects.requireNonNull(a);
        final hlv b = dta.b();
        int n2;
        final int n = n2 = 0;
        if (b.b("live_event_docking_enabled", false)) {
            n2 = n;
            if (!a.c()) {
                n2 = n;
                if (!a.d.a.b("overlay_permission_granted")) {
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            final com.twitter.android.liveevent.dock.b a2 = this.a;
            a2.c.a((o69$a)new com.twitter.android.liveevent.dock.a(a2));
        }
    }
    
    public final void g(final u4 u4) {
        if (this.c() && u4 != null) {
            u4.q();
            ((fyd)u4.f).q((dyd)new wq2());
            u4.p(u4.d());
        }
    }
    
    public final void h(final u4 u4) {
        synchronized (this) {
            if (this.c() && this.m.f() && this.b()) {
                final gyw f = this.a.f(((qzf)this.m.c()).getId(), (a59)meq.g);
                this.d(u4, f.a, f.b, this.n.f());
            }
            if (this.n.f()) {
                this.e();
            }
            final snj b = snj.b;
            final int a = w4j.a;
            this.n = (snj<vxw>)b;
        }
    }
    
    public interface b
    {
        public static final mzw$b$a h0 = new mzw$b$a();
        
        void d(final qzf p0);
    }
}
