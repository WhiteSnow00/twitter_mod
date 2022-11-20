import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3w extends rn1
{
    public static final cba o1;
    public final mwh m1;
    public final Long n1;
    
    static {
        o1 = (cba)aba.c("app", "twitter_service", "mute_keywords", "update");
    }
    
    public l3w(final UserIdentifier userIdentifier, final String s, final mwh m1, final Long n1) {
        super(userIdentifier, s);
        this.m1 = m1;
        this.n1 = n1;
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)l3w.o1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/keywords/update.json", "/");
        ((tqc$a)mcv).d("id", this.m1.b);
        ((tqc$a)mcv).c("valid_from", this.m1.d);
        ((tqc$a)mcv).e("mute_surfaces", (Collection)this.m1.f);
        ((tqc$a)mcv).e("mute_options", (Collection)this.m1.g);
        final Long n1 = this.n1;
        if (n1 != null) {
            if (n1 == -1L) {
                ((tqc$a)mcv).d("duration", "");
            }
            else {
                ((tqc$a)mcv).c("duration", (long)this.n1);
            }
        }
        return ((tqc$a)mcv).k();
    }
}
