import tv.periscope.model.b;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Map;
import tv.periscope.model.NarrowcastSpaceType$None;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5n extends gue implements rtb<f6n, f6n>
{
    public final /* synthetic */ gqn C0;
    public final /* synthetic */ dah D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ List<AudioSpaceTopicItem> F0;
    public final /* synthetic */ boolean G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ boolean I0;
    public final /* synthetic */ boolean J0;
    public final /* synthetic */ boolean K0;
    
    public q5n(final gqn c0, final dah d0, final boolean e0, final List<AudioSpaceTopicItem> f0, final boolean g0, final int h0, final boolean i0, final boolean j0, final boolean k0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "$this$setState");
        final gqn c0 = this.C0;
        final qh6 d = c0.d;
        final boolean x = c0.x;
        final b e = c0.e;
        elu v = null;
        String s;
        if (e == null || (s = e.w()) == null) {
            final v21 f = this.C0.f;
            if (f != null) {
                s = f.h;
            }
            else {
                s = null;
            }
        }
        final gqn c2 = this.C0;
        final v21 f2 = c2.f;
        Long l;
        if (f2 != null) {
            l = f2.l;
        }
        else {
            l = null;
        }
        final hqn u = c2.u;
        final boolean b = c2.w == f0r.E0 && !tdy.V(c2);
        final gqn c3 = this.C0;
        final boolean b2 = c3.v == pf3.C0;
        final v21 f3 = c3.f;
        String f4;
        if (f3 != null) {
            f4 = f3.f;
        }
        else {
            f4 = null;
        }
        final String z = c3.z;
        final Boolean a = c3.A;
        final boolean b3 = a != null && a;
        final boolean v2 = tdy.V(this.C0);
        final gqn c4 = this.C0;
        final h9w f5 = c4.F;
        final boolean b4 = f6n.C == h9w.C0 && f5 == h9w.H0;
        final v21 f6 = c4.f;
        Long i;
        if (f6 != null) {
            i = f6.I;
        }
        else {
            i = null;
        }
        final boolean b5 = f6 != null && f6.J;
        Object o2;
        if (f6 == null || (o2 = f6.T) == null) {
            o2 = NarrowcastSpaceType$None.INSTANCE;
        }
        if (f6 != null) {
            v = f6.V;
        }
        return f6n.l(f6n, false, d, this.D0, x, null, null, s, l, f4, b, null, u, false, null, b2, b3, z, null, 0, null, null, null, null, null, null, this.E0, v2, f5, b4, false, false, false, false, false, this.F0, i, this.G0, b5, 0, false, (NarrowcastSpaceType)o2, false, this.H0, this.I0, this.J0, false, false, false, false, v, f6 != null && f6.W, this.K0, -1006868381, 2344327);
    }
}
