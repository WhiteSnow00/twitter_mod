import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iv7 extends ste implements qsb<View, xvl>
{
    public final iyu D0;
    public final rfm E0;
    public final rv1 F0;
    
    public iv7(final iyu d0, final rfm e0, final rv1 f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "view");
        final iyu d0 = this.D0;
        xvl xvl;
        if (d0 != null) {
            xvl = new xvl(view, d0, this.E0, this.F0);
        }
        else {
            xvl = null;
        }
        return xvl;
    }
}
