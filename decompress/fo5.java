// 
// Decompiled by Procyon v0.6.0
// 

public final class fo5
{
    public static final b Companion;
    public static final a b;
    public final int a;
    
    static {
        Companion = new b();
        b = new a();
    }
    
    public fo5(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fo5 && this.a == ((fo5)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return ze.G("CommunityJoinRequestsResult(pendingJoinRequestCount=", this.a, ")");
    }
    
    public static final class a extends y4j<fo5>
    {
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            return new fo5(vlp.x());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final fo5 fo5 = (fo5)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)fo5, "prompt");
            wlp.x(fo5.a);
        }
    }
    
    public static final class b
    {
    }
}
