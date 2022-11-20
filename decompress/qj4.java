import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qj4 implements orc$a<iam>
{
    public final pj4 D0;
    
    public qj4(final pj4 d0) {
        this.D0 = d0;
    }
    
    public final void a(final wv0 wv0) {
    }
    
    public final void b(final wv0 wv0) {
        final iam iam = (iam)wv0;
        final boolean b = iam.q1 != null && iam.p1;
        if (pj4.k(this.D0, (anm)iam) && b) {
            Objects.requireNonNull(this.D0);
            final String u = ngl.u(ngl.i(this.D0.E0.a), "user_similarities_list::user:replenish");
            final af4 af4 = new af4(this.D0.L0);
            ((u0p)af4).q(new String[] { u });
            cbw.b((elm)af4);
            final pj4 d0 = this.D0;
            d0.J0.e(3, null, (r2g$a<Object>)d0);
        }
        this.D0.n();
    }
    
    public final void c(final wv0 wv0, final boolean b) {
    }
}
