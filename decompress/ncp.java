import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.graphics.Point;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncp extends ln1
{
    public final jvg J0;
    public final c2h K0;
    public int L0;
    public String M0;
    public final List<Integer> N0;
    public final List<kvj<String, String>> O0;
    public urj P0;
    public final trc Q0;
    public Point R0;
    public List<d2h> S0;
    
    public ncp(final Context context, final UserIdentifier userIdentifier, final jvg j0, final r1h r1h, final lba<ihl> lba, final List<Integer> list, final List<kvj<String, String>> o0, final c2h k0, final Point r0, final trc q0, final List<d2h> s0) {
        super(context, userIdentifier, r1h, (lba)lba);
        this.L0 = 0;
        final List x = rif.x((List)list);
        this.N0 = x;
        this.O0 = o0;
        this.J0 = j0;
        this.K0 = k0;
        this.R0 = r0;
        this.Q0 = q0;
        this.S0 = s0;
        cj1.b(x.isEmpty() ^ true);
    }
    
    public final void b() {
        super.b();
        final urj p0 = this.P0;
        jee.l((Object)p0);
        p0.b();
    }
    
    public final void e() {
        super.H0 = 2;
        this.h();
    }
    
    public final void h() {
        synchronized (this) {
            final urj p0 = new urj(super.D0, super.E0, this.J0, (r1h)new scn((Object)this, 7), super.F0, (int)this.N0.get(this.L0), (List)this.O0, this.K0, this.R0, this.Q0, (List)this.S0);
            this.P0 = p0;
            this.M0 = p0.i();
            this.P0.e();
        }
    }
}
