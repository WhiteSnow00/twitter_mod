import java.util.Iterator;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.BaseBundle;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmz extends sby
{
    public final /* synthetic */ int D0;
    public final /* synthetic */ sdz E0;
    public final /* synthetic */ Object F0;
    public final /* synthetic */ Object G0;
    
    public final void a() {
        switch (this.D0) {
            default: {
                final List list = (List)this.F0;
                final v3a g = igy.g;
                final ArrayList list2 = new ArrayList<BaseBundle>(list.size());
                for (final String s : list) {
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putString("module_name", s);
                    list2.add((BaseBundle)bundle);
                }
                try {
                    final Object g2 = this.G0;
                    ((nyz)((igy)g2).d.n).I1(((igy)g2).a, (List)list2, igy.h(), (jzz)new kdy((igy)this.G0, this.E0));
                }
                catch (final RemoteException ex) {
                    igy.g.l((Throwable)ex, "cancelDownloads(%s)", new Object[] { this.F0 });
                }
                return;
            }
            case 0: {
                try {
                    final Object g3 = this.G0;
                    ((iuz)((vvz)g3).a.n).Z0(((vvz)g3).b, vvz.a((vvz)g3, (String)this.F0), (wwz)new guz((vvz)this.G0, this.E0, (String)this.F0));
                }
                catch (final RemoteException ex2) {
                    vvz.e.l((Throwable)ex2, "requestUpdateInfo(%s)", new Object[] { this.F0 });
                    this.E0.a((Exception)new RuntimeException((Throwable)ex2));
                }
            }
        }
    }
}
