// 
// Decompiled by Procyon v0.6.0
// 

public final class tbm extends tvs implements cuw
{
    public final sbm q;
    
    public tbm(final a a) {
        super((tvs.a)a, 24);
        final sbm p = a.p;
        vmw.g((Object)p);
        this.q = p;
    }
    
    public static final class a extends tvs.a<tbm, a>
    {
        public sbm p;
        
        public final Object i() {
            return new tbm(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null;
        }
    }
}
