// 
// Decompiled by Procyon v0.6.0
// 

public final class sgc extends r7a implements Comparable<r7a>
{
    public static final nmp<sgc> L0;
    public static final nmp<d8a<sgc>> M0;
    public final String K0;
    
    static {
        final sgc.sgc$b sgc$b = sgc.L0 = new sgc.sgc$b();
        final d8a g0 = d8a.G0;
        sgc.M0 = new d8a$c((nmp)sgc$b);
    }
    
    public sgc(final a a) {
        super((r7a.a)a);
        String d;
        if ((d = a.d) == null) {
            d = "";
        }
        this.K0 = d;
    }
    
    @Override
    public final int compareTo(final Object o) {
        return r7a.J0.compare(this, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof sgc)) {
                return b2;
            }
            final sgc sgc = (sgc)o;
            final boolean b3 = this == sgc || (this.f(sgc) && o5j.a((Object)this.K0, (Object)sgc.K0));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final r7a.a g() {
        return new a(this);
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.K0, (Object)(super.F0 * 31));
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("HashtagEntity{text='");
        go9.r(f, this.K0, '\'', "} ");
        f.append(super.toString());
        return f.toString();
    }
    
    public static final class a extends r7a.a<sgc, a>
    {
        public String d;
        
        public a() {
        }
        
        public a(final sgc sgc) {
            super(sgc);
            this.d = sgc.K0;
        }
        
        public final Object i() {
            return new sgc(this);
        }
        
        @Override
        public final void m() {
            super.m();
            final int b = super.b;
            if (b != -1 && super.c == -1) {
                final String d = this.d;
                if (d != null) {
                    super.c = d.length() + b + 1;
                }
            }
        }
    }
}
