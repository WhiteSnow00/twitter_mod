import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vaf<T> implements jbj<T, T>
{
    public final z7x C0;
    
    public vaf(final z7x c0) {
        zzd.f((Object)c0, "viewLifecycle");
        this.C0 = c0;
    }
    
    public final naj<T> a(final b5j<T> b5j) {
        zzd.f((Object)b5j, "upstream");
        final b5j concat = b5j.concat((naj)((raf)this.C0).a().filter((ptk)new di((rtb)vaf$a.C0, 1)).map((qtb)new nma((rtb)vaf$b.C0, 5)), (naj)b5j.create((b9j)k1b.D0));
        final int c0 = hab.C0;
        Objects.requireNonNull(concat, "other is null");
        m4j.b(c0, "bufferSize");
        final b5j compose = b5j.compose((jbj)new mbj((b5j)null, (naj)concat, true, c0));
        zzd.e((Object)compose, "upstream\n            .co\u2026          )\n            )");
        return (naj<T>)compose;
    }
}
