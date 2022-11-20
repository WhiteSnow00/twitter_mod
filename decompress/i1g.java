import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i1g
{
    public final Context a;
    public final UserIdentifier b;
    public final g7k c;
    public final qbu d;
    
    public i1g(final Context a, final UserIdentifier b, final g7k c, final qbu d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static i1g a(final UserIdentifier userIdentifier) {
        return g4k.e(userIdentifier).w2();
    }
    
    public final boolean b() {
        return this.b.getId() > 0L && this.c.a(this.a, new String[] { "android.permission.READ_CONTACTS" }) && this.d();
    }
    
    public final boolean c() {
        final qbu d = this.d;
        boolean b = false;
        if (d.g("pref_contacts_live_sync_opt_in", 0) == 0) {
            b = true;
        }
        return b;
    }
    
    public final boolean d() {
        final qbu d = this.d;
        boolean b = false;
        if (d.g("pref_contacts_live_sync_opt_in", 0) == 2) {
            b = true;
        }
        return b;
    }
    
    public final void e(final int n) {
        this.d.i().g("pref_contacts_live_sync_opt_in", n).e();
        f3g.a(this.a).c(new Intent("action_live_sync_permission_change").putExtra("extra_live_sync_opt_in_state", n).putExtra("extra_user_id", this.b.getId()));
    }
}
