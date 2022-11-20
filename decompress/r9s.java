import android.view.View;
import java.util.Objects;
import android.net.Uri;
import com.twitter.ui.view.RtlViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r9s implements pm6, n0u, qkt, r8s
{
    public final RtlViewPager D0;
    public final v9s E0;
    
    public r9s(final r8x r8x, final xbm xbm, final RtlViewPager d0, final v9s e0) {
        this.D0 = d0;
        this.E0 = e0;
        final wc6 wc6 = new wc6();
        wc6.d(new t19[] { r8x.d().subscribe((lj6)new iag(e0, 3)), r8x.g().subscribe((lj6)new a1p((Object)e0, 4)) });
        xbm.i((oj)new q9s(wc6, 0));
    }
    
    public final void B(final Uri uri) {
        final v9s e0 = this.E0;
        Objects.requireNonNull(e0);
        if (uri != null) {
            e0.D0.setCurrentItem(e0.E0.t(uri));
        }
    }
    
    public final boolean E() {
        return this.E0.E();
    }
    
    public final boolean G() {
        return this.E0.G();
    }
    
    public final boolean I() {
        return false;
    }
    
    public final void N(final int n) {
        ((View)this.D0).setTranslationY((float)n);
    }
    
    public final boolean X1(final boolean b) {
        return this.E0.X1(b);
    }
    
    public final View getView() {
        return (View)this.D0;
    }
    
    public final boolean n1() {
        return this.E0.n1();
    }
    
    public final boolean y() {
        return true;
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
}
