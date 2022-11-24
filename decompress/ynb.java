import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ynb extends no<Object>
{
    public final AtomicReference a;
    
    public ynb(final AtomicReference a) {
        this.a = a;
    }
    
    public final void a(final Object o, final xn xn) {
        final no no = this.a.get();
        if (no != null) {
            no.a(o);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
    
    public final void b() {
        final no no = this.a.getAndSet(null);
        if (no != null) {
            no.b();
        }
    }
}
