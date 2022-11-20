import java.util.Objects;
import android.net.Uri;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agg
{
    public final List<Uri> a;
    public final ufg b;
    public final a c;
    
    public agg(final xbm xbm, final ufg b, final a c) {
        this.a = rif.w((Object)mfg.a, (Object[])new Uri[] { mfg.e, mfg.b, mfg.d });
        this.b = b;
        this.c = c;
        final t19 subscribe = b.h().subscribe((lj6)new hoa(this, 11));
        Objects.requireNonNull(subscribe);
        xbm.i((oj)new szo(subscribe, 3));
    }
    
    public interface a
    {
        void D(final int p0);
    }
}
