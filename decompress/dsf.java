import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsf implements puf
{
    public static final a E0;
    public mna<vo6> C0;
    public mna<hfv> D0;
    
    static {
        E0 = new a("", false);
    }
    
    public dsf() {
        final int a = lna.a;
        final int a2 = w4j.a;
        final kna c0 = kna.C0;
        this.C0 = (mna<vo6>)c0;
        this.D0 = (mna<hfv>)c0;
    }
    
    public final CharSequence a(final dm3 dm3) {
        final int j = dm3.j;
        final String s = "";
        if (j == 1) {
            final b b = dm3.b;
            pf8.r(b);
            final hfv c = this.c(b);
            String s2;
            if (c != null && pjr.g((CharSequence)c.J0)) {
                if ((s2 = pjr.l(c.J0)) == null) {
                    s2 = s;
                }
            }
            else {
                s2 = s;
                if (pjr.g((CharSequence)b.f0()) && (s2 = pjr.l(b.f0())) == null) {
                    s2 = s;
                }
            }
            return s2;
        }
        if (j == 2) {
            final mdq e = dm3.e;
            pf8.r(e);
            return this.f(e.f);
        }
        if (j == 3) {
            final rmu g = dm3.g;
            pf8.r(g);
            return this.f(g.a);
        }
        if (j != 5) {
            return "";
        }
        final fpf c2 = dm3.c;
        pf8.r(c2);
        final hfv i = c2.j;
        String l = s;
        if (i != null) {
            l = s;
            if (pjr.g((CharSequence)i.J0)) {
                l = pjr.l(i.J0);
                if (l == null) {
                    l = s;
                }
            }
        }
        return l;
    }
    
    public final a b(final dm3 dm3) {
        final int j = dm3.j;
        if (j == 1) {
            final b b = dm3.b;
            pf8.r(b);
            final hfv c = this.c(b);
            a a;
            if (c != null && pjr.g((CharSequence)c.c())) {
                a = new a(c.c(), c.M0);
            }
            else {
                a = new a(b.i0(), false);
            }
            return a;
        }
        if (j == 2) {
            final mdq e = dm3.e;
            pf8.r(e);
            return this.e(e.f);
        }
        if (j == 3) {
            final rmu g = dm3.g;
            pf8.r(g);
            return this.e(g.a);
        }
        if (j != 5) {
            return dsf.E0;
        }
        final fpf c2 = dm3.c;
        pf8.r(c2);
        final hfv i = c2.j;
        a a2;
        if (i != null && pjr.g((CharSequence)i.c())) {
            a2 = new a(i.c(), i.M0);
        }
        else {
            a2 = new a("", false);
        }
        return a2;
    }
    
    public final hfv c(final b b) {
        final String e0 = b.e0();
        if (pjr.e((CharSequence)e0)) {
            return null;
        }
        return (hfv)this.D0.K0((otk)new bsf((Object)e0, 0));
    }
    
    public final ebh d(final vo6 vo6) {
        if (vo6.k() != null && vo6.k().P0 != null) {
            return vo6.k().P0;
        }
        return ebh.a((hfv)this.D0.K0((otk)new zxw((Object)vo6, 1)));
    }
    
    public final a e(String c) {
        if (pjr.e((CharSequence)c)) {
            return dsf.E0;
        }
        final vo6 g = this.g(c);
        if (g == null) {
            return dsf.E0;
        }
        final ebh d = this.d(g);
        if (d != null) {
            if ((c = d.c) == null) {
                c = "";
            }
            return new a(c, d.e || d.f);
        }
        return dsf.E0;
    }
    
    public final void e1(final ouf ouf) {
        Object o;
        if ((o = ouf.b) == null) {
            o = v2a.C0;
        }
        this.C0 = (mna<vo6>)c6e.j((Iterable)o);
        this.D0 = (mna<hfv>)c6e.j((Iterable)ouf.a.e);
    }
    
    public final CharSequence f(String s) {
        final boolean e = pjr.e((CharSequence)s);
        final String s2 = "";
        if (e) {
            return "";
        }
        final vo6 g = this.g(s);
        s = s2;
        if (g != null) {
            final ebh d = this.d(g);
            if (d != null) {
                if ((s = pjr.l(d.b)) == null) {
                    s = s2;
                }
            }
            else if ((s = pjr.l(g.x())) == null) {
                s = s2;
            }
        }
        return s;
    }
    
    public final vo6 g(final String s) {
        return (vo6)this.C0.K0((otk)new csf(s, 0));
    }
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        
        public a(final String a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (this.b != a.b || !w4j.a((Object)this.a, (Object)a.a)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return w4j.g((Object)this.b, (Object)this.a);
        }
    }
}
