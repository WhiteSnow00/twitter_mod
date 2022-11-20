import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.twitter.media.ui.image.UserImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8l
{
    public static final a Companion;
    public final Context a;
    public UserImageView b;
    public RelativeLayout c;
    public pd1 d;
    public i2b e;
    public final Resources f;
    
    static {
        Companion = new a();
    }
    
    public a8l(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
        this.f = a.getResources();
    }
    
    public final RelativeLayout a() {
        final RelativeLayout c = this.c;
        if (c != null) {
            return c;
        }
        czd.m("avatarContainer");
        throw null;
    }
    
    public final UserImageView b() {
        final UserImageView b = this.b;
        if (b != null) {
            return b;
        }
        czd.m("avatarView");
        throw null;
    }
    
    public static final class a
    {
    }
}
