import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f2z extends s9y
{
    public final IBinder g;
    public final bm1 h;
    
    public f2z(final bm1 h, final int n, final IBinder g, final Bundle bundle) {
        super(this.h = h, n, bundle);
        this.g = g;
    }
    
    @Override
    public final void d(final vg6 vg6) {
        final bm1$b x0 = this.h.X0;
        if (x0 != null) {
            x0.s(vg6);
        }
        this.h.H(vg6);
    }
    
    @Override
    public final boolean e() {
        try {
            final IBinder g = this.g;
            eli.q(g);
            final String interfaceDescriptor = g.getInterfaceDescriptor();
            if (!this.h.E().equals(interfaceDescriptor)) {
                final String e = this.h.E();
                Log.w("GmsClient", mb0.C(new StringBuilder(String.valueOf(e).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", e, " vs. ", interfaceDescriptor));
                return false;
            }
            final IInterface x = this.h.x(this.g);
            if (x != null && (bm1.L(this.h, 2, 4, x) || bm1.L(this.h, 3, 4, x))) {
                final bm1 h = this.h;
                h.b1 = null;
                final bm1$a w0 = h.W0;
                if (w0 != null) {
                    w0.b();
                }
                return true;
            }
            return false;
        }
        catch (final RemoteException ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
