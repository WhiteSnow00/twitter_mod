import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ags extends gue implements rtb<hgs, oyv>
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ bgs D0;
    public final /* synthetic */ x6m E0;
    
    public ags(final int c0, final bgs d0, final x6m e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hgs hgs = (hgs)o;
        zzd.f((Object)hgs, "$this$commandExecutionContext");
        final int d = nb0.D(this.C0);
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        boolean b = true;
        final Object o2 = null;
        Object b2 = null;
        switch (d) {
            case 46: {
                final msv h = this.D0.h;
                if (h == null) {
                    break;
                }
                final msv$a c = h.c;
                if (c != null) {
                    h.c = c.a;
                    h.b = new msv$a(h.b, c.b);
                    h.d += c.b.a.C0.length();
                    b2 = c.b;
                }
                if (b2 != null) {
                    this.D0.j.invoke(b2);
                    break;
                }
                break;
            }
            case 45: {
                final msv h2 = this.D0.h;
                if (h2 != null) {
                    h2.a(fhs.a(hgs.h, ((kq1)hgs).g, ((kq1)hgs).f, 4));
                }
                final msv h3 = this.D0.h;
                if (h3 == null) {
                    break;
                }
                final msv$a b3 = h3.b;
                Object b4 = o2;
                if (b3 != null) {
                    final msv$a a = b3.a;
                    b4 = o2;
                    if (a != null) {
                        h3.b = a;
                        h3.d -= b3.b.a.C0.length();
                        h3.c = new msv$a(h3.c, b3.b);
                        b4 = a.b;
                    }
                }
                if (b4 != null) {
                    this.D0.j.invoke(b4);
                    break;
                }
                break;
            }
            case 44: {
                final bgs d2 = this.D0;
                if (!d2.e) {
                    d2.a(tdy.u0((Object)new kx4("\t", 1)));
                    break;
                }
                this.E0.C0 = false;
                break;
            }
            case 43: {
                final bgs d3 = this.D0;
                if (!d3.e) {
                    d3.a(tdy.u0((Object)new kx4("\n", 1)));
                    break;
                }
                this.E0.C0 = false;
                break;
            }
            case 42: {
                ((kq1)hgs).e.a = null;
                int n4 = n3;
                if (((kq1)hgs).g.C0.length() > 0) {
                    n4 = 1;
                }
                if (n4 != 0) {
                    ((kq1)hgs).B(mis.d(((kq1)hgs).f));
                    break;
                }
                break;
            }
            case 41: {
                ((kq1)hgs).x();
                ((kq1)hgs).A();
                break;
            }
            case 40: {
                ((kq1)hgs).w();
                ((kq1)hgs).A();
                break;
            }
            case 39: {
                ((kq1)hgs).v();
                ((kq1)hgs).A();
                break;
            }
            case 38: {
                ((kq1)hgs).y();
                ((kq1)hgs).A();
                break;
            }
            case 37: {
                ((kq1)hgs).p();
                ((kq1)hgs).A();
                break;
            }
            case 36: {
                ((kq1)hgs).m();
                ((kq1)hgs).A();
                break;
            }
            case 35: {
                ((kq1)hgs).s();
                ((kq1)hgs).A();
                break;
            }
            case 34: {
                ((kq1)hgs).k();
                ((kq1)hgs).A();
                break;
            }
            case 33: {
                ((kq1)hgs).t();
                ((kq1)hgs).A();
                break;
            }
            case 32: {
                ((kq1)hgs).u();
                ((kq1)hgs).A();
                break;
            }
            case 31: {
                hgs.F();
                ((kq1)hgs).A();
                break;
            }
            case 30: {
                hgs.G();
                ((kq1)hgs).A();
                break;
            }
            case 29: {
                ((kq1)hgs).i();
                ((kq1)hgs).A();
                break;
            }
            case 28: {
                ((kq1)hgs).z();
                ((kq1)hgs).A();
                break;
            }
            case 27: {
                ((kq1)hgs).r();
                ((kq1)hgs).A();
                break;
            }
            case 26: {
                ((kq1)hgs).j();
                ((kq1)hgs).A();
                break;
            }
            case 25: {
                ((kq1)hgs).e.a = null;
                if (((kq1)hgs).g.C0.length() <= 0) {
                    b = false;
                }
                if (b) {
                    ((kq1)hgs).f = h6q.f(0, ((kq1)hgs).g.C0.length());
                    break;
                }
                break;
            }
            case 24: {
                final List d4 = hgs.D((rtb)zfs.C0);
                if (d4 != null) {
                    this.D0.a(d4);
                    break;
                }
                break;
            }
            case 23: {
                final List d5 = hgs.D((rtb)yfs.C0);
                if (d5 != null) {
                    this.D0.a(d5);
                    break;
                }
                break;
            }
            case 22: {
                final List d6 = hgs.D((rtb)xfs.C0);
                if (d6 != null) {
                    this.D0.a(d6);
                    break;
                }
                break;
            }
            case 21: {
                final List d7 = hgs.D((rtb)wfs.C0);
                if (d7 != null) {
                    this.D0.a(d7);
                    break;
                }
                break;
            }
            case 20: {
                final List d8 = hgs.D((rtb)vfs.C0);
                if (d8 != null) {
                    this.D0.a(d8);
                    break;
                }
                break;
            }
            case 19: {
                final List d9 = hgs.D((rtb)ufs.C0);
                if (d9 != null) {
                    this.D0.a(d9);
                    break;
                }
                break;
            }
            case 18: {
                this.D0.b.f();
                break;
            }
            case 17: {
                this.D0.b.m();
                break;
            }
            case 16: {
                this.D0.b.d(false);
                break;
            }
            case 15: {
                ((kq1)hgs).t();
                break;
            }
            case 14: {
                ((kq1)hgs).u();
                break;
            }
            case 13: {
                hgs.F();
                break;
            }
            case 12: {
                hgs.G();
                break;
            }
            case 11: {
                ((kq1)hgs).i();
                break;
            }
            case 10: {
                ((kq1)hgs).z();
                break;
            }
            case 9: {
                ((kq1)hgs).x();
                break;
            }
            case 8: {
                ((kq1)hgs).w();
                break;
            }
            case 7: {
                ((kq1)hgs).v();
                break;
            }
            case 6: {
                ((kq1)hgs).y();
                break;
            }
            case 5: {
                ((kq1)hgs).p();
                break;
            }
            case 4: {
                ((kq1)hgs).m();
                break;
            }
            case 3: {
                ((kq1)hgs).k();
                break;
            }
            case 2: {
                ((kq1)hgs).s();
                break;
            }
            case 1: {
                final tfs c2 = tfs.C0;
                zzd.f((Object)c2, "or");
                ((kq1)hgs).e.a = null;
                int n5 = n;
                if (((kq1)hgs).g.C0.length() > 0) {
                    n5 = 1;
                }
                if (n5 == 0) {
                    break;
                }
                if (mis.c(((kq1)hgs).f)) {
                    c2.invoke((Object)hgs);
                    break;
                }
                if (((kq1)hgs).g()) {
                    ((kq1)hgs).B(mis.f(((kq1)hgs).f));
                    break;
                }
                ((kq1)hgs).B(mis.g(((kq1)hgs).f));
                break;
            }
            case 0: {
                final sfs c3 = sfs.C0;
                zzd.f((Object)c3, "or");
                ((kq1)hgs).e.a = null;
                int n6 = n2;
                if (((kq1)hgs).g.C0.length() > 0) {
                    n6 = 1;
                }
                if (n6 == 0) {
                    break;
                }
                if (mis.c(((kq1)hgs).f)) {
                    c3.invoke((Object)hgs);
                    break;
                }
                if (((kq1)hgs).g()) {
                    ((kq1)hgs).B(mis.g(((kq1)hgs).f));
                    break;
                }
                ((kq1)hgs).B(mis.f(((kq1)hgs).f));
                break;
            }
        }
        return oyv.a;
    }
}
