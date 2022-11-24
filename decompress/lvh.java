import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvh
{
    public final AtomicReference<a> a;
    public final nyh b;
    
    public lvh() {
        this.a = new AtomicReference<a>(null);
        this.b = (nyh)ma7.f();
    }
    
    public static final class a
    {
        public final int a;
        public final iae b;
        
        public a(final int a, final iae b) {
            mqb.n(a, "priority");
            this.a = a;
            this.b = b;
        }
    }
}
