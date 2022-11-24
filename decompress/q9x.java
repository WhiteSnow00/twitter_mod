import android.view.View$OnLongClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q9x extends t5j<vzv>
{
    public final View F0;
    public final ptb<Boolean> G0;
    
    public q9x(final View f0, final ptb<Boolean> g0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void subscribeActual(final ocj<? super vzv> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onLongClickListener = new a(this.F0, this.G0, ocj);
        ocj.onSubscribe((b39)onLongClickListener);
        this.F0.setOnLongClickListener((View$OnLongClickListener)onLongClickListener);
    }
    
    public static final class a extends wig implements View$OnLongClickListener
    {
        public final View G0;
        public final ptb<Boolean> H0;
        public final ocj<? super vzv> I0;
        
        public a(final View g0, final ptb<Boolean> h0, final ocj<? super vzv> i0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "handled");
            e0e.g((Object)i0, "observer");
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
        }
        
        public final void c() {
            this.G0.setOnLongClickListener((View$OnLongClickListener)null);
        }
        
        public final boolean onLongClick(final View view) {
            e0e.g((Object)view, "v");
            if (!this.isDisposed()) {
                try {
                    if (this.H0.invoke()) {
                        this.I0.onNext((Object)vzv.a);
                        return true;
                    }
                }
                catch (final Exception ex) {
                    this.I0.onError((Throwable)ex);
                    this.dispose();
                }
            }
            return false;
        }
    }
}
