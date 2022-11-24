import androidx.appcompat.widget.Toolbar$f;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zit extends t5j<MenuItem>
{
    public final Toolbar F0;
    
    public zit(final Toolbar f0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super MenuItem> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onMenuItemClickListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onMenuItemClickListener);
        this.F0.setOnMenuItemClickListener((Toolbar$f)onMenuItemClickListener);
    }
    
    public static final class a extends wig implements Toolbar$f
    {
        public final Toolbar G0;
        public final ocj<? super MenuItem> H0;
        
        public a(final Toolbar g0, final ocj<? super MenuItem> h0) {
            e0e.g((Object)g0, "toolbar");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void c() {
            this.G0.setOnMenuItemClickListener((Toolbar$f)null);
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            e0e.g((Object)menuItem, "item");
            if (!this.isDisposed()) {
                this.H0.onNext((Object)menuItem);
            }
            return true;
        }
    }
}
