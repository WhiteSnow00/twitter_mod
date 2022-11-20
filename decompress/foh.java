import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foh extends ste implements qsb<View, fzv>
{
    public final hoh D0;
    public final joh.h E0;
    
    public foh(final hoh d0, final joh.h e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        final emh e = this.D0.e;
        final joh.h e2 = this.E0;
        final poh c = e2.c;
        final String d = e2.d;
        final gbl f = e2.f;
        Objects.requireNonNull(e);
        czd.f((Object)c, "type");
        e.a.onNext((Object)new kmh$d(c, d, f));
        return fzv.a;
    }
}
