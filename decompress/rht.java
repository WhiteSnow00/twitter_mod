import androidx.appcompat.widget.Toolbar$f;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rht extends b5j<MenuItem>
{
    public final Toolbar C0;
    
    public rht(final Toolbar c0) {
        zzd.g((Object)c0, "view");
        this.C0 = c0;
    }
    
    public final void subscribeActual(final wbj<? super MenuItem> wbj) {
        zzd.g((Object)wbj, "observer");
        if (!m8y.i(wbj)) {
            return;
        }
        final a onMenuItemClickListener = new a(this.C0, wbj);
        wbj.onSubscribe((j29)onMenuItemClickListener);
        this.C0.setOnMenuItemClickListener((Toolbar.Toolbar$f)onMenuItemClickListener);
    }
    
    public static final class a extends fig implements Toolbar$f
    {
        public final Toolbar D0;
        public final wbj<? super MenuItem> E0;
        
        public a(final Toolbar d0, final wbj<? super MenuItem> e0) {
            zzd.g((Object)d0, "toolbar");
            zzd.g((Object)e0, "observer");
            this.D0 = d0;
            this.E0 = e0;
        }
        
        public final void c() {
            this.D0.setOnMenuItemClickListener(null);
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            zzd.g((Object)menuItem, "item");
            if (!this.isDisposed()) {
                this.E0.onNext((Object)menuItem);
            }
            return true;
        }
    }
}
