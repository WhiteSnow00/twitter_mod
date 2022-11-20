import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ws9 implements ebi
{
    public final Activity D0;
    public final ccj<Object> E0;
    
    public ws9(final Activity d0, final ccj<Object> e0) {
        czd.f((Object)d0, "activity");
        czd.f((Object)e0, "observer");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void a3() {
        this.D0.onBackPressed();
    }
    
    public final boolean n(final MenuItem menuItem) {
        czd.f((Object)menuItem, "item");
        boolean b;
        if (2131430013 == menuItem.getItemId()) {
            this.E0.onNext((Object)us9.a);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
}
