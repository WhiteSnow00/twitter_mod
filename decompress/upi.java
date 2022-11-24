import java.util.Iterator;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class upi extends x0b
{
    public static final List<Integer> R0;
    public final long M0;
    public final UserIdentifier N0;
    public final tsc O0;
    public final kbv P0;
    public final ipv Q0;
    
    static {
        R0 = ojf.w((Object)7, (Object[])new Integer[] { 8, 9, 6 });
    }
    
    public upi(final Context context, final UserIdentifier n0, final long m0, final tsc o0, final kbv p6, final ipv q0) {
        super(context);
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = q0;
    }
    
    public final void m() {
        if (!"enabled".equalsIgnoreCase(ita.b().d("android_notifications_tab_urt_6030"))) {
            return;
        }
        final oxo t = ((sp1)kbv.d2(this.N0)).T();
        final String a = ttl.a(new String[] { ttl.b("data_type", (Object)8), ttl.g("type", (Iterable)upi.R0), ttl.b("data_id", (Object)this.M0), ttl.b("data_type_group", (Object)6) });
        final xmq c = ((rmq)t.f((Class)qss.class)).c();
        final ojf h = ojf.H();
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(a);
        ((lp1$a)zsl$a).o("type");
        Object o = c.e((zsl)((z4j)zsl$a).e());
        try {
            while (((j1m)o).moveToNext()) {
                h.p((Object)((qss$a)((j1m)o).a()).getType());
            }
            ((j1m)o).close();
            for (final int intValue : (List)((z4j)h).e()) {
                o = this.O0;
                final kbv p0 = this.P0;
                final vdq vdq = new vdq((Object)p0);
                final fxs$a fxs$a = new fxs$a();
                fxs$a.c = this.N0.getId();
                fxs$a.a = intValue;
                ((tsc)o).f((osc)new szi(super.I0, this.N0, intValue, 1, (jpv)new x98(new y98((pml)vdq, (fxs)((z4j)fxs$a).e(), 2, this.Q0)), p0));
            }
        }
        finally {
            if (o != null) {
                try {
                    ((j1m)o).close();
                }
                finally {
                    final Throwable t2;
                    final Throwable t3;
                    t2.addSuppressed(t3);
                }
            }
        }
    }
}
