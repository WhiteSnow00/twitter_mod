import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class if6 extends ste implements qsb<View, fzv>
{
    public final kf6 D0;
    public final joh.c E0;
    
    public if6(final kf6 d0, final joh.c e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        final emh e = this.D0.e;
        final joh.c e2 = this.E0;
        final poh a = e2.a;
        final String b = e2.b;
        Objects.requireNonNull(e);
        czd.f((Object)a, "type");
        czd.f((Object)b, "moduleId");
        e.a.onNext((Object)new kmh$c(a, b));
        return fzv.a;
    }
}
