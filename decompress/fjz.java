import android.os.RemoteException;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjz implements Runnable
{
    public final /* synthetic */ String C0;
    public final /* synthetic */ String D0;
    public final /* synthetic */ hwz E0;
    public final /* synthetic */ roy F0;
    public final /* synthetic */ skz G0;
    
    public fjz(final skz g0, final String c0, final String d0, final hwz e0, final roy f0) {
        this.G0 = g0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final void run() {
        Object o;
        final ArrayList list = (ArrayList)(o = new ArrayList());
        try {
            try {
                final skz g0 = this.G0;
                o = list;
                final szy f0 = g0.F0;
                if (f0 == null) {
                    o = list;
                    ((abz)g0).C0.b().H0.c("Failed to get conditional properties; not connected to service", (Object)this.C0, (Object)this.D0);
                    o = ((abz)this.G0).C0;
                }
                o = list;
                xd.t((Object)this.E0);
                o = list;
                o = xoz.t(f0.e1(this.C0, this.D0, this.E0));
                this.G0.s();
                o = ((abz)this.G0).C0;
            }
            finally {}
        }
        catch (final RemoteException ex) {
            ((abz)this.G0).C0.b().H0.d("Failed to get conditional properties; remote exception", (Object)this.C0, (Object)this.D0, (Object)ex);
            o = ((abz)this.G0).C0;
        }
        final ArrayList list2;
        ((y7z)o).B().D(this.F0, list2);
        return;
        ((abz)this.G0).C0.B().D(this.F0, (ArrayList)o);
    }
}
