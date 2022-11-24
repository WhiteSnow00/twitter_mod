import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q0u implements g39
{
    public final f0u a;
    public final f0u b;
    
    public q0u(final f0u a, final f0u b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final f0u a = this.a;
        final f0u b = this.b;
        Objects.requireNonNull(a);
        e0e.f((Object)b, "transition");
        a.i.remove((Object)b);
    }
}
