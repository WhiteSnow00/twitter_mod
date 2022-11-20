import android.view.View;
import java.util.Objects;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvb extends fn
{
    public final fvb a;
    
    public jvb(final fvb a) {
        this.a = a;
    }
    
    public final void b(final Activity activity, final boolean b) {
        czd.f((Object)activity, "activity");
        final wvb g1 = this.a.g1;
        Objects.requireNonNull(g1);
        if (b && !g1.p && !g1.i.k) {
            o70.d((View)g1.a);
        }
    }
}
