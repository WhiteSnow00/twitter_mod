// 
// Decompiled by Procyon v0.6.0
// 

public final class gbm extends zus implements ntw
{
    public final fbm q;
    
    public gbm(final a a) {
        super((zus$a<?, ?>)a, 24);
        final fbm p = a.p;
        jee.l((Object)p);
        this.q = p;
    }
    
    public static final class a extends zus$a<gbm, a>
    {
        public fbm p;
        
        public final Object i() {
            return new gbm(this);
        }
        
        public final boolean l() {
            return super.l() && this.p != null;
        }
    }
}
