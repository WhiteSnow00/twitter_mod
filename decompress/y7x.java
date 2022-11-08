import android.view.View$OnLayoutChangeListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y7x extends b5j<oyv>
{
    public final View C0;
    
    public y7x(final View c0) {
        this.C0 = c0;
    }
    
    public final void subscribeActual(final wbj<? super oyv> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a a = new a(this.C0, wbj);
        wbj.onSubscribe((j29)a);
        this.C0.addOnLayoutChangeListener((View$OnLayoutChangeListener)a);
    }
    
    public static final class a extends fig implements View$OnLayoutChangeListener
    {
        public final View D0;
        public final wbj<? super oyv> E0;
        
        public a(final View d0, final wbj<? super oyv> e0) {
            zzd.g((Object)d0, "view");
            zzd.g((Object)e0, "observer");
            this.D0 = d0;
            this.E0 = e0;
        }
        
        public final void c() {
            this.D0.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        }
        
        public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
            zzd.g((Object)view, "v");
            if (!this.isDisposed()) {
                this.E0.onNext((Object)oyv.a);
            }
        }
    }
}
