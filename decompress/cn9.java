import com.twitter.app.chrome.di.view.DynamicChromeFragmentViewObjectGraph;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public class cn9 extends umd implements n0u, qkt, r8s
{
    public final void B(final Uri uri) {
        this.i2().B(uri);
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
        w1e.e((x1e)this).getView().setTranslationY((float)n);
    }
    
    public final boolean X1(final boolean b) {
        return this.i2().X1(b);
    }
    
    public final tn9 i2() {
        return ((DynamicChromeFragmentViewObjectGraph)w1e.h((x1e)this)).w();
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
