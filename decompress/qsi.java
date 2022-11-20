import android.os.Parcelable;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import com.twitter.util.user.UserIdentifier;
import java.util.Random;
import android.net.Uri;
import java.util.Objects;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qsi
{
    public final Context a;
    public final Intent b;
    public int c;
    
    public qsi(final Context a, final String action, final lsi lsi) {
        this.c = 0;
        this.a = a;
        final int a2 = kpi.a;
        Objects.requireNonNull(lpi.Companion);
        dwj.c(this.b = ((lpi)((b5j)cr0.Companion.a()).B((Class)lpi.class)).h8().setAction(action).setData(Uri.withAppendedPath(bgv$l.a, String.valueOf(lsi.a))).putExtra("sb_account_id", lsi.B.getId()), "notification_info", (Object)lsi, (rlp)lsi.Z);
        final UserIdentifier b = lsi.B;
        if (p0f.m(nri.Companion, b, "userIdentifier", b, "android_create_unique_notification_intents", false)) {
            this.c = new Random().nextInt();
        }
    }
    
    public final PendingIntent a() {
        int n;
        if (Build$VERSION.SDK_INT >= 31) {
            n = 301989888;
        }
        else {
            n = 268435456;
        }
        return this.b(n);
    }
    
    public final PendingIntent b(final int n) {
        return PendingIntent.getService(this.a, this.c, new Intent(this.b), n);
    }
    
    public final qsi c(final int n, final String s) {
        if (n != 0 && ikr.g((CharSequence)s)) {
            this.b.putExtra("undo_allowed", true);
            this.b.putExtra("undo_icon", n);
            this.b.putExtra("undo_text", s);
        }
        return this;
    }
    
    public final qsi d(final PendingIntent pendingIntent) {
        this.b.putExtra("action_intent", (Parcelable)pendingIntent);
        return this;
    }
    
    public final qsi e(final dui dui, final dui dui2) {
        final Intent b = this.b;
        final dui$b b2 = dui$b.b;
        dwj.c(b, "extra_scribe_info", (Object)dui, (rlp)b2);
        dwj.c(this.b, "extra_scribe_info_background", (Object)dui2, (rlp)b2);
        return this;
    }
}
