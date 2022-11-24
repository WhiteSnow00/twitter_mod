import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wa7 extends wf
{
    public final String d;
    
    public wa7(final String d) {
        this.d = d;
    }
    
    @Override
    public final void d(final View view, final ng ng) {
        e0e.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        ng.b(new ng$a(16, (CharSequence)this.d));
    }
}
