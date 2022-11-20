import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f47 extends rn1
{
    public static final cba o1;
    public final mwh m1;
    public final long n1;
    
    static {
        o1 = (cba)aba.c("app", "twitter_service", "mute_keywords", "create");
    }
    
    public f47(final UserIdentifier userIdentifier, final String s, final mwh m1, final long n1) {
        super(userIdentifier, s);
        this.m1 = m1;
        this.n1 = n1;
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)f47.o1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/keywords/create.json", "/");
        ((tqc$a)mcv).d("keyword", this.m1.c);
        ((tqc$a)mcv).e("mute_surfaces", (Collection)this.m1.f);
        ((tqc$a)mcv).e("mute_options", (Collection)this.m1.g);
        final long n1 = this.n1;
        if (n1 == -1L) {
            ((tqc$a)mcv).d("duration", "");
        }
        else {
            ((tqc$a)mcv).c("duration", n1);
        }
        return ((tqc$a)mcv).k();
    }
}
