import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q97 extends vf
{
    public final String d;
    
    public q97(final String d) {
        this.d = d;
    }
    
    public final void d(final View view, final mg mg) {
        czd.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, mg.a);
        mg.b(new mg$a(16, (CharSequence)this.d));
    }
}
