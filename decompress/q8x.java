import android.view.View$OnLayoutChangeListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8x extends h5j<fzv>
{
    public final View D0;
    
    public q8x(final View d0) {
        this.D0 = d0;
    }
    
    public final void subscribeActual(final ccj<? super fzv> ccj) {
        czd.g((Object)ccj, "observer");
        if (!c9y.j((ccj)ccj)) {
            return;
        }
        final a a = new a(this.D0, ccj);
        ccj.onSubscribe((t19)a);
        this.D0.addOnLayoutChangeListener((View$OnLayoutChangeListener)a);
    }
    
    public static final class a extends cig implements View$OnLayoutChangeListener
    {
        public final View E0;
        public final ccj<? super fzv> F0;
        
        public a(final View e0, final ccj<? super fzv> f0) {
            czd.g((Object)e0, "view");
            czd.g((Object)f0, "observer");
            this.E0 = e0;
            this.F0 = f0;
        }
        
        public final void b() {
            this.E0.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
        
        public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
            czd.g((Object)view, "v");
            if (!this.isDisposed()) {
                this.F0.onNext((Object)fzv.a);
            }
        }
    }
}
