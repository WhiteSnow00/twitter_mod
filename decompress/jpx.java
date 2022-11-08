import java.util.concurrent.CancellationException;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpx implements View$OnAttachStateChangeListener
{
    public final /* synthetic */ fae C0;
    
    public jpx(final fae c0) {
        this.C0 = c0;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        zzd.f((Object)view, "v");
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        zzd.f((Object)view, "v");
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        fae$a.a(this.C0, (CancellationException)null, 1, (Object)null);
    }
}
