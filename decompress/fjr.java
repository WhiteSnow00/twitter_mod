import android.os.Bundle;
import android.app.Dialog;
import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjr implements vw8
{
    public final ww8 F0;
    public final gm G0;
    public final znl<kni> H0;
    
    public fjr(final ww8 f0, final gm g0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (znl<kni>)new znl();
        f0.H0 = this;
    }
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n == 4414) {
            this.H0.onNext((Object)kni.a);
        }
    }
    
    public final void q0(final Dialog dialog, final int n, final Bundle bundle) {
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
    }
}
