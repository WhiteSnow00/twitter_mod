import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e20 implements de2
{
    public final View C0;
    
    public e20(final View c0) {
        zzd.f((Object)c0, "view");
        this.C0 = c0;
    }
    
    public final Object a(final sve sve, final otb<n5m> otb, final ap6<? super oyv> ap6) {
        final long x = m8y.x(sve);
        final n5m n5m = (n5m)otb.invoke();
        if (n5m != null) {
            final n5m g = n5m.g(x);
            this.C0.requestRectangleOnScreen(new Rect((int)g.a, (int)g.b, (int)g.c, (int)g.d), false);
            return oyv.a;
        }
        return oyv.a;
    }
}
