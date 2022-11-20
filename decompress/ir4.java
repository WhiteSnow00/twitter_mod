// 
// Decompiled by Procyon v0.6.0
// 

public final class ir4
{
    public final hwj a;
    public final hwj b;
    public final hwj c;
    public final hwj d;
    public final hwj e;
    public final hwj f;
    public final hwj g;
    public final hwj h;
    public final hwj i;
    public final hwj j;
    public final hwj k;
    public final hwj l;
    public final hwj m;
    
    public ir4(final long n, final long n2, final long n3, final long n4, final long n5, final long n6, final long n7, final long n8, final long n9, final long n10, final long n11, final long n12, final boolean b) {
        final nq4 nq4 = new nq4(n);
        final mlr a = mlr.a;
        this.a = (hwj)blz.P(nq4, (hiq)a);
        this.b = (hwj)blz.P(new nq4(n2), (hiq)a);
        this.c = (hwj)blz.P(new nq4(n3), (hiq)a);
        this.d = (hwj)blz.P(new nq4(n4), (hiq)a);
        this.e = (hwj)blz.P(new nq4(n5), (hiq)a);
        this.f = (hwj)blz.P(new nq4(n6), (hiq)a);
        this.g = (hwj)blz.P(new nq4(n7), (hiq)a);
        this.h = (hwj)blz.P(new nq4(n8), (hiq)a);
        this.i = (hwj)blz.P(new nq4(n9), (hiq)a);
        this.j = (hwj)blz.P(new nq4(n10), (hiq)a);
        this.k = (hwj)blz.P(new nq4(n11), (hiq)a);
        this.l = (hwj)blz.P(new nq4(n12), (hiq)a);
        this.m = (hwj)blz.P(b, (hiq)a);
    }
    
    public final long a() {
        return ((nq4)this.e.getValue()).a;
    }
    
    public final long b() {
        return ((nq4)this.g.getValue()).a;
    }
    
    public final long c() {
        return ((nq4)this.j.getValue()).a;
    }
    
    public final long d() {
        return ((nq4)this.l.getValue()).a;
    }
    
    public final long e() {
        return ((nq4)this.h.getValue()).a;
    }
    
    public final long f() {
        return ((nq4)this.i.getValue()).a;
    }
    
    public final long g() {
        return ((nq4)this.k.getValue()).a;
    }
    
    public final long h() {
        return ((nq4)this.a.getValue()).a;
    }
    
    public final long i() {
        return ((nq4)this.b.getValue()).a;
    }
    
    public final long j() {
        return ((nq4)this.c.getValue()).a;
    }
    
    public final long k() {
        return ((nq4)this.d.getValue()).a;
    }
    
    public final long l() {
        return ((nq4)this.f.getValue()).a;
    }
    
    public final boolean m() {
        return (boolean)this.m.getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Colors(primary=");
        j.append((Object)nq4.j(this.h()));
        j.append(", primaryVariant=");
        j.append((Object)nq4.j(this.i()));
        j.append(", secondary=");
        j.append((Object)nq4.j(this.j()));
        j.append(", secondaryVariant=");
        j.append((Object)nq4.j(this.k()));
        j.append(", background=");
        j.append((Object)nq4.j(this.a()));
        j.append(", surface=");
        j.append((Object)nq4.j(this.l()));
        j.append(", error=");
        j.append((Object)nq4.j(this.b()));
        j.append(", onPrimary=");
        j.append((Object)nq4.j(this.e()));
        j.append(", onSecondary=");
        j.append((Object)nq4.j(this.f()));
        j.append(", onBackground=");
        j.append((Object)nq4.j(this.c()));
        j.append(", onSurface=");
        j.append((Object)nq4.j(this.g()));
        j.append(", onError=");
        j.append((Object)nq4.j(this.d()));
        j.append(", isLight=");
        j.append(this.m());
        j.append(')');
        return j.toString();
    }
}
