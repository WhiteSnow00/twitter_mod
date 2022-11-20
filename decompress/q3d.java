// 
// Decompiled by Procyon v0.6.0
// 

public final class q3d extends zus implements ntw
{
    public final p3d q;
    
    public q3d(final a a) {
        super((zus$a<?, ?>)a, 50);
        final p3d p = a.p;
        czd.c((Object)p);
        this.q = p;
    }
    
    public static final class a extends zus$a<q3d, a>
    {
        public p3d p;
        
        public final Object i() {
            return new q3d(this);
        }
        
        public final boolean l() {
            return super.l() && this.p != null;
        }
    }
}
