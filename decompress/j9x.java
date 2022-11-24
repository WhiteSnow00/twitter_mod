import android.view.View$OnLayoutChangeListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9x extends t5j<vzv>
{
    public final View F0;
    
    public j9x(final View f0) {
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super vzv> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a a = new a(this.F0, ocj);
        ocj.onSubscribe((b39)a);
        this.F0.addOnLayoutChangeListener((View$OnLayoutChangeListener)a);
    }
    
    public static final class a extends wig implements View$OnLayoutChangeListener
    {
        public final View G0;
        public final ocj<? super vzv> H0;
        
        public a(final View g0, final ocj<? super vzv> h0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void c() {
            this.G0.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
        
        public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
            e0e.g((Object)view, "v");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)vzv.a);
            }
        }
    }
}
