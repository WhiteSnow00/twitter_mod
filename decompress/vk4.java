import android.os.Bundle;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vk4 implements osc$a<vam>
{
    public final uk4 F0;
    
    public vk4(final uk4 f0) {
        this.F0 = f0;
    }
    
    public final void a(final aw0 aw0) {
    }
    
    public final void b(final aw0 aw0) {
        final vam vam = (vam)aw0;
        final boolean b = vam.s1 != null && vam.r1;
        if (uk4.k(this.F0, (pnm)vam) && b) {
            Objects.requireNonNull(this.F0);
            final String u = zgl.u(zgl.i(this.F0.G0.a), "user_similarities_list::user:replenish");
            final fg4 fg4 = new fg4(this.F0.N0);
            ((o1p)fg4).q(new String[] { u });
            sbw.b((tlm)fg4);
            final uk4 f0 = this.F0;
            f0.L0.e(3, (Bundle)null, (o3g$a)f0);
        }
        this.F0.n();
    }
    
    public final void c(final aw0 aw0, final boolean b) {
    }
}
