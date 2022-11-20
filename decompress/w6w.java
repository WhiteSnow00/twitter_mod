import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6w extends tp1<scv>
{
    public final cgv E0;
    public final x6w F0;
    
    public w6w(final x6w f0, final cgv e0) {
        this.F0 = f0;
        this.E0 = e0;
    }
    
    public final void b(final Object o) {
        final scv scv = (scv)o;
        final x6w f0 = this.F0;
        if (f0.M0) {
            f0.J0.e((Object)new kjf$b(this.E0));
        }
        else {
            f0.J0.e((Object)new kjf$a(this.E0));
        }
        final x6w f2 = this.F0;
        final boolean m0 = f2.M0 ^ true;
        f2.M0 = m0;
        final View n0 = ((t6w)f2.D0).N0;
        int visibility;
        if (m0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        n0.setVisibility(visibility);
    }
}
