import java.util.Map;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ji implements psb
{
    public final int D0;
    public final String E0;
    public final Object F0;
    public final Object G0;
    
    public ji(final Object f0, final Object g0, final String e0, final int d0) {
        this.D0 = d0;
        this.F0 = f0;
        this.G0 = g0;
        this.E0 = e0;
    }
    
    public final Object apply(final Object o) {
        switch (this.D0) {
            default: {
                final m34 m34 = (m34)this.F0;
                final byr byr = (byr)this.G0;
                final String e0 = this.E0;
                final List list = (List)o;
                return m34.W0.e(e0).doOnNext((lj6)new m9s((Object)byr, 28));
            }
            case 1: {
                final vn2 vn2 = (vn2)this.F0;
                final byr byr2 = (byr)this.G0;
                final String e2 = this.E0;
                final List list2 = (List)o;
                return vn2.R0.e(e2).doOnNext((lj6)new m9s((Object)byr2, 28));
            }
            case 0: {
                final ki ki = (ki)this.F0;
                final UserIdentifier a = (UserIdentifier)this.G0;
                final String e3 = this.E0;
                final iyi iyi = (iyi)o;
                Objects.requireNonNull(ki);
                final long c = iyi.c;
                final m4s a2 = hq1.a;
                Object v;
                if (c > System.currentTimeMillis()) {
                    v = eaq.v((Object)c);
                }
                else {
                    final brl a3 = ki.a;
                    final String a4 = iyi.a;
                    final Map b = iyi.b;
                    Objects.requireNonNull(a3);
                    final ep1$a$a ep1$a$a = new ep1$a$a();
                    ep1$a$a.a = a;
                    ep1$a$a.b = e3;
                    ep1$a$a.c = a4;
                    ep1$a$a.d = b;
                    final eaq r = ((ep1)a3).a.R((Object)((n4j)ep1$a$a).e());
                    final fjc r2 = fjc.R0;
                    Objects.requireNonNull(r);
                    v = new kbq((lcq)new cbq((lcq)new kbq((lcq)r, (psb)r2), (lj6)new d7f((Object)a, 11)), (psb)ivt.T0);
                }
                return v;
            }
        }
    }
}
