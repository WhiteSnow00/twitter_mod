import java.util.Iterator;
import com.google.android.play.core.internal.zzat;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bey extends cdy
{
    public final cdy G0;
    public final tgy H0;
    
    public bey(final tgy h0, final ffz ffz, final cdy g0) {
        this.H0 = h0;
        this.G0 = g0;
        super((ffz<?>)ffz);
    }
    
    @Override
    public final void a() {
        final tgy h0 = this.H0;
        final cdy g0 = this.G0;
        if (h0.n == null && !h0.g) {
            h0.b.l("Initiate binding to the service.", new Object[0]);
            h0.d.add(g0);
            final kgy m = new kgy(h0);
            h0.m = m;
            h0.g = true;
            if (!h0.a.bindService(h0.h, (ServiceConnection)m, 1)) {
                h0.b.l("Failed to bind to the service.", new Object[0]);
                h0.g = false;
                final Iterator iterator = h0.d.iterator();
                while (iterator.hasNext()) {
                    ((cdy)iterator.next()).b((Exception)new zzat());
                }
                h0.d.clear();
            }
        }
        else if (h0.g) {
            h0.b.l("Waiting to bind to the service.", new Object[0]);
            h0.d.add(g0);
        }
        else {
            g0.run();
        }
    }
}
