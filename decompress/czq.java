import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czq extends ste implements qsb<hwq, fzv>
{
    public final hzq D0;
    
    public czq(final hzq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final Long d = hwq.d;
        if (d != null) {
            final hzq d2 = this.D0;
            ((TextView)d2.k).setText((CharSequence)uoz.C(d2.c, d.longValue()));
        }
        return fzv.a;
    }
}
