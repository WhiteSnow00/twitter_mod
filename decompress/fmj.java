import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmj extends ste implements qsb<tmi, fzv>
{
    public final emj D0;
    public final hmj E0;
    
    public fmj(final emj d0, final hmj e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final NavigationHandler b = this.D0.b;
        final ssv a = this.E0.a;
        if (a != null) {
            b.e(a);
            return fzv.a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
