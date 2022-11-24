import android.content.res.Resources;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import com.twitter.ui.user.UserView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oib
{
    public static final a Companion;
    public final UserView a;
    public final ToggleTwitterButton b;
    public final hmu c;
    public final viw d;
    public final dsb e;
    public final dob f;
    public final Resources g;
    public final bxb h;
    public final nlq i;
    
    static {
        Companion = new a();
    }
    
    public oib(final UserView a, final ToggleTwitterButton b, final hmu c, final viw d, final dsb e, final dob f, final Resources g, final bxb h, final nlq i) {
        e0e.f((Object)c, "tweetFollowRepository");
        e0e.f((Object)d, "userRepository");
        e0e.f((Object)e, "friendshipCache");
        e0e.f((Object)g, "resources");
        e0e.f((Object)h, "galleryColorAnimator");
        e0e.f((Object)i, "softUserGate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static final class a
    {
    }
}
