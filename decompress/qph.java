import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qph
{
    public static void a(final Activity activity, final UserIdentifier c, final mbi<?> mbi, final String s) {
        if (c.isRegularUser()) {
            final t7w$a t7w$a = new t7w$a(((Context)activity).getResources());
            t7w$a.c = c;
            ((dj1.a)t7w$a).a.putExtra("moments_owner_id", c.getId());
            ((dj1.a)t7w$a).a.putExtra("moments_owner_username", s);
            mbi.d((zm)((h4j)t7w$a).e());
        }
        else {
            bl0.B("Trying to start a user guide without a valid userId");
        }
    }
}
