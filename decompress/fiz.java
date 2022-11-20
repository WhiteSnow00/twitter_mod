import android.os.RemoteException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fiz implements Runnable
{
    public final int D0;
    public final twz E0;
    public final glz F0;
    
    public fiz(final glz f0, final twz e0, final int d0) {
        this.D0 = d0;
        this.F0 = f0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        switch (this.D0) {
            default: {
                final glz f0 = this.F0;
                final i0z g0 = f0.G0;
                if (g0 == null) {
                    ((pbz)f0).D0.b().I0.a("Failed to send consent settings to service");
                }
                else {
                    try {
                        eli.q(this.E0);
                        g0.w1(this.E0);
                        this.F0.s();
                    }
                    catch (final RemoteException ex) {
                        ((pbz)this.F0).D0.b().I0.b("Failed to send consent settings to the service", (Object)ex);
                    }
                }
                return;
            }
            case 0: {
                final glz f2 = this.F0;
                final i0z g2 = f2.G0;
                if (g2 == null) {
                    ((pbz)f2).D0.b().I0.a("Failed to reset data on the service: not connected to service");
                }
                else {
                    try {
                        eli.q(this.E0);
                        g2.C1(this.E0);
                    }
                    catch (final RemoteException ex2) {
                        ((pbz)this.F0).D0.b().I0.b("Failed to reset data on the service: remote exception", (Object)ex2);
                    }
                    this.F0.s();
                }
            }
        }
    }
}
