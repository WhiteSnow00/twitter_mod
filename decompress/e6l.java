import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e6l extends ste implements qsb<z6l, fzv>
{
    public final z5l D0;
    
    public e6l(final z5l d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final z6l z6l = (z6l)o;
        czd.f((Object)z6l, "$this$distinct");
        if (z6l.a) {
            final z5l d0 = this.D0;
            if (d0.Q0 == null) {
                final jhl n2 = jhl.n2(2131955977);
                ((Fragment)n2).S1();
                n2.p2(((cnb)d0.H0).P(), "loading_dialog");
                d0.Q0 = n2;
            }
        }
        else {
            final z5l d2 = this.D0;
            final jhl q0 = d2.Q0;
            if (q0 != null) {
                q0.m2();
            }
            d2.Q0 = null;
        }
        return fzv.a;
    }
}
