import android.view.View;
import androidx.core.widget.NestedScrollView$c;
import androidx.core.widget.NestedScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qci extends t5j<zbx>
{
    public final NestedScrollView F0;
    
    public qci(final NestedScrollView f0) {
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super zbx> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onScrollChangeListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onScrollChangeListener);
        this.F0.setOnScrollChangeListener((NestedScrollView$c)onScrollChangeListener);
    }
    
    public static final class a extends wig implements NestedScrollView$c
    {
        public final NestedScrollView G0;
        public final ocj<? super zbx> H0;
        
        public a(final NestedScrollView g0, final ocj<? super zbx> h0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void b(final NestedScrollView nestedScrollView, final int n, final int n2, final int n3, final int n4) {
            e0e.g((Object)nestedScrollView, "v");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)new zbx((View)this.G0, n, n2, n3, n4));
            }
        }
        
        public final void c() {
            this.G0.setOnScrollChangeListener((NestedScrollView$c)null);
        }
    }
}
