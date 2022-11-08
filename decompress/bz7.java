import com.twitter.util.user.UserIdentifier;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bz7 implements wqa<v3e<wx7$a, qx7.a>>
{
    public static v3e<wx7$a, qx7.a> a(final Resources resources, final UserIdentifier userIdentifier, final zml<dw7> zml, final zml<wz7> zml2) {
        final xy7 xy7 = (xy7)ca7.u((Class)xy7.class);
        zzd.f((Object)resources, "resources");
        zzd.f((Object)userIdentifier, "currentUser");
        zzd.f((Object)zml, "contentViewIntentSubject");
        zzd.f((Object)zml2, "pageViewIntentSubject");
        Object o;
        Object o2;
        if (poa.P()) {
            final dy7 dy7 = new dy7((zml)zml2);
            o = new ey7((zml)zml2);
            o2 = dy7;
        }
        else {
            o2 = new fy7((zml)zml);
            o = new gy7((zml)zml);
        }
        return new qx7(resources, userIdentifier, (rtb<? super wx7$a, oyv>)o2, (rtb<? super wx7$a, oyv>)o);
    }
}
