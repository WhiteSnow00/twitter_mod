import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ng8 implements i84
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    
    public ng8(final long a, final long b, final long c, final long d, final long e, final long f, final long g, final long h, final long i, final long j, final long k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final l9r<sr4> a(final boolean b, final zht zht, final d86 d86, int n) {
        e0e.f((Object)zht, "state");
        d86.x(-1568341342);
        final sa6$b a = sa6.a;
        long n2 = 0L;
        Label_0121: {
            if (b) {
                n = zht.ordinal();
                if (n != 0) {
                    if (n == 1) {
                        n2 = this.i;
                        break Label_0121;
                    }
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n2 = this.h;
            }
            else {
                n = zht.ordinal();
                if (n != 0 && n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n2 = this.k;
                }
                else {
                    n2 = this.j;
                }
            }
        }
        l9r l9r;
        if (b) {
            d86.x(-796405338);
            if (zht == zht.G0) {
                n = 100;
            }
            else {
                n = 50;
            }
            l9r = tdq.a(n2, (ac0)eg8.M0(n, 0, null, 6), d86, 0);
            d86.O();
        }
        else {
            d86.x(-796405152);
            l9r = zzz.h0((Object)new sr4(n2), d86);
            d86.O();
        }
        d86.O();
        return (l9r<sr4>)l9r;
    }
    
    public final l9r<sr4> b(final boolean b, final zht zht, final d86 d86, int n) {
        e0e.f((Object)zht, "state");
        d86.x(840901029);
        final sa6$b a = sa6.a;
        long n2 = 0L;
        Label_0130: {
            if (b) {
                n = zht.ordinal();
                if (n != 0) {
                    if (n == 1) {
                        n2 = this.d;
                        break Label_0130;
                    }
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n2 = this.c;
            }
            else {
                n = zht.ordinal();
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n2 = this.g;
                    }
                    else {
                        n2 = this.f;
                    }
                }
                else {
                    n2 = this.e;
                }
            }
        }
        l9r l9r;
        if (b) {
            d86.x(-2010643579);
            if (zht == zht.G0) {
                n = 100;
            }
            else {
                n = 50;
            }
            l9r = tdq.a(n2, (ac0)eg8.M0(n, 0, null, 6), d86, 0);
            d86.O();
        }
        else {
            d86.x(-2010643393);
            l9r = zzz.h0((Object)new sr4(n2), d86);
            d86.O();
        }
        d86.O();
        return (l9r<sr4>)l9r;
    }
    
    public final l9r<sr4> c(final zht zht, final d86 d86, int n) {
        e0e.f((Object)zht, "state");
        d86.x(544656267);
        final sa6$b a = sa6.a;
        final zht g0 = zht.G0;
        long n2;
        if (zht == g0) {
            n2 = this.b;
        }
        else {
            n2 = this.a;
        }
        if (zht == g0) {
            n = 100;
        }
        else {
            n = 50;
        }
        final l9r a2 = tdq.a(n2, (ac0)eg8.M0(n, 0, null, 6), d86, 0);
        d86.O();
        return (l9r<sr4>)a2;
    }
}
