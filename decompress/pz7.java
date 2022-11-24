import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pz7 implements bra<b4e<hy7$d, xz7$a>>
{
    public static b4e<hy7$d, xz7$a> a(final Resources resources, final jh7 jh7, final UserIdentifier userIdentifier, final znl<h08> znl) {
        final iz7 iz7 = (iz7)lp7.m0((Class)iz7.class);
        e0e.f((Object)resources, "resources");
        e0e.f((Object)jh7, "dmCardViewFactory");
        e0e.f((Object)userIdentifier, "currentUser");
        e0e.f((Object)znl, "pageViewIntentSubject");
        return (b4e<hy7$d, xz7$a>)new xz7(resources, jh7, userIdentifier, (stb)new ty7(znl));
    }
}
