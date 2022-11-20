import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3r extends enm<List<String>, List<mph>, pph>
{
    public final UserIdentifier E0;
    
    public d3r(final UserIdentifier e0, final xbm xbm) {
        this.E0 = e0;
        xbm.i((oj)new dt1((Object)this, 18));
    }
    
    public final orc c(final Object o) {
        return (orc)new pph(this.E0, (List)o);
    }
    
    public final Object d(final orc orc) {
        final qph k1 = ((pph)orc).k1;
        Object o;
        if (k1 != null) {
            o = k1.a;
        }
        else {
            o = gdd.E0;
            final int a = c5j.a;
        }
        return o;
    }
}
