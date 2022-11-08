import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bob extends jo<Object>
{
    public final /* synthetic */ AtomicReference a;
    
    public bob(final AtomicReference a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o, final tn tn) {
        final jo jo = this.a.get();
        if (jo != null) {
            jo.a(o);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
    
    @Override
    public final void b() {
        final jo jo = this.a.getAndSet(null);
        if (jo != null) {
            jo.b();
        }
    }
}
