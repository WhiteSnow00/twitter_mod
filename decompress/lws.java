import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lws extends kus implements ydc, usw, mm3, jsw
{
    public final gxd q;
    public final kws r;
    
    public lws(final a a) {
        super((kus.a)a, 38);
        final gxd p = a.p;
        pf8.r(p);
        this.q = p;
        this.r = a.q;
    }
    
    public final List<gxd> f() {
        return ijf.v((Object)this.q);
    }
    
    public static final class a extends kus.a<lws, a>
    {
        public gxd p;
        public kws q;
        
        public final Object i() {
            return new lws(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && this.p != null && this.q != null;
        }
    }
}
