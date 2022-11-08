// 
// Decompiled by Procyon v0.6.0
// 

public final class umt extends nws
{
    public final y5t k;
    
    public umt(final a a) {
        super((nws$a)a);
        final y5t k = a.k;
        pf8.r(k);
        this.k = k;
    }
    
    public static final class a extends nws$a<umt, a>
    {
        public y5t k;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new umt(this);
        }
        
        public final boolean l() {
            return this.k != null;
        }
    }
}
