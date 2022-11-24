import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pvh
{
    public final AtomicReference<a> a;
    public final nyh b;
    
    public pvh() {
        this.a = new AtomicReference<a>(null);
        this.b = (nyh)ma7.f();
    }
    
    public static final void a(final pvh pvh, final a a) {
        a a2;
        do {
            a2 = pvh.a.get();
            if (a2 != null && ((Enum<jvh>)a.a).compareTo(a2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!pvh.a.compareAndSet(a2, a));
        if (a2 != null) {
            a2.b.a((CancellationException)null);
        }
    }
    
    public static final class a
    {
        public final jvh a;
        public final iae b;
        
        public a(final jvh a, final iae b) {
            e0e.f((Object)a, "priority");
            this.a = a;
            this.b = b;
        }
    }
}
