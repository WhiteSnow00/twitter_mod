import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ttk extends o3m
{
    public static final ttk.ttk$a Companion;
    public final stk k;
    
    static {
        Companion = new ttk.ttk$a();
    }
    
    public ttk(final u93<o3m> u93, final Context context, final UserIdentifier userIdentifier, final psc psc, final stk k) {
        super((u93)u93, context, userIdentifier, psc);
        this.k = k;
        final boolean g = pjr.g((CharSequence)((ulp)k).a);
        boolean b2;
        final boolean b = b2 = false;
        if (g) {
            b2 = b;
            if (pjr.g((CharSequence)k.c)) {
                b2 = b;
                if (!k.d.isEmpty()) {
                    b2 = b;
                    if (k.d.get(0).a()) {
                        b2 = true;
                    }
                }
            }
        }
        ij1.b(b2);
    }
    
    public final xjp a() {
        ij1.b(super.d == null);
        final List u0 = tdy.u0((Object)this.k.c);
        final List d = this.k.d;
        zzd.e((Object)d, "recommendation.candidates");
        final ArrayList list = new ArrayList<String>(kr4.h1((Iterable)d, 10));
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            list.add(((lg3)iterator.next()).b);
        }
        return new xjp((u93)new fpa(this, 17), super.b, super.c, (Collection)tdy.P0((Iterable)or4.X1((Collection)u0, (Iterable)list)), wg4.v1, (m4s)m4s.a);
    }
    
    public final boolean c(final String s) {
        final boolean g = pjr.g((CharSequence)s);
        boolean b = false;
        if (g) {
            final String c = this.k.c;
            zzd.e((Object)c, "recommendation.controlMeasurementUrl");
            b = b;
            if (gkr.o1((CharSequence)s, (CharSequence)c, false)) {
                b = true;
            }
        }
        return b;
    }
    
    public final void d(final xrc<?, ?> xrc, final lg3 lg3, final nca nca) {
        zzd.f((Object)nca, "event");
        for (final Map.Entry<String, V> entry : lg3.c.entrySet()) {
            final String s = entry.getKey();
            if (s != null) {
                xrc.a(s, (String)entry.getValue());
            }
        }
        xrc.a("result", nca.e);
    }
}
