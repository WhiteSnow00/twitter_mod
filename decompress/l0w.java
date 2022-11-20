import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l0w extends sn1
{
    public final Context l1;
    public final vav m1;
    
    public l0w(final Context l1, final UserIdentifier userIdentifier, final long n) {
        final vav c2 = vav.c2(userIdentifier);
        super(userIdentifier, n, (uil)null);
        this.l1 = l1;
        this.m1 = c2;
    }
    
    public l0w(final Context l1, final UserIdentifier userIdentifier, final long n, final uil uil) {
        final vav c2 = vav.c2(userIdentifier);
        super(userIdentifier, n, uil);
        this.l1 = l1;
        this.m1 = c2;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/users/destroy.json", "/");
        this.o0((tqc$a)mcv);
        return ((tqc$a)mcv).k();
    }
    
    public final void n0(final xrc<cgv, kbv> xrc) {
        final cgv cgv = (cgv)xrc.g;
        final nm6 z = ((anm)this).Z(this.l1);
        this.m1.o4(cgv.D0, 8192, z);
        final nus nus = new nus(vav.I2(((anm)this).Q0));
        final mws$a mws$a = new mws$a();
        mws$a.a = 43;
        mws$a.c = ((anm)this).Q0.getId();
        nus.f((mws)((n4j)mws$a).e(), (Iterable)rif.v((Object)cgv.e()));
        z.b();
        ((BaseBundle)xrc.a).putString("muted_username", cgv.K0);
    }
}
