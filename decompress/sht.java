import android.view.View;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sht extends b5j<oyv>
{
    public final Toolbar C0;
    
    public sht(final Toolbar c0) {
        zzd.g((Object)c0, "view");
        this.C0 = c0;
    }
    
    public final void subscribeActual(final wbj<? super oyv> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a navigationOnClickListener = new a(this.C0, wbj);
        wbj.onSubscribe((j29)navigationOnClickListener);
        this.C0.setNavigationOnClickListener((View$OnClickListener)navigationOnClickListener);
    }
    
    public static final class a extends fig implements View$OnClickListener
    {
        public final Toolbar D0;
        public final wbj<? super oyv> E0;
        
        public a(final Toolbar d0, final wbj<? super oyv> e0) {
            zzd.g((Object)d0, "toolbar");
            zzd.g((Object)e0, "observer");
            this.D0 = d0;
            this.E0 = e0;
        }
        
        public final void c() {
            this.D0.setNavigationOnClickListener(null);
        }
        
        public final void onClick(final View view) {
            zzd.g((Object)view, "view");
            if (!this.isDisposed()) {
                this.E0.onNext((Object)oyv.a);
            }
        }
    }
}
