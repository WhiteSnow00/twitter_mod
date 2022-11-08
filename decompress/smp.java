import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class smp extends i1v<pmi>
{
    public final swg i1;
    public final long j1;
    public final boolean k1;
    
    public smp(final UserIdentifier userIdentifier, final long j1, final swg i1, final boolean k1) {
        super(userIdentifier, 0);
        this.j1 = j1;
        this.i1 = i1;
        this.k1 = k1;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/amplify/marketplace/videos.json", "/");
        ((qrc.a)rbv).c("video_id", this.j1);
        ((qrc.a)rbv).f("monetize", this.i1.a);
        if (!this.i1.b.isEmpty()) {
            ((qrc.a)rbv).e("monetization_categorization", this.i1.b);
        }
        if (!this.i1.c.isEmpty()) {
            ((qrc.a)rbv).e("advertiser_blacklist", this.i1.c);
        }
        if (!this.i1.e.isEmpty()) {
            ((qrc.a)rbv).e("advertiser_whitelist", this.i1.e);
        }
        if (!this.i1.f.isEmpty()) {
            ((qrc.a)rbv).e("monetization_category_whitelist", this.i1.f);
        }
        if (this.k1) {
            if (!this.i1.g.isEmpty()) {
                ((qrc.a)rbv).e("ads_category_blacklist", this.i1.g);
            }
        }
        else if (!this.i1.d.isEmpty()) {
            ((qrc.a)rbv).e("monetization_category_blacklist", this.i1.d);
        }
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)new mhe();
    }
}
