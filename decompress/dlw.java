import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlw extends gue implements rtb<List<hfv>, oyv>
{
    public final /* synthetic */ clw C0;
    
    public dlw(final clw c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        zzd.e((Object)list, "users");
        final clw c0 = this.C0;
        for (final hfv hfv : list) {
            final reg<Long, clw.a> d = c0.d;
            final long c2 = hfv.C0;
            Boolean b;
            if ((b = hfv.A1) == null) {
                b = Boolean.FALSE;
            }
            zzd.e((Object)b, "it.hasNFTAvatar ?: false");
            ((HashMap<Long, clw.a>)d).put(Long.valueOf(c2), new clw.a(b));
        }
        return oyv.a;
    }
}
