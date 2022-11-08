import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j4z implements Runnable
{
    public final /* synthetic */ int C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ Object E0;
    public final /* synthetic */ Object F0;
    
    @Override
    public final void run() {
        switch (this.C0) {
            default: {
                final skz skz = (skz)this.F0;
                final szy f0 = skz.F0;
                if (f0 == null) {
                    ((abz)skz).C0.b().H0.a("Failed to send default event parameters to service");
                }
                else {
                    try {
                        xd.t((Object)this.D0);
                        f0.z0((Bundle)this.E0, (hwz)this.D0);
                    }
                    catch (final RemoteException ex) {
                        ((abz)this.F0).C0.b().H0.b("Failed to send default event parameters to service", (Object)ex);
                    }
                }
                return;
            }
            case 0: {
                final n4z n4z = (n4z)this.F0;
                final r4z d0 = n4z.D0;
                final String c0 = n4z.C0;
                final hly hly = (hly)this.D0;
                d0.a.a().g();
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("package_name", c0);
                try {
                    if (hly.m(bundle) == null) {
                        d0.a.b().H0.a("Install Referrer Service returned a null response");
                    }
                }
                catch (final Exception ex2) {
                    d0.a.b().H0.b("Exception occurred while retrieving the Install Referrer", (Object)ex2.getMessage());
                }
                d0.a.a().g();
                y7z.k();
                throw null;
            }
        }
    }
}
