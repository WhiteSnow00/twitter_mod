import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eoq extends pue implements stb<unq, vzv>
{
    public final wnq F0;
    
    public eoq(final wnq f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final unq unq = (unq)o;
        e0e.f((Object)unq, "$this$distinct");
        final wnq$a companion = wnq.Companion;
        final View f0 = this.F0.F0;
        final boolean a = unq.a;
        Objects.requireNonNull(companion);
        final ViewGroup$LayoutParams layoutParams = f0.getLayoutParams();
        if (a) {
            layoutParams.width = -1;
        }
        else {
            layoutParams.width = -2;
        }
        f0.setLayoutParams(layoutParams);
        return vzv.a;
    }
}
