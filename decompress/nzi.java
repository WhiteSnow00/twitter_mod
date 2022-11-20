import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class nzi extends num
{
    public static final int o2 = 0;
    
    public final /* bridge */ xk1 h2() {
        return (xk1)this.t2();
    }
    
    public final /* bridge */ kjl m2() {
        return (kjl)this.t2();
    }
    
    @Override
    public final /* bridge */ oum n2() {
        return this.t2();
    }
    
    @Override
    public final void r2(final long n, final bo6 bo6, final boolean b) {
        ((Context)((Fragment)this).L0()).startService((Intent)((vl1)this.t2()).a.getParcelable("retweet_service_intent"));
        this.q2(0, n, bo6, b);
    }
    
    public final ozi t2() {
        return new ozi(((Fragment)this).J0);
    }
}
