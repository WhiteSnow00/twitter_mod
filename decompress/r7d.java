import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.Set;
import android.content.Context;
import android.content.ContentResolver;
import java.util.Map;
import android.os.Build$VERSION;
import java.util.Objects;
import com.facebook.imagepipeline.platform.a;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7d
{
    public static r7d t;
    public final xms a;
    public final p7d b;
    public final zh4 c;
    public ty6<h73, vh4> d;
    public wsd<h73, vh4> e;
    public ty6<h73, PooledByteBuffer> f;
    public wsd<h73, PooledByteBuffer> g;
    public zq2 h;
    public pz8 i;
    public a6d j;
    public n7d k;
    public ish l;
    public c1l m;
    public g1l n;
    public zq2 o;
    public pz8 p;
    public dt0 q;
    public a r;
    public q90 s;
    
    public r7d(final p7d b) {
        pqb.b();
        Objects.requireNonNull(b);
        this.b = b;
        Objects.requireNonNull(b.D());
        this.a = new xms(b.E().a());
        Objects.requireNonNull(b.D());
        xh4.I0 = 0;
        this.c = new zh4(b.w());
        pqb.b();
    }
    
    public static void l(final p7d p7d) {
        synchronized (r7d.class) {
            if (r7d.t != null) {
                xli.F0((Class)r7d.class, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            r7d.t = new r7d(p7d);
        }
    }
    
    public final n7d a() {
        if (Build$VERSION.SDK_INT >= 24) {
            Objects.requireNonNull(this.b.D());
        }
        if (this.n == null) {
            final ContentResolver contentResolver = this.b.getContext().getApplicationContext().getContentResolver();
            if (this.m == null) {
                final q7d.b b = this.b.D().b;
                final Context context = this.b.getContext();
                final r53 e = this.b.t().e();
                if (this.j == null) {
                    this.b.r();
                    final q90 b2 = this.b();
                    a6d c;
                    a6d b3;
                    if (b2 != null) {
                        c = b2.c();
                        b3 = b2.b();
                    }
                    else {
                        b3 = null;
                        c = null;
                    }
                    if (this.b.o() == null) {
                        this.j = (a6d)new lh8(c, b3, this.i());
                    }
                    else {
                        this.j = (a6d)new lh8(c, b3, this.i(), (Map)this.b.o().a);
                        final l6d c2 = l6d.c();
                        c2.b = this.b.o().b;
                        c2.d();
                    }
                }
                final a6d j = this.j;
                final lil h = this.b.h();
                this.b.k();
                final boolean z = this.b.z();
                Objects.requireNonNull(this.b.D());
                final efa e2 = this.b.E();
                final qqk t = this.b.t();
                this.b.u();
                final uqk c3 = t.c(0);
                this.b.t().d();
                final wsd<h73, vh4> d = this.d();
                final wsd<h73, PooledByteBuffer> e3 = this.e();
                final zq2 f = this.f();
                final zq2 i = this.j();
                final l73 y = this.b.y();
                final ghk h2 = this.h();
                Objects.requireNonNull(this.b.D());
                Objects.requireNonNull(this.b.D());
                Objects.requireNonNull(this.b.D());
                final int a = this.b.D().a;
                final zh4 c4 = this.c;
                Objects.requireNonNull(this.b.D());
                final int f2 = this.b.D().f;
                Objects.requireNonNull(b);
                this.m = new c1l(context, e, j, h, false, z, e2, c3, (t3h)d, (t3h)e3, f, i, y, h2, a, c4, f2);
            }
            final c1l m = this.m;
            final rci c5 = this.b.c();
            final boolean z2 = this.b.z();
            Objects.requireNonNull(this.b.D());
            final xms a2 = this.a;
            this.b.k();
            Objects.requireNonNull(this.b.D());
            final boolean p = this.b.p();
            if (this.l == null) {
                this.b.n();
                this.b.m();
                Objects.requireNonNull(this.b.D());
                final int a3 = this.b.D().a;
                Objects.requireNonNull(this.b.D());
                this.b.n();
                this.b.m();
                this.l = new ish(a3, (k8d)null, (Integer)null, this.b.D().e);
            }
            final ish l = this.l;
            Objects.requireNonNull(this.b.D());
            Objects.requireNonNull(this.b.D());
            Objects.requireNonNull(this.b.D());
            Objects.requireNonNull(this.b.D());
            this.n = new g1l(contentResolver, m, c5, z2, (wms)a2, false, p, (k8d)l);
        }
        final g1l n = this.n;
        final Set f3 = this.b.f();
        final Set a4 = this.b.a();
        final dzr b4 = this.b.b();
        final wsd<h73, vh4> d2 = this.d();
        final wsd<h73, PooledByteBuffer> e4 = this.e();
        final zq2 f4 = this.f();
        final zq2 k = this.j();
        final l73 y2 = this.b.y();
        final ezr c6 = this.b.D().c;
        Objects.requireNonNull(this.b.D());
        this.b.C();
        return new n7d(n, f3, a4, b4, (t3h)d2, (t3h)e4, f4, k, y2, (dzr)c6, (w93)null, this.b);
    }
    
    public final q90 b() {
        if (this.s == null) {
            final ghk h = this.h();
            final efa e = this.b.E();
            final ty6<h73, vh4> c = this.c();
            Objects.requireNonNull(this.b.D());
            this.b.l();
            if (!npe.E0) {
                try {
                    npe.F0 = (q90)AnimatedFactoryV2Impl.class.getConstructor(ghk.class, efa.class, ty6.class, Boolean.TYPE, clp.class).newInstance(h, e, c, Boolean.FALSE, null);
                }
                finally {}
                if (npe.F0 != null) {
                    npe.E0 = true;
                }
            }
            this.s = npe.F0;
        }
        return this.s;
    }
    
    public final ty6<h73, vh4> c() {
        if (this.d == null) {
            final j02 x = this.b.x();
            final dzr q = this.b.q();
            final g4h b = this.b.B();
            final t3h$a g = this.b.g();
            this.b.j();
            Objects.requireNonNull((ry6)x);
            final keg d = new keg((low)new qy6(), g, q, (ty6$b)null);
            b.b((f4h)d);
            this.d = d;
        }
        return (ty6<h73, vh4>)this.d;
    }
    
    public final wsd<h73, vh4> d() {
        if (this.e == null) {
            final ty6<h73, vh4> c = this.c();
            final p5d a = this.b.A();
            a.g();
            this.e = new wsd<h73, vh4>((t3h<Object, Object>)c, (v3h)new xsd(a));
        }
        return this.e;
    }
    
    public final wsd<h73, PooledByteBuffer> e() {
        if (this.g == null) {
            this.b.d();
            if (this.f == null) {
                final dzr s = this.b.s();
                final g4h b = this.b.B();
                final keg f = new keg((low)new g97(), (t3h$a)new u9i(), s, (ty6$b)null);
                b.b((f4h)f);
                this.f = f;
            }
            final keg f2 = this.f;
            final p5d a = this.b.A();
            a.k();
            this.g = new wsd<h73, PooledByteBuffer>((t3h<Object, Object>)f2, (v3h)new k3a(a));
        }
        return this.g;
    }
    
    public final zq2 f() {
        if (this.h == null) {
            final ywa g = this.g();
            final qqk t = this.b.t();
            this.b.u();
            this.h = new zq2(g, t.c(0), this.b.t().d(), this.b.E().f(), this.b.E().b(), this.b.A());
        }
        return this.h;
    }
    
    public final ywa g() {
        if (this.i == null) {
            this.i = (pz8)((qz8)this.b.v()).a(this.b.e());
        }
        return (ywa)this.i;
    }
    
    public final ghk h() {
        if (this.q == null) {
            final qqk t = this.b.t();
            this.i();
            this.q = new dt0(t.a(), this.c);
        }
        return (ghk)this.q;
    }
    
    public final hhk i() {
        if (this.r == null) {
            final qqk t = this.b.t();
            Objects.requireNonNull(this.b.D());
            a r;
            if (Build$VERSION.SDK_INT >= 26) {
                final int b = t.b();
                r = new moj(t.a(), b, new grk(b));
            }
            else {
                final int b2 = t.b();
                r = new et0(t.a(), b2, new grk(b2));
            }
            this.r = r;
        }
        return (hhk)this.r;
    }
    
    public final zq2 j() {
        if (this.o == null) {
            final ywa k = this.k();
            final qqk t = this.b.t();
            this.b.u();
            this.o = new zq2(k, t.c(0), this.b.t().d(), this.b.E().f(), this.b.E().b(), this.b.A());
        }
        return this.o;
    }
    
    public final ywa k() {
        if (this.p == null) {
            this.p = (pz8)((qz8)this.b.v()).a(this.b.i());
        }
        return (ywa)this.p;
    }
}
