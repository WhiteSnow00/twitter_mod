import java.util.Iterator;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpi extends vza
{
    public static final List<Integer> P0;
    public final long K0;
    public final UserIdentifier L0;
    public final trc M0;
    public final vav N0;
    public final xov O0;
    
    static {
        P0 = rif.w((Object)7, (Object[])new Integer[] { 8, 9, 6 });
    }
    
    public dpi(final Context context, final UserIdentifier l0, final long k0, final trc m0, final vav n0, final xov o0) {
        super(context);
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
    }
    
    public final void m() {
        if (!"enabled".equalsIgnoreCase(asa.b().d("android_notifications_tab_urt_6030"))) {
            return;
        }
        final two t = ((np1)vav.c2(this.L0)).T();
        final String a = itl.a(new String[] { itl.b("data_type", (Object)8), itl.g("type", (Iterable)dpi.P0), itl.b("data_id", (Object)this.K0), itl.b("data_type_group", (Object)6) });
        final amq c = ((ulq)t.f((Class)wrs.class)).c();
        final rif h = rif.H();
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).s(a);
        ((fp1$a)osl$a).o("type");
        Object o = c.e((osl)((n4j)osl$a).e());
        try {
            while (((y0m)o).moveToNext()) {
                h.p((Object)((wrs$a)((y0m)o).a()).getType());
            }
            ((y0m)o).close();
            for (final int intValue : (List)((n4j)h).e()) {
                final trc m0 = this.M0;
                o = this.N0;
                final ycq ycq = new ycq(o);
                final mws$a mws$a = new mws$a();
                mws$a.c = this.L0.getId();
                mws$a.a = intValue;
                m0.f((orc)new fzi(super.G0, this.L0, intValue, 1, (yov)new u88(new a10((dml)ycq, (mws)((n4j)mws$a).e(), 2, this.O0)), (vav)o));
            }
        }
        finally {
            if (o != null) {
                try {
                    ((y0m)o).close();
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
