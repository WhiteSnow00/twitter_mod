import java.util.Arrays;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzv extends gue implements rtb<pnv, oyv>
{
    public final /* synthetic */ hn6 C0;
    
    public gzv(final hn6 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pnv pnv = (pnv)o;
        final hn6 c0 = this.C0;
        final Uri[] e = gfv.e;
        c0.a((Uri[])Arrays.copyOf(e, e.length));
        this.C0.b();
        return oyv.a;
    }
}
