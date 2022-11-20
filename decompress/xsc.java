import android.graphics.Paint;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xsc implements View$OnLayoutChangeListener
{
    public final zsc D0;
    
    public xsc(final zsc d0) {
        this.D0 = d0;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final zsc d0 = this.D0;
        czd.f((Object)d0, "this$0");
        d0.g = new zsc$b(n3 - n + ((View)d0.c).getResources().getDimensionPixelOffset(2131167439), (int)(float)Math.ceil((n4 - n2) / ((Paint)d0.c.getPaint()).getFontSpacing()));
        d0.b();
    }
}
