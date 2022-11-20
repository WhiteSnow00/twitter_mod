// 
// Decompiled by Procyon v0.6.0
// 

public final class iwu extends ste implements qsb<t6m$a, fzv>
{
    public final jwu D0;
    public final h0p E0;
    
    public iwu(final jwu d0, final h0p e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6m$a t6m$a = (t6m$a)o;
        int n;
        if (t6m$a == null) {
            n = -1;
        }
        else {
            n = iwu.iwu$a.a[((Enum)t6m$a).ordinal()];
        }
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    jwu.a(this.D0, "reached_end", this.E0);
                }
            }
            else {
                jwu.a(this.D0, "scroll_left", this.E0);
            }
        }
        else {
            jwu.a(this.D0, "scroll_right", this.E0);
        }
        return fzv.a;
    }
}
