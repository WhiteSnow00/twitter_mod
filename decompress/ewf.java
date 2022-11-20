import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewf extends ste implements qsb<zvf$b, fzv>
{
    public final zvf D0;
    
    public ewf(final zvf d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zvf$b zvf$b = (zvf$b)o;
        final zvf d0 = this.D0;
        czd.e((Object)zvf$b, "it");
        Objects.requireNonNull(d0);
        if (zvf$b instanceof zvf$b$a) {
            final xx0 l0 = d0.L0;
            if (l0 != null) {
                final zvf$b$a zvf$b$a = (zvf$b$a)zvf$b;
                l0.k0((x1)new asf(zvf$b$a.a, zvf$b$a.b));
            }
        }
        else if (zvf$b instanceof zvf$b$b) {
            m8a.d(((zvf$b$b)zvf$b).a);
        }
        return fzv.a;
    }
}
