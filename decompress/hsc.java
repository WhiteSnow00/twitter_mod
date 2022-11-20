import android.os.BaseBundle;
import android.os.Bundle;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.ContentResolver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsc implements tue
{
    public final Context a;
    public final ContentResolver b;
    public final String c;
    
    public hsc(final Context a, final ContentResolver b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        return c0.b((tue)this, userIdentifier);
    }
    
    public final String b() {
        return "huawei";
    }
    
    public final int c(final tg1 tg1) {
        try {
            final Uri parse = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("package", this.a.getPackageName());
            ((BaseBundle)bundle).putString("class", this.c);
            ((BaseBundle)bundle).putInt("badgenumber", tg1.c);
            this.b.call(parse, "change_badge", (String)null, bundle);
            return 1;
        }
        catch (final Exception ex) {
            return 2;
        }
        catch (final IllegalArgumentException ex2) {
            return 3;
        }
    }
    
    public final String d() {
        return null;
    }
}
