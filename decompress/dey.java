import java.util.Iterator;
import android.os.RemoteException;
import java.util.List;
import android.os.Bundle;
import android.os.BaseBundle;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dey extends cdy
{
    public final Collection G0;
    public final Collection H0;
    public final ffz I0;
    public final hky J0;
    
    public dey(final hky j0, final ffz ffz, final Collection g0, final Collection h0, final ffz i0) {
        this.J0 = j0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super((ffz<?>)ffz);
    }
    
    @Override
    public final void a() {
        final Collection g0 = this.G0;
        final ArrayList list = new ArrayList<BaseBundle>(g0.size());
        for (final String s : g0) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("module_name", s);
            list.add((BaseBundle)bundle);
        }
        final Collection h0 = this.H0;
        final ArrayList list2 = new ArrayList<BaseBundle>(h0.size());
        for (final String s2 : h0) {
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("language", s2);
            list2.add((BaseBundle)bundle2);
        }
        list.addAll((Collection<? extends BaseBundle>)list2);
        try {
            final hky j0 = this.J0;
            final cpy cpy = (cpy)j0.b.n;
            final String a = j0.a;
            final Bundle bundle3 = new Bundle();
            ((BaseBundle)bundle3).putInt("playcore_version_code", 11002);
            cpy.L(a, (List)list, bundle3, (mpy)new xjy(this.J0, this.I0));
        }
        catch (final RemoteException ex) {
            hky.c.k((Throwable)ex, "startInstall(%s,%s)", this.G0, this.H0);
            this.I0.a((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
