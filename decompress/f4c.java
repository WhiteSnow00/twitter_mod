import android.os.Handler;
import android.os.Looper;
import com.twitter.util.user.UserIdentifier;
import android.content.Intent;
import com.twitter.app.common.args.ContentViewArgs;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4c implements d4c
{
    public final on6 a;
    public final cn b;
    public final Context c;
    
    public f4c(final on6 a, final cn b, final Context c) {
        zzd.f((Object)a, "contentViewArgsIntentFactory");
        zzd.f((Object)b, "activityArgsIntentFactory");
        zzd.f((Object)c, "appContext");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final zm zm) {
        final int a = c4c.a;
        this.c(zm, new ebi(0, 3));
    }
    
    public final void b(final ContentViewArgs contentViewArgs) {
        final int a = c4c.a;
        zzd.f((Object)contentViewArgs, "args");
        this.d(contentViewArgs, new ebi(0, 3));
    }
    
    public final void c(final zm zm, final ebi ebi) {
        zzd.f((Object)zm, "args");
        final Intent a = this.b.a(this.c, zm);
        x3j.l(a, ebi);
        this.e(a);
    }
    
    public final <T extends ContentViewArgs> void d(final T t, final ebi ebi) {
        zzd.f((Object)t, "args");
        final Intent b = this.a.b(this.c, (ContentViewArgs)t, (UserIdentifier)null);
        x3j.l(b, ebi);
        this.e(b);
    }
    
    public final void e(final Intent intent) {
        if (ij1.k()) {
            this.c.startActivity(intent.addFlags(268435456));
        }
        else {
            new Handler(Looper.getMainLooper()).post((Runnable)new j01((Object)this, (Object)intent, 4));
        }
    }
}
