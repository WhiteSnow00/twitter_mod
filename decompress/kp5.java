// 
// Decompiled by Procyon v0.6.0
// 

public final class kp5
{
    public static final b Companion;
    public static final a b;
    public final int a;
    
    static {
        Companion = new b();
        b = new a();
    }
    
    public kp5(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kp5 && this.a == ((kp5)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return ffe.m("CommunityJoinRequestsResult(pendingJoinRequestCount=", this.a, ")");
    }
    
    public static final class a extends k5j<kp5>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            return new kp5(rmp.z());
        }
        
        public final void f(final smp smp, final Object o) {
            final kp5 kp5 = (kp5)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)kp5, "prompt");
            smp.z(kp5.a);
        }
    }
    
    public static final class b
    {
    }
}
