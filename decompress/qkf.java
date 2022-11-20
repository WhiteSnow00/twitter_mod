import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qkf extends rn1
{
    public static final cba m1;
    
    static {
        m1 = (cba)aba.c("app", "twitter_service", "mute_keywords", "list");
    }
    
    public qkf(final UserIdentifier userIdentifier, final String s) {
        super(userIdentifier, s);
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)qkf.m1;
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.F0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/mutes/keywords/list.json", "/");
        return ((tqc$a)mcv).k();
    }
}
