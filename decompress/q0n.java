import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q0n extends ste implements qsb<r0n, fzv>
{
    public final o0n D0;
    
    public q0n(final o0n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final r0n r0n = (r0n)o;
        czd.f((Object)r0n, "$this$distinct");
        final String h = o1d.h(this.D0.G0, (long)r0n.b, true);
        czd.e((Object)h, "tweetNumberFormat(resour\u2026sersCount.toLong(), true)");
        final o0n d0 = this.D0;
        ((TextView)d0.H0).setText((CharSequence)d0.G0.getQuantityString(2131820672, r0n.b, new Object[] { h }));
        return fzv.a;
    }
}
