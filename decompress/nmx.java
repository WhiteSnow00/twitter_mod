// 
// Decompiled by Procyon v0.6.0
// 

public final class nmx implements vrd
{
    public final String b;
    
    public nmx(final String b) {
        e0e.f((Object)b, "completionDeeplink");
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nmx && e0e.a((Object)this.b, (Object)((nmx)o).b));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return c0e.h("WebModalInputData(completionDeeplink=", this.b, ")");
    }
    
    public static final class a extends k5j<nmx>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final String c = rmp.C();
            e0e.e((Object)c, "input.readNotNullString()");
            return new nmx(c);
        }
        
        public final void f(final smp smp, final Object o) {
            final nmx nmx = (nmx)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)nmx, "inputData");
            smp.G(nmx.b);
        }
    }
}
