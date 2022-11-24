// 
// Decompiled by Procyon v0.6.0
// 

public final class jw1 implements ex
{
    public final float a;
    public final float b;
    
    public jw1(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final long n, final long n2, final cwe cwe) {
        e0e.f((Object)cwe, "layoutDirection");
        final float n3 = ((int)(n2 >> 32) - (int)(n >> 32)) / 2.0f;
        final float n4 = (nud.b(n2) - nud.b(n)) / 2.0f;
        float a;
        if (cwe == cwe.F0) {
            a = this.a;
        }
        else {
            a = -1 * this.a;
        }
        final float n5 = 1;
        return kqe.d(jb2.B0((a + n5) * n3), jb2.B0((n5 + this.b) * n4));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jw1)) {
            return false;
        }
        final jw1 jw1 = (jw1)o;
        return e0e.a((Object)this.a, (Object)jw1.a) && e0e.a((Object)this.b, (Object)jw1.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("BiasAlignment(horizontalBias=");
        f.append(this.a);
        f.append(", verticalBias=");
        return dn.C(f, this.b, ')');
    }
    
    public static final class a implements ex$b
    {
        public final float a;
        
        public a(final float a) {
            this.a = a;
        }
        
        public final int a(final int n, final int n2, final cwe cwe) {
            e0e.f((Object)cwe, "layoutDirection");
            final float n3 = (n2 - n) / 2.0f;
            float a;
            if (cwe == cwe.F0) {
                a = this.a;
            }
            else {
                a = -1 * this.a;
            }
            return jb2.B0((1 + a) * n3);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }
        
        @Override
        public final String toString() {
            return dn.C(ehk.f("Horizontal(bias="), this.a, ')');
        }
    }
    
    public static final class b implements ex$c
    {
        public final float a;
        
        public b(final float a) {
            this.a = a;
        }
        
        public final int a(final int n, final int n2) {
            return jb2.B0((1 + this.a) * ((n2 - n) / 2.0f));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && e0e.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }
        
        @Override
        public final String toString() {
            return dn.C(ehk.f("Vertical(bias="), this.a, ')');
        }
    }
}
