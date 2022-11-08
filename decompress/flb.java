import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flb implements Callable<jlb.a>
{
    public final /* synthetic */ String C0;
    public final /* synthetic */ Context D0;
    public final /* synthetic */ dlb E0;
    public final /* synthetic */ int F0;
    
    public flb(final String c0, final Context d0, final dlb e0, final int f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        return jlb.b(this.C0, this.D0, this.E0, this.F0);
    }
}
