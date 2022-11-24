import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvj implements a5p
{
    public static final cvj.cvj$c Companion;
    public static final ouo<cvj, ?> h;
    public final p2f a;
    public final wwj b;
    public int c;
    public final fq8 d;
    public final fq8 e;
    public final wwj f;
    public final wwj g;
    
    static {
        Companion = new cvj.cvj$c();
        cvj.h = (puo.puo$c)mmf.a((hub)cvj$a.F0, (stb)cvj$b.F0);
    }
    
    public cvj() {
        this(0);
    }
    
    public cvj(final int n) {
        this.a = new p2f(n, 0);
        this.b = (wwj)zzz.W((Object)n);
        this.d = (fq8)zzz.C((ptb)new ptb<Integer>(this) {
            public final cvj F0;
            
            public final Object invoke() {
                return this.F0.a.g().a();
            }
        });
        this.e = (fq8)zzz.C((ptb)new ptb<Float>(this) {
            public final cvj F0;
            
            public final Object invoke() {
                final cvj f0 = this.F0;
                final List b = f0.a.g().b();
                final ListIterator listIterator = b.listIterator(b.size());
                while (true) {
                    while (listIterator.hasPrevious()) {
                        final Object previous = listIterator.previous();
                        if (((l1f)previous).getIndex() == f0.e()) {
                            final l1f l1f = (l1f)previous;
                            float e;
                            if (l1f != null) {
                                e = jb2.E(-l1f.a() / (float)l1f.getSize(), -1.0f, 1.0f);
                            }
                            else {
                                e = 0.0f;
                            }
                            return e;
                        }
                    }
                    final Object previous = null;
                    continue;
                }
            }
        });
        this.f = (wwj)zzz.W((Object)null);
        this.g = (wwj)zzz.W((Object)null);
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public final float b(final float n) {
        return this.a.b(n);
    }
    
    public final Object c(final jvh jvh, final hub<? super g4p, ? super mp6<? super vzv>, ?> hub, final mp6<? super vzv> mp6) {
        final Object c = this.a.c(jvh, (hub)hub, (mp6)mp6);
        if (c == jz6.F0) {
            return c;
        }
        return vzv.a;
    }
    
    public final Object d(int i, float i2, mp6<? super vzv> f0) {
        op6 op6 = null;
        Label_0052: {
            if (f0 instanceof cvj$d) {
                op6 = (cvj$d)f0;
                final int l0 = op6.L0;
                if ((l0 & Integer.MIN_VALUE) != 0x0) {
                    op6.L0 = l0 + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            op6 = new op6(this, f0) {
                public cvj F0;
                public int G0;
                public int H0;
                public float I0;
                public Object J0;
                public final cvj K0;
                public int L0;
                
                public final Object invokeSuspend(final Object j0) {
                    this.J0 = j0;
                    this.L0 |= Integer.MIN_VALUE;
                    return this.K0.d(0, 0.0f, (mp6<? super vzv>)this);
                }
            };
        }
        final Object j0 = op6.J0;
        final jz6 f2 = jz6.F0;
        final int l2 = op6.L0;
        final l1f l1f = null;
        Throwable t = null;
        Label_0424: {
            Label_0212: {
                switch (l2) {
                    default: {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    case 5: {
                        final int h0 = op6.H0;
                        i2 = op6.I0;
                        final int g0 = op6.G0;
                        final cvj f3 = op6.F0;
                        try {
                            jb2.M0(j0);
                            break Label_0424;
                        }
                        finally {
                            f0 = f3;
                            final Throwable t2;
                            t = t2;
                            break Label_0424;
                        }
                    }
                    case 2:
                    case 4:
                    case 6: {
                        break Label_0212;
                    }
                    case 3:
                    case 1: {
                        Label_0231: {
                            break Label_0231;
                            i2 = op6.I0;
                            i = op6.G0;
                            final cvj cvj = f0 = op6.F0;
                            try {
                                jb2.M0(j0);
                                f0 = cvj;
                                break Label_0424;
                                f0 = op6.F0;
                                try {
                                    jb2.M0(j0);
                                    break Label_0424;
                                }
                                finally {}
                                i2 = op6.I0;
                                i = op6.G0;
                                final cvj cvj2 = f0 = op6.F0;
                                jb2.M0(j0);
                                f0 = cvj2;
                                break Label_0424;
                            }
                            finally {
                                break Label_0424;
                            }
                        }
                    }
                    case 0: {
                        jb2.M0(j0);
                        if (i < 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("page");
                            sb.append('[');
                            sb.append(i);
                            sb.append("] must be >= 0");
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        if (-1.0f <= i2 && i2 <= 1.0f) {
                            break;
                        }
                        throw new IllegalArgumentException("pageOffset must be >= 0 and <= 1".toString());
                    }
                }
            }
            try {
                ((cjq<Integer>)this.f).setValue(new Integer(i));
                final int e = this.a.e();
                if (Math.abs(i - e) > 3) {
                    final p2f a = this.a;
                    int n;
                    if (i > e) {
                        n = i - 3;
                    }
                    else {
                        n = i + 3;
                    }
                    op6.F0 = this;
                    op6.G0 = i;
                    op6.I0 = i2;
                    op6.L0 = 1;
                    if (p2f.i(a, n, (mp6)op6) == f2) {
                        return f2;
                    }
                    f0 = this;
                }
                else {
                    f0 = this;
                }
                try {
                    if (Math.abs(i2) <= 0.005f) {
                        final p2f a2 = f0.a;
                        op6.F0 = f0;
                        op6.L0 = 2;
                        final p2f$c companion = p2f.Companion;
                        if (a2.d(i, 0, (mp6)op6) == f2) {
                            return f2;
                        }
                    }
                    else {
                        final p2f a3 = f0.a;
                        final hub<g4p, mp6<? super vzv>, Object> hub = (hub<g4p, mp6<? super vzv>, Object>)new hub<g4p, mp6<? super vzv>, Object>(null) {
                            public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                                return (mp6<vzv>)new hub<g4p, mp6<? super vzv>, Object>(mp6) {};
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                final g4p g4p = (g4p)o;
                                final hub<g4p, mp6<? super vzv>, Object> hub = (hub<g4p, mp6<? super vzv>, Object>)new hub<g4p, mp6<? super vzv>, Object>((mp6)o2) {
                                    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
                                        return (mp6<vzv>)new hub<g4p, mp6<? super vzv>, Object>(mp6) {};
                                    }
                                };
                                final vzv a = vzv.a;
                                hub.invokeSuspend(a);
                                return a;
                            }
                            
                            public final Object invokeSuspend(final Object o) {
                                jb2.M0(o);
                                return vzv.a;
                            }
                        };
                        op6.F0 = f0;
                        op6.G0 = i;
                        op6.I0 = i2;
                        op6.L0 = 3;
                        if (m58.y((a5p)a3, (jvh)null, (hub)hub, (mp6)op6, 1, (Object)null) == f2) {
                            return f2;
                        }
                        final b2f g2 = f0.a.g();
                        while (true) {
                            for (final Object next : g2.b()) {
                                if (((l1f)next).getIndex() == i) {
                                    final l1f l1f2 = (l1f)next;
                                    cvj cvj3;
                                    if (l1f2 != null) {
                                        final p2f a4 = f0.a;
                                        final int b0 = jb2.B0(l1f2.getSize() * i2);
                                        op6.F0 = f0;
                                        op6.L0 = 4;
                                        cvj3 = f0;
                                        if (a4.d(i, b0, (mp6)op6) == f2) {
                                            return f2;
                                        }
                                    }
                                    else {
                                        cvj3 = f0;
                                        if (g2.b().isEmpty() ^ true) {
                                            final int h0 = ((l1f)rr4.C1(g2.b())).getSize();
                                            final p2f a5 = f0.a;
                                            final int b2 = jb2.B0(h0 * i2);
                                            op6.F0 = f0;
                                            op6.G0 = i;
                                            op6.I0 = i2;
                                            op6.H0 = h0;
                                            op6.L0 = 5;
                                            final int g0 = i;
                                            if (a5.d(i, b2, (mp6)op6) == f2) {
                                                return f2;
                                            }
                                            final Iterator iterator2 = f0.a.g().b().iterator();
                                            Object next2;
                                            do {
                                                next2 = l1f;
                                                if (!iterator2.hasNext()) {
                                                    break;
                                                }
                                                next2 = iterator2.next();
                                                if (((l1f)next2).getIndex() == g0) {
                                                    i = 1;
                                                }
                                                else {
                                                    i = 0;
                                                }
                                            } while (i == 0);
                                            final l1f l1f3 = (l1f)next2;
                                            cvj3 = f0;
                                            if (l1f3 != null) {
                                                cvj3 = f0;
                                                if (l1f3.getSize() != h0) {
                                                    final p2f a6 = f0.a;
                                                    i = jb2.B0(l1f3.getSize() * i2);
                                                    op6.F0 = f0;
                                                    op6.L0 = 6;
                                                    final Object d = a6.d(g0, i, (mp6)op6);
                                                    cvj3 = f0;
                                                    if (d == f2) {
                                                        return f2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    f0 = cvj3;
                                    break Label_0424;
                                }
                            }
                            Object next = null;
                            continue;
                        }
                    }
                    f0.h();
                    return vzv.a;
                }
                finally {}
            }
            finally {
                f0 = this;
            }
        }
        f0.h();
        throw t;
    }
    
    public final int e() {
        return ((cjq<Number>)this.b).getValue().intValue();
    }
    
    public final float f() {
        return this.e.getValue().floatValue();
    }
    
    public final l1f g() {
        final b2f g = this.a.g();
        final Iterator iterator = g.b().iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                final l1f l1f = (l1f)next;
                int n = Math.min(l1f.getSize() + l1f.a(), g.e() - this.c) - Math.max(l1f.a(), 0);
                l1f l1f2 = (l1f)next;
                do {
                    final Object next2 = iterator.next();
                    final l1f l1f3 = (l1f)next2;
                    final int n2 = Math.min(l1f3.getSize() + l1f3.a(), g.e() - this.c) - Math.max(l1f3.a(), 0);
                    next = l1f2;
                    int n3;
                    if ((n3 = n) < n2) {
                        next = next2;
                        n3 = n2;
                    }
                    l1f2 = (l1f)next;
                    n = n3;
                } while (iterator.hasNext());
            }
        }
        return (l1f)next;
    }
    
    public final void h() {
        ((cjq<Object>)this.f).setValue(null);
    }
    
    public final void i(final int n) {
        if (n != ((cjq<Number>)this.b).getValue().intValue()) {
            ((cjq<Integer>)this.b).setValue(Integer.valueOf(n));
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("PagerState(pageCount=");
        f.append(this.d.getValue().intValue());
        f.append(", currentPage=");
        f.append(this.e());
        f.append(", currentPageOffset=");
        f.append(this.f());
        f.append(')');
        return f.toString();
    }
}
