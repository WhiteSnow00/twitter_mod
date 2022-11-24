import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khg implements fa3
{
    public final int a;
    public final vhg b;
    
    public khg(final vhg b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final vhg b = this.b;
                final List list = (List)o;
                ((u9)b).F4().invalidate();
                return;
            }
            case 0: {
                final vhg b2 = this.b;
                final kni kni = (kni)o;
                if (!b2.j1.getBoolean("has_completed_signin_flow", false)) {
                    b2.j1.edit().putBoolean("has_completed_signin_flow", true).apply();
                }
                if (!b2.h2) {
                    final e39 h1 = b2.h1;
                    final UserIdentifier current = UserIdentifier.getCurrent();
                    final String x0 = db9.X0;
                    h1.c(t5j.create((t9j)new cb9(current)).subscribeOn(jxo.c()).observeOn(iqs.j()).subscribe((rk6)new vhd((Object)b2, 12)));
                }
                b2.t1.f(pbf.a.a);
                b2.B1.a.t();
            }
        }
    }
}
