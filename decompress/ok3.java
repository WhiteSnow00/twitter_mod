import com.twitter.util.user.UserIdentifier;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ok3 extends i1v<tj3>
{
    public final Uri i1;
    public final String j1;
    public final String k1;
    public final long l1;
    public tj3 m1;
    
    public ok3(final UserIdentifier userIdentifier, final long l1, final String j1, final String k1) {
        super(userIdentifier, 0);
        final int f = dta.b().f("card_compose_preview_retry_max", 2);
        final long h = dta.b().h("card_compose_preview_retry_timeout_ms", 30000L);
        ((cw0)this).I();
        ((cw0)this).G((ysm)new uj8(f));
        ((cw0)this).G((ysm)new kog(1));
        ((cw0)this).G((ysm)new ok3.ok3$a(f, h));
        this.l1 = l1;
        this.j1 = j1;
        this.k1 = k1;
        final Uri parse = Uri.parse(dta.b().l("card_compose_preview_url", "https://caps.twitter.com/v2/cards/preview.json"));
        this.i1 = parse;
        final String authority = parse.getAuthority();
        pf8.r(authority);
        super.g1 = new vrc(authority, true);
        final int a = w4j.a;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        final String path = this.i1.getPath();
        pf8.r(path);
        ((qrc.a)rbv).m(path);
        rbv.p();
        final String j1 = this.j1;
        if (j1 != null) {
            ((qrc.a)rbv).d("status", j1);
            ((qrc.a)rbv).e = xrc$b.F0;
            final int a = w4j.a;
        }
        final String k1 = this.k1;
        if (k1 != null) {
            ((qrc.a)rbv).d("card_uri", k1);
            ((qrc.a)rbv).e = xrc$b.E0;
            final int a2 = w4j.a;
        }
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<tj3, pav> g0() {
        return (wsc<tj3, pav>)new pdv(102);
    }
    
    public final void j(final ism<tsc<tj3, pav>> ism) {
        super.U0 = false;
        cag.a("CardPreview", "Retry scheduled");
    }
    
    @Override
    public final void n0(final tsc<tj3, pav> tsc) {
        this.m1 = (tj3)tsc.g;
    }
}
