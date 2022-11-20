import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxc implements View$OnClickListener
{
    public final int D0;
    public final Object E0;
    
    public hxc(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        switch (this.D0) {
            default: {
                final t0w t0w = (t0w)this.E0;
                czd.f((Object)t0w, "this$0");
                t0w.E0.onNext((Object)tmi.a);
                return;
            }
            case 0: {
                final jxc jxc = (jxc)this.E0;
                czd.f((Object)jxc, "this$0");
                jxc.l.H(3);
            }
        }
    }
}
