// 
// Decompiled by Procyon v0.6.0
// 

public final class bw1 implements ex
{
    public final float a;
    public final float b;
    
    public bw1(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final long a(final long n, final long n2, final fve fve) {
        czd.f((Object)fve, "layoutDirection");
        final float n3 = ((int)(n2 >> 32) - (int)(n >> 32)) / 2.0f;
        final float n4 = (ltd.b(n2) - ltd.b(n)) / 2.0f;
        float a;
        if (fve == fve.D0) {
            a = this.a;
        }
        else {
            a = -1 * this.a;
        }
        final float n5 = 1;
        return wd.j(zyz.n((a + n5) * n3), zyz.n((n5 + this.b) * n4));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bw1)) {
            return false;
        }
        final bw1 bw1 = (bw1)o;
        return czd.a((Object)this.a, (Object)bw1.a) && czd.a((Object)this.b, (Object)bw1.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("BiasAlignment(horizontalBias=");
        j.append(this.a);
        j.append(", verticalBias=");
        return wnj.C(j, this.b, ')');
    }
    
    public static final class a implements ex.b
    {
        public final float a;
        
        public a(final float a) {
            this.a = a;
        }
        
        @Override
        public final int a(final int n, final int n2, final fve fve) {
            czd.f((Object)fve, "layoutDirection");
            final float n3 = (n2 - n) / 2.0f;
            float a;
            if (fve == fve.D0) {
                a = this.a;
            }
            else {
                a = -1 * this.a;
            }
            return zyz.n((1 + a) * n3);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }
        
        @Override
        public final String toString() {
            return wnj.C(fu8.j("Horizontal(bias="), this.a, ')');
        }
    }
    
    public static final class b implements c
    {
        public final float a;
        
        public b(final float a) {
            this.a = a;
        }
        
        @Override
        public final int a(final int n, final int n2) {
            return zyz.n((1 + this.a) * ((n2 - n) / 2.0f));
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && czd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }
        
        @Override
        public final String toString() {
            return wnj.C(fu8.j("Vertical(bias="), this.a, ')');
        }
    }
}
