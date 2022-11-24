import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3k
{
    public e3k(final Context context) {
        e0e.f((Object)context, "appContext");
        c4g.a(context).b(new a(), new IntentFilter("action_live_sync_permission_change"));
    }
    
    public static final class a extends BroadcastReceiver
    {
        public final void onReceive(final Context context, final Intent intent) {
            e0e.f((Object)context, "context");
            e0e.f((Object)intent, "intent");
            final int intExtra = intent.getIntExtra("extra_live_sync_opt_in_state", 0);
            final UserIdentifier a = UserIdentifier.Companion.a(intent.getLongExtra("extra_user_id", 0L));
            if (intExtra == 0) {
                gcu.Companion.b(a).i().f("people_discovery_has_collapsed_address_book_prompt", false).e();
            }
        }
    }
}
