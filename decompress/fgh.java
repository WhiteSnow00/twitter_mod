import androidx.appcompat.app.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgh extends ste implements qsb<tgh, fzv>
{
    public final yfh D0;
    
    public fgh(final yfh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tgh tgh = (tgh)o;
        czd.f((Object)tgh, "$this$distinct");
        final tfh g0 = this.D0.G0;
        g0.E0 = tgh.h;
        ((f)g0.D0).invalidateOptionsMenu();
        return fzv.a;
    }
}
