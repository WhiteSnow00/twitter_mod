import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ff6 extends ste implements qsb<View, fzv>
{
    public final hf6 D0;
    public final joh.b E0;
    
    public ff6(final hf6 d0, final joh.b e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        final emh e = this.D0.e;
        final joh.b e2 = this.E0;
        final poh b = e2.b;
        final gbl c = e2.c;
        final String d = e2.d;
        Objects.requireNonNull(e);
        czd.f((Object)b, "type");
        e.a.onNext((Object)new kmh$b(b, c, d));
        return fzv.a;
    }
}
