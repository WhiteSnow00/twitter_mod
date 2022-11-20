import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b0u implements y19
{
    public final mzt a;
    public final mzt$d b;
    
    public b0u(final mzt a, final mzt$d b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final mzt a = this.a;
        final mzt$d b = this.b;
        Objects.requireNonNull(a);
        czd.f((Object)b, "animation");
        a.h.remove((Object)b);
    }
}
