// 
// Decompiled by Procyon v0.6.0
// 

public final class v0t extends kus implements usw
{
    public final t0t q;
    
    public v0t(final a a) {
        super((kus.a)a, 43);
        final t0t p = a.p;
        pf8.r(p);
        this.q = p;
    }
    
    public final a x() {
        final a a = new a(this);
        a.p = this.q;
        return a;
    }
    
    public static final class a extends kus.a<v0t, a>
    {
        public t0t p;
        
        public a() {
        }
        
        public a(final kus kus) {
            super(kus);
        }
        
        public final Object i() {
            return new v0t(this);
        }
        
        @Override
        public final boolean l() {
            return super.l() && this.p != null;
        }
        
        public final a o(final t0t p) {
            this.p = p;
            return this;
        }
    }
}
