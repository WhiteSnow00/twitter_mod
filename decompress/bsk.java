import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsk extends qsz
{
    public final void h(final View view, final int n, final int n2) {
        e0e.f((Object)view, "composeView");
        view.setSystemGestureExclusionRects(shw.A0((Object[])new Rect[] { new Rect(0, 0, n, n2) }));
    }
}
