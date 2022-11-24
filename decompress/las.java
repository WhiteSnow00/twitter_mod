import com.twitter.android.explore.main.di.view.URTGuideViewGraph;
import com.twitter.android.explore.main.di.view.TabbedGuideViewObjectGraph;
import java.util.Objects;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class las extends und implements g1u, l9s, hlt, n9s
{
    public final void B(final Uri uri) {
        final oas g0 = this.i2().G0;
        Objects.requireNonNull(g0);
        if (uri != null) {
            g0.F0.setCurrentItem(g0.G0.u(uri));
        }
    }
    
    public final boolean E() {
        return this.i2().E();
    }
    
    public final boolean G() {
        return this.i2().G();
    }
    
    public final boolean I() {
        return false;
    }
    
    public final void N(final int n) {
        this.i2().N(n);
    }
    
    public final boolean X1(final boolean b) {
        return this.i2().X1(b);
    }
    
    public final kas i2() {
        return ((TabbedGuideViewObjectGraph)k5b.f((y2e)this)).S5();
    }
    
    public final boolean n1() {
        return this.i2().n1();
    }
    
    public final void p() {
        final xl1 s = this.i2().G0.I0.a.S();
        if (s instanceof vpv) {
            final vpv vpv = (vpv)s;
            Objects.requireNonNull(vpv);
            ((URTGuideViewGraph)((x9)((und)vpv).b1()).n()).J6().d1(2);
        }
    }
    
    public final boolean y() {
        return true;
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
}
