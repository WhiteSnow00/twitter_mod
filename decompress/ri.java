import com.twitter.navigation.settings.AccessibilityViewArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.settings.LocationInformationSettingsViewArgs;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ri implements spa
{
    public final int a;
    public final Context b;
    
    public ri(final Context b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        switch (this.a) {
            default: {
                final Context b = this.b;
                czd.f((Object)b, "$context");
                return tm6.Companion.a().x8().a(b, (ContentViewArgs)LocationInformationSettingsViewArgs.INSTANCE);
            }
            case 1: {
                return i81.a().a(this.b, (ContentViewArgs)AccessibilityViewArgs.INSTANCE);
            }
            case 0: {
                return an.a().a(this.b, new gvx());
            }
        }
    }
}
