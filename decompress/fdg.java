import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdg implements Callable<udg<adg>>
{
    public final WeakReference D0;
    public final Context E0;
    public final int F0;
    public final String G0;
    
    public fdg(final WeakReference d0, final Context e0, final int f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() throws Exception {
        Context e0 = (Context)this.D0.get();
        if (e0 == null) {
            e0 = this.E0;
        }
        return cdg.e(e0, this.F0, this.G0);
    }
}
