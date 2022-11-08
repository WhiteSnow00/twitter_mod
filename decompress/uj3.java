// 
// Decompiled by Procyon v0.6.0
// 

public final class uj3 extends nws
{
    public final tj3 k;
    public final int l;
    
    public uj3(final a a) {
        super((nws$a)a);
        final tj3 k = a.k;
        pf8.r(k);
        this.k = k;
        this.l = a.l;
    }
    
    public static final class a extends nws$a<uj3, a>
    {
        public tj3 k;
        public int l;
        
        public a(final long n) {
            super(n);
            this.l = 1;
        }
        
        public final Object i() {
            return new uj3(this);
        }
        
        public final boolean l() {
            return this.k != null && this.l != 0;
        }
    }
}
