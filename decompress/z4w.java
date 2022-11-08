import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.UriMatcher;
import com.twitter.login.api.PasswordResetArgs;
import android.os.Bundle;
import com.twitter.android.BackupCodeActivity;
import com.twitter.app.users.WhoToFollowUsersTimelineActivity;
import com.twitter.ads.AdsCompanionContentViewArgs;
import com.twitter.util.user.UserIdentifier;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.Map;
import com.twitter.model.liveevent.LiveEventConfiguration;
import com.twitter.login.api.WebauthnArgs;
import android.net.Uri$Builder;
import com.twitter.android.settings.ContentPreferencesSettingsActivity;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.app.common.args.ContentViewArgs;
import android.content.Context;
import com.twitter.account.navigation.LoginArgs;
import java.util.List;
import java.util.Objects;
import android.app.Activity;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4w implements y4w
{
    public final e7f a;
    public final fd8 b;
    public final k5w c;
    public final c7f d;
    public final oh4 e;
    
    public z4w(final e7f a, final fd8 b, final k5w c, final c7f d, final oh4 e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final boolean a(final Uri uri) {
        return this.a.k(uri) || this.b.a(uri);
    }
    
    public final void b(final Activity activity) {
        final Uri data = activity.getIntent().getData();
        if (this.e.isShutdown()) {
            final oh4 e = this.e;
            String string;
            if (data != null) {
                string = data.toString();
            }
            else {
                string = null;
            }
            e.a(string);
        }
        else if (data != null) {
            this.c(activity, data);
        }
    }
    
    public final void c(final Activity activity, Uri ex) {
        final Uri z = p5w.z((Uri)ex);
        final String stringExtra = activity.getIntent().getStringExtra("shortcut");
        if (pjr.g((CharSequence)stringExtra)) {
            saw.b((okm)new zf4(new String[] { zi.y("app:url_interpreter:shortcut:", stringExtra, ":open") }));
        }
        ex = (PackageManager$NameNotFoundException)((Uri)ex).getQueryParameter("app_action");
        if (!pjr.e((CharSequence)ex)) {
            saw.b((okm)new zf4(new String[] { zi.y("assistant:deep_link:", (String)ex, "::open") }));
        }
        if (this.c.a(z, (k5w.a)new ve8((Object)this, (Object)activity, 5))) {
            return;
        }
        if (this.b.a(z)) {
            this.b.b(activity);
            return;
        }
        final e7f a = this.a;
        final ocw m = a.a.m();
        final UserIdentifier k = m.k();
        final boolean p = m.p();
        final List pathSegments = z.getPathSegments();
        ex = (PackageManager$NameNotFoundException)a.b.a(z, false);
        final int a2 = ((b7f$a)ex).a;
        Objects.requireNonNull(a.f);
        if (((b7f$a)ex).a != -1) {
            bl0.a().a();
            if (ffa.q("scribe_deprecation_sample_size", cro.g).b()) {
                final lev lev = new lev();
                lev.k = ((b7f$a)ex).b;
                final StringBuilder g = w48.g("Matched against code ");
                g.append(((b7f$a)ex).a);
                g.append(" pattern ");
                g.append(((b7f$a)ex).b);
                lev.v = g.toString();
                final int d = nb0.D(((b7f$a)ex).c);
                if (d != 1) {
                    if (d != 2) {
                        ex = null;
                    }
                    else {
                        ex = (PackageManager$NameNotFoundException)new zf4(a7f.b);
                    }
                }
                else {
                    ex = (PackageManager$NameNotFoundException)new zf4(a7f.a);
                }
                if (ex != null) {
                    ((zf4)ex).D(ijf.v((Object)lev));
                    xca.a().b(k, (okm)ex);
                }
            }
        }
    Label_4257_Outer:
        while (true) {
            if (!p && !e7f.l.contains(a2)) {
                ex = (PackageManager$NameNotFoundException)LoginArgs.attachExtraIntent(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, null, null, false, null, null)), activity.getIntent());
                break Label_5053;
            }
            Label_5230: {
                if (a2 == 50) {
                    break Label_5230;
                }
                Label_5084: {
                    if (a2 == 51) {
                        break Label_5084;
                    }
                    Label_5070: {
                        if (a2 == 62) {
                            break Label_5070;
                        }
                        Label_5056: {
                            if (a2 == 63) {
                                break Label_5056;
                            }
                            if (a2 == 72 || a2 == 73) {
                                break Label_5230;
                            }
                            Label_4965: {
                                if (a2 == 115) {
                                    break Label_4965;
                                }
                                Label_4953: {
                                    if (a2 == 116) {
                                        break Label_4953;
                                    }
                                    Label_4876: {
                                        if (a2 == 124) {
                                            break Label_4876;
                                        }
                                        Label_4863: {
                                            if (a2 == 125) {
                                                break Label_4863;
                                            }
                                            Label_4835: {
                                                if (a2 == 139) {
                                                    break Label_4835;
                                                }
                                                Label_4772: {
                                                    if (a2 == 140) {
                                                        break Label_4772;
                                                    }
                                                    Label_4723: {
                                                        if (a2 == 156) {
                                                            break Label_4723;
                                                        }
                                                        Label_4632: {
                                                            if (a2 == 157) {
                                                                break Label_4632;
                                                            }
                                                            Label_4355: {
                                                                Label_4212: {
                                                                    switch (a2) {
                                                                        default: {
                                                                            ex = (PackageManager$NameNotFoundException)"";
                                                                            Label_3754: {
                                                                                boolean b;
                                                                                final z6c.a a3;
                                                                                final f8c.a a4;
                                                                                final Uri build;
                                                                                final cn d2;
                                                                                final c7l$a c7l$a;
                                                                                Object a5;
                                                                                final UriMatcher a6;
                                                                                final String lastPathSegment;
                                                                                Object a7;
                                                                                final Object o;
                                                                                final String string;
                                                                                final Object queryParameter;
                                                                                final String queryParameter2;
                                                                                final String queryParameter3;
                                                                                final String z2;
                                                                                final cn d3;
                                                                                final y6w$a y6w$a;
                                                                                final fov.a a8;
                                                                                final sjg t;
                                                                                final ksp.a a9;
                                                                                final ar7 a10;
                                                                                final kk1$b kk1$b;
                                                                                final Object e;
                                                                                final int a11;
                                                                                final UserIdentifier parse;
                                                                                final String queryParameter4;
                                                                                final String queryParameter5;
                                                                                final long o2;
                                                                                final String queryParameter6;
                                                                                th7 d4;
                                                                                kk7$b kk7$b;
                                                                                int a12;
                                                                                th7 d5;
                                                                                kk7$b kk7$b2;
                                                                                final ar7 a13;
                                                                                final bi7$a bi7$a;
                                                                                final String queryParameter7;
                                                                                ocw e2;
                                                                                final String string2;
                                                                                Resources resources;
                                                                                String string3;
                                                                                switch (a2) {
                                                                                    case 162: {
                                                                                        ex = (PackageManager$NameNotFoundException)a.i(activity, z, true);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 154: {
                                                                                        ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (zm)new dmx(z));
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 150: {
                                                                                        if (a.l()) {
                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                            e7f.p((Context)activity);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)bgl.j((Context)activity, "deeplink");
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 145: {
                                                                                        if (!a.l()) {
                                                                                            Intent intent;
                                                                                            if (a.l()) {
                                                                                                e7f.p((Context)activity);
                                                                                                intent = a.b(activity);
                                                                                            }
                                                                                            else {
                                                                                                final String stringId = k.getStringId();
                                                                                                final cn d6 = a.d;
                                                                                                final ys9$a ys9$a = new ys9$a();
                                                                                                ys9$a.q(gfv$q.b.buildUpon().appendEncodedPath(stringId).appendQueryParameter("ownerId", stringId).build());
                                                                                                intent = d6.a((Context)activity, (zm)((h4j)ys9$a).e());
                                                                                            }
                                                                                            ex = (PackageManager$NameNotFoundException)intent.putExtra("edit_birthdate", true);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                        e7f.p((Context)activity);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 136: {
                                                                                        ex = (PackageManager$NameNotFoundException)jgw.E((Context)activity);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 128: {
                                                                                        ex = (PackageManager$NameNotFoundException)a.d(activity, a.j(activity), true);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 122: {
                                                                                        if (dta.b().b("auth_timeline_token_tracking_enabled", false)) {
                                                                                            final String queryParameter8 = z.getQueryParameter("att");
                                                                                            if (queryParameter8 != null) {
                                                                                                s51.c(queryParameter8);
                                                                                            }
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, null, null, false, null, null));
                                                                                        ((Intent)ex).setData(activity.getIntent().getData());
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 102: {
                                                                                        final long o3 = pjr.o(z.getQueryParameter("user_id"), -1L);
                                                                                        if (o3 != -1L) {
                                                                                            final fi2 fi2 = new fi2();
                                                                                            fi2.mIntent.putExtra("extra_user_id", o3);
                                                                                            ex = (PackageManager$NameNotFoundException)fi2.toIntent((Context)activity, (Class<? extends Activity>)WhoToFollowUsersTimelineActivity.class);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 68: {
                                                                                        final String queryParameter9 = z.getQueryParameter("status");
                                                                                        if (queryParameter9 != null) {
                                                                                            ex = (PackageManager$NameNotFoundException)a.f(activity, z, queryParameter9);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 48: {
                                                                                        ex = (PackageManager$NameNotFoundException)a.c(activity, (String)pathSegments.get(1), (String)null);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 19: {
                                                                                        ex = (PackageManager$NameNotFoundException)new Uri$Builder().scheme("twitter").authority("list").build();
                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity).setData((Uri)ex);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    default:
                                                                                        Label_3292: {
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
                                                                                                                                                                            ex = null;
                                                                                                                                                                            if (p5w.x(z) && (pathSegments == null || pathSegments.isEmpty())) {
                                                                                                                                                                                break Label_4355;
                                                                                                                                                                            }
                                                                                                                                                                            break Label_4355;
                                                                                                                                                                        }
                                                                                                                                                                        case 78: {
                                                                                                                                                                            break Label_4355;
                                                                                                                                                                        }
                                                                                                                                                                        case 77: {
                                                                                                                                                                            break Label_4355;
                                                                                                                                                                        }
                                                                                                                                                                        case 76: {
                                                                                                                                                                            break Label_4355;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                case 57: {
                                                                                                                                                                    break Label_4212;
                                                                                                                                                                }
                                                                                                                                                                case 56: {
                                                                                                                                                                    break Label_4212;
                                                                                                                                                                }
                                                                                                                                                                case 55: {
                                                                                                                                                                    break Label_4212;
                                                                                                                                                                }
                                                                                                                                                                case 54: {
                                                                                                                                                                    break Label_4355;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        case 46: {
                                                                                                                                                            try {
                                                                                                                                                                ((Context)activity).getPackageManager().getPackageInfo("com.android.vending", 0);
                                                                                                                                                                b = true;
                                                                                                                                                            }
                                                                                                                                                            catch (final PackageManager$NameNotFoundException ex) {
                                                                                                                                                                b = false;
                                                                                                                                                            }
                                                                                                                                                            if (b) {
                                                                                                                                                                ex = (PackageManager$NameNotFoundException)new Intent("android.intent.action.VIEW", Uri.parse(sej.a((Context)activity, ((Context)activity).getPackageName()))).addFlags(1073741824);
                                                                                                                                                                break Label_5053;
                                                                                                                                                            }
                                                                                                                                                            p88.f().b(2131955772, 1);
                                                                                                                                                            break Label_4355;
                                                                                                                                                        }
                                                                                                                                                        case 45: {
                                                                                                                                                            if (a.l()) {
                                                                                                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                                p88.f().e((CharSequence)((Context)activity).getString(2131958701), 1);
                                                                                                                                                                break Label_5053;
                                                                                                                                                            }
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)new Intent((Context)activity, (Class)ContentPreferencesSettingsActivity.class).putExtra("source", z.getQueryParameter("source"));
                                                                                                                                                            break Label_5053;
                                                                                                                                                        }
                                                                                                                                                        case 44: {
                                                                                                                                                            if (a.g.a()) {
                                                                                                                                                                tnl.a(k).c(true);
                                                                                                                                                                break Label_4355;
                                                                                                                                                            }
                                                                                                                                                            break Label_4355;
                                                                                                                                                        }
                                                                                                                                                        case 43: {
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                                                                                                            break Label_5053;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                case 41: {
                                                                                                                                                    break Label_3754;
                                                                                                                                                }
                                                                                                                                                case 40: {
                                                                                                                                                    break Label_3754;
                                                                                                                                                }
                                                                                                                                                case 39: {
                                                                                                                                                    break Label_3754;
                                                                                                                                                }
                                                                                                                                                case 38: {
                                                                                                                                                    break Label_3754;
                                                                                                                                                }
                                                                                                                                                case 36:
                                                                                                                                                case 37: {
                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.f(activity, z, z.getQueryParameter("text"));
                                                                                                                                                    break Label_5053;
                                                                                                                                                }
                                                                                                                                                case 35: {
                                                                                                                                                    ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (zm)((h4j)a.n((String)pathSegments.get(0))).e());
                                                                                                                                                    break Label_5053;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        case 26:
                                                                                                                                        case 27:
                                                                                                                                        case 28:
                                                                                                                                        case 29: {
                                                                                                                                            break Label_3292;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                case 24: {
                                                                                                                                    a3 = new z6c.a();
                                                                                                                                    a4 = new f8c.a();
                                                                                                                                    a4.a = "all_subscribed_lists_timeline";
                                                                                                                                    a4.b = new e8c(new String[] { "user", "timeline_response", "timeline" });
                                                                                                                                    ((sjg)a4.c).w((Object)"screen_name", (Object)pathSegments.get(0));
                                                                                                                                    ((sjg)a4.c).w((Object)"includeTweetVisibilityNudge", (Object)fiy.d());
                                                                                                                                    a3.t((f8c)a4.e());
                                                                                                                                    a3.u();
                                                                                                                                    a3.v();
                                                                                                                                    a3.x(((Context)activity).getString(2131953633));
                                                                                                                                    ex = (PackageManager$NameNotFoundException)a3.e();
                                                                                                                                    ((Context)activity).startActivity(a.d.a((Context)activity, (zm)ex));
                                                                                                                                    break Label_4355;
                                                                                                                                }
                                                                                                                                case 22: {
                                                                                                                                    build = new Uri$Builder().scheme("twitter").authority("user").appendQueryParameter("screen_name", (String)pathSegments.get(1)).build();
                                                                                                                                    d2 = a.d;
                                                                                                                                    c7l$a = new c7l$a();
                                                                                                                                    c7l$a.f = build;
                                                                                                                                    c7l$a.a = a.e;
                                                                                                                                    ex = (PackageManager$NameNotFoundException)d2.a((Context)activity, (zm)((h4j)c7l$a).e());
                                                                                                                                    break Label_5053;
                                                                                                                                }
                                                                                                                                case 23: {
                                                                                                                                    break Label_4355;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        case 174: {
                                                                                                                            ex = (PackageManager$NameNotFoundException)bn.a().a((Context)activity, (zm)new blx(new WebauthnArgs((pbg)null, (String)null, true)));
                                                                                                                            break Label_5053;
                                                                                                                        }
                                                                                                                        case 173: {
                                                                                                                            a5 = null;
                                                                                                                            a6 = qm2.a;
                                                                                                                            lastPathSegment = z.getLastPathSegment();
                                                                                                                            if (pjr.g((CharSequence)lastPathSegment)) {
                                                                                                                                a5 = a.d.a((Context)activity, (zm)new jh2(lastPathSegment, "LexDirectFull", false, (vo6)null, 0L));
                                                                                                                            }
                                                                                                                            if ((ex = (PackageManager$NameNotFoundException)a5) != null) {
                                                                                                                                break Label_5053;
                                                                                                                            }
                                                                                                                            if (qm2.a.match(z) == 0) {
                                                                                                                                ex = (PackageManager$NameNotFoundException)e7f.h(activity, z);
                                                                                                                                break Label_5053;
                                                                                                                            }
                                                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                            break Label_5053;
                                                                                                                        }
                                                                                                                        case 172: {
                                                                                                                            o = (a7 = null);
                                                                                                                            if (dta.b().b("live_event_experience_enabled", true)) {
                                                                                                                                a7 = o;
                                                                                                                                if (!"INVALID_ID".equals(pzf.c(z))) {
                                                                                                                                    a7 = a.d.a((Context)activity, (zm)new tvf((LiveEventConfiguration)((h4j)pzf.b(z)).e()));
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if ((ex = (PackageManager$NameNotFoundException)a7) != null) {
                                                                                                                                break Label_5053;
                                                                                                                            }
                                                                                                                            ex = (PackageManager$NameNotFoundException)z;
                                                                                                                            if (pzf.e(z.toString())) {
                                                                                                                                ex = (PackageManager$NameNotFoundException)Uri.parse("https://mobile.twitter.com/i/events/*".replace("*", pzf.c(z)));
                                                                                                                            }
                                                                                                                            string = ((Uri)ex).toString();
                                                                                                                            if (string != null && pzf.e.t(Uri.parse(string), false) == 0) {
                                                                                                                                a.m(activity, (Uri)ex, true);
                                                                                                                                ex = (PackageManager$NameNotFoundException)a7;
                                                                                                                                break Label_5053;
                                                                                                                            }
                                                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                            break Label_5053;
                                                                                                                        }
                                                                                                                        case 171: {
                                                                                                                            queryParameter = z.getQueryParameter("title");
                                                                                                                            if (queryParameter != null) {
                                                                                                                                ex = (PackageManager$NameNotFoundException)queryParameter;
                                                                                                                            }
                                                                                                                            queryParameter2 = z.getQueryParameter("diid");
                                                                                                                            queryParameter3 = z.getQueryParameter("dis");
                                                                                                                            z2 = af.z("icymi ", queryParameter3, " ", queryParameter2);
                                                                                                                            d3 = a.d;
                                                                                                                            y6w$a = new y6w$a();
                                                                                                                            y6w$a.a = "timeline/icymi.json";
                                                                                                                            a8 = new fov.a();
                                                                                                                            a8.c = (String)ex;
                                                                                                                            a8.e = z2;
                                                                                                                            t = sjg.t();
                                                                                                                            t.w((Object)"diid", (Object)queryParameter2);
                                                                                                                            t.w((Object)"dis", (Object)queryParameter3);
                                                                                                                            a8.b = new tpv((Map)((h4j)t).e());
                                                                                                                            y6w$a.b = (fov)a8.e();
                                                                                                                            ex = (PackageManager$NameNotFoundException)d3.a((Context)activity, (zm)new v0c((y6w)((h4j)y6w$a).e()));
                                                                                                                            break Label_5053;
                                                                                                                        }
                                                                                                                        case 170: {
                                                                                                                            ex = null;
                                                                                                                            a9 = new ksp.a();
                                                                                                                            a9.b = true;
                                                                                                                            a.h.b((Context)activity, (lwp)new axp(z.toString()), rba.a(a.e.e(), ""), (ksp)a9.e(), (List)Collections.emptyList());
                                                                                                                            saw.b((okm)new zf4(nca.Companion.b(a.e.e(), "", "share_via")));
                                                                                                                            break Label_5053;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 132: {
                                                                                                                    if (a.l()) {
                                                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                        p88.f().e((CharSequence)((Context)activity).getString(2131958701), 1);
                                                                                                                        break Label_5053;
                                                                                                                    }
                                                                                                                    ex = (PackageManager$NameNotFoundException)new oxi();
                                                                                                                    ((Context)activity).startActivity(a.d.a((Context)activity, (zm)ex));
                                                                                                                    break Label_4355;
                                                                                                                }
                                                                                                                case 131: {
                                                                                                                    a10 = zq7.a();
                                                                                                                    kk1$b = new kk1$b();
                                                                                                                    ((kk1$a)kk1$b).w(activity.getIntent().getStringExtra("android.intent.extra.TEXT"));
                                                                                                                    e = ((h4j)kk1$b).e();
                                                                                                                    a11 = w4j.a;
                                                                                                                    ex = (PackageManager$NameNotFoundException)a.o(activity, a10.a((Context)activity, (kk1)e));
                                                                                                                    break Label_5053;
                                                                                                                }
                                                                                                                case 130: {
                                                                                                                    ex = (PackageManager$NameNotFoundException)a.d(activity, a.j(activity), false);
                                                                                                                    break Label_5053;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        case 110: {
                                                                                                            ex = (PackageManager$NameNotFoundException)rbl.a((Context)activity, k, m.b(), (hil)null, (jev)null, (qzo)null, true);
                                                                                                            break Label_5053;
                                                                                                        }
                                                                                                        case 109: {
                                                                                                            if (Build$VERSION.SDK_INT < 33) {
                                                                                                                break Label_4355;
                                                                                                            }
                                                                                                            if (a.k.f((Context)activity, "android.permission.POST_NOTIFICATIONS") == 3) {
                                                                                                                activity.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS"));
                                                                                                                ex = (PackageManager$NameNotFoundException)a.e.e();
                                                                                                                saw.b((okm)new zf4(nca.Companion.b((taa)ex, "notification", "system_settings")));
                                                                                                                break Label_4355;
                                                                                                            }
                                                                                                            a.k.i(1981, activity, new String[] { "android.permission.POST_NOTIFICATIONS" });
                                                                                                            ex = (PackageManager$NameNotFoundException)a.e.e();
                                                                                                            saw.b((okm)new zf4(nca.Companion.b((taa)ex, "notification", "system_permission")));
                                                                                                            break Label_4355;
                                                                                                        }
                                                                                                        case 108: {
                                                                                                            break Label_4355;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                case 88: {
                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                    break Label_5053;
                                                                                                }
                                                                                                case 86: {
                                                                                                    parse = UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                                                    if (((gew)a.a).n(parse)) {
                                                                                                        ((gew)a.a).i(parse);
                                                                                                    }
                                                                                                    queryParameter4 = z.getQueryParameter("welcome_message_id");
                                                                                                    queryParameter5 = z.getQueryParameter("text");
                                                                                                    o2 = pjr.o(z.getQueryParameter("recipient_id"), -1L);
                                                                                                    queryParameter6 = z.getQueryParameter("recipient_screen_name");
                                                                                                    if (pjr.g((CharSequence)queryParameter6)) {
                                                                                                        d4 = sh7.d();
                                                                                                        kk7$b = new kk7$b();
                                                                                                        ((BaseBundle)((zl1$a)kk7$b).a).putString("recipient_screen_name", queryParameter6);
                                                                                                        a12 = w4j.a;
                                                                                                        ((kk1$a)kk7$b).v();
                                                                                                        ((kk1$a)kk7$b).w(queryParameter5);
                                                                                                        ((kk7$a)kk7$b).J(queryParameter4);
                                                                                                        ex = (PackageManager$NameNotFoundException)d4.e((Context)activity, (kk7)((h4j)kk7$b).e());
                                                                                                        break Label_5053;
                                                                                                    }
                                                                                                    if (o2 != -1L) {
                                                                                                        d5 = sh7.d();
                                                                                                        kk7$b2 = new kk7$b();
                                                                                                        ((kk7$a)kk7$b2).G(o2);
                                                                                                        ((kk1$a)kk7$b2).v();
                                                                                                        ((kk1$a)kk7$b2).w(queryParameter5);
                                                                                                        ((kk7$a)kk7$b2).J(queryParameter4);
                                                                                                        ex = (PackageManager$NameNotFoundException)d5.e((Context)activity, (kk7)((h4j)kk7$b2).e());
                                                                                                        break Label_5053;
                                                                                                    }
                                                                                                    a13 = zq7.a();
                                                                                                    bi7$a = new bi7$a();
                                                                                                    ((kk1$a)bi7$a).v();
                                                                                                    ((kk1$a)bi7$a).w(queryParameter5);
                                                                                                    ex = (PackageManager$NameNotFoundException)a13.f((Context)activity, (bi7)((h4j)bi7$a).e());
                                                                                                    break Label_5053;
                                                                                                }
                                                                                                case 85: {
                                                                                                    queryParameter7 = z.getQueryParameter("user");
                                                                                                    if (queryParameter7 != null) {
                                                                                                        UserIdentifier.getCurrent();
                                                                                                        if (!queryParameter7.equals(a.a.m().b())) {
                                                                                                            e2 = a.a.e(queryParameter7);
                                                                                                            if (e2 != null) {
                                                                                                                ((gew)a.a).i(e2.k());
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    ex = (PackageManager$NameNotFoundException)((mec)activity).v0().h();
                                                                                                    string2 = z.toString();
                                                                                                    zzd.f((Object)string2, "value");
                                                                                                    ((mbi)ex).b((ContentViewArgs)new AdsCompanionContentViewArgs(string2));
                                                                                                    break Label_4355;
                                                                                                }
                                                                                                case 84: {
                                                                                                    if (pf8.m(m)) {
                                                                                                        ex = (PackageManager$NameNotFoundException)((mec)activity).v0().h();
                                                                                                        resources = ((Context)activity).getResources();
                                                                                                        zzd.f((Object)resources, "resources");
                                                                                                        string3 = resources.getString(2131951921);
                                                                                                        zzd.e((Object)string3, "resources.getString(R.string.ads_companion_url)");
                                                                                                        ((mbi)ex).b((ContentViewArgs)new AdsCompanionContentViewArgs(string3));
                                                                                                        break Label_4355;
                                                                                                    }
                                                                                                    ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                    break Label_5053;
                                                                                                }
                                                                                                case 82:
                                                                                                case 83: {
                                                                                                    ex = (PackageManager$NameNotFoundException)psi.a().e();
                                                                                                    break Label_5053;
                                                                                                }
                                                                                                case 87: {
                                                                                                    break Label_3292;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    case 31: {
                                                                                        break Label_5230;
                                                                                    }
                                                                                    case 17:
                                                                                    case 164: {
                                                                                        final ldj$a ldj$a = new ldj$a((Context)activity);
                                                                                        final sbs$a sbs$a = new sbs$a();
                                                                                        sbs$a.p("contacts_live_sync");
                                                                                        ldj$a.d = (sbs)((h4j)sbs$a).e();
                                                                                        ex = (PackageManager$NameNotFoundException)((ldj)((h4j)ldj$a).e()).a().setFlags(335544320);
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 100: {
                                                                                        final Context applicationContext = ((Context)activity).getApplicationContext();
                                                                                        final String queryParameter10 = z.getQueryParameter("refsrc");
                                                                                        final String string4 = applicationContext.getString(2131955635);
                                                                                        Label_3555: {
                                                                                            if (queryParameter10 != null && queryParameter10.startsWith(string4)) {
                                                                                                final String substring = queryParameter10.substring(applicationContext.getString(2131955635).length(), queryParameter10.length());
                                                                                                final int[] b2 = tdy.b1;
                                                                                                while (true) {
                                                                                                    for (int i = 0; i < 2; ++i) {
                                                                                                        final String string5 = applicationContext.getString(b2[i]);
                                                                                                        final StringBuilder sb = new StringBuilder();
                                                                                                        sb.append("_");
                                                                                                        sb.append(string5);
                                                                                                        if (substring.equals(sb.toString())) {
                                                                                                            final String o4 = d0p.o(new String[] { "login", "", "forgot_password", string5, "success" });
                                                                                                            final zf4 zf4 = new zf4(UserIdentifier.getCurrent());
                                                                                                            zf4.q(new String[] { o4 });
                                                                                                            saw.b((okm)zf4);
                                                                                                            break Label_3555;
                                                                                                        }
                                                                                                    }
                                                                                                    final String string5 = "";
                                                                                                    continue Label_4257_Outer;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        final UserIdentifier parse2 = UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                                        if (((gew)a.a).n(parse2)) {
                                                                                            ((gew)a.a).i(parse2);
                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity).setFlags(67108864);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)z.getQueryParameter("screen_name");
                                                                                        if (p) {
                                                                                            activity.startActivity(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)ex, null, false, null, null)));
                                                                                            break Label_4355;
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)LoginArgs.attachExtraIntent(a.i.a((Context)activity, (ContentViewArgs)new LoginArgs(false, (String)ex, null, false, null, null)), a.b(activity));
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 112: {
                                                                                        if (p) {
                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                            break Label_5053;
                                                                                        }
                                                                                        final ldj$a ldj$a2 = new ldj$a((Context)activity);
                                                                                        final sbs$a j = yqh.j("signup");
                                                                                        j.d = "deeplink";
                                                                                        ldj$a2.d = (sbs)((h4j)j).e();
                                                                                        ex = (PackageManager$NameNotFoundException)((ldj)((h4j)ldj$a2).e()).a();
                                                                                        break Label_5053;
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
                                                                                        final boolean b3 = "1".equals(z.getQueryParameter("df")) && queryParameter13 != null;
                                                                                        final c7l$a c7l$a2 = new c7l$a();
                                                                                        c7l$a2.h = parse3.getId();
                                                                                        c7l$a2.c = queryParameter13;
                                                                                        c7l$a2.a = a.e;
                                                                                        if (b3) {
                                                                                            c7l$a2.e = j8l.i.toString();
                                                                                        }
                                                                                        ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (zm)((h4j)c7l$a2).e());
                                                                                        break Label_5053;
                                                                                    }
                                                                                    case 70: {
                                                                                        break Label_4355;
                                                                                    }
                                                                                    case 147: {
                                                                                        break Label_4632;
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        case 15: {
                                                                            ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                            break Label_5053;
                                                                        }
                                                                        case 13:
                                                                        case 14: {
                                                                            ex = (PackageManager$NameNotFoundException)a.i(activity, z, false);
                                                                            break Label_5053;
                                                                        }
                                                                        case 12: {
                                                                            final long o5 = pjr.o((String)pathSegments.get(2), -1L);
                                                                            if (o5 != -1L) {
                                                                                final th7 d7 = sh7.d();
                                                                                final kk7$b kk7$b3 = new kk7$b();
                                                                                ((kk7$a)kk7$b3).G(o5);
                                                                                ex = (PackageManager$NameNotFoundException)d7.e((Context)activity, (kk7)((h4j)kk7$b3).e());
                                                                                break Label_5053;
                                                                            }
                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                            break Label_5053;
                                                                        }
                                                                        case 8: {
                                                                            ex = (PackageManager$NameNotFoundException)zq7.a().b((Context)activity);
                                                                            break Label_5053;
                                                                        }
                                                                        case 9: {
                                                                            final long o6 = pjr.o(z.getQueryParameter("user_id"), -1L);
                                                                            if (a2 == 57 && o6 == -1L) {
                                                                                ex = (PackageManager$NameNotFoundException)e7f.h(activity, z);
                                                                                break Label_5053;
                                                                            }
                                                                            final th7 d8 = sh7.d();
                                                                            final kk7$b kk7$b4 = new kk7$b();
                                                                            ((kk7$a)kk7$b4).G(o6);
                                                                            ex = (PackageManager$NameNotFoundException)d8.e((Context)activity, (kk7)((h4j)kk7$b4).e());
                                                                            break Label_5053;
                                                                        }
                                                                        case 11: {
                                                                            ex = (PackageManager$NameNotFoundException)zq7.a().e((Context)activity);
                                                                            break Label_5053;
                                                                        }
                                                                        case 10: {
                                                                            break Label_4953;
                                                                        }
                                                                    }
                                                                }
                                                                ex = (PackageManager$NameNotFoundException)((Context)activity).getPackageName();
                                                                PackageManager packageManager2;
                                                                PackageManager packageManager = null;
                                                                String s2;
                                                                int n;
                                                                int n2;
                                                                Uri data;
                                                                Uri e3;
                                                                c7l$a n3;
                                                                long long1;
                                                                reu reu;
                                                                String queryParameter14;
                                                                c7l$a n4;
                                                                jsi b4;
                                                                Object a14;
                                                                PackageManager$NameNotFoundException ex3;
                                                                Intent intent2;
                                                                Bundle extras;
                                                                PackageManager$NameNotFoundException ex4;
                                                                String s3;
                                                                th7 d9;
                                                                String s4;
                                                                th7 d10;
                                                                String queryParameter15;
                                                                sbs$a sbs$a2;
                                                                cn d11;
                                                                evl s5;
                                                                Block_109_Outer:Block_101_Outer:Block_106_Outer:Block_94_Outer:Label_4254_Outer:
                                                                while (true) {
                                                                    try {
                                                                        packageManager = (packageManager2 = ((Context)activity).getPackageManager());
                                                                        s2 = "com.android.vending";
                                                                        n = 0;
                                                                        packageManager2.getPackageInfo(s2, n);
                                                                        n2 = 1;
                                                                        break Label_4257;
                                                                    }
                                                                    catch (final PackageManager$NameNotFoundException ex2) {}
                                                                    while (true) {
                                                                        try {
                                                                            packageManager2 = packageManager;
                                                                            s2 = "com.android.vending";
                                                                            n = 0;
                                                                            packageManager2.getPackageInfo(s2, n);
                                                                            n2 = 1;
                                                                            if (n2 != 0) {
                                                                                ex = (PackageManager$NameNotFoundException)sej.a((Context)activity, (String)ex);
                                                                            }
                                                                            else {
                                                                                ex = (PackageManager$NameNotFoundException)((Context)activity).getString(2131954237, new Object[] { ex });
                                                                            }
                                                                            ex = (PackageManager$NameNotFoundException)new Intent("android.intent.action.VIEW", Uri.parse((String)ex));
                                                                            if (ex != null) {
                                                                                data = activity.getIntent().getData();
                                                                                if (data != null) {
                                                                                    ((Intent)ex).putExtra("deep_link_uri", data.toString());
                                                                                }
                                                                                e3 = hn.e(activity);
                                                                                if (e3 != null) {
                                                                                    ((Intent)ex).putExtra("android.intent.extra.REFERRER", e3.toString());
                                                                                }
                                                                                activity.startActivity((Intent)ex);
                                                                            }
                                                                            return;
                                                                            Label_4559: {
                                                                                ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                            }
                                                                            continue Label_4257_Outer;
                                                                            Label_4762:
                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                            continue Label_4257_Outer;
                                                                            ex = (PackageManager$NameNotFoundException)psi.a().e();
                                                                            continue Label_4257_Outer;
                                                                            ex = (PackageManager$NameNotFoundException)UserIdentifier.parse(z.getQueryParameter("user_id"));
                                                                            iftrue(Label_5175:)(!((gew)a.a).n((UserIdentifier)ex));
                                                                            Label_4605: {
                                                                                while (true) {
                                                                                    Block_93: {
                                                                                        while (true) {
                                                                                            Block_105: {
                                                                                                Label_5319: {
                                                                                                    Label_4389: {
                                                                                                    Block_89_Outer:
                                                                                                        while (true) {
                                                                                                            Block_100: {
                                                                                                            Block_86:
                                                                                                                while (true) {
                                                                                                                    Label_4789: {
                                                                                                                        Label_4940: {
                                                                                                                            Label_4689:Block_108_Outer:Label_5306_Outer:
                                                                                                                            while (true) {
                                                                                                                                Block_88: {
                                                                                                                                    while (true) {
                                                                                                                                    Block_103:
                                                                                                                                        while (true) {
                                                                                                                                            Block_102: {
                                                                                                                                                Label_4701: {
                                                                                                                                                Label_5306:
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            Block_96: {
                                                                                                                                                                while (true) {
                                                                                                                                                                    Block_98: {
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Block_97: {
                                                                                                                                                                                Block_104: {
                                                                                                                                                                                    break Block_104;
                                                                                                                                                                                    n3.e = ((Uri)ex).toString();
                                                                                                                                                                                    break Label_5319;
                                                                                                                                                                                    try {
                                                                                                                                                                                        long1 = Long.parseLong(pathSegments.get(2));
                                                                                                                                                                                        reu = new reu((Context)activity, a.d);
                                                                                                                                                                                        reu.a(long1);
                                                                                                                                                                                        ex = (PackageManager$NameNotFoundException)reu.e();
                                                                                                                                                                                        continue Label_4257_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (final NumberFormatException ex) {
                                                                                                                                                                                        e9a.d((Throwable)ex);
                                                                                                                                                                                    }
                                                                                                                                                                                    break Label_4355;
                                                                                                                                                                                    Block_95: {
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            n4 = a.n(queryParameter14);
                                                                                                                                                                                            iftrue(Label_4685:)(a2 == 147);
                                                                                                                                                                                            break Block_93;
                                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)b4.v;
                                                                                                                                                                                            break Label_4940;
                                                                                                                                                                                            iftrue(Label_4701:)(ex == null);
                                                                                                                                                                                            break Block_95;
                                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)a.e(activity, z, true, (String)null);
                                                                                                                                                                                            continue Label_4257_Outer;
                                                                                                                                                                                            a14 = null;
                                                                                                                                                                                            iftrue(Label_5035:)(!"smart_follow".equals(z.getQueryParameter("steps")));
                                                                                                                                                                                            break Block_102;
                                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                                                                            continue Label_4257_Outer;
                                                                                                                                                                                            ex = null;
                                                                                                                                                                                            ex3 = null;
                                                                                                                                                                                            queryParameter14 = z.getQueryParameter("screen_name");
                                                                                                                                                                                            iftrue(Label_5053:)(queryParameter14 == null);
                                                                                                                                                                                            continue Block_101_Outer;
                                                                                                                                                                                        }
                                                                                                                                                                                        extras = intent2.getExtras();
                                                                                                                                                                                        ex = ex4;
                                                                                                                                                                                        iftrue(Label_4940:)(extras == null);
                                                                                                                                                                                        break Block_100;
                                                                                                                                                                                        ex = null;
                                                                                                                                                                                        iftrue(Label_4789:)(activity.getIntent() == null);
                                                                                                                                                                                        break Block_97;
                                                                                                                                                                                        ex = null;
                                                                                                                                                                                        n3 = a.n((String)pathSegments.get(0));
                                                                                                                                                                                        iftrue(Label_5302:)(a2 == 26);
                                                                                                                                                                                        break Block_105;
                                                                                                                                                                                    }
                                                                                                                                                                                    n4.e = ((Uri)ex).toString();
                                                                                                                                                                                    break Label_4701;
                                                                                                                                                                                    break Label_5306;
                                                                                                                                                                                    Label_5281:
                                                                                                                                                                                    ex = (PackageManager$NameNotFoundException)j8l.a;
                                                                                                                                                                                    break Label_5306;
                                                                                                                                                                                    Label_4621:
                                                                                                                                                                                    a.m(activity, z, false);
                                                                                                                                                                                    continue Label_4257_Outer;
                                                                                                                                                                                }
                                                                                                                                                                                ((gew)a.a).i((UserIdentifier)ex);
                                                                                                                                                                                s3 = pathSegments.get(1);
                                                                                                                                                                                d9 = sh7.d();
                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)new kk7$b();
                                                                                                                                                                                ((kk7$a)ex).A(s3);
                                                                                                                                                                                ((kk1$a)ex).v();
                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)d9.e((Context)activity, (kk7)((h4j)ex).e());
                                                                                                                                                                                continue Label_4257_Outer;
                                                                                                                                                                                Label_4678:
                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)j8l.a;
                                                                                                                                                                                continue Label_4689;
                                                                                                                                                                                iftrue(Label_4762:)(!dta.b().b("native_mobile_sms_2fa_enabled", false));
                                                                                                                                                                                break Block_96;
                                                                                                                                                                                Label_5295:
                                                                                                                                                                                ex = (PackageManager$NameNotFoundException)j8l.e;
                                                                                                                                                                                break Label_5306;
                                                                                                                                                                                ex = null;
                                                                                                                                                                                continue Label_4257_Outer;
                                                                                                                                                                            }
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)activity.getIntent().getExtras();
                                                                                                                                                                            break Label_4789;
                                                                                                                                                                            Label_5175:
                                                                                                                                                                            s4 = pathSegments.get(1);
                                                                                                                                                                            d10 = sh7.d();
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)new kk7$b();
                                                                                                                                                                            ((kk7$a)ex).A(s4);
                                                                                                                                                                            ((kk1$a)ex).v();
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)d10.e((Context)activity, (kk7)((h4j)ex).e());
                                                                                                                                                                            continue Label_4257_Outer;
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)z.getQueryParameter("att");
                                                                                                                                                                            iftrue(Label_4389:)(ex == null);
                                                                                                                                                                            break Block_86;
                                                                                                                                                                            ex4 = null;
                                                                                                                                                                            intent2 = activity.getIntent();
                                                                                                                                                                            ex = ex4;
                                                                                                                                                                            iftrue(Label_4940:)(intent2 == null);
                                                                                                                                                                            break Block_98;
                                                                                                                                                                            Label_4586:
                                                                                                                                                                            iftrue(Label_4621:)(a.k(z) || p5w.r(z));
                                                                                                                                                                            break Label_4605;
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)a.g(activity, z, 62, (String)null);
                                                                                                                                                                            continue Label_4257_Outer;
                                                                                                                                                                            Label_5288:
                                                                                                                                                                            ex = (PackageManager$NameNotFoundException)j8l.c;
                                                                                                                                                                            iftrue(Label_5319:)(ex == null);
                                                                                                                                                                            continue Block_101_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        ex = null;
                                                                                                                                                                        a.j.b(z.getQueryParameter("bounce_location"), true, null);
                                                                                                                                                                        continue Label_4257_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    ex = ex4;
                                                                                                                                                                    iftrue(Label_4940:)(!yvj.a(intent2));
                                                                                                                                                                    continue Block_108_Outer;
                                                                                                                                                                }
                                                                                                                                                                ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, asy.x(k, m.getUser(), c9s.Z0));
                                                                                                                                                                continue Label_4257_Outer;
                                                                                                                                                            }
                                                                                                                                                            ex = (PackageManager$NameNotFoundException)new Intent((Context)activity, (Class)BackupCodeActivity.class).putExtra("bc_account_id", k.getId());
                                                                                                                                                            continue Label_4257_Outer;
                                                                                                                                                            iftrue(Label_5288:)(a2 == 73);
                                                                                                                                                            iftrue(Label_5281:)(a2 == 87);
                                                                                                                                                            continue Label_5306_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_5302:
                                                                                                                                                        ex = (PackageManager$NameNotFoundException)j8l.f;
                                                                                                                                                        continue Label_5306;
                                                                                                                                                    }
                                                                                                                                                    ex = (PackageManager$NameNotFoundException)z.getQueryParameter("action");
                                                                                                                                                    queryParameter15 = z.getQueryParameter("mode");
                                                                                                                                                    iftrue(Label_4559:)(!"compose".equals(ex) || !"poll".equals(queryParameter15));
                                                                                                                                                    break Block_88;
                                                                                                                                                }
                                                                                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (zm)((h4j)n4).e());
                                                                                                                                                continue Label_4257_Outer;
                                                                                                                                                iftrue(Label_5053:)((ex = (PackageManager$NameNotFoundException)a14) != null);
                                                                                                                                                break Block_103;
                                                                                                                                            }
                                                                                                                                            ex = (PackageManager$NameNotFoundException)new ldj$a((Context)activity);
                                                                                                                                            sbs$a2 = new sbs$a();
                                                                                                                                            sbs$a2.p("rux");
                                                                                                                                            ((ldj$a)ex).d = (sbs)((h4j)sbs$a2).e();
                                                                                                                                            a14 = ((ldj)((h4j)ex).e()).a();
                                                                                                                                            continue Block_94_Outer;
                                                                                                                                        }
                                                                                                                                        ex = (PackageManager$NameNotFoundException)a.b(activity);
                                                                                                                                        continue Label_4257_Outer;
                                                                                                                                        iftrue(Label_4389:)(!dta.b().b("auth_timeline_token_tracking_enabled", false));
                                                                                                                                        continue Block_106_Outer;
                                                                                                                                    }
                                                                                                                                    Label_4685:
                                                                                                                                    ex = (PackageManager$NameNotFoundException)j8l.c;
                                                                                                                                    continue Label_4689;
                                                                                                                                }
                                                                                                                                d11 = a.d;
                                                                                                                                ex = (PackageManager$NameNotFoundException)new o76();
                                                                                                                                ((o76)ex).g(5);
                                                                                                                                ((dj1)ex).mIntent.setFlags(67108864);
                                                                                                                                ((o76)ex).q(false);
                                                                                                                                ex = (PackageManager$NameNotFoundException)d11.a((Context)activity, (zm)ex);
                                                                                                                                continue Label_4257_Outer;
                                                                                                                                ex = ex3;
                                                                                                                                continue Label_4689;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        ex = (PackageManager$NameNotFoundException)a.e(activity, z, false, (String)ex);
                                                                                                                        continue Label_4257_Outer;
                                                                                                                        ex = (PackageManager$NameNotFoundException)a.g(activity, z, 63, (String)null);
                                                                                                                        continue Label_4257_Outer;
                                                                                                                    }
                                                                                                                    s5 = new kk7((Bundle)ex).s();
                                                                                                                    pf8.r(s5);
                                                                                                                    ex = (PackageManager$NameNotFoundException)new reu((Context)activity);
                                                                                                                    ((reu)ex).a(s5.d);
                                                                                                                    ex = (PackageManager$NameNotFoundException)((reu)ex).e();
                                                                                                                    continue Label_4257_Outer;
                                                                                                                    iftrue(Label_4586:)(!p5w.q(z));
                                                                                                                    continue Block_106_Outer;
                                                                                                                }
                                                                                                                s51.c((String)ex);
                                                                                                                break Label_4389;
                                                                                                            }
                                                                                                            b4 = oer.b(extras);
                                                                                                            ex = ex4;
                                                                                                            iftrue(Label_4940:)(b4 == null);
                                                                                                            continue Block_89_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    ex = (PackageManager$NameNotFoundException)a.i.a((Context)activity, (ContentViewArgs)new PasswordResetArgs(z.toString(), (String)null));
                                                                                                    continue Label_4257_Outer;
                                                                                                }
                                                                                                ex = (PackageManager$NameNotFoundException)a.d.a((Context)activity, (zm)((h4j)n3).e());
                                                                                                continue Label_4257_Outer;
                                                                                            }
                                                                                            iftrue(Label_5295:)(a2 == 28);
                                                                                            continue Block_94_Outer;
                                                                                        }
                                                                                        n2 = 0;
                                                                                        continue Block_109_Outer;
                                                                                    }
                                                                                    iftrue(Label_4678:)(a2 == 157);
                                                                                    continue Label_4254_Outer;
                                                                                }
                                                                                ex = (PackageManager$NameNotFoundException)a.c(activity, z.getQueryParameter("user_id"), z.getQueryParameter("screen_name"));
                                                                                continue Label_4257_Outer;
                                                                            }
                                                                            p88.f().b(2131956959, 1);
                                                                            continue Label_4257_Outer;
                                                                        }
                                                                        catch (final PackageManager$NameNotFoundException ex5) {
                                                                            continue;
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
