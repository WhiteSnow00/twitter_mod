import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkb implements Callable<hkb$a>
{
    public final String D0;
    public final Context E0;
    public final bkb F0;
    public final int G0;
    
    public dkb(final String d0, final Context e0, final bkb f0, final int g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() throws Exception {
        return hkb.b(this.D0, this.E0, this.F0, this.G0);
    }
}
