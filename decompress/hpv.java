// 
// Decompiled by Procyon v0.6.0
// 

public final class hpv extends tvs implements cuw
{
    public final zqv q;
    
    public hpv(final a a, final int n) {
        super((tvs.a)a, n);
        final zqv p2 = a.p;
        vmw.g((Object)p2);
        this.q = p2;
    }
    
    public static final class a extends tvs.a<hpv, a>
    {
        public zqv p;
        
        public final Object i() {
            final int b = this.p.b;
            int n;
            if (b != 2 && b != 3) {
                n = 12;
            }
            else {
                n = 13;
            }
            return new hpv(this, n);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null;
        }
    }
}
