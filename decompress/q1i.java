import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q1i extends xk1
{
    public static final q1i.q1i$b Companion;
    
    static {
        Companion = new q1i.q1i$b();
    }
    
    public q1i(final Bundle bundle) {
        super(bundle);
    }
    
    public static final class a extends xk1$a<q1i, a>
    {
        public final aob c;
        
        public a(final aob c) {
            czd.f((Object)c, "fragmentProvider");
            super(3424535);
            this.c = c;
        }
        
        public final Object i() {
            final Bundle a = ((vl1$a)this).a;
            czd.e((Object)a, "bundle");
            return new q1i(a);
        }
        
        public final xk1 v() {
            final Bundle a = ((vl1$a)this).a;
            czd.e((Object)a, "bundle");
            return new q1i(a);
        }
        
        public final wk1 x() {
            return (wk1)this.c.a(((n4j)this).e());
        }
    }
}
