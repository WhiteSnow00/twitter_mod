import com.twitter.android.explore.main.di.view.URTGuideViewGraph;
import com.twitter.android.explore.main.di.view.TabbedGuideViewObjectGraph;
import java.util.Objects;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class s9s extends umd implements n0u, r8s, qkt, t8s
{
    public final void B(final Uri uri) {
        final v9s e0 = this.i2().E0;
        Objects.requireNonNull(e0);
        if (uri != null) {
            e0.D0.setCurrentItem(e0.E0.t(uri));
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
    
    public final r9s i2() {
        return ((TabbedGuideViewObjectGraph)w1e.h((x1e)this)).S5();
    }
    
    public final void m() {
        final sl1 s = this.i2().E0.G0.a.S();
        if (s instanceof kpv) {
            final kpv kpv = (kpv)s;
            Objects.requireNonNull(kpv);
            ((eus)((URTGuideViewGraph)((x9)((umd)kpv).b1()).n()).J6()).d1(2);
        }
    }
    
    public final boolean n1() {
        return this.i2().n1();
    }
    
    public final boolean y() {
        return true;
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
}
