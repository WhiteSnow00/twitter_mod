import android.os.BaseBundle;
import java.util.Locale;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbw implements kyr<lbw>
{
    public UserIdentifier C0;
    public olw D0;
    
    public mbw(final UserIdentifier c0, final olw d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final Object get() {
        String format;
        if (this.D0.i() == 18) {
            final String string = ((BaseBundle)((zl1)this.D0).a).getString("follow_request_sender");
            if (pjr.g((CharSequence)string)) {
                format = String.format(Locale.ENGLISH, obw.i, string);
            }
            else {
                format = "(user_groups_g_flags & 4) DESC";
            }
        }
        else {
            format = null;
        }
        final lbw$a lbw$a = new lbw$a(this.C0);
        lbw$a.b = ((BaseBundle)((zl1)this.D0).a).getLong("tag", -1L);
        lbw$a.c = this.D0.i();
        lbw$a.d = format;
        return ((h4j)lbw$a).e();
    }
}
