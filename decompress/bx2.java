import android.view.MenuItem;
import android.view.Menu;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bx2 implements iai
{
    public final Resources D0;
    public final vmd E0;
    public boolean F0;
    
    public bx2(final Resources d0, final vmd e0) {
        czd.f((Object)d0, "resources");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        czd.f((Object)hai, "navComponent");
        czd.f((Object)menu, "menu");
        hai.setTitle((CharSequence)this.D0.getString(2131952273));
        hai.z(2131689515, menu);
        return true;
    }
    
    public final int d2(final hai hai) {
        czd.f((Object)hai, "navComponent");
        final MenuItem item = hai.findItem(2131430026);
        if (item != null) {
            item.setEnabled(this.F0);
        }
        return 2;
    }
}
