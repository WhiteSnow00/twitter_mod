import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uoh extends pue implements stb<View, vzv>
{
    public final woh F0;
    public final yoh$h G0;
    
    public uoh(final woh f0, final yoh$h g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f((Object)o, "it");
        final tmh e = this.F0.e;
        final yoh$h g0 = this.G0;
        final eph c = g0.c;
        final String d = g0.d;
        final tbl f = g0.f;
        Objects.requireNonNull(e);
        e0e.f((Object)c, "type");
        e.a.onNext((Object)new zmh.d(c, d, f));
        return vzv.a;
    }
}
