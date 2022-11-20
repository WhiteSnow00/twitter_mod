import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vph
{
    public static void a(final Activity activity, final UserIdentifier c, final obi<?> obi, final String s) {
        if (c.isRegularUser()) {
            final c8w$a c8w$a = new c8w$a(((Context)activity).getResources());
            c8w$a.c = c;
            ((xi1.a)c8w$a).a.putExtra("moments_owner_id", c.getId());
            ((xi1.a)c8w$a).a.putExtra("moments_owner_username", s);
            obi.d((ym)((n4j)c8w$a).e());
        }
        else {
            mw.B("Trying to start a user guide without a valid userId");
        }
    }
}
