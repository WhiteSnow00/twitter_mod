import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js8 extends rn1
{
    public static final cba n1;
    public final String[] m1;
    
    static {
        n1 = (cba)aba.c("app", "twitter_service", "mute_keywords", "destroy");
    }
    
    public js8(final UserIdentifier userIdentifier, final String s, final String[] m1) {
        super(userIdentifier, s);
        this.m1 = m1;
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)js8.n1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.G0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/keywords/destroy.json", "/");
        ((tqc$a)mcv).h("ids", this.m1);
        return ((tqc$a)mcv).k();
    }
}
