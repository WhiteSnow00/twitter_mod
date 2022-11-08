import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehf extends wf
{
    public final /* synthetic */ boolean d;
    
    public ehf(final boolean d) {
        this.d = d;
    }
    
    public final void d(final View view, final ng ng) {
        zzd.f((Object)view, "host");
        super.a.onInitializeAccessibilityNodeInfo(view, ng.a);
        ng.F(this.d ^ true);
        if (this.d) {
            ng.x(ng$a.g);
        }
        else {
            ng.b(new ng$a(16, (CharSequence)view.getContext().getString(2131954664)));
        }
    }
}
