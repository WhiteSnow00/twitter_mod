import android.app.Activity;
import android.view.View;
import java.util.Iterator;
import java.util.Comparator;
import android.accounts.Account;
import java.util.List;
import java.util.Objects;
import android.content.ComponentName;
import android.os.Handler;
import android.content.Context;
import android.accounts.AccountManager;
import android.view.View$OnClickListener;
import android.text.method.LinkMovementMethod;
import android.widget.TextView$BufferType;
import android.text.SpannableString;
import android.widget.TextView;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.ui.user.UserView;
import android.widget.Button;
import android.accounts.OnAccountsUpdateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bj0 extends vbv implements OnAccountsUpdateListener, b
{
    public b51 X0;
    public final kxo Y0;
    public final String Z0;
    public cgv a1;
    public final Button b1;
    public final UserView c1;
    public final fe8 d1;
    
    public bj0(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final Bundle bundle, final xba<bo> xba2, final ij ij, final um6 um6, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.d1 = new fe8((Object)this, 18);
        f.i(r8x.k(), (n93)new aj0((Object)this, (Object)um6, 0));
        final String stringExtra = intent.getStringExtra("ck");
        this.Z0 = stringExtra;
        if (bundle == null) {
            this.Z4("impression");
        }
        final ul1 ul1 = (ul1)cnb;
        adw d;
        if ((d = ul1.i1.get("selected_user")) == null) {
            d = zcw.d();
        }
        final String h4 = ((u9)this).H4(2131952095);
        n0r.b((TextView)((u9)this).C4(2131429728), (SpannableString)null, resources.getString(2131952096, new Object[] { h4 }), h4, "https://help.twitter.com/managing-your-account/connect-or-revoke-access-to-third-party-apps");
        final TextView textView = (TextView)((u9)this).C4(2131427704);
        final String string = ((Context)cnb).getString(2131958103);
        final String string2 = ((Context)cnb).getString(2131958098);
        final String string3 = ((Context)cnb).getString(2131958076);
        final String string4 = ((Context)cnb).getString(2131952120, new Object[] { string, string2, string3 });
        final SpannableString spannableString = new SpannableString((CharSequence)string4);
        n0r.a(spannableString, string4, string, ((Context)cnb).getString(2131958997));
        n0r.a(spannableString, string4, string2, ((Context)cnb).getString(2131955872));
        n0r.a(spannableString, string4, string3, ((Context)cnb).getString(2131952886));
        textView.setText((CharSequence)spannableString, TextView$BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        final String h5 = ((u9)this).H4(2131952091);
        n0r.b((TextView)((u9)this).C4(2131430992), (SpannableString)null, resources.getString(2131952117, new Object[] { h5 }), h5, "https://twitter.com/settings/applications");
        final Button b1 = (Button)((u9)this).C4(2131430444);
        ((View)b1).setEnabled(false);
        ((View)b1).setOnClickListener((View$OnClickListener)new mgk((Object)this, (Object)b1, 3));
        this.b1 = b1;
        ((View)((u9)this).C4(2131428076)).setOnClickListener((View$OnClickListener)new m0x((Object)this, 8));
        final UserView c1 = (UserView)((u9)this).C4(2131427426);
        this.c1 = c1;
        adw b2 = d;
        if (d.g()) {
            b2 = zcw.b(d.j().a);
        }
        if (b2.n()) {
            this.a5(b2.getUser());
        }
        final g8w g8w = new g8w((Object)this, (Object)ij, 3);
        ((View)c1).setOnClickListener((View$OnClickListener)g8w);
        ((u9)this).C4(2131427427).setOnClickListener((View$OnClickListener)g8w);
        AccountManager.get((Context)cnb).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, false);
        final boolean b3 = asa.b().b("account_oauth_scope_backend_enabled", false);
        final kxo y0 = ul1.i1.get("scope_string_presenter");
        if (y0 != null) {
            this.Y0 = y0;
        }
        else {
            if (b3) {
                this.Y0 = (kxo)new uf1();
            }
            else {
                this.Y0 = (kxo)new o5f(resources);
            }
            ul1.v("scope_string_presenter", this.Y0);
        }
        final b51 x0 = ul1.i1.get("auth_token_controller");
        if (x0 != null) {
            this.X0 = x0;
        }
        else {
            ul1.v("auth_token_controller", this.X0 = new b51(stringExtra, intent.getStringExtra("cs"), ((Context)cnb).getPackageManager(), (ComponentName)intent.getParcelableExtra("ca"), b3));
        }
        this.X0.b((b51.b)this);
        final b51 x2 = this.X0;
        Objects.requireNonNull(x2);
        rw0.c((oj)new qbk(x2, 5)).n(gmw.H()).q((oj)new wp1((Object)x2, 8));
        ro.a(xba2, 1, (n93<bo>)new hg1((Object)this, 6));
    }
    
    public final void N4() {
        AccountManager.get((Context)((u9)this).E0).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
        this.X0.b(null);
    }
    
    public final void W4(final int n) {
        m1f.e().c(n, 1);
        ((Activity)((u9)this).E0).finish();
    }
    
    public final void X4(final int n, final a a) {
        if (n != 200) {
            if (n != 401 && n != 403) {
                this.W4(2131951815);
            }
            else {
                this.W4(2131952092);
            }
        }
        else {
            jee.l((Object)a);
            final m3j a2 = a.a.a;
            ((Activity)((u9)this).E0).setResult(-1, new Intent().putExtra("tk", a2.a).putExtra("ts", a2.b).putExtra("screen_name", a.b).putExtra("user_id", a.c));
            ((Activity)((u9)this).E0).finish();
        }
    }
    
    public final void Y4(final l3j l3j) {
        if (l3j == null) {
            this.W4(2131951815);
        }
        else {
            ((u9)this).C4(2131430774).setVisibility(8);
            ((u9)this).C4(2131427703).setVisibility(0);
            ((TextView)((u9)this).C4(2131432076)).setText((CharSequence)((u9)this).M0.getString(2131952094, new Object[] { l3j.b }));
            final TextView textView = (TextView)((u9)this).C4(2131428639);
            if (!ikr.e((CharSequence)l3j.d)) {
                textView.setText((CharSequence)l3j.d);
            }
            else {
                ((View)textView).setVisibility(8);
            }
            final TextView textView2 = (TextView)((u9)this).C4(2131432453);
            if (!ikr.e((CharSequence)l3j.c)) {
                textView2.setText((CharSequence)l3j.c);
            }
            else {
                ((View)textView2).setVisibility(8);
            }
            final TextView textView3 = (TextView)((u9)this).C4(2131432005);
            if (l3j.f == null && l3j.e == null) {
                ((View)textView3).setVisibility(8);
            }
            else {
                final String h4 = ((u9)this).H4(2131952118);
                final String string = ((u9)this).M0.getString(2131958098);
                final String string2 = ((u9)this).M0.getString(2131952119, new Object[] { l3j.b, h4, string });
                final SpannableString spannableString = new SpannableString((CharSequence)string2);
                n0r.b(textView3, spannableString, string2, h4, l3j.f);
                n0r.b(textView3, spannableString, string2, string, l3j.e);
            }
            final List<String> a = this.Y0.a(l3j).a;
            ((TextView)((u9)this).C4(2131430550)).setText((CharSequence)((u9)this).M0.getString(2131952115, new Object[] { l3j.b }));
            ((TextView)((u9)this).C4(2131430549)).setText((CharSequence)ikr.h((CharSequence)"\n", (Iterable)a));
        }
    }
    
    public final void Z4(final String s) {
        final af4 af4 = new af4();
        ((u0p)af4).q(new String[] { "sso_sdk:::", s });
        if (this.Z0 != null) {
            ((u0p)af4).f(String.valueOf(5), this.Z0);
        }
        cbw.b((elm)af4);
    }
    
    public final void a5(final cgv cgv) {
        if (cgv != null) {
            this.c1.setUser(cgv);
            ((ul1)((u9)this).E0).v("selected_user", zcw.b(cgv.f()));
        }
        this.a1 = cgv;
        ((View)this.b1).setEnabled(cgv != null);
    }
    
    public final void onAccountsUpdated(final Account[] array) {
        final List b = rif.B((Comparator)adw.b, (Iterable)i5e.e((Iterable)zcw.c(), (xtk)xod.f));
        final boolean empty = b.isEmpty();
        final adw adw = null;
        if (empty) {
            this.a5(null);
            return;
        }
        final cgv a1 = this.a1;
        final Iterator iterator = b.iterator();
        adw adw2;
        do {
            adw2 = adw;
            if (!iterator.hasNext()) {
                break;
            }
            adw2 = (adw)iterator.next();
        } while (a1 != null && adw2.k().equals((Object)this.a1.f()));
        if (adw2 != null) {
            this.a5(adw2.getUser());
        }
    }
}
