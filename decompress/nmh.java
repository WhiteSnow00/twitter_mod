import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmh implements ebi
{
    public final int D0;
    public final obi E0;
    
    public nmh(final obi obi, final int d0) {
        this.D0 = d0;
        if (d0 != 1) {
            czd.f((Object)obi, "navigator");
            this.E0 = obi;
            return;
        }
        czd.f((Object)obi, "navigator");
        this.E0 = obi;
    }
    
    public final void a3() {
        switch (this.D0) {
            default: {
                this.E0.j();
                return;
            }
            case 0: {
                this.E0.j();
            }
        }
    }
    
    public final boolean n(final MenuItem menuItem) {
        return false;
    }
}
