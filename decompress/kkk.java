import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkk extends ste implements qsb<xp2, fzv>
{
    public final hkk D0;
    
    public kkk(final hkk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xp2 xp2 = (xp2)o;
        czd.f((Object)xp2, "$this$distinct");
        if (xp2.e == xp2.d.E0) {
            final hkk d0 = this.D0;
            d0.K0.loadUrl(xp2.a);
            if (d0.c1 == 0L) {
                d0.c1 = SystemClock.elapsedRealtime();
            }
        }
        return fzv.a;
    }
}
