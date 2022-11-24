import android.view.View$OnClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6x extends t5j<vzv>
{
    public final View F0;
    
    public v6x(final View f0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super vzv> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onClickListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onClickListener);
        this.F0.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public static final class a extends wig implements View$OnClickListener
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
            this.G0.setOnClickListener((View$OnClickListener)null);
        }
        
        public final void onClick(final View view) {
            e0e.g((Object)view, "v");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)vzv.a);
            }
        }
    }
}
