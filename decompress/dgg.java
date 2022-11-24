import android.os.Bundle;
import java.util.ArrayList;
import com.twitter.app.main.MainActivity;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgg implements vig
{
    public static final dgg a;
    
    static {
        a = new dgg();
    }
    
    public final void a(final Intent intent, final Context context, final UserIdentifier userIdentifier) {
        e0e.f((Object)intent, "startIntent");
        e0e.f((Object)context, "context");
        final int q1 = MainActivity.q1;
        final ArrayList list = new ArrayList();
        final Intent intent2 = new Intent(context, (Class)MainActivity.class);
        intent2.putExtra("AbsFragmentActivity_intent_origin", MainActivity.class.getName());
        intent2.putExtra("AbsFragmentActivity_account_user_identifier", userIdentifier.getId());
        list.add(intent2);
        list.add(intent);
        if (!list.isEmpty()) {
            final Intent[] array = list.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            final Object a = qo6.a;
            qo6$a.a(context, array, (Bundle)null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
