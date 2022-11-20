import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsq extends ste implements qsb<p01, fzv>
{
    public final psq D0;
    public final String E0;
    
    public rsq(final psq d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final p01 p = (p01)o;
        final String a0 = p.c.a0;
        final nl2 h0 = nl2.H0;
        final boolean a2 = czd.a((Object)a0, (Object)"ENDED");
        int n = 0;
        if (!a2) {
            final boolean b = p.c.a0.length() > 0;
            n = n;
            if (b) {
                n = 1;
            }
        }
        if (n != 0) {
            final psq d0 = this.D0;
            final String e0 = this.E0;
            Objects.requireNonNull(d0);
            w1e.m((asq)d0, e0, true);
        }
        else {
            psq.w(this.D0);
        }
        return fzv.a;
    }
}
