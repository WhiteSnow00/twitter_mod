import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnq extends ste implements qsb<xmq, fzv>
{
    public final zmq D0;
    
    public mnq(final zmq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xmq xmq = (xmq)o;
        czd.f((Object)xmq, "$this$distinct");
        final tg5 g = xmq.g;
        if (g != null && g.d() != es5.H0) {
            final int f0 = pv5.Companion.a(xmq.g).F0;
            final zmq d0 = this.D0;
            ((GradientDrawable)d0.T0.getValue()).setColor(kn6.b(d0.H0, f0));
            d0.S0.setBackground((Drawable)d0.T0.getValue());
        }
        else {
            this.D0.S0.setBackgroundResource(xmq.k);
        }
        return fzv.a;
    }
}
