// 
// Decompiled by Procyon v0.6.0
// 

public final class k53 extends rrp
{
    public final wcj f;
    
    public k53(final a a) {
        super((rrp.a)a);
        final wcj e = a.e;
        if (e != null) {
            this.f = e;
            return;
        }
        e0e.m("ocfButton");
        throw null;
    }
    
    public static final class a extends rrp.a<k53, a>
    {
        public wcj e;
        
        public final Object i() {
            return new k53(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && super.a != null;
        }
    }
}
