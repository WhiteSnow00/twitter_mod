import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cot extends tvs implements aec, cuw
{
    public final lxd q;
    public final k7t r;
    
    public cot(final a a) {
        super((tvs.a)a, 41);
        final lxd p = a.p;
        vmw.g((Object)p);
        this.q = p;
        final k7t q = a.q;
        vmw.g((Object)q);
        this.r = q;
    }
    
    public final List<lxd> f() {
        return ojf.v((Object)this.q);
    }
    
    public static final class a extends tvs.a<cot, a>
    {
        public lxd p;
        public k7t q;
        
        public final Object i() {
            return new cot(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null && this.q != null;
        }
    }
}
