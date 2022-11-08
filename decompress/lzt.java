import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzt implements o29
{
    public final /* synthetic */ wyt a;
    public final /* synthetic */ wyt$d b;
    
    public lzt(final wyt a, final wyt$d b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final wyt a = this.a;
        final wyt$d b = this.b;
        Objects.requireNonNull(a);
        zzd.f((Object)b, "animation");
        a.h.remove((Object)b);
    }
}
