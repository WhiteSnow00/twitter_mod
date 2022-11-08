import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag6 extends gue implements rtb<View, oyv>
{
    public final /* synthetic */ cg6 C0;
    public final /* synthetic */ eoh$b D0;
    
    public ag6(final cg6 c0, final eoh$b d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "it");
        final zlh e = this.C0.e;
        final eoh$b d0 = this.D0;
        final koh b = d0.b;
        final ual c = d0.c;
        final String d2 = d0.d;
        Objects.requireNonNull(e);
        zzd.f((Object)b, "type");
        e.a.onNext((Object)new fmh.b(b, c, d2));
        return oyv.a;
    }
}
