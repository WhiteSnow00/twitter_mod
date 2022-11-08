import com.twitter.util.user.UserIdentifier;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsk
{
    public static final psa a;
    
    static {
        a = new psa("pref_post_tweet_actions_fatigue", 2, TimeUnit.DAYS.toMillis(30L), UserIdentifier.Companion.c());
    }
}
