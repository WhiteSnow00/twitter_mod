import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p50 implements o29
{
    public final /* synthetic */ erk a;
    
    public p50(final erk a) {
        this.a = a;
    }
    
    public final void dispose() {
        this.a.d();
        final erk a = this.a;
        ((View)a).setTag(2131432598, (Object)null);
        a.O0.removeViewImmediate((View)a);
    }
}
