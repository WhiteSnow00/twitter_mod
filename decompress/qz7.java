import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qz7 implements bra<b4e<hy7$d, yz7$a>>
{
    public static b4e<hy7$d, yz7$a> a(final Resources resources, final UserIdentifier userIdentifier, final stb<hy7$d, vzv> stb) {
        final iz7 iz7 = (iz7)lp7.m0((Class)iz7.class);
        e0e.f((Object)resources, "resources");
        e0e.f((Object)userIdentifier, "currentUser");
        e0e.f((Object)stb, "clickAction");
        return (b4e<hy7$d, yz7$a>)new yz7(resources, userIdentifier, (stb)stb);
    }
}
