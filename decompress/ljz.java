import android.os.RemoteException;
import java.util.Objects;
import com.google.android.play.core.assetpacks.AssetPackState;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljz implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public ljz(final bky g0, final Bundle h0, final AssetPackState i0) {
        this.F0 = 1;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public ljz(final fmz i0, final sxz g0, final aqy h0) {
        this.F0 = 0;
        this.I0 = i0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final int f0 = this.F0;
        Object t0 = null;
        final String s = null;
        switch (f0) {
            default: {
                final bky bky = (bky)this.G0;
                final Bundle bundle = (Bundle)this.H0;
                final AssetPackState assetPackState = (AssetPackState)this.I0;
                final tuy g = bky.g;
                Objects.requireNonNull(g);
                if (g.c((quy)new y8r((Object)g, (Object)bundle, 3, (j98)null))) {
                    bky.o.post((Runnable)new tyz((Object)bky, (Object)assetPackState, 5));
                    ((w100)bky.i.a()).i();
                }
                return;
            }
            case 0: {
                Object o = s;
                m9z m9z = null;
                try {
                    try {
                        if (!((ocz)this.I0).F0.u().o().f(ady.H0)) {
                            o = s;
                            ((ocz)this.I0).F0.b().P0.a("Analytics storage consent denied; will not get app instance id");
                            o = s;
                            ((ocz)this.I0).F0.w().u((String)null);
                            o = s;
                            ((ocz)this.I0).F0.u().K0.b((String)null);
                            final m9z f2 = ((ocz)this.I0).F0;
                        }
                        o = s;
                        final fmz fmz = (fmz)this.I0;
                        o = s;
                        final g1z i0 = fmz.I0;
                        if (i0 == null) {
                            o = s;
                            ((ocz)fmz).F0.b().K0.a("Failed to get app instance id");
                            final m9z f3 = ((ocz)this.I0).F0;
                        }
                        o = s;
                        iuk.C((Object)this.G0);
                        o = s;
                        t0 = i0.t0((sxz)this.G0);
                        if (t0 != null) {
                            o = t0;
                            ((ocz)this.I0).F0.w().u((String)t0);
                            o = t0;
                            ((ocz)this.I0).F0.u().K0.b((String)t0);
                        }
                        o = t0;
                        ((fmz)this.I0).s();
                        final m9z f4 = ((ocz)this.I0).F0;
                    }
                    finally {}
                }
                catch (final RemoteException ex) {
                    ((ocz)this.I0).F0.b().K0.b("Failed to get app instance id", (Object)ex);
                    final m9z f5 = ((ocz)this.I0).F0;
                    t0 = m9z;
                    m9z = f5;
                }
                m9z.B().I((aqy)this.H0, (String)t0);
                return;
                ((ocz)this.I0).F0.B().I((aqy)this.H0, (String)o);
                break;
            }
        }
    }
}
