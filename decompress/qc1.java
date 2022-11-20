import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qc1 extends ste implements nsb<fzv>
{
    public final kc1 D0;
    public final String E0;
    public final int F0;
    public final p G0;
    
    public qc1(final kc1 d0, final String e0, final p g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = 2;
        this.G0 = g0;
        super(0);
    }
    
    public final Object invoke() {
        final Context a = this.D0.a;
        final String e0 = this.E0;
        if (e0 != null) {
            hqo.f(a, e0, this.F0, this.G0, null, null);
        }
        return fzv.a;
    }
}
