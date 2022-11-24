import android.os.RemoteException;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class skz implements Runnable
{
    public final String F0;
    public final String G0;
    public final sxz H0;
    public final aqy I0;
    public final fmz J0;
    
    public skz(final fmz j0, final String f0, final String g0, final sxz h0, final aqy i0) {
        this.J0 = j0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        Object o;
        final ArrayList list = (ArrayList)(o = new ArrayList());
        try {
            try {
                final fmz j0 = this.J0;
                o = list;
                final g1z i0 = j0.I0;
                if (i0 == null) {
                    o = list;
                    ((ocz)j0).F0.b().K0.c("Failed to get conditional properties; not connected to service", (Object)this.F0, (Object)this.G0);
                    o = ((ocz)this.J0).F0;
                }
                o = list;
                iuk.C((Object)this.H0);
                o = list;
                o = kqz.t(i0.e1(this.F0, this.G0, this.H0));
                this.J0.s();
                o = ((ocz)this.J0).F0;
            }
            finally {}
        }
        catch (final RemoteException ex) {
            ((ocz)this.J0).F0.b().K0.d("Failed to get conditional properties; remote exception", (Object)this.F0, (Object)this.G0, (Object)ex);
            o = ((ocz)this.J0).F0;
        }
        final ArrayList list2;
        ((m9z)o).B().D(this.I0, list2);
        return;
        ((ocz)this.J0).F0.B().D(this.I0, (ArrayList)o);
    }
}
