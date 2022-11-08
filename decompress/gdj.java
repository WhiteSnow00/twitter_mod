import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdj implements sn6
{
    public final jn6$a$a C0;
    public final boolean D0;
    
    public gdj(final wic wic, final lsr lsr, final lxm lxm) {
        zzd.f((Object)wic, "viewHolder");
        zzd.f((Object)lsr, "subtaskProperties");
        final jn6$a companion = jn6.Companion;
        final View heldView = ((c7x)wic).getHeldView();
        zzd.e((Object)heldView, "viewHolder.heldView");
        this.C0 = (jn6$a$a)companion.a(heldView);
        this.D0 = (rp2.w0(lsr.f.a) && rp2.w0(lsr.f.b));
        wic.B(lxm, lsr.f.a);
        wic.q(lxm, lsr.f.b);
    }
    
    public final jn6 c() {
        return (jn6)this.C0;
    }
}
