import android.os.BaseBundle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofy extends rdy<Void>
{
    public final int c;
    public final String d;
    public final int e;
    public final xgy f;
    
    public ofy(final xgy f, final fez<Void> fez, final int c, final String d, final int e) {
        super(this.f = f, (fez)fez);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void m(final Bundle bundle) {
        this.f.d.c(super.a);
        xgy.g.j("onError(%d), retrying notifyModuleCompleted...", ((BaseBundle)bundle).getInt("error_code"));
        final int e = this.e;
        if (e > 0) {
            this.f.j(this.c, this.d, e - 1);
        }
    }
}
