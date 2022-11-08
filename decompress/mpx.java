import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpx implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ View C0;
    public final /* synthetic */ p4m D0;
    
    public mpx(final View c0, final p4m d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        zzd.f((Object)view, "v");
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        zzd.f((Object)view, "v");
        this.C0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.D0.t();
    }
}
