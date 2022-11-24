import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vcx extends t5j<vzv>
{
    public final View F0;
    
    public vcx(final View f0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super vzv> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a a = new a(this.F0, ocj);
        ocj.onSubscribe((b39)a);
        this.F0.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)a);
    }
    
    public static final class a extends wig implements ViewTreeObserver$OnGlobalLayoutListener
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
            this.G0.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        
        public final void onGlobalLayout() {
            if (!this.isDisposed()) {
                this.H0.onNext((Object)vzv.a);
            }
        }
    }
}
