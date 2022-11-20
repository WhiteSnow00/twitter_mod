import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.util.Objects;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.birdwatch.navigation.BirdwatchHomePageActivityArgs;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class xy1 extends pl implements xv8
{
    public zy1 o2;
    
    public final xk1 h2() {
        return (xk1)new yy1(((Fragment)this).J0);
    }
    
    public final void k0(final Dialog dialog, int b, final int n) {
        final tl a = ((dm)((tlp)new yy1(((Fragment)this).J0)).j()).a(n);
        if (a != null) {
            final zy1 o2 = this.o2;
            if (o2 != null) {
                b = a.b;
                if (b != 1) {
                    if (b == 2) {
                        o2.a.b((ContentViewArgs)BirdwatchHomePageActivityArgs.INSTANCE);
                    }
                }
                else {
                    final eaq b2 = trc.c().b((orc)new g6c(zcw.d().k()));
                    final a1p a1p = new a1p((Object)o2, 17);
                    final m8a b3 = m8a.b();
                    Objects.requireNonNull(b3);
                    b2.G((lj6)a1p, (lj6)new z0p((Object)b3, 20));
                }
            }
        }
    }
    
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        ((wk1)this).U1 = (xv8)this;
        final int a = c5j.a;
    }
    
    public final void m2() {
        if (((Fragment)this).N0() != null) {
            this.o2 = new zy1(((smd)this).v0().h());
        }
    }
}
