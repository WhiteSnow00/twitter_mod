import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d20 implements ne2
{
    public final View F0;
    
    public d20(final View f0) {
        e0e.f((Object)f0, "view");
        this.F0 = f0;
    }
    
    public final Object a(final bwe bwe, final ptb<p6m> ptb, final mp6<? super vzv> mp6) {
        final long s = w9y.s(bwe);
        final p6m p6m = (p6m)ptb.invoke();
        if (p6m != null) {
            final p6m g = p6m.g(s);
            this.F0.requestRectangleOnScreen(new Rect((int)g.a, (int)g.b, (int)g.c, (int)g.d), false);
            return vzv.a;
        }
        return vzv.a;
    }
}
