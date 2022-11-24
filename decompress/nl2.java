import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nl2 extends tnm<nl2.nl2$a, j2c, i2c>
{
    public final kfw G0;
    public final vf2 H0;
    public final di2 I0;
    
    public nl2(final kfw g0, final vf2 h0, final di2 i0, final tsc tsc) {
        super(tsc);
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final osc c(final Object o) {
        final nl2.nl2$a nl2$a = (nl2.nl2$a)o;
        fj1.b(kr4.t(nl2$a.a) ^ true);
        final UserIdentifier b = this.G0.b();
        final Collection a = nl2$a.a;
        vmw.g((Object)a);
        return (osc)new i2c(b, a, nl2$a.b);
    }
    
    @Override
    public final Object d(final osc osc) {
        final i2c i2c = (i2c)osc;
        final j2c n1 = i2c.n1;
        j2c j2c;
        if (n1 == null) {
            j2c = new j2c((Map)Collections.emptyMap(), (Map)Collections.emptyMap());
        }
        else {
            final Map a = n1.a;
            final boolean m1 = i2c.m1;
            for (final Map.Entry<K, noj> entry : a.entrySet()) {
                if (entry.getValue().f()) {
                    ((m4e)this.H0).i((String)entry.getKey(), (Object)entry.getValue().c());
                }
                if (m1) {
                    ((hre)this.I0).remove((Object)entry.getKey());
                }
            }
            final Iterator iterator2 = n1.b.entrySet().iterator();
            while (true) {
                j2c = n1;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Map.Entry<String, V> entry2 = (Map.Entry<String, V>)iterator2.next();
                ((hre)this.I0).put((Object)entry2.getKey(), (Object)entry2.getValue());
            }
        }
        return j2c;
    }
}
