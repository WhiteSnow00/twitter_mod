import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lth implements xep
{
    public final long a;
    public final ptb<bwe> b;
    public final ptb<qjs> c;
    
    public lth(final long a, final ptb<? extends bwe> b, final ptb<qjs> c) {
        this.a = a;
        this.b = (ptb<bwe>)b;
        this.c = c;
    }
    
    public final p6m a(final int n) {
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            Objects.requireNonNull(p6m.Companion);
            return p6m.e;
        }
        final int length = qjs.a.a.length();
        if (length < 1) {
            Objects.requireNonNull(p6m.Companion);
            return p6m.e;
        }
        return qjs.b(jb2.F(n, 0, length - 1));
    }
    
    public final long b(final hfp hfp, final boolean b) {
        if ((b && hfp.a.c != this.a) || (!b && hfp.b.c != this.a)) {
            Objects.requireNonNull(kgj.Companion);
            return kgj.b;
        }
        if (this.c() == null) {
            Objects.requireNonNull(kgj.Companion);
            return kgj.b;
        }
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            Objects.requireNonNull(kgj.Companion);
            return kgj.b;
        }
        hfp$a hfp$a;
        if (b) {
            hfp$a = hfp.a;
        }
        else {
            hfp$a = hfp.b;
        }
        return kqe.P(qjs, hfp$a.b, b, hfp.c);
    }
    
    public final bwe c() {
        final bwe bwe = (bwe)this.b.invoke();
        if (bwe != null && bwe.j()) {
            return bwe;
        }
        return null;
    }
    
    public final awj<hfp, Boolean> d(long n, long a, final kgj kgj, final boolean b, final bwe bwe, final jfp jfp, final hfp hfp) {
        e0e.f((Object)jfp, "adjustment");
        boolean b2 = false;
        Label_0058: {
            if (hfp != null) {
                final long a2 = this.a;
                if (a2 != hfp.a.c || a2 != hfp.b.c) {
                    b2 = false;
                    break Label_0058;
                }
            }
            b2 = true;
        }
        if (!b2) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        final bwe c = this.c();
        if (c == null) {
            return (awj<hfp, Boolean>)new awj((Object)null, (Object)Boolean.FALSE);
        }
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            return (awj<hfp, Boolean>)new awj((Object)null, (Object)Boolean.FALSE);
        }
        Objects.requireNonNull(kgj.Companion);
        final long v = bwe.v(c, kgj.b);
        n = kgj.g(n, v);
        final long g = kgj.g(a, v);
        kgj kgj2;
        if (kgj != null) {
            kgj2 = new kgj(kgj.g(kgj.a, v));
        }
        else {
            kgj2 = null;
        }
        a = this.a;
        final long c2 = qjs.c;
        final p6m p6m = new p6m(0.0f, 0.0f, (float)(int)(c2 >> 32), (float)nud.b(c2));
        final ngp.b f0 = ngp.F0;
        awj awj;
        if (!p6m.a(n) && !p6m.a(g) && !(f0.b(g, p6m) > 0 ^ f0.b(n, p6m) > 0)) {
            awj = new awj((Object)null, (Object)Boolean.FALSE);
        }
        else {
            final int r = ak1.r(qjs, p6m, n);
            final int r2 = ak1.r(qjs, p6m, g);
            int r3;
            if (kgj2 != null) {
                r3 = ak1.r(qjs, p6m, kgj2.a);
            }
            else {
                r3 = -1;
            }
            n = p4j.f(r, r2);
            zjs zjs;
            if (hfp != null) {
                zjs = new zjs(p4j.f(hfp.a.b, hfp.b.b));
            }
            else {
                zjs = null;
            }
            n = jfp.a(qjs, n, r3, b, zjs);
            final hfp h = ak1.h(n, zjs.h(n), a, qjs);
            final boolean a3 = e0e.a((Object)h, (Object)hfp);
            awj = new awj((Object)h, (Object)((b ? (r != r3) : (r2 != r3)) || (a3 ^ true)));
        }
        return (awj<hfp, Boolean>)awj;
    }
    
    public final xc0 e() {
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            return new xc0("", (List)null, 6);
        }
        return qjs.a.a;
    }
    
    public final long f() {
        return this.a;
    }
    
    public final hfp g() {
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            return null;
        }
        return ak1.h(p4j.f(0, qjs.a.a.length()), false, this.a, qjs);
    }
    
    public final long h(int f) {
        final qjs qjs = (qjs)this.c.invoke();
        if (qjs == null) {
            Objects.requireNonNull(zjs.Companion);
            return zjs.b;
        }
        final int length = qjs.a.a.length();
        if (length < 1) {
            Objects.requireNonNull(zjs.Companion);
            return zjs.b;
        }
        f = qjs.f(jb2.F(f, 0, length - 1));
        return p4j.f(qjs.j(f), qjs.e(f, true));
    }
}
