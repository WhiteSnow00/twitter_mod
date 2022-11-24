import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hf6 extends gnd<Boolean>
{
    public final CompoundButton F0;
    
    public hf6(final CompoundButton f0) {
        this.F0 = f0;
    }
    
    @Override
    public final Object d() {
        return this.F0.isChecked();
    }
    
    @Override
    public final void e(final ocj<? super Boolean> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onCheckedChangeListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onCheckedChangeListener);
        this.F0.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)onCheckedChangeListener);
    }
    
    public static final class a extends wig implements CompoundButton$OnCheckedChangeListener
    {
        public final CompoundButton G0;
        public final ocj<? super Boolean> H0;
        
        public a(final CompoundButton g0, final ocj<? super Boolean> h0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void c() {
            this.G0.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        
        public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
            e0e.g((Object)compoundButton, "compoundButton");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)b);
            }
        }
    }
}
