// 
// Decompiled by Procyon v0.6.0
// 

public final class lxo extends kus implements mm3
{
    public final jxo q;
    
    public lxo(final a a) {
        super((kus.a)a, 37);
        final jxo p = a.p;
        pf8.r(p);
        this.q = p;
    }
    
    public static final class a extends kus.a<lxo, a>
    {
        public jxo p;
        
        public final Object i() {
            return new lxo(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && this.p != null;
        }
    }
}
