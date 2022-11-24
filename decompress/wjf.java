import android.content.Intent;
import android.app.Activity;
import com.twitter.account.navigation.LoginArgs;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.notifications.settings.tweet.TweetSettingsContentViewArgs;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjf implements ara
{
    public final int a;
    public final Object b;
    
    public wjf(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a() {
        switch (this.a) {
            default: {
                return new lku(((s1g)cgw.a().c((Class)s1g.class)).u8(), (s4e)this.b);
            }
            case 2: {
                return lr0.a().a((Context)this.b, (ContentViewArgs)new TweetSettingsContentViewArgs());
            }
            case 1: {
                final Context context = (Context)this.b;
                Intent intent = lr0.a().a(context, (ContentViewArgs)new LoginArgs(false, (String)null, (String)null, false, (String)null, (wg8)null));
                if (context instanceof Activity) {
                    intent = LoginArgs.attachExtraIntent(intent, ((Activity)context).getIntent());
                }
                return intent;
            }
            case 0: {
                final Context context2 = (Context)this.b;
                final gn a = fn.a();
                final wnf$a wnf$a = new wnf$a();
                wnf$a.r();
                return a.a(context2, (cn)((z4j)wnf$a).e());
            }
        }
    }
}
