import java.util.Collection;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klp extends llp
{
    public klp(final fa3 fa3, final UserIdentifier userIdentifier, final tsc tsc, final Collection collection, final ch4 ch4, final z5s z5s) {
        e0e.f((Object)userIdentifier, "owner");
        e0e.f((Object)tsc, "httpRequestController");
        e0e.f((Object)collection, "urls");
        super(fa3, userIdentifier, tsc, collection, ch4, z5s, true);
    }
}
