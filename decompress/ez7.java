import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ez7 implements wqa<v3e<wx7$d, mz7$a>>
{
    public static v3e<wx7$d, mz7$a> a(final Resources resources, final ah7 ah7, final UserIdentifier userIdentifier, final zml<wz7> zml) {
        final xy7 xy7 = (xy7)ca7.u((Class)xy7.class);
        zzd.f((Object)resources, "resources");
        zzd.f((Object)ah7, "dmCardViewFactory");
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)zml, "pageViewIntentSubject");
        return new mz7(resources, ah7, userIdentifier, (rtb<? super wx7$d, oyv>)new iy7(zml));
    }
}
