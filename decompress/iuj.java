import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuj implements n3p
{
    public static final iuj.iuj$c Companion;
    public static final dto<iuj, ?> h;
    public final i2f a;
    public final cwj b;
    public int c;
    public final rp8 d;
    public final rp8 e;
    public final cwj f;
    public final cwj g;
    
    static {
        Companion = new iuj.iuj$c();
        iuj.h = (eto.eto$c)emf.a((gub)iuj$a.C0, (rtb)iuj$b.C0);
    }
    
    public iuj() {
        this(0);
    }
    
    public iuj(final int n) {
        this.a = new i2f(n, 0);
        this.b = (cwj)nkz.r((Object)n);
        this.d = (rp8)nkz.k((otb)new iuj$g(this));
        this.e = (rp8)nkz.k((otb)new iuj$f(this));
        this.f = (cwj)nkz.r((Object)null);
        this.g = (cwj)nkz.r((Object)null);
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public final float b(final float n) {
        return this.a.b(n);
    }
    
    public final Object c(final puh puh, final gub<? super u2p, ? super ap6<? super oyv>, ?> gub, final ap6<? super oyv> ap6) {
        final Object c = this.a.c(puh, (gub)gub, (ap6)ap6);
        if (c == zy6.C0) {
            return c;
        }
        return oyv.a;
    }
    
    public final Object d(int i, float f0, ap6<? super oyv> c0) {
        iuj$d iuj$d = null;
        Label_0052: {
            if (c0 instanceof iuj$d) {
                iuj$d = (iuj$d)c0;
                final int i2 = iuj$d.I0;
                if ((i2 & Integer.MIN_VALUE) != 0x0) {
                    iuj$d.I0 = i2 + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            iuj$d = new iuj$d(this, (ap6)c0);
        }
        final Object g0 = iuj$d.G0;
        final zy6 c2 = zy6.C0;
        final int i3 = iuj$d.I0;
        final e1f e1f = null;
        Throwable t = null;
        Label_1052: {
            Label_0212: {
                switch (i3) {
                    default: {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    case 5: {
                        final int e0 = iuj$d.E0;
                        f0 = iuj$d.F0;
                        final int d0 = iuj$d.D0;
                        final iuj c3 = iuj$d.C0;
                        try {
                            kq9.b1(g0);
                            break Label_1052;
                        }
                        finally {
                            c0 = c3;
                            final Throwable t2;
                            t = t2;
                            break Label_1052;
                        }
                    }
                    case 2:
                    case 4:
                    case 6: {
                        break Label_0212;
                    }
                    case 3:
                    case 1: {
                        while (true) {
                            break Label_0231;
                            f0 = iuj$d.F0;
                            i = iuj$d.D0;
                            final iuj iuj = c0 = iuj$d.C0;
                            try {
                                kq9.b1(g0);
                                c0 = iuj;
                                break Label_1052;
                                f0 = iuj$d.F0;
                                i = iuj$d.D0;
                                final iuj iuj2 = c0 = iuj$d.C0;
                                kq9.b1(g0);
                                c0 = iuj2;
                                break Label_1052;
                                c0 = iuj$d.C0;
                                try {
                                    kq9.b1(g0);
                                    break Label_1052;
                                }
                                finally {}
                                continue;
                            }
                            finally {
                                break Label_1052;
                            }
                            break;
                        }
                    }
                    case 0: {
                        kq9.b1(g0);
                        if (i < 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("page");
                            sb.append('[');
                            sb.append(i);
                            sb.append("] must be >= 0");
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        if (-1.0f <= f0 && f0 <= 1.0f) {
                            break;
                        }
                        throw new IllegalArgumentException("pageOffset must be >= 0 and <= 1".toString());
                    }
                }
            }
            try {
                ((nhq)this.f).setValue((Object)new Integer(i));
                final int e2 = this.a.e();
                if (Math.abs(i - e2) > 3) {
                    final i2f a = this.a;
                    int n;
                    if (i > e2) {
                        n = i - 3;
                    }
                    else {
                        n = i + 3;
                    }
                    iuj$d.C0 = this;
                    iuj$d.D0 = i;
                    iuj$d.F0 = f0;
                    iuj$d.I0 = 1;
                    if (i2f.i(a, n, (ap6)iuj$d) == c2) {
                        return c2;
                    }
                    c0 = this;
                }
                else {
                    c0 = this;
                }
                try {
                    if (Math.abs(f0) <= 0.005f) {
                        final i2f a2 = c0.a;
                        iuj$d.C0 = c0;
                        iuj$d.I0 = 2;
                        final i2f.c companion = i2f.Companion;
                        if (a2.d(i, 0, (ap6)iuj$d) == c2) {
                            return c2;
                        }
                    }
                    else {
                        final i2f a3 = c0.a;
                        final iuj$e iuj$e = new iuj$e((ap6)null);
                        iuj$d.C0 = c0;
                        iuj$d.D0 = i;
                        iuj$d.F0 = f0;
                        iuj$d.I0 = 3;
                        if (hy8.u((n3p)a3, (puh)null, (gub)iuj$e, (ap6)iuj$d, 1, (Object)null) == c2) {
                            return c2;
                        }
                        final u1f g2 = c0.a.g();
                        while (true) {
                            for (final Object next : g2.b()) {
                                if (((e1f)next).getIndex() == i) {
                                    final e1f e1f2 = (e1f)next;
                                    iuj iuj3;
                                    if (e1f2 != null) {
                                        final i2f a4 = c0.a;
                                        final int p2 = q0b.p(e1f2.getSize() * f0);
                                        iuj$d.C0 = c0;
                                        iuj$d.I0 = 4;
                                        iuj3 = c0;
                                        if (a4.d(i, p2, (ap6)iuj$d) == c2) {
                                            return c2;
                                        }
                                    }
                                    else {
                                        iuj3 = c0;
                                        if (g2.b().isEmpty() ^ true) {
                                            final int e0 = ((e1f)or4.G1(g2.b())).getSize();
                                            final i2f a5 = c0.a;
                                            final int p3 = q0b.p(e0 * f0);
                                            iuj$d.C0 = c0;
                                            iuj$d.D0 = i;
                                            iuj$d.F0 = f0;
                                            iuj$d.E0 = e0;
                                            iuj$d.I0 = 5;
                                            final int d0 = i;
                                            if (a5.d(i, p3, (ap6)iuj$d) == c2) {
                                                return c2;
                                            }
                                            final Iterator iterator2 = c0.a.g().b().iterator();
                                            Object next2;
                                            do {
                                                next2 = e1f;
                                                if (!iterator2.hasNext()) {
                                                    break;
                                                }
                                                next2 = iterator2.next();
                                                if (((e1f)next2).getIndex() == d0) {
                                                    i = 1;
                                                }
                                                else {
                                                    i = 0;
                                                }
                                            } while (i == 0);
                                            final e1f e1f3 = (e1f)next2;
                                            iuj3 = c0;
                                            if (e1f3 != null) {
                                                iuj3 = c0;
                                                if (e1f3.getSize() != e0) {
                                                    final i2f a6 = c0.a;
                                                    i = q0b.p(e1f3.getSize() * f0);
                                                    iuj$d.C0 = c0;
                                                    iuj$d.I0 = 6;
                                                    final Object d2 = a6.d(d0, i, (ap6)iuj$d);
                                                    iuj3 = c0;
                                                    if (d2 == c2) {
                                                        return c2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c0 = iuj3;
                                    break Label_1052;
                                }
                            }
                            Object next = null;
                            continue;
                        }
                    }
                    c0.h();
                    return oyv.a;
                }
                finally {}
            }
            finally {
                c0 = this;
            }
        }
        c0.h();
        throw t;
    }
    
    public final int e() {
        return ((Number)((nhq)this.b).getValue()).intValue();
    }
    
    public final float f() {
        return ((Number)this.e.getValue()).floatValue();
    }
    
    public final e1f g() {
        final u1f g = this.a.g();
        final Iterator iterator = g.b().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                final e1f e1f = (e1f)next;
                int n = Math.min(e1f.getSize() + e1f.a(), g.e() - this.c) - Math.max(e1f.a(), 0);
                e1f e1f2 = (e1f)next;
                do {
                    final Object next2 = iterator.next();
                    final e1f e1f3 = (e1f)next2;
                    final int n2 = Math.min(e1f3.getSize() + e1f3.a(), g.e() - this.c) - Math.max(e1f3.a(), 0);
                    next = e1f2;
                    int n3;
                    if ((n3 = n) < n2) {
                        next = next2;
                        n3 = n2;
                    }
                    e1f2 = (e1f)next;
                    n = n3;
                } while (iterator.hasNext());
            }
        }
        return (e1f)next;
    }
    
    public final void h() {
        ((nhq)this.f).setValue((Object)null);
    }
    
    public final void i(final int n) {
        if (n != ((Number)((nhq)this.b).getValue()).intValue()) {
            ((nhq)this.b).setValue((Object)n);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("PagerState(pageCount=");
        g.append(((Number)this.d.getValue()).intValue());
        g.append(", currentPage=");
        g.append(this.e());
        g.append(", currentPageOffset=");
        g.append(this.f());
        g.append(')');
        return g.toString();
    }
}
