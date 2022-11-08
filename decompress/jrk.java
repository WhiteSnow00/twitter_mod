import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrk implements PopupWindow$OnDismissListener
{
    public final /* synthetic */ krk C0;
    
    public jrk(final krk c0) {
        this.C0 = c0;
    }
    
    public final void onDismiss() {
        final krk$a f = this.C0.f;
        if (f != null) {
            final xog xog = (xog)((nn1)f).D0;
            zzd.f((Object)xog, "$emitter");
            ((oog$a)xog).a();
        }
    }
}
