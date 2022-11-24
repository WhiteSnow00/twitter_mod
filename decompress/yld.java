import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yld implements g39
{
    public final wld a;
    public final wld.a b;
    
    public yld(final wld a, final wld.a b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final wld a = this.a;
        final wld.a b = this.b;
        Objects.requireNonNull(a);
        e0e.f((Object)b, "animation");
        a.a.n((Object)b);
    }
}
