import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u0u implements g39
{
    public final f0u a;
    public final f0u$d b;
    
    public u0u(final f0u a, final f0u$d b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final f0u a = this.a;
        final f0u$d b = this.b;
        Objects.requireNonNull(a);
        e0e.f((Object)b, "animation");
        a.h.remove((Object)b);
    }
}
