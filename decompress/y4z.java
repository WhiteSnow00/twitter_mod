import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y4z implements Runnable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    
    public y4z(final Object g0, final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.G0 = g0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final glz glz = (glz)this.G0;
                final i0z g0 = glz.G0;
                if (g0 == null) {
                    ((pbz)glz).D0.b().I0.a("Failed to send default event parameters to service");
                }
                else {
                    try {
                        eli.q(this.E0);
                        g0.z0((Bundle)this.F0, (twz)this.E0);
                    }
                    catch (final RemoteException ex) {
                        ((pbz)this.G0).D0.b().I0.b("Failed to send default event parameters to service", (Object)ex);
                    }
                }
                return;
            }
            case 0: {
                final c5z c5z = (c5z)this.G0;
                final g5z e0 = c5z.E0;
                final String d0 = c5z.D0;
                final xly xly = (xly)this.E0;
                e0.a.a().g();
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("package_name", d0);
                try {
                    if (xly.m(bundle) == null) {
                        e0.a.b().I0.a("Install Referrer Service returned a null response");
                    }
                }
                catch (final Exception ex2) {
                    e0.a.b().I0.b("Exception occurred while retrieving the Install Referrer", (Object)ex2.getMessage());
                }
                e0.a.a().g();
                n8z.k();
                throw null;
            }
        }
    }
}
