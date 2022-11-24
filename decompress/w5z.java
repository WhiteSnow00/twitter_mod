import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w5z implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public w5z(final Object i0, final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.I0 = i0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final fmz fmz = (fmz)this.I0;
                final g1z i0 = fmz.I0;
                if (i0 == null) {
                    ((ocz)fmz).F0.b().K0.a("Failed to send default event parameters to service");
                }
                else {
                    try {
                        iuk.C((Object)this.G0);
                        i0.z0((Bundle)this.H0, (sxz)this.G0);
                    }
                    catch (final RemoteException ex) {
                        ((ocz)this.I0).F0.b().K0.b("Failed to send default event parameters to service", (Object)ex);
                    }
                }
                return;
            }
            case 0: {
                final a6z a6z = (a6z)this.I0;
                final e6z g0 = a6z.G0;
                final String f0 = a6z.F0;
                final rmy rmy = (rmy)this.G0;
                g0.a.a().g();
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("package_name", f0);
                try {
                    if (rmy.m(bundle) == null) {
                        g0.a.b().K0.a("Install Referrer Service returned a null response");
                    }
                }
                catch (final Exception ex2) {
                    g0.a.b().K0.b("Exception occurred while retrieving the Install Referrer", (Object)ex2.getMessage());
                }
                g0.a.a().g();
                m9z.k();
                throw null;
            }
        }
    }
}
