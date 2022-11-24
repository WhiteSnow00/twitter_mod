import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4w extends yn1
{
    public static final jca q1;
    public final cxh o1;
    public final Long p1;
    
    static {
        q1 = (jca)hca.c("app", "twitter_service", "mute_keywords", "update");
    }
    
    public a4w(final UserIdentifier userIdentifier, final String s, final cxh o1, final Long p4) {
        super(userIdentifier, s);
        this.o1 = o1;
        this.p1 = p4;
        ((v2p$a)((pnm)this).Y()).a.M0 = (ica)a4w.q1;
    }
    
    public final trc f0() {
        final adv adv = new adv();
        adv.e = asc$b.I0;
        final int a = o5j.a;
        adv.n("/1.1/mutes/keywords/update.json", "/");
        adv.d("id", this.o1.b);
        adv.c("valid_from", this.o1.d);
        adv.e("mute_surfaces", (Collection)this.o1.f);
        adv.e("mute_options", (Collection)this.o1.g);
        final Long p1 = this.p1;
        if (p1 != null) {
            if (p1 == -1L) {
                adv.d("duration", "");
            }
            else {
                adv.c("duration", (long)this.p1);
            }
        }
        return adv.k();
    }
}
