import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zey extends bdy<Void>
{
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ igy f;
    
    public zey(final igy f, final sdz<Void> sdz, final int c, final String d, final int e) {
        this.f = f;
        super(f, (sdz)sdz);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void m(final Bundle bundle) {
        this.f.d.c(super.a);
        igy.g.k("onError(%d), retrying notifyModuleCompleted...", new Object[] { ((BaseBundle)bundle).getInt("error_code") });
        final int e = this.e;
        if (e > 0) {
            this.f.j(this.c, this.d, e - 1);
        }
    }
}
