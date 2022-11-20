import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewh extends sn1
{
    public static final cba n1;
    public final Context l1;
    public final vav m1;
    
    static {
        n1 = (cba)aba.c("app", "twitter_service", "mute_user", "create");
    }
    
    public ewh(final Context l1, final UserIdentifier userIdentifier, final long n, final vav m1, final uil uil) {
        super(userIdentifier, n, uil);
        this.l1 = l1;
        this.m1 = m1;
        ((wv0<Object>)this).G((qtm<Object>)new mdi());
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)ewh.n1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/users/create.json", "/");
        this.o0((tqc$a)mcv);
        return ((tqc$a)mcv).k();
    }
    
    public final void n0(final xrc<cgv, kbv> xrc) {
        final cgv cgv = (cgv)xrc.g;
        jee.l((Object)cgv);
        final nm6 z = ((anm)this).Z(this.l1);
        this.m1.j4(cgv.D0, 8192, z);
        final nus nus = new nus(vav.I2(((anm)this).Q0));
        final mws$a mws$a = new mws$a();
        mws$a.c = ((anm)this).Q0.getId();
        mws$a.a = 43;
        nus.d((mws)((n4j)mws$a).e(), z);
        final vav m1 = this.m1;
        final long id = ((anm)this).Q0.getId();
        final long d0 = cgv.D0;
        final boolean d2 = chw.d0(cgv.I1);
        final lzr g2 = ((ok1)m1).G2();
        g2.G0();
        final String value = String.valueOf(d0);
        try {
            String s = itl.a(new String[] { itl.b("owner_id", (Object)String.valueOf(id)), itl.q(new String[] { itl.b("author_id", (Object)value), itl.b("sender_id", (Object)value) }) });
            if (d2) {
                s = itl.a(new String[] { s, itl.n("type", (Object)6) });
            }
            m1.U0(g2, s, z);
            g2.z();
            g2.A();
            z.b();
            ((BaseBundle)xrc.a).putString("muted_username", cgv.K0);
        }
        finally {
            g2.A();
        }
    }
}
