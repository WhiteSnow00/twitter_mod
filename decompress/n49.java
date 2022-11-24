import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import android.content.Context;
import android.net.Uri$Builder;
import java.util.Objects;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n49 implements rk6
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    
    public n49(final Object g0, final Object h0, final Object i0, final Object j0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void accept(Object value) {
        switch (this.F0) {
            default: {
                final z3g z3g = (z3g)this.G0;
                final nn nn = (nn)this.H0;
                final mdq mdq = (mdq)this.I0;
                final igt igt = (igt)this.J0;
                final xlw$a xlw$a = (xlw$a)value;
                if (xlw$a.a) {
                    z3g.a();
                }
                else {
                    z3g.b();
                }
                if (xlw$a.b) {
                    nn.b((otm)f07.H0, (Object)mdq.t0());
                    nn.a();
                }
                if (flr.g((CharSequence)xlw$a.c)) {
                    igt.a((CharSequence)xlw$a.c, 1);
                }
                return;
            }
            case 1: {
                final rri rri = (rri)this.G0;
                final UserIdentifier userIdentifier = (UserIdentifier)this.H0;
                final String s = (String)this.I0;
                final String s2 = (String)this.J0;
                final List list = (List)value;
                Objects.requireNonNull(rri);
                final Uri$Builder uri$Builder = new Uri$Builder();
                uri$Builder.scheme("notification").authority(m61.a);
                uri$Builder.appendQueryParameter("user_id", Long.toString(userIdentifier.getId()));
                final String string = uri$Builder.toString();
                for (final bti bti : list) {
                    if (dsi.Companion.f(userIdentifier)) {
                        rri.b.h(string, bti.c());
                    }
                    else {
                        rri.b.h(string, bti.a);
                    }
                }
                final erl g = rri.g;
                Objects.requireNonNull(g);
                e0e.f((Object)s, "conversationId");
                ((ihw)((vzr)g.a).get((Object)userIdentifier)).h(s);
                rri.i(userIdentifier, s2);
                return;
            }
            case 0: {
                final o49 o49 = (o49)this.G0;
                final Context context = (Context)this.H0;
                final de6 de6 = (de6)this.I0;
                final tsc tsc = (tsc)this.J0;
                final bti bti2 = (bti)value;
                Objects.requireNonNull(o49);
                final m38 a = h38.a(bti2.B);
                final nuh$a a2 = o49.a;
                final UserIdentifier b = bti2.B;
                if ((value = ((HashMap<K, Object>)a2).get(b)) == null) {
                    value = new zpm(context, bti2.B, a.v2(), a.s7(), a.M(), a.A(), a.T1());
                    ((Map<K, Object>)a2).put((K)b, value);
                }
                final zpm zpm = (zpm)value;
                final bbq w = zpm.a().w((rtb)new ky0((Object)zpm, 7));
                Objects.requireNonNull(tsc);
                de6.a(w.G((rk6)new iug((Object)tsc, 1), (rk6)lvb.e));
                tsc.f(new m1w(context, UserIdentifier.getCurrent(), a.L()));
            }
        }
    }
}
