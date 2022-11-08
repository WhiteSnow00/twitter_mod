import android.view.View$OnLongClickListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8x extends b5j<oyv>
{
    public final View C0;
    public final otb<Boolean> D0;
    
    public e8x(final View c0, final otb<Boolean> d0) {
        zzd.g((Object)c0, "view");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void subscribeActual(final wbj<? super oyv> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a onLongClickListener = new a(this.C0, this.D0, wbj);
        wbj.onSubscribe((j29)onLongClickListener);
        this.C0.setOnLongClickListener((View$OnLongClickListener)onLongClickListener);
    }
    
    public static final class a extends fig implements View$OnLongClickListener
    {
        public final View D0;
        public final otb<Boolean> E0;
        public final wbj<? super oyv> F0;
        
        public a(final View d0, final otb<Boolean> e0, final wbj<? super oyv> f0) {
            zzd.g((Object)d0, "view");
            zzd.g((Object)e0, "handled");
            zzd.g((Object)f0, "observer");
            this.D0 = d0;
            this.E0 = e0;
            this.F0 = f0;
        }
        
        public final void c() {
            this.D0.setOnLongClickListener((View$OnLongClickListener)null);
        }
        
        public final boolean onLongClick(final View view) {
            zzd.g((Object)view, "v");
            if (!this.isDisposed()) {
                try {
                    if (this.E0.invoke()) {
                        this.F0.onNext((Object)oyv.a);
                        return true;
                    }
                }
                catch (final Exception ex) {
                    this.F0.onError((Throwable)ex);
                    this.dispose();
                }
            }
            return false;
        }
    }
}
