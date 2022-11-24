import android.net.Uri;
import android.content.Intent;
import com.twitter.app.posttweetactions.ui.share.ShareSheetArgs;
import android.content.Context;
import com.twitter.app.posttweetactions.ui.contacts.PostTweetActionsModalSheetArgs;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhg implements fa3
{
    public final int a;
    public final vhg b;
    
    public lhg(final vhg b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.a) {
            default: {
                final vhg b = this.b;
                final cwu cwu = (cwu)o;
                final q9v m1 = b.M1;
                final int n = 1;
                m1.c(1);
                if (cwu instanceof cwu$e) {
                    final vg3 d = ((cwu$e)cwu).d;
                    if (d != null) {
                        final gwy z1 = b.Z1;
                        final long a = d.a(false);
                        Objects.requireNonNull(z1);
                        final usa a2 = zsk.a;
                        if (a2.c()) {
                            final rmv c = ita.c();
                            e0e.e((Object)c, "getCurrentMemoizing()");
                            if (c.f("android_post_tweet_actions_flow", 0) != 0) {
                                final rmv c2 = ita.c();
                                e0e.e((Object)c2, "getCurrentMemoizing()");
                                if (c2.f("android_post_tweet_actions_flow", 0) == 1) {
                                    if (((g2g)z1.c).b()) {
                                        ((gx8)z1.b).d((lw8)new PostTweetActionsModalSheetArgs(), (px8)px8$a.F0);
                                    }
                                    else {
                                        final Context context = (Context)z1.a;
                                        e0e.f((Object)context, "context");
                                        final dej.a a3 = new dej.a(context);
                                        final fds.a a4 = new fds.a();
                                        a4.p("contacts_live_sync");
                                        a3.d = (fds)a4.e();
                                        final Intent setFlags = ((dej)a3.e()).a().setFlags(335544320);
                                        e0e.e((Object)setFlags, "Builder(context)\n       \u2026.FLAG_ACTIVITY_CLEAR_TOP)");
                                        context.startActivity(setFlags);
                                    }
                                }
                                else {
                                    final rmv c3 = ita.c();
                                    e0e.e((Object)c3, "getCurrentMemoizing()");
                                    int n2;
                                    if (c3.f("android_post_tweet_actions_flow", 0) == 2) {
                                        n2 = n;
                                    }
                                    else {
                                        n2 = 0;
                                    }
                                    if (n2 != 0) {
                                        ((gx8)z1.b).d((lw8)new ShareSheetArgs(a), (px8)px8$a.F0);
                                    }
                                }
                                a2.b();
                            }
                        }
                    }
                }
                return;
            }
            case 0: {
                final vhg b2 = this.b;
                final h5h$a h5h$a = (h5h$a)o;
                final Uri y4 = b2.Y4();
                if (y4 != null) {
                    final int u = ((dtj)b2.d1).u(y4);
                    final ysj c4 = ((dtj)b2.d1).C(u);
                    if (c4 != null) {
                        b2.b5(u, c4);
                    }
                }
            }
        }
    }
}
