import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rk4 implements ksc$a<t9m>
{
    public final /* synthetic */ qk4 C0;
    
    public rk4(final qk4 c0) {
        this.C0 = c0;
    }
    
    public final void b(final cw0 cw0) {
        final t9m t9m = (t9m)cw0;
        final boolean b = t9m.p1 != null && t9m.o1;
        if (qk4.k(this.C0, (kmm)t9m) && b) {
            Objects.requireNonNull(this.C0);
            final String u = bgl.u(bgl.i(this.C0.D0.a), "user_similarities_list::user:replenish");
            final zf4 zf4 = new zf4(this.C0.K0);
            zf4.q(new String[] { u });
            saw.b((okm)zf4);
            final qk4 c0 = this.C0;
            c0.I0.e(3, (Bundle)null, (g3g$a)c0);
        }
        this.C0.n();
    }
}
