import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rv9 implements ebi
{
    public final ccj<Object> D0;
    
    public rv9(final ccj<Object> d0) {
        czd.f((Object)d0, "observer");
        this.D0 = d0;
    }
    
    public final void a3() {
        this.D0.onNext((Object)ov9.a);
    }
    
    public final boolean n(final MenuItem menuItem) {
        return false;
    }
}
