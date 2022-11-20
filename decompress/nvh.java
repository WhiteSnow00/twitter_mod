import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvh extends qn1
{
    public static final cba o1;
    
    static {
        o1 = (cba)aba.c("app", "twitter_service", "mute_convo", "create");
    }
    
    public nvh(final Context context, final UserIdentifier userIdentifier, final long n, final long n2) {
        super(context, userIdentifier, n, n2, true, vav.c2(userIdentifier));
        ((a2p$a)((anm<Object, Object>)this).Y()).a.K0 = (bba)nvh.o1;
    }
    
    public final String o0() {
        return "/1.1/mutes/conversations/create.json";
    }
}
