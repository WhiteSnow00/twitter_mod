import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmt extends zus implements ycc, ntw
{
    public final jwd q;
    public final p6t r;
    
    public hmt(final a a) {
        super((zus$a<?, ?>)a, 40);
        final jwd p = a.p;
        jee.l((Object)p);
        this.q = p;
        final p6t q = a.q;
        jee.l((Object)q);
        this.r = q;
    }
    
    public final List<jwd> f() {
        return rif.v((Object)this.q);
    }
    
    public static final class a extends zus$a<hmt, a>
    {
        public jwd p;
        public p6t q;
        
        public final Object i() {
            return new hmt(this);
        }
        
        public final boolean l() {
            return super.l() && this.p != null && this.q != null;
        }
    }
}
