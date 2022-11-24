import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltw extends tvs implements rtw, aec
{
    public final ktw q;
    public final lxd r;
    
    public ltw(final a a) {
        super((tvs.a)a, 44);
        final ktw p = a.p;
        vmw.g((Object)p);
        this.q = p;
        this.r = a.q;
    }
    
    public final List<lxd> f() {
        return ojf.v((Object)this.r);
    }
    
    public static final class a extends tvs.a<ltw, a>
    {
        public ktw p;
        public lxd q;
        
        public final Object i() {
            return new ltw(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && this.p != null;
        }
    }
}
