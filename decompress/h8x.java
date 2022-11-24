import android.view.View$OnFocusChangeListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8x extends gnd<Boolean>
{
    public final View F0;
    
    public h8x(final View f0) {
        this.F0 = f0;
    }
    
    @Override
    public final Object d() {
        return this.F0.hasFocus();
    }
    
    @Override
    public final void e(final ocj<? super Boolean> ocj) {
        e0e.g((Object)ocj, "observer");
        final a onFocusChangeListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onFocusChangeListener);
        this.F0.setOnFocusChangeListener((View$OnFocusChangeListener)onFocusChangeListener);
    }
    
    public static final class a extends wig implements View$OnFocusChangeListener
    {
        public final View G0;
        public final ocj<? super Boolean> H0;
        
        public a(final View g0, final ocj<? super Boolean> h0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void c() {
            this.G0.setOnFocusChangeListener((View$OnFocusChangeListener)null);
        }
        
        public final void onFocusChange(final View view, final boolean b) {
            e0e.g((Object)view, "v");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)b);
            }
        }
    }
}
