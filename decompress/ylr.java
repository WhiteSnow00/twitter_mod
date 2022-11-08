import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ylr implements xq<wlr$c>
{
    public static final ylr a;
    public static final List<String> b;
    
    static {
        a = new ylr();
        b = tdy.v0((Object[])new String[] { "revue_account_id", "subscription_status" });
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final wlr$c wlr$c = (wlr$c)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)wlr$c, "value");
        qle.A1("revue_account_id");
        Objects.requireNonNull(w2j.Companion);
        bb7.a(w2j.a).a(qle, bb7, wlr$c.a);
        qle.A1("subscription_status");
        ar.b((xq<zvm>)awm.a).a(qle, bb7, wlr$c.b);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        String s = null;
        zvm zvm = null;
        while (true) {
            final int k3 = eie.k3((List)ylr.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    break;
                }
                zvm = ar.b((xq<zvm>)awm.a).b(eie, bb7);
            }
            else {
                Objects.requireNonNull(w2j.Companion);
                s = bb7.a(w2j.a).b(eie, bb7);
            }
        }
        zzd.c((Object)s);
        return new wlr$c(s, zvm);
    }
}
