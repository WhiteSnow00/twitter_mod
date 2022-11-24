import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joq extends pue implements stb<unq, vzv>
{
    public final wnq F0;
    
    public joq(final wnq f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final unq unq = (unq)o;
        e0e.f((Object)unq, "$this$distinct");
        final yh5 g = unq.g;
        if (g != null && g.d() != kt5.J0) {
            final int h0 = uw5.Companion.a(unq.g).H0;
            final wnq f0 = this.F0;
            ((GradientDrawable)f0.V0.getValue()).setColor(qo6.b(f0.J0, h0));
            f0.U0.setBackground((Drawable)f0.V0.getValue());
        }
        else {
            this.F0.U0.setBackgroundResource(unq.k);
        }
        return vzv.a;
    }
}
