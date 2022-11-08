// 
// Decompiled by Procyon v0.6.0
// 

public final class u9r extends fqp
{
    public final u9r$c f;
    
    public u9r(final a a) {
        super((fqp.a)a);
        this.f = a.e;
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    public static final class a extends fqp.a<u9r, a>
    {
        public u9r$c e;
        
        public a() {
            this.e = u9r$c.D0;
        }
        
        public final Object i() {
            return new u9r(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && super.a != null;
        }
    }
}
