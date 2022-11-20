import androidx.preference.TwoStatePreference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cz8 extends ste implements qsb<Boolean, fzv>
{
    public final bz8 D0;
    
    public cz8(final bz8 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        if (!(boolean)o) {
            final bz8 d0 = this.D0;
            final bz8$a companion = bz8.Companion;
            ((TwoStatePreference)d0.g2()).Y(false);
            d0.h2().e(0);
            m1f.e().c(2131951888, 0);
        }
        return fzv.a;
    }
}
