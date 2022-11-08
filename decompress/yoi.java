import java.util.Iterator;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yoi extends y0b
{
    public static final List<Integer> O0;
    public final long J0;
    public final UserIdentifier K0;
    public final psc L0;
    public final aav M0;
    public final ynv N0;
    
    static {
        O0 = ijf.w((Object)7, (Object[])new Integer[] { 8, 9, 6 });
    }
    
    public yoi(final Context context, final UserIdentifier k0, final long j0, final psc l0, final aav m0, final ynv n0) {
        super(context);
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
    }
    
    public final void m() {
        if (!"enabled".equalsIgnoreCase(dta.b().d("android_notifications_tab_urt_6030"))) {
            return;
        }
        final dwo t = ((rp1)aav.d2(this.K0)).T();
        final String a = tsl.a(new String[] { tsl.b("data_type", (Object)8), tsl.g("type", (Iterable)yoi.O0), tsl.b("data_id", (Object)this.J0), tsl.b("data_type_group", (Object)6) });
        final glq c = ((alq)t.f((Class)frs.class)).c();
        final ijf h = ijf.H();
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).s(a);
        ((jp1$a)zrl$a).o("type");
        Object o = c.e((zrl)((h4j)zrl$a).e());
        try {
            while (((j0m)o).moveToNext()) {
                h.p((Object)((frs$a)((j0m)o).a()).getType());
            }
            ((j0m)o).close();
            o = ((List)((h4j)h).e()).iterator();
            while (((Iterator)o).hasNext()) {
                final int intValue = (int)((Iterator)o).next();
                final psc l0 = this.L0;
                final aav m0 = this.M0;
                final hcq hcq = new hcq((Object)m0);
                final aws$a aws$a = new aws$a();
                aws$a.c = this.K0.getId();
                aws$a.a = intValue;
                l0.f((ksc)new zyi(super.F0, this.K0, intValue, 1, (znv)new k98(new aag((qll)hcq, (aws)((h4j)aws$a).e(), 2, this.N0)), m0));
            }
        }
        finally {
            if (o != null) {
                try {
                    ((j0m)o).close();
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
