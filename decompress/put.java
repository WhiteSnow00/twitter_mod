import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class put extends i1v<List<String>>
{
    public static final tba j1;
    public final out i1;
    
    static {
        j1 = (tba)rba.c("jobs", "tpm_id_sync", "", "");
    }
    
    public put(final UserIdentifier userIdentifier, final out i1) {
        super(userIdentifier, 0);
        this.i1 = i1;
        super.g1 = qbv.d;
        final int a = w4j.a;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.E0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/mob_idsync_generate.json", "/");
        ((qrc.a)rbv).c("user_id", super.P0.getId());
        final lq a2 = mp.a();
        if (a2 != null) {
            ((qrc.a)rbv).d("ad_id", a2.a);
        }
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<List<String>, pav> g0() {
        return (wsc<List<String>, pav>)f9g.e((Class)String.class);
    }
    
    @Override
    public final void m0(final tsc<List<String>, pav> tsc) {
        saw.b((okm)new zf4(nca.e((sba)put.j1, "failure")));
    }
    
    @Override
    public final void n0(final tsc<List<String>, pav> tsc) {
        final List list = (List)tsc.g;
        if (!hr4.t((Collection)list)) {
            this.i1.a.i().h("ids", (Object)list, (alp)new xq4$a(hx6.i)).e();
        }
        saw.b((okm)new zf4(nca.e((sba)put.j1, "success")));
    }
}
