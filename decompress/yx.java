import android.view.MenuItem;
import java.util.Objects;
import com.twitter.app.alttext.AltTextActivityViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yx implements cbi
{
    public final /* synthetic */ int C0;
    public final Object D0;
    
    public yx(final AltTextActivityViewModel d0) {
        this.C0 = 0;
        zzd.f((Object)d0, "viewModel");
        this.D0 = d0;
    }
    
    public yx(final mbi d0) {
        this.C0 = 1;
        zzd.f((Object)d0, "navigator");
        this.D0 = d0;
    }
    
    public final void a3() {
        switch (this.C0) {
            default: {
                ((mbi)this.D0).j();
                return;
            }
            case 0: {
                final AltTextActivityViewModel altTextActivityViewModel = (AltTextActivityViewModel)this.D0;
                final zx a = zx.a;
                Objects.requireNonNull(altTextActivityViewModel);
                altTextActivityViewModel.O((qcw)a);
            }
        }
    }
    
    public final boolean q(final MenuItem menuItem) {
        final int c0 = this.C0;
        boolean b = true;
        switch (c0) {
            default: {
                zzd.f((Object)menuItem, "item");
                return true;
            }
            case 0: {
                zzd.f((Object)menuItem, "item");
                if (menuItem.getItemId() == 2131430011) {
                    final AltTextActivityViewModel altTextActivityViewModel = (AltTextActivityViewModel)this.D0;
                    final by a = by.a;
                    Objects.requireNonNull(altTextActivityViewModel);
                    altTextActivityViewModel.O((qcw)a);
                }
                else {
                    b = false;
                }
                return b;
            }
        }
    }
}
