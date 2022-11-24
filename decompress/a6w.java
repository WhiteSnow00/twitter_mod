import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.UriMatcher;
import com.twitter.android.BackupCodeActivity;
import android.os.Bundle;
import com.twitter.login.api.PasswordResetArgs;
import com.twitter.app.users.WhoToFollowUsersTimelineActivity;
import com.twitter.ads.AdsCompanionContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.login.api.WebauthnArgs;
import android.net.Uri$Builder;
import com.twitter.android.settings.ContentPreferencesSettingsActivity;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.account.navigation.LoginArgs;
import java.util.Objects;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a6w implements z5w
{
    public final m7f a;
    public final td8 b;
    public final k6w c;
    public final k7f d;
    public final uh4 e;
    public final zgv f;
    public final mlq g;
    
    public a6w(final m7f a, final td8 b, final k6w c, final k7f d, final uh4 e, final zgv f, final mlq g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final boolean a(final Uri uri) {
        return this.a.k(uri) || this.b.a(uri);
    }
    
    public final void b(final Activity activity) {
        final Uri data = activity.getIntent().getData();
        final boolean shutdown = this.e.isShutdown();
        Intent a = null;
        final String s = null;
        if (shutdown) {
            final uh4 e = this.e;
            String string = s;
            if (data != null) {
                string = data.toString();
            }
            e.a(string);
        }
        else if (data != null) {
            final boolean a2 = this.f.m().a();
            int n = 0;
            if (a2) {
                final mlq g = this.g;
                final int a3 = g.c.a(data, false).a;
                if (a3 != -1) {
                    final slq slq = g.a.get(a3);
                    final qlq b = g.b;
                    slq g2;
                    if ((g2 = slq) == null) {
                        g2 = slq.G0;
                    }
                    a = b.a((Context)activity, g2);
                }
                n = n;
                if (a != null) {
                    activity.startActivity(a);
                    n = 1;
                }
            }
            if (n != 0) {
                return;
            }
            this.c(activity, data);
        }
    }
    
    public final void c(final Activity activity, Uri ex) {
        final Uri z = p6w.z((Uri)ex);
        final String stringExtra = activity.getIntent().getStringExtra("shortcut");
        if (flr.g((CharSequence)stringExtra)) {
            sbw.b((tlm)new fg4(new String[] { c0e.h("app:url_interpreter:shortcut:", stringExtra, ":open") }));
        }
        ex = (PackageManager$NameNotFoundException)((Uri)ex).getQueryParameter("app_action");
        if (!flr.e((CharSequence)ex)) {
            sbw.b((tlm)new fg4(new String[] { c0e.h("assistant:deep_link:", (String)ex, "::open") }));
        }
        if (this.c.a(z, (k6w.a)new p5w((Object)this, (Object)activity))) {
            return;
        }
        if (this.b.a(z)) {
            this.b.b(activity);
            return;
        }
        final m7f a = this.a;
        final qdw m = a.a.m();
        final UserIdentifier k = m.k();
        final boolean p = m.p();
        final List pathSegments = z.getPathSegments();
        ex = (PackageManager$NameNotFoundException)((gr1)a.b).a(z, false);
        final int a2 = ((gr1$a)ex).a;
        Objects.requireNonNull(a.f);
        if (((gr1$a)ex).a != -1) {
            po.b().a();
            if (jba.t("scribe_deprecation_sample_size", nso.g).b()) {
                final ufv ufv = new ufv();
                ufv.k = ((gr1$a)ex).b;
                final StringBuilder f = ehk.f("Matched against code ");
                f.append(((gr1$a)ex).a);
                f.append(" pattern ");
                f.append(((gr1$a)ex).b);
                ufv.v = f.toString();
                final int g = lb0.G(((gr1$a)ex).c);
                if (g != 1) {
                    if (g != 2) {
                        ex = null;
                    }
                    else {
                        ex = (PackageManager$NameNotFoundException)new fg4(i7f.b);
                    }
                }
                else {
                    ex = (PackageManager$NameNotFoundException)new fg4(i7f.a);
                }
                if (ex != null) {
                    ((fg4)ex).D(ojf.v((Object)ufv));
                    nda.a().b(k, (tlm)ex);
                }
            }
        }
    Label_2774_Outer:
        while (true) {
            if (!p && !m7f.l.contains(a2)) {
                ex = (PackageManager$NameNotFoundException)LoginArgs.attachExtraIntent(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)null, (String)null, false, (String)null, (wg8)null)), activity.getIntent());
                break Label_5377;
            }
            Label_5272: {
                if (a2 == 50) {
                    break Label_5272;
                }
                Label_5119: {
                    if (a2 == 51) {
                        break Label_5119;
                    }
                    Label_5104: {
                        if (a2 == 62) {
                            break Label_5104;
                        }
                        Label_5089: {
                            if (a2 == 63) {
                                break Label_5089;
                            }
                            Label_5086: {
                                if (a2 == 72 || a2 == 73) {
                                    break Label_5086;
                                }
                                Label_4994: {
                                    if (a2 == 115) {
                                        break Label_4994;
                                    }
                                    Label_4982: {
                                        if (a2 == 116) {
                                            break Label_4982;
                                        }
                                        Label_4924: {
                                            if (a2 == 124) {
                                                break Label_4924;
                                            }
                                            Label_4910: {
                                                if (a2 == 125) {
                                                    break Label_4910;
                                                }
                                                Label_4883: {
                                                    if (a2 == 139) {
                                                        break Label_4883;
                                                    }
                                                    Label_4817: {
                                                        if (a2 == 140) {
                                                            break Label_4817;
                                                        }
                                                        Label_4768: {
                                                            if (a2 == 156) {
                                                                break Label_4768;
                                                            }
                                                            Label_4676: {
                                                                if (a2 == 157) {
                                                                    break Label_4676;
                                                                }
                                                            Label_4294_Outer:
                                                                while (true) {
                                                                    Label_4264: {
                                                                        Label_4251: {
                                                                            switch (a2) {
                                                                                default: {
                                                                                    ex = (PackageManager$NameNotFoundException)"";
                                                                                    Label_3784: {
                                                                                        switch (a2) {
                                                                                            default: {
                                                                                                switch (a2) {
                                                                                                    default: {
                                                                                                        switch (a2) {
                                                                                                            default: {
                                                                                                                switch (a2) {
                                                                                                                    default: {
                                                                                                                        switch (a2) {
                                                                                                                            default: {
                                                                                                                                switch (a2) {
                                                                                                                                    default: {
                                                                                                                                        switch (a2) {
                                                                                                                                            default: {
                                                                                                                                                switch (a2) {
                                                                                                                                                    default: {
                                                                                                                                                        switch (a2) {
                                                                                                                                                            default: {
                                                                                                                                                                switch (a2) {
                                                                                                                                                                    default: {
                                                                                                                                                                        switch (a2) {
                                                                                                                                                                            default: {
                                                                                                                                                                                if (p6w.x(z) && (pathSegments == null || pathSegments.isEmpty())) {
                                                                                                                                                                                    break Label_4294_Outer;
                                                                                                                                                                                }
                                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            case 78: {
                                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            case 77: {
                                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            case 76: {
                                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    case 57: {
                                                                                                                                                                        break Label_4251;
                                                                                                                                                                    }
                                                                                                                                                                    case 56: {
                                                                                                                                                                        break Label_4251;
                                                                                                                                                                    }
                                                                                                                                                                    case 55: {
                                                                                                                                                                        break Label_4264;
                                                                                                                                                                    }
                                                                                                                                                                    case 54: {
                                                                                                                                                                        break Label_4294_Outer;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            case 46: {
                                                                                                                                                                boolean b;
                                                                                                                                                                try {
                                                                                                                                                                    ((Context)activity).getPackageManager().getPackageInfo("com.android.vending", 0);
                                                                                                                                                                    b = true;
                                                                                                                                                                }
                                                                                                                                                                catch (final PackageManager$NameNotFoundException ex) {
                                                                                                                                                                    b = false;
                                                                                                                                                                }
                                                                                                                                                                if (b) {
                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)new Intent("android.intent.action.VIEW", Uri.parse(kfj.a((Context)activity, ((Context)activity).getPackageName()))).addFlags(1073741824);
                                                                                                                                                                    break Label_5377;
                                                                                                                                                                }
                                                                                                                                                                ehk.c().c(2131955772, 1);
                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                            }
                                                                                                                                                            case 45: {
                                                                                                                                                                if (a.l()) {
                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                                    ehk.c().a((CharSequence)((Context)activity).getString(2131958703), 1);
                                                                                                                                                                    break Label_5377;
                                                                                                                                                                }
                                                                                                                                                                ex = (PackageManager$NameNotFoundException)new Intent((Context)activity, (Class)ContentPreferencesSettingsActivity.class).putExtra("source", z.getQueryParameter("source"));
                                                                                                                                                                break Label_5377;
                                                                                                                                                            }
                                                                                                                                                            case 44: {
                                                                                                                                                                if (a.g.b()) {
                                                                                                                                                                    tol.a(k).c(true);
                                                                                                                                                                    break Label_4294_Outer;
                                                                                                                                                                }
                                                                                                                                                                break Label_4294_Outer;
                                                                                                                                                            }
                                                                                                                                                            case 43: {
                                                                                                                                                                ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                                                                                                                break Label_5377;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    case 41: {
                                                                                                                                                        break Label_3784;
                                                                                                                                                    }
                                                                                                                                                    case 40: {
                                                                                                                                                        break Label_3784;
                                                                                                                                                    }
                                                                                                                                                    case 39: {
                                                                                                                                                        break Label_3784;
                                                                                                                                                    }
                                                                                                                                                    case 38: {
                                                                                                                                                        break Label_3784;
                                                                                                                                                    }
                                                                                                                                                    case 36:
                                                                                                                                                    case 37: {
                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.f(activity, z, z.getQueryParameter("text"));
                                                                                                                                                        break Label_5377;
                                                                                                                                                    }
                                                                                                                                                    case 35: {
                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (cn)((z4j)a.n((String)pathSegments.get(0))).e());
                                                                                                                                                        break Label_5377;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            case 26:
                                                                                                                                            case 27:
                                                                                                                                            case 28:
                                                                                                                                            case 29: {
                                                                                                                                                break Label_5086;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    case 24: {
                                                                                                                                        final d7c$a d7c$a = new d7c$a();
                                                                                                                                        final i8c$a i8c$a = new i8c$a();
                                                                                                                                        i8c$a.a = "all_subscribed_lists_timeline";
                                                                                                                                        i8c$a.b = new h8c(new String[] { "user", "timeline_response", "timeline" });
                                                                                                                                        ((kkg)i8c$a.c).w((Object)"screen_name", (Object)pathSegments.get(0));
                                                                                                                                        ((kkg)i8c$a.c).w((Object)"includeTweetVisibilityNudge", (Object)bs4.n0());
                                                                                                                                        d7c$a.t((i8c)((z4j)i8c$a).e());
                                                                                                                                        d7c$a.u();
                                                                                                                                        d7c$a.v();
                                                                                                                                        d7c$a.x((CharSequence)((Context)activity).getString(2131953633));
                                                                                                                                        ex = (PackageManager$NameNotFoundException)((z4j)d7c$a).e();
                                                                                                                                        ((Context)activity).startActivity(a.d.a((Context)activity, (cn)ex));
                                                                                                                                        break Label_4294_Outer;
                                                                                                                                    }
                                                                                                                                    case 22: {
                                                                                                                                        final Uri build = new Uri$Builder().scheme("twitter").authority("user").appendQueryParameter("screen_name", (String)pathSegments.get(1)).build();
                                                                                                                                        final gn d = a.d;
                                                                                                                                        final b8l$a b8l$a = new b8l$a();
                                                                                                                                        b8l$a.f = build;
                                                                                                                                        b8l$a.a = a.e;
                                                                                                                                        ex = (PackageManager$NameNotFoundException)d.a((Context)activity, (cn)((z4j)b8l$a).e());
                                                                                                                                        break Label_5377;
                                                                                                                                    }
                                                                                                                                    case 23: {
                                                                                                                                        break Label_4294_Outer;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            case 174: {
                                                                                                                                ex = (PackageManager$NameNotFoundException)fn.a().a((Context)activity, (cn)new lmx(new WebauthnArgs((zbg)null, (String)null, true)));
                                                                                                                                break Label_5377;
                                                                                                                            }
                                                                                                                            case 173: {
                                                                                                                                final UriMatcher a3 = wm2.a;
                                                                                                                                final String lastPathSegment = z.getLastPathSegment();
                                                                                                                                Object a4;
                                                                                                                                if (flr.g((CharSequence)lastPathSegment)) {
                                                                                                                                    a4 = a.d.a((Context)activity, (cn)new th2(lastPathSegment, "LexDirectFull", false, (hp6)null, 0L));
                                                                                                                                }
                                                                                                                                else {
                                                                                                                                    a4 = null;
                                                                                                                                }
                                                                                                                                ex = (PackageManager$NameNotFoundException)a4;
                                                                                                                                if (a4 != null) {
                                                                                                                                    break Label_2774;
                                                                                                                                }
                                                                                                                                if (wm2.a.match(z) == 0) {
                                                                                                                                    ex = (PackageManager$NameNotFoundException)m7f.h(activity, z);
                                                                                                                                    break Label_5377;
                                                                                                                                }
                                                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                break Label_5377;
                                                                                                                            }
                                                                                                                            case 172: {
                                                                                                                                Object a5;
                                                                                                                                if (ita.b().b("live_event_experience_enabled", true) && !"INVALID_ID".equals(wzf.c(z))) {
                                                                                                                                    a5 = a.d.a((Context)activity, (cn)new zvf((LiveEventConfiguration)((z4j)wzf.b(z)).e()));
                                                                                                                                }
                                                                                                                                else {
                                                                                                                                    a5 = null;
                                                                                                                                }
                                                                                                                                ex = (PackageManager$NameNotFoundException)a5;
                                                                                                                                if (a5 != null) {
                                                                                                                                    break Label_2774;
                                                                                                                                }
                                                                                                                                ex = (PackageManager$NameNotFoundException)z;
                                                                                                                                if (wzf.e(z.toString())) {
                                                                                                                                    ex = (PackageManager$NameNotFoundException)Uri.parse("https://mobile.twitter.com/i/events/*".replace("*", wzf.c(z)));
                                                                                                                                }
                                                                                                                                final String string = ((Uri)ex).toString();
                                                                                                                                if (string != null && wzf.e.f(Uri.parse(string), false) == 0) {
                                                                                                                                    a.m(activity, (Uri)ex, true);
                                                                                                                                    ex = (PackageManager$NameNotFoundException)a5;
                                                                                                                                    break Label_2774;
                                                                                                                                }
                                                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                break Label_5377;
                                                                                                                            }
                                                                                                                            case 171: {
                                                                                                                                final Object queryParameter = z.getQueryParameter("title");
                                                                                                                                if (queryParameter != null) {
                                                                                                                                    ex = (PackageManager$NameNotFoundException)queryParameter;
                                                                                                                                }
                                                                                                                                final String queryParameter2 = z.getQueryParameter("diid");
                                                                                                                                final String queryParameter3 = z.getQueryParameter("dis");
                                                                                                                                final String z2 = bj.z("icymi ", queryParameter3, " ", queryParameter2);
                                                                                                                                final gn d2 = a.d;
                                                                                                                                final x7w.a a6 = new x7w.a();
                                                                                                                                a6.a = "timeline/icymi.json";
                                                                                                                                final ppv.a a7 = new ppv.a();
                                                                                                                                a7.c = (String)ex;
                                                                                                                                a7.e = z2;
                                                                                                                                final kkg t = kkg.t();
                                                                                                                                t.w((Object)"diid", (Object)queryParameter2);
                                                                                                                                t.w((Object)"dis", (Object)queryParameter3);
                                                                                                                                a7.b = new arv((Map)((z4j)t).e());
                                                                                                                                a6.b = (ppv)a7.e();
                                                                                                                                ex = (PackageManager$NameNotFoundException)d2.a((Context)activity, (cn)new x0c((x7w)a6.e()));
                                                                                                                                break Label_5377;
                                                                                                                            }
                                                                                                                            case 170: {
                                                                                                                                final xtp$a xtp$a = new xtp$a();
                                                                                                                                xtp$a.b = true;
                                                                                                                                a.h.b((Context)activity, (zxp)new oyp(z.toString()), hca.a(a.e.e(), ""), (xtp)((z4j)xtp$a).e(), (List)Collections.emptyList());
                                                                                                                                ex = (PackageManager$NameNotFoundException)a.e.e();
                                                                                                                                sbw.b((tlm)new fg4(dda.Companion.b((iba)ex, "", "share_via")));
                                                                                                                                break Label_4294_Outer;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    case 132: {
                                                                                                                        if (a.l()) {
                                                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                            ehk.c().a((CharSequence)((Context)activity).getString(2131958703), 1);
                                                                                                                            break Label_5377;
                                                                                                                        }
                                                                                                                        ex = (PackageManager$NameNotFoundException)new fyi();
                                                                                                                        ((Context)activity).startActivity(a.d.a((Context)activity, (cn)ex));
                                                                                                                        break Label_4294_Outer;
                                                                                                                    }
                                                                                                                    case 131: {
                                                                                                                        final kr7 a8 = jr7.a();
                                                                                                                        final ik1$b ik1$b = new ik1$b();
                                                                                                                        ((ik1$a)ik1$b).w(activity.getIntent().getStringExtra("android.intent.extra.TEXT"));
                                                                                                                        final Object e = ((z4j)ik1$b).e();
                                                                                                                        final int a9 = o5j.a;
                                                                                                                        ex = (PackageManager$NameNotFoundException)a.o(activity, a8.a((Context)activity, (ik1)e));
                                                                                                                        break Label_5377;
                                                                                                                    }
                                                                                                                    case 130: {
                                                                                                                        ex = (PackageManager$NameNotFoundException)a.d(activity, a.j(activity), false);
                                                                                                                        break Label_5377;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            case 110: {
                                                                                                                ex = (PackageManager$NameNotFoundException)rcl.a((Context)activity, k, m.c(), null, null, null, true);
                                                                                                                break Label_5377;
                                                                                                            }
                                                                                                            case 109: {
                                                                                                                if (Build$VERSION.SDK_INT < 33) {
                                                                                                                    break Label_4294_Outer;
                                                                                                                }
                                                                                                                if (a.k.f((Context)activity, "android.permission.POST_NOTIFICATIONS") == 3) {
                                                                                                                    activity.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS"));
                                                                                                                    ex = (PackageManager$NameNotFoundException)a.e.e();
                                                                                                                    sbw.b((tlm)new fg4(dda.Companion.b((iba)ex, "notification", "system_settings")));
                                                                                                                    break Label_4294_Outer;
                                                                                                                }
                                                                                                                a.k.i(1981, activity, new String[] { "android.permission.POST_NOTIFICATIONS" });
                                                                                                                ex = (PackageManager$NameNotFoundException)a.e.e();
                                                                                                                sbw.b((tlm)new fg4(dda.Companion.b((iba)ex, "notification", "system_permission")));
                                                                                                                break Label_4294_Outer;
                                                                                                            }
                                                                                                            case 108: {
                                                                                                                break Label_4294_Outer;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    case 88: {
                                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                        break Label_5377;
                                                                                                    }
                                                                                                    case 86: {
                                                                                                        final UserIdentifier parse = UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                                                        if (((kfw)a.a).n(parse)) {
                                                                                                            ((kfw)a.a).i(parse);
                                                                                                        }
                                                                                                        final String queryParameter4 = z.getQueryParameter("welcome_message_id");
                                                                                                        final String queryParameter5 = z.getQueryParameter("text");
                                                                                                        final long o = flr.o(z.getQueryParameter("recipient_id"), -1L);
                                                                                                        final String queryParameter6 = z.getQueryParameter("recipient_screen_name");
                                                                                                        if (flr.g((CharSequence)queryParameter6)) {
                                                                                                            final ci7 d3 = bi7.d();
                                                                                                            final uk7$b uk7$b = new uk7$b();
                                                                                                            ((BaseBundle)((am1.a)uk7$b).a).putString("recipient_screen_name", queryParameter6);
                                                                                                            final int a10 = o5j.a;
                                                                                                            ((ik1$a)uk7$b).v();
                                                                                                            ((ik1$a)uk7$b).w(queryParameter5);
                                                                                                            ((uk7$a)uk7$b).J(queryParameter4);
                                                                                                            ex = (PackageManager$NameNotFoundException)d3.e((Context)activity, (uk7)((z4j)uk7$b).e());
                                                                                                            break Label_5377;
                                                                                                        }
                                                                                                        if (o != -1L) {
                                                                                                            final ci7 d4 = bi7.d();
                                                                                                            final uk7$b uk7$b2 = new uk7$b();
                                                                                                            ((uk7$a)uk7$b2).G(o);
                                                                                                            ((ik1$a)uk7$b2).v();
                                                                                                            ((ik1$a)uk7$b2).w(queryParameter5);
                                                                                                            ((uk7$a)uk7$b2).J(queryParameter4);
                                                                                                            ex = (PackageManager$NameNotFoundException)d4.e((Context)activity, (uk7)((z4j)uk7$b2).e());
                                                                                                            break Label_5377;
                                                                                                        }
                                                                                                        final kr7 a11 = jr7.a();
                                                                                                        final ki7$a ki7$a = new ki7$a();
                                                                                                        ((ik1$a)ki7$a).v();
                                                                                                        ((ik1$a)ki7$a).w(queryParameter5);
                                                                                                        ex = (PackageManager$NameNotFoundException)a11.f((Context)activity, (ki7)((z4j)ki7$a).e());
                                                                                                        break Label_5377;
                                                                                                    }
                                                                                                    case 85: {
                                                                                                        final String queryParameter7 = z.getQueryParameter("user");
                                                                                                        if (queryParameter7 != null) {
                                                                                                            UserIdentifier.getCurrent();
                                                                                                            if (!queryParameter7.equals(a.a.m().c())) {
                                                                                                                final qdw e2 = a.a.e(queryParameter7);
                                                                                                                if (e2 != null) {
                                                                                                                    ((kfw)a.a).i(e2.k());
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        ex = (PackageManager$NameNotFoundException)((oec)activity).v0().h();
                                                                                                        final String string2 = z.toString();
                                                                                                        e0e.f((Object)string2, "value");
                                                                                                        ((fci)ex).b((ContentViewArgs)new AdsCompanionContentViewArgs(string2));
                                                                                                        break Label_4294_Outer;
                                                                                                    }
                                                                                                    case 84: {
                                                                                                        if (eg8.t(m)) {
                                                                                                            ex = (PackageManager$NameNotFoundException)((oec)activity).v0().h();
                                                                                                            final Resources resources = ((Context)activity).getResources();
                                                                                                            e0e.f((Object)resources, "resources");
                                                                                                            final String string3 = resources.getString(2131951921);
                                                                                                            e0e.e((Object)string3, "resources.getString(R.string.ads_companion_url)");
                                                                                                            ((fci)ex).b((ContentViewArgs)new AdsCompanionContentViewArgs(string3));
                                                                                                            break Label_4294_Outer;
                                                                                                        }
                                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                        break Label_5377;
                                                                                                    }
                                                                                                    case 82:
                                                                                                    case 83: {
                                                                                                        ex = (PackageManager$NameNotFoundException)hti.a().e();
                                                                                                        break Label_5377;
                                                                                                    }
                                                                                                    case 87: {
                                                                                                        break Label_5086;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 162: {
                                                                                                ex = (PackageManager$NameNotFoundException)a.i(activity, z, true);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 154: {
                                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (cn)new mnx(z));
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 150: {
                                                                                                if (a.l()) {
                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                    m7f.p((Context)activity);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)zgl.j((Context)activity, "deeplink");
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 145: {
                                                                                                if (!a.l()) {
                                                                                                    Intent intent;
                                                                                                    if (a.l()) {
                                                                                                        m7f.p((Context)activity);
                                                                                                        intent = a.b(activity);
                                                                                                    }
                                                                                                    else {
                                                                                                        final String stringId = k.getStringId();
                                                                                                        final gn d5 = a.d;
                                                                                                        final jt9.a a12 = new jt9.a();
                                                                                                        a12.q(pgv$q.b.buildUpon().appendEncodedPath(stringId).appendQueryParameter("ownerId", stringId).build());
                                                                                                        intent = d5.a((Context)activity, (cn)a12.e());
                                                                                                    }
                                                                                                    ex = (PackageManager$NameNotFoundException)intent.putExtra("edit_birthdate", true);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                m7f.p((Context)activity);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 136: {
                                                                                                ex = (PackageManager$NameNotFoundException)o9a.t((Context)activity);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 128: {
                                                                                                ex = (PackageManager$NameNotFoundException)a.d(activity, a.j(activity), true);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 122: {
                                                                                                if (ita.b().b("auth_timeline_token_tracking_enabled", false)) {
                                                                                                    final String queryParameter8 = z.getQueryParameter("att");
                                                                                                    if (queryParameter8 != null) {
                                                                                                        u51.c(queryParameter8);
                                                                                                    }
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)null, (String)null, false, (String)null, (wg8)null));
                                                                                                ((Intent)ex).setData(activity.getIntent().getData());
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 102: {
                                                                                                final long o2 = flr.o(z.getQueryParameter("user_id"), -1L);
                                                                                                if (o2 != -1L) {
                                                                                                    final e07 e3 = new e07();
                                                                                                    ((aj1)e3).mIntent.putExtra("extra_user_id", o2);
                                                                                                    ex = (PackageManager$NameNotFoundException)((aj1)e3).toIntent((Context)activity, (Class<? extends Activity>)WhoToFollowUsersTimelineActivity.class);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 68: {
                                                                                                final String queryParameter9 = z.getQueryParameter("status");
                                                                                                if (queryParameter9 != null) {
                                                                                                    ex = (PackageManager$NameNotFoundException)a.f(activity, z, queryParameter9);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 48: {
                                                                                                ex = (PackageManager$NameNotFoundException)a.c(activity, (String)pathSegments.get(1), (String)null);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 19: {
                                                                                                ex = (PackageManager$NameNotFoundException)new Uri$Builder().scheme("twitter").authority("list").build();
                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity).setData((Uri)ex);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 17:
                                                                                            case 164: {
                                                                                                final dej.a a13 = new dej.a((Context)activity);
                                                                                                final fds.a a14 = new fds.a();
                                                                                                a14.p("contacts_live_sync");
                                                                                                a13.d = (fds)a14.e();
                                                                                                ex = (PackageManager$NameNotFoundException)((dej)a13.e()).a().setFlags(335544320);
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 100: {
                                                                                                final Context applicationContext = ((Context)activity).getApplicationContext();
                                                                                                final String queryParameter10 = z.getQueryParameter("refsrc");
                                                                                                final String string4 = applicationContext.getString(2131955635);
                                                                                                Label_3583: {
                                                                                                    if (queryParameter10 != null && queryParameter10.startsWith(string4)) {
                                                                                                        final String substring = queryParameter10.substring(applicationContext.getString(2131955635).length(), queryParameter10.length());
                                                                                                        final int[] n0 = eg8.N0;
                                                                                                        while (true) {
                                                                                                            for (int i = 0; i < 2; ++i) {
                                                                                                                final String string5 = applicationContext.getString(n0[i]);
                                                                                                                final StringBuilder sb = new StringBuilder();
                                                                                                                sb.append("_");
                                                                                                                sb.append(string5);
                                                                                                                if (substring.equals(sb.toString())) {
                                                                                                                    final String o3 = o1p.o(new String[] { "login", "", "forgot_password", string5, "success" });
                                                                                                                    final fg4 fg4 = new fg4(UserIdentifier.getCurrent());
                                                                                                                    ((o1p)fg4).q(new String[] { o3 });
                                                                                                                    sbw.b((tlm)fg4);
                                                                                                                    break Label_3583;
                                                                                                                }
                                                                                                            }
                                                                                                            final String string5 = "";
                                                                                                            continue Label_4294_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                final UserIdentifier parse2 = UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                                                if (((kfw)a.a).n(parse2)) {
                                                                                                    ((kfw)a.a).i(parse2);
                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity).setFlags(67108864);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)z.getQueryParameter("screen_name");
                                                                                                if (p) {
                                                                                                    activity.startActivity(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)ex, (String)null, false, (String)null, (wg8)null)));
                                                                                                    break Label_4294_Outer;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)LoginArgs.attachExtraIntent(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)ex, (String)null, false, (String)null, (wg8)null)), a.b(activity));
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 112: {
                                                                                                if (p) {
                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                    break Label_5377;
                                                                                                }
                                                                                                final dej.a a15 = new dej.a((Context)activity);
                                                                                                final fds.a z3 = rk0.z("signup");
                                                                                                z3.d = "deeplink";
                                                                                                a15.d = (fds)z3.e();
                                                                                                ex = (PackageManager$NameNotFoundException)((dej)a15.e()).a();
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 118: {
                                                                                                final String queryParameter11 = z.getQueryParameter("user_id");
                                                                                                final String queryParameter12 = z.getQueryParameter("id");
                                                                                                String s = queryParameter11;
                                                                                                if (queryParameter11 == null) {
                                                                                                    s = queryParameter12;
                                                                                                }
                                                                                                final UserIdentifier parse3 = UserIdentifier.parse(s, UserIdentifier.LOGGED_OUT);
                                                                                                final String queryParameter13 = z.getQueryParameter("screen_name");
                                                                                                final boolean b2 = "1".equals(z.getQueryParameter("df")) && queryParameter13 != null;
                                                                                                final b8l$a b8l$a2 = new b8l$a();
                                                                                                b8l$a2.h = parse3.getId();
                                                                                                b8l$a2.c = queryParameter13;
                                                                                                b8l$a2.a = a.e;
                                                                                                if (b2) {
                                                                                                    b8l$a2.e = j9l.i.toString();
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (cn)((z4j)b8l$a2).e());
                                                                                                break Label_5377;
                                                                                            }
                                                                                            case 70: {
                                                                                                break Label_4294_Outer;
                                                                                            }
                                                                                            case 147: {
                                                                                                break Label_4676;
                                                                                            }
                                                                                            case 31: {
                                                                                                break Label_5086;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                case 15: {
                                                                                    ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                                    break Label_5377;
                                                                                }
                                                                                case 13:
                                                                                case 14: {
                                                                                    ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                                    break Label_5377;
                                                                                }
                                                                                case 12: {
                                                                                    final long o4 = flr.o((String)pathSegments.get(2), -1L);
                                                                                    if (o4 != -1L) {
                                                                                        final ci7 d6 = bi7.d();
                                                                                        final uk7$b uk7$b3 = new uk7$b();
                                                                                        ((uk7$a)uk7$b3).G(o4);
                                                                                        ex = (PackageManager$NameNotFoundException)d6.e((Context)activity, (uk7)((z4j)uk7$b3).e());
                                                                                        break Label_5377;
                                                                                    }
                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                    break Label_5377;
                                                                                }
                                                                                case 8: {
                                                                                    ex = (PackageManager$NameNotFoundException)jr7.a().b((Context)activity);
                                                                                    break Label_5377;
                                                                                }
                                                                                case 9: {
                                                                                    final long o5 = flr.o(z.getQueryParameter("user_id"), -1L);
                                                                                    if (a2 == 57 && o5 == -1L) {
                                                                                        ex = (PackageManager$NameNotFoundException)m7f.h(activity, z);
                                                                                        break Label_5377;
                                                                                    }
                                                                                    final ci7 d7 = bi7.d();
                                                                                    final uk7$b uk7$b4 = new uk7$b();
                                                                                    ((uk7$a)uk7$b4).G(o5);
                                                                                    ex = (PackageManager$NameNotFoundException)d7.e((Context)activity, (uk7)((z4j)uk7$b4).e());
                                                                                    break Label_5377;
                                                                                }
                                                                                case 11: {
                                                                                    ex = (PackageManager$NameNotFoundException)jr7.a().e((Context)activity);
                                                                                    break Label_5377;
                                                                                }
                                                                                case 10: {
                                                                                    break Label_4982;
                                                                                }
                                                                            }
                                                                        }
                                                                        break Label_5377;
                                                                    }
                                                                    ex = (PackageManager$NameNotFoundException)((Context)activity).getPackageName();
                                                                    PackageManager packageManager2;
                                                                    PackageManager packageManager = null;
                                                                    String s2;
                                                                    int n2;
                                                                    int n3;
                                                                    b8l$a n4;
                                                                    b8l$a n5;
                                                                    long long1;
                                                                    zfu zfu;
                                                                    Object a16;
                                                                    Uri data;
                                                                    dej.a a17;
                                                                    String queryParameter14;
                                                                    zfu zfu2;
                                                                    Uri e4;
                                                                    gn d8;
                                                                    ci7 d9;
                                                                    uk7$b uk7$b5;
                                                                    String s3;
                                                                    ci7 d10;
                                                                    Block_92_Outer:Block_109_Outer:Block_107_Outer:Label_4727_Outer:Label_4292_Outer:
                                                                    while (true) {
                                                                        try {
                                                                            packageManager = (packageManager2 = ((Context)activity).getPackageManager());
                                                                            s2 = "com.android.vending";
                                                                            n2 = 0;
                                                                            packageManager2.getPackageInfo(s2, n2);
                                                                            n3 = 1;
                                                                            break Label_4294;
                                                                        }
                                                                        catch (final PackageManager$NameNotFoundException ex2) {}
                                                                    Block_112_Outer:
                                                                        while (true) {
                                                                            try {
                                                                                packageManager2 = packageManager;
                                                                                s2 = "com.android.vending";
                                                                                n2 = 0;
                                                                                packageManager2.getPackageInfo(s2, n2);
                                                                                n3 = 1;
                                                                                if (n3 != 0) {
                                                                                    ex = (PackageManager$NameNotFoundException)kfj.a((Context)activity, (String)ex);
                                                                                }
                                                                                else {
                                                                                    ex = (PackageManager$NameNotFoundException)((Context)activity).getString(2131954237, new Object[] { ex });
                                                                                }
                                                                                ex = (PackageManager$NameNotFoundException)new Intent("android.intent.action.VIEW", Uri.parse((String)ex));
                                                                                continue Label_4294_Outer;
                                                                                Label_4740: {
                                                                                    Block_96: {
                                                                                    Block_105_Outer:
                                                                                        while (true) {
                                                                                        Label_5408:
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    Block_86: {
                                                                                                        while (true) {
                                                                                                            Block_93: {
                                                                                                            Label_5344:
                                                                                                                while (true) {
                                                                                                                    Label_4727:Label_5068_Outer:Block_85_Outer:
                                                                                                                    while (true) {
                                                                                                                        while (true) {
                                                                                                                        Label_5068:
                                                                                                                            while (true) {
                                                                                                                                Block_95: {
                                                                                                                                    Block_111: {
                                                                                                                                        Block_108: {
                                                                                                                                            while (true) {
                                                                                                                                                Label_5432: {
                                                                                                                                                Block_88:
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            Block_100: {
                                                                                                                                                                while (true) {
                                                                                                                                                                    Label_4968: {
                                                                                                                                                                        Block_103: {
                                                                                                                                                                            while (true) {
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    Label_4837: {
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                n4 = a.n((String)ex);
                                                                                                                                                                                                iftrue(Label_4723:)(a2 == 147);
                                                                                                                                                                                                break Block_93;
                                                                                                                                                                                                n5.e = ((Uri)ex).toString();
                                                                                                                                                                                                Label_5357: {
                                                                                                                                                                                                    break Label_5357;
                                                                                                                                                                                                    Label_4835: {
                                                                                                                                                                                                        ex = null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break Label_4837;
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.g(activity, z, 62, (String)null);
                                                                                                                                                                                                    break Label_5377;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        long1 = Long.parseLong(pathSegments.get(2));
                                                                                                                                                                                                        zfu = new zfu((Context)activity, a.d);
                                                                                                                                                                                                        zfu.a(long1);
                                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)zfu.e();
                                                                                                                                                                                                        break Label_5377;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final NumberFormatException ex) {
                                                                                                                                                                                                        r9a.d((Throwable)ex);
                                                                                                                                                                                                        break Label_4294_Outer;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break Label_4294_Outer;
                                                                                                                                                                                                    iftrue(Label_5319:)(a2 == 87);
                                                                                                                                                                                                    break Block_108;
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.c(activity, z.getQueryParameter("user_id"), z.getQueryParameter("screen_name"));
                                                                                                                                                                                                    break Label_5377;
                                                                                                                                                                                                    Label_4716:
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)j9l.a;
                                                                                                                                                                                                    break Label_4727;
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, (ContentViewArgs)new PasswordResetArgs(z.toString(), (String)null));
                                                                                                                                                                                                    break Label_5377;
                                                                                                                                                                                                    Label_5326:
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)j9l.c;
                                                                                                                                                                                                    break Label_5344;
                                                                                                                                                                                                    Label_4966:
                                                                                                                                                                                                    ex = null;
                                                                                                                                                                                                    break Label_4968;
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)((bti)ex).v;
                                                                                                                                                                                                    break Label_4968;
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.g(activity, z, 63, (String)null);
                                                                                                                                                                                                    break Label_5377;
                                                                                                                                                                                                    Label_4664:
                                                                                                                                                                                                    a.m(activity, z, false);
                                                                                                                                                                                                    break Label_4294_Outer;
                                                                                                                                                                                                    iftrue(Label_5065:)(!"smart_follow".equals(z.getQueryParameter("steps")));
                                                                                                                                                                                                    Block_102: {
                                                                                                                                                                                                        break Block_102;
                                                                                                                                                                                                        ehk.c().c(2131956959, 1);
                                                                                                                                                                                                        break Label_4294_Outer;
                                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a16;
                                                                                                                                                                                                        iftrue(Label_5377:)(a16 != null);
                                                                                                                                                                                                        break Block_103;
                                                                                                                                                                                                        data = activity.getIntent().getData();
                                                                                                                                                                                                        iftrue(Label_5408:)(data == null);
                                                                                                                                                                                                        break Block_111;
                                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)((Intent)ex).getExtras();
                                                                                                                                                                                                        iftrue(Label_4966:)(ex == null);
                                                                                                                                                                                                        break Block_100;
                                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, qjy.k(k, m.getUser(), pas.c1));
                                                                                                                                                                                                        break Label_5377;
                                                                                                                                                                                                        Label_5437:
                                                                                                                                                                                                        return;
                                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)z.getQueryParameter("att");
                                                                                                                                                                                                        iftrue(Label_4424:)(ex == null);
                                                                                                                                                                                                        break Block_86;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    a17 = new dej.a((Context)activity);
                                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)new fds.a();
                                                                                                                                                                                                    ((fds.a)ex).p("rux");
                                                                                                                                                                                                    a17.d = (fds)((z4j)ex).e();
                                                                                                                                                                                                    a16 = ((dej)a17.e()).a();
                                                                                                                                                                                                    continue Label_5068;
                                                                                                                                                                                                }
                                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (cn)((z4j)n5).e());
                                                                                                                                                                                                break Label_5377;
                                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)z.getQueryParameter("screen_name");
                                                                                                                                                                                                iftrue(Label_4763:)(ex == null);
                                                                                                                                                                                                continue Block_109_Outer;
                                                                                                                                                                                            }
                                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)z.getQueryParameter("bounce_location");
                                                                                                                                                                                            a.j.b((String)ex, true, null);
                                                                                                                                                                                            ex = null;
                                                                                                                                                                                            break Label_5377;
                                                                                                                                                                                            n3 = 0;
                                                                                                                                                                                            continue Block_92_Outer;
                                                                                                                                                                                            Label_4627: {
                                                                                                                                                                                                iftrue(Label_4664:)(a.k(z) || p6w.r(z));
                                                                                                                                                                                            }
                                                                                                                                                                                            continue Label_5068_Outer;
                                                                                                                                                                                        }
                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                                                                                                                                        iftrue(Label_5213:)(!((kfw)a.a).n((UserIdentifier)ex));
                                                                                                                                                                                        break Block_105_Outer;
                                                                                                                                                                                        Label_4723: {
                                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)j9l.c;
                                                                                                                                                                                        }
                                                                                                                                                                                        break Label_4727;
                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)activity.getIntent().getExtras();
                                                                                                                                                                                        break Label_4837;
                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)z.getQueryParameter("action");
                                                                                                                                                                                        queryParameter14 = z.getQueryParameter("mode");
                                                                                                                                                                                        iftrue(Label_4599:)(!"compose".equals(ex) || !"poll".equals(queryParameter14));
                                                                                                                                                                                        break Block_88;
                                                                                                                                                                                    }
                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)new uk7((Bundle)ex).s();
                                                                                                                                                                                    vmw.g((Object)ex);
                                                                                                                                                                                    zfu2 = new zfu((Context)activity);
                                                                                                                                                                                    zfu2.a(((ewl)ex).d);
                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)zfu2.e();
                                                                                                                                                                                    break Label_5377;
                                                                                                                                                                                    Label_5333: {
                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)j9l.e;
                                                                                                                                                                                    }
                                                                                                                                                                                    iftrue(Label_5357:)(ex == null);
                                                                                                                                                                                    continue Block_107_Outer;
                                                                                                                                                                                }
                                                                                                                                                                                Label_4807: {
                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                                                }
                                                                                                                                                                                break Label_5377;
                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)activity.getIntent();
                                                                                                                                                                                iftrue(Label_4966:)(ex == null || !swj.a((Intent)ex));
                                                                                                                                                                                continue Block_85_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)hti.a().e();
                                                                                                                                                                            break Label_5377;
                                                                                                                                                                            iftrue(Label_4807:)(!ita.b().b("native_mobile_sms_2fa_enabled", false));
                                                                                                                                                                            break Block_96;
                                                                                                                                                                        }
                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                                        break Label_5377;
                                                                                                                                                                    }
                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.e(activity, z, false, (String)ex);
                                                                                                                                                                    break Label_5377;
                                                                                                                                                                    iftrue(Label_4835:)(activity.getIntent() == null);
                                                                                                                                                                    continue Block_112_Outer;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)fgr.b((Bundle)ex);
                                                                                                                                                            iftrue(Label_4966:)(ex == null);
                                                                                                                                                            continue Label_5068_Outer;
                                                                                                                                                        }
                                                                                                                                                        break Label_5272;
                                                                                                                                                        Label_5319: {
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)j9l.a;
                                                                                                                                                        }
                                                                                                                                                        continue Label_5344;
                                                                                                                                                        ((Intent)ex).putExtra("android.intent.extra.REFERRER", e4.toString());
                                                                                                                                                        break Label_5432;
                                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.e(activity, z, true, (String)null);
                                                                                                                                                        break Label_5377;
                                                                                                                                                        while (true) {
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                            break Label_5377;
                                                                                                                                                            iftrue(Label_4627:)(!p6w.q(z));
                                                                                                                                                            continue Block_105_Outer;
                                                                                                                                                        }
                                                                                                                                                        iftrue(Label_5333:)(a2 == 28);
                                                                                                                                                        iftrue(Label_5326:)(a2 == 73);
                                                                                                                                                        continue Label_4727_Outer;
                                                                                                                                                    }
                                                                                                                                                    d8 = a.d;
                                                                                                                                                    ex = (PackageManager$NameNotFoundException)new f86();
                                                                                                                                                    ((f86)ex).g(5);
                                                                                                                                                    ((aj1)ex).mIntent.setFlags(67108864);
                                                                                                                                                    ((f86)ex).q(false);
                                                                                                                                                    ex = (PackageManager$NameNotFoundException)d8.a((Context)activity, (cn)ex);
                                                                                                                                                    break Label_5377;
                                                                                                                                                }
                                                                                                                                                activity.startActivity((Intent)ex);
                                                                                                                                                return;
                                                                                                                                                iftrue(Label_4740:)(ex == null);
                                                                                                                                                break Block_95;
                                                                                                                                                iftrue(Label_5437:)(ex == null);
                                                                                                                                                continue Block_85_Outer;
                                                                                                                                            }
                                                                                                                                            Label_5213: {
                                                                                                                                                ex = (PackageManager$NameNotFoundException)pathSegments.get(1);
                                                                                                                                            }
                                                                                                                                            d9 = bi7.d();
                                                                                                                                            uk7$b5 = new uk7$b();
                                                                                                                                            ((uk7$a)uk7$b5).A((String)ex);
                                                                                                                                            ((ik1$a)uk7$b5).v();
                                                                                                                                            ex = (PackageManager$NameNotFoundException)d9.e((Context)activity, (uk7)((z4j)uk7$b5).e());
                                                                                                                                            continue Label_2774_Outer;
                                                                                                                                        }
                                                                                                                                        continue Label_5344;
                                                                                                                                    }
                                                                                                                                    ((Intent)ex).putExtra("deep_link_uri", data.toString());
                                                                                                                                    break Label_5408;
                                                                                                                                }
                                                                                                                                n4.e = ((Uri)ex).toString();
                                                                                                                                break Label_4740;
                                                                                                                                Label_5065: {
                                                                                                                                    a16 = null;
                                                                                                                                }
                                                                                                                                continue Label_5068;
                                                                                                                            }
                                                                                                                            iftrue(Label_4424:)(!ita.b().b("auth_timeline_token_tracking_enabled", false));
                                                                                                                            continue Label_4292_Outer;
                                                                                                                        }
                                                                                                                        ex = null;
                                                                                                                        continue Label_4727;
                                                                                                                    }
                                                                                                                    Label_5340: {
                                                                                                                        ex = (PackageManager$NameNotFoundException)j9l.f;
                                                                                                                    }
                                                                                                                    continue Label_5344;
                                                                                                                }
                                                                                                                Label_4599: {
                                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                }
                                                                                                                continue Label_2774_Outer;
                                                                                                            }
                                                                                                            iftrue(Label_4716:)(a2 == 157);
                                                                                                            continue;
                                                                                                        }
                                                                                                        ex = null;
                                                                                                        continue Label_2774_Outer;
                                                                                                    }
                                                                                                    u51.c((String)ex);
                                                                                                    continue Label_4292_Outer;
                                                                                                }
                                                                                                ex = null;
                                                                                                n5 = a.n((String)pathSegments.get(0));
                                                                                                iftrue(Label_5340:)(a2 == 26);
                                                                                                continue;
                                                                                            }
                                                                                            e4 = kn.e(activity);
                                                                                            iftrue(Label_5432:)(e4 == null);
                                                                                            continue Block_105_Outer;
                                                                                        }
                                                                                        ((kfw)a.a).i((UserIdentifier)ex);
                                                                                        s3 = pathSegments.get(1);
                                                                                        d10 = bi7.d();
                                                                                        ex = (PackageManager$NameNotFoundException)new uk7$b();
                                                                                        ((uk7$a)ex).A(s3);
                                                                                        ((ik1$a)ex).v();
                                                                                        ex = (PackageManager$NameNotFoundException)d10.e((Context)activity, (uk7)((z4j)ex).e());
                                                                                        continue Label_2774_Outer;
                                                                                    }
                                                                                    ex = (PackageManager$NameNotFoundException)new Intent((Context)activity, (Class)BackupCodeActivity.class).putExtra("bc_account_id", k.getId());
                                                                                    continue Label_2774_Outer;
                                                                                }
                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (cn)((z4j)n4).e());
                                                                                continue Label_2774_Outer;
                                                                            }
                                                                            catch (final PackageManager$NameNotFoundException ex3) {
                                                                                continue;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break;
        }
    }
}
