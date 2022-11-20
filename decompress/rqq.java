import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rqq extends ste implements qsb<vrq, fzv>
{
    public final zpq D0;
    
    public rqq(final zpq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vrq vrq = (vrq)o;
        czd.f((Object)vrq, "$this$distinct");
        final zpq d0 = this.D0;
        if (d0.V0 == null && vrq.p) {
            d0.V0 = d0.U0.inflate();
        }
        final View v0 = this.D0.V0;
        if (v0 != null) {
            int visibility;
            if (vrq.p) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            v0.setVisibility(visibility);
        }
        return fzv.a;
    }
}
