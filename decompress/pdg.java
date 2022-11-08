import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdg implements Callable<eeg<kdg>>
{
    public final /* synthetic */ WeakReference C0;
    public final /* synthetic */ Context D0;
    public final /* synthetic */ int E0;
    public final /* synthetic */ String F0;
    
    public pdg(final WeakReference c0, final Context d0, final int e0, final String f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        Context d0 = (Context)this.C0.get();
        if (d0 == null) {
            d0 = this.D0;
        }
        return mdg.e(d0, this.E0, this.F0);
    }
}
