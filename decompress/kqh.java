import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqh
{
    public static void a(final Activity activity, final UserIdentifier c, final fci<?> fci, final String s) {
        if (c.isRegularUser()) {
            final r8w$a r8w$a = new r8w$a(((Context)activity).getResources());
            r8w$a.c = c;
            ((aj1.a)r8w$a).a.putExtra("moments_owner_id", c.getId());
            ((aj1.a)r8w$a).a.putExtra("moments_owner_username", s);
            fci.d((cn)((z4j)r8w$a).e());
        }
        else {
            w9.w("Trying to start a user guide without a valid userId");
        }
    }
}
