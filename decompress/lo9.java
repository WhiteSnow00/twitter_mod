import com.twitter.app.dm.DMConversationContentViewProvider$a;
import com.facebook.imagepipeline.request.a$c;
import java.util.Objects;
import com.facebook.imagepipeline.request.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lo9 implements rtb
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public lo9(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final Object apply(Object o) {
        final int f0 = this.F0;
        boolean b = true;
        switch (f0) {
            default: {
                final kbv kbv = (kbv)this.G0;
                final tn6 tn6 = (tn6)this.H0;
                final hp6 hp6 = (hp6)o;
                final gvs gvs = new gvs(kbv);
                final boolean b2 = gvs.p(hp6.D(), true, 1048576, tn6) > 0;
                if (gvs.p(hp6.F0.e1, true, 2097152, tn6) <= 0) {
                    b = false;
                }
                o = new yjh(hp6.D(), b2, true, true);
                if (b2 || b) {
                    tn6.b();
                }
                return o;
            }
            case 2: {
                final krb krb = (krb)this.G0;
                final Object h0 = this.H0;
                final a a = (a)o;
                Objects.requireNonNull(krb);
                return new jrb(a, h0, a$c.H0);
            }
            case 1: {
                final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)this.G0;
                final ja9 ja9 = (ja9)this.H0;
                final jx9 jx9 = (jx9)o;
                Objects.requireNonNull(dmConversationContentViewProvider$a);
                return ja9.a(new x99(jx9), dmConversationContentViewProvider$a.c.i1);
            }
            case 0: {
                final mo9 mo9 = (mo9)this.G0;
                final r9 r9 = (r9)this.H0;
                final mo9$a mo9$a = (mo9$a)o;
                final ccq ccq = new ccq((idq)((tnm<r9, Object, osc>)mo9.a).S(r9), (rk6)new kd1((Object)mo9, 10));
                final to9 c = mo9.c;
                Objects.requireNonNull(c);
                return ((bbq)new hcq((idq)ccq, (rtb)new ky0((Object)c, 1))).N();
            }
        }
    }
}
