// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import java.util.HashMap;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.os.BaseBundle;
import android.widget.TextView;
import com.twitter.navigation.settings.ProxySettingsViewArgs;
import android.view.MenuItem;
import android.app.Dialog;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.login.api.PasswordResetArgs;
import com.twitter.account.smartlock.a$c$a;
import android.text.Editable;
import android.os.ResultReceiver;
import android.view.View;
import android.os.Parcelable;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.navigation.DispatchArgs;
import android.app.Activity;
import android.view.Menu;
import android.view.autofill.AutofillManager;
import android.os.Build$VERSION;
import com.twitter.account.smartlock.b;
import android.net.Uri;
import com.twitter.account.smartlock.ActivityBasedLoginAssistResultResolver;
import android.widget.ListAdapter;
import java.util.List;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import com.twitter.ui.widget.PopupEditText;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnFocusChangeListener;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.webkit.WebViewClient;
import java.util.Objects;
import android.webkit.WebView;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.account.smartlock.a;
import com.twitter.account.navigation.LoginArgs;
import com.twitter.account.smartlock.a$c;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.widget.TwitterEditText$c;
import android.text.TextWatcher;

@a91
public class LoginContentViewProvider extends kcv implements TextWatcher, dx8, TwitterEditText$c
{
    public static final int[] A1;
    public String Z0;
    public String a1;
    public String b1;
    public boolean c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public final LoginContentViewProvider.LoginContentViewProvider$d g1;
    public int h1;
    public TwitterEditText i1;
    public TwitterEditText j1;
    public Button k1;
    public boolean l1;
    public vce m1;
    public boolean n1;
    public a$c o1;
    public final LoginArgs p1;
    public final vbg q1;
    public final cbf r1;
    public final xk0 s1;
    public final cbg t1;
    public final a u1;
    public final ao6 v1;
    public final gn w1;
    public final tsc x1;
    public final kes y1;
    public final igt z1;
    
    static {
        A1 = new int[] { 2130970711 };
    }
    
    public LoginContentViewProvider(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf r1, final cbg t1, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final Bundle bundle, final vbg q1, final LoginArgs p32, final duo duo, final fda<fo> fda2, final a u1, final xk0 s1, final ao6 v1, final gn w1, final tsc x1, final kes y1, final igt z1, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, r1, t1, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = "no_prefill";
        this.a1 = "";
        final LoginContentViewProvider.LoginContentViewProvider$d g1 = new LoginContentViewProvider.LoginContentViewProvider$d(this);
        this.g1 = g1;
        this.q1 = q1;
        this.p1 = p32;
        this.r1 = r1;
        this.s1 = s1;
        this.t1 = t1;
        this.u1 = u1;
        this.v1 = v1;
        this.w1 = w1;
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        duo.b(this);
        duo.a((gto<?>)new LoginContentViewProvider$a(this));
        vo.c((fda)fda2, 1, (fa3)new qjl((Object)this, 2));
        vo.c((fda)fda2, 3, (fa3)new h3((Object)this, 2));
        this.f1 = p32.isAddAccount();
        this.l1 = p32.isAuthorizeAccount();
        ((View)(this.i1 = (TwitterEditText)this.C4(2131429886))).requestFocus();
        this.j1 = (TwitterEditText)this.C4(2131429888);
        this.k1 = (Button)this.C4(2131429887);
        ((TextView)this.j1).setInputType(129);
        this.m1 = new vce();
        final rmv b = ita.b();
        int i = 0;
        if (b.b("login_js_instrumentation_enabled", false)) {
            final WebView webView = (WebView)this.C4(2131429702);
            final vce m1 = this.m1;
            Objects.requireNonNull(m1);
            final String k = ita.b().k("signup_js_instrumentation_location_android");
            if (flr.g((CharSequence)k)) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowFileAccess(false);
                webView.setWebViewClient((WebViewClient)m1);
                if (bundle != null) {
                    m1.c = ((BaseBundle)bundle).getString("result");
                }
                if (m1.c == null) {
                    final aw0<bac> c = new vce.a().c();
                    c.F((aw0.aw0$b<? extends aw0<bac>>)new vce$c(webView, k));
                    m1.b.d((aw0)c);
                }
            }
        }
        ((View)this.k1).setOnClickListener((View$OnClickListener)new bqf((Object)this, 1));
        ((TextView)this.i1).addTextChangedListener((TextWatcher)this);
        ((TextView)this.j1).addTextChangedListener((TextWatcher)this);
        this.j1.setOnStatusIconClickListener((TwitterEditText$c)this);
        ((TextView)this.j1).setOnEditorActionListener((TextView$OnEditorActionListener)new bbg(this));
        this.C4(2131430529).setOnClickListener((View$OnClickListener)new d1x((Object)this, 2));
        this.h1 = 0;
        final Uri data = intent.getData();
        String text;
        String text2;
        if (data != null) {
            text = data.getQueryParameter("screen_name");
            text2 = data.getQueryParameter("password");
        }
        else {
            text = p32.getUsername();
            text2 = p32.getPassword();
        }
        if (flr.g((CharSequence)text)) {
            hbg.c(userIdentifier, "login:::username:prefill");
            ((TextView)this.i1).setText((CharSequence)text);
            if (flr.e((CharSequence)text2)) {
                ((View)this.j1).requestFocus();
            }
            else {
                ((TextView)this.j1).setText((CharSequence)text2);
                ((View)this.k1).requestFocus();
            }
        }
        else {
            hbg.c(userIdentifier, "login:::username:prefill_fail");
        }
        ((TextView)this.i1).addTextChangedListener((TextWatcher)new LoginContentViewProvider$b(this));
        this.j1.setOnFocusChangeListener((View$OnFocusChangeListener)new abg(userIdentifier, 0));
        ((View)this.k1).setEnabled(this.f5());
        ((TextView)this.C4(2131429433)).setText(2131954851);
        s1.k();
        if (bundle == null) {
            final fg4 fg4 = new fg4(userIdentifier);
            ((o1p)fg4).q(new String[] { "login::::impression" });
            sbw.b((tlm)fg4);
            final fg4 fg5 = new fg4(userIdentifier);
            String s2;
            if (this.f1) {
                s2 = "switch_account";
            }
            else {
                s2 = "logged_out";
            }
            ((o1p)fg5).q(new String[] { "login", "", s2, "", "impression" });
            sbw.b((tlm)fg5);
            if (data != null) {
                this.Y4(data);
            }
            if (flr.e((CharSequence)((AppCompatEditText)this.i1).getText())) {
                final AccountManager value = AccountManager.get(new mbz((Context)dob, 1).a);
                Account[] accountsByType;
                if (value != null) {
                    accountsByType = value.getAccountsByType("com.google");
                }
                else {
                    accountsByType = new Account[0];
                }
                String name;
                if (accountsByType.length > 0) {
                    name = accountsByType[0].name;
                }
                else {
                    name = null;
                }
                if (flr.g((CharSequence)name)) {
                    ((TextView)this.i1).setText((CharSequence)name);
                    this.Z0 = "email";
                    this.a1 = name;
                    ((View)this.j1).requestFocus();
                }
            }
            final fg4 fg6 = new fg4();
            ((o1p)fg6).q(new String[] { "login", "identifier", this.Z0, "", "prefill" });
            sbw.b((tlm)fg6);
        }
        else {
            t1.g(this.b1, (fbg)g1);
        }
        final PopupEditText popupEditText = (PopupEditText)this.i1;
        final AccountManager value2 = AccountManager.get(new mbz((Context)dob, 1).a);
        Account[] accountsByType2;
        if (value2 != null) {
            accountsByType2 = value2.getAccountsByType("com.google");
        }
        else {
            accountsByType2 = new Account[0];
        }
        final ArrayList list = new ArrayList<String>(accountsByType2.length);
        while (i < accountsByType2.length) {
            list.add(accountsByType2[i].name);
            ++i;
        }
        popupEditText.setAdapter((ListAdapter)new ArrayAdapter((Context)dob, 2131625785, (List)list));
        new LoginContentViewProvider.LoginContentViewProvider$e(this, popupEditText);
        if (!hdx.n()) {
            final b a = ActivityBasedLoginAssistResultResolver.a((vnd)super.G0);
            this.u1.b();
            ffe.h("login", "retrieve_credential", "begin");
            u1.f(a).c((bdq)new zp1<noj<a$c>>(this) {
                public final LoginContentViewProvider G0;
                
                public final void b(final Object o) {
                    final noj noj = (noj)o;
                    if (noj.f()) {
                        final String a = ((a$c)noj.c()).a;
                        final String b = ((a$c)noj.c()).b;
                        final LoginContentViewProvider g0 = this.G0;
                        g0.n1 = true;
                        g0.o1 = (a$c)noj.c();
                        this.G0.a5(a, b);
                        ffe.h("login", "retrieve_credential", "success");
                    }
                }
                
                public final void onError(final Throwable t) {
                    final noj g = ffe.g(t);
                    if (g.f()) {
                        final int intValue = (int)g.c();
                        if (intValue == 0) {
                            ffe.h("login", "retrieve_credential", "dismiss");
                        }
                        else if (intValue != 1001 && intValue != 1000) {
                            if (intValue != 4 && intValue != 1002) {
                                if (intValue == 16) {
                                    ffe.h("login", "retrieve_credential", "disabled");
                                }
                                else if (intValue == 17) {
                                    ffe.h("login", "retrieve_credential", "api_not_connected");
                                }
                                else {
                                    ffe.j("login", "retrieve_credential", t);
                                }
                            }
                            else {
                                ffe.h("login", "retrieve_credential", "none_available");
                            }
                        }
                        else {
                            ffe.h("login", "retrieve_credential", "none_of_above");
                        }
                    }
                    else {
                        ffe.j("login", "retrieve_credential", t);
                    }
                }
            });
        }
        this.q1.a((kub)new zag(this, (fci)fci, nn));
        if (bh.f((Context)super.G0)) {
            final TwitterEditText i2 = this.i1;
            ((TextView)i2).setHint(i2.getLabelText());
            final TwitterEditText j1 = this.j1;
            ((TextView)j1).setHint(j1.getLabelText());
        }
    }
    
    public static void W4(final LoginContentViewProvider loginContentViewProvider, final fci fci, final nn nn, final Boolean b, final Intent intent) {
        Objects.requireNonNull(loginContentViewProvider);
        if (b) {
            loginContentViewProvider.e5(UserIdentifier.getCurrent());
            final Intent extraIntent = LoginArgs.extractExtraIntent(loginContentViewProvider.N0);
            if (extraIntent != null) {
                ((Context)loginContentViewProvider.G0).startActivity(extraIntent);
            }
            else if (loginContentViewProvider.c1 || !loginContentViewProvider.l1) {
                fci.d((cn)fgg.b((Uri)null));
                nn.a();
            }
            ((Activity)loginContentViewProvider.G0).setResult(-1, intent);
            if (hdx.n() && Build$VERSION.SDK_INT >= 26) {
                final AutofillManager autofillManager = (AutofillManager)((Activity)loginContentViewProvider.G0).getSystemService((Class)AutofillManager.class);
                if (autofillManager != null && autofillManager.isAutofillSupported()) {
                    autofillManager.commit();
                }
            }
            ((Activity)loginContentViewProvider.G0).finish();
        }
    }
    
    public static void X4(final LoginContentViewProvider loginContentViewProvider) {
        ((Activity)loginContentViewProvider.G0).removeDialog(1);
        loginContentViewProvider.e1 = false;
    }
    
    @Override
    public final boolean N2(final zai zai, final Menu menu) {
        super.N2(zai, menu);
        zai.z(2131689529, menu);
        return true;
    }
    
    public final void N4() {
        this.t1.e(this.b1);
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        if (UserIdentifier.getCurrent().isRegularUser() && "android.intent.action.MAIN".equals(super.N0.getAction())) {
            super.T0.d((cn)fgg.b(fgg.a));
            super.H0.a();
        }
        if (this.e1) {
            this.d5();
        }
        else {
            ((Activity)super.G0).removeDialog(1);
            this.e1 = false;
        }
    }
    
    public final void Y4(final Uri uri) {
        if (!ita.b().b("native_password_reset_enabled", false)) {
            return;
        }
        final String queryParameter = uri.getQueryParameter("screen_name");
        final String queryParameter2 = uri.getQueryParameter("login_verification_user_id");
        final String queryParameter3 = uri.getQueryParameter("login_verification_request_id");
        final String queryParameter4 = uri.getQueryParameter("login_verification_cause");
        final String queryParameter5 = uri.getQueryParameter("login_verification_request_url");
        if (flr.e((CharSequence)queryParameter) || flr.e((CharSequence)queryParameter2) || flr.e((CharSequence)queryParameter3)) {
            return;
        }
        if (flr.e((CharSequence)queryParameter4)) {
            return;
        }
        final UserIdentifier parse = UserIdentifier.parse(queryParameter2);
        try {
            final int int1 = Integer.parseInt(queryParameter4);
            this.d1 = int1;
            if (int1 == 1) {
                final String queryParameter6 = uri.getQueryParameter("login_verification_type");
                if (flr.e((CharSequence)queryParameter6)) {
                    return;
                }
                try {
                    final int int2 = Integer.parseInt(queryParameter6);
                    this.c1 = true;
                    this.g1.c(queryParameter, new zbg(parse, queryParameter3, int2, queryParameter5, this.d1));
                    return;
                }
                catch (final NumberFormatException ex) {
                    return;
                }
            }
            this.d5();
            this.c1 = true;
            this.b1 = this.t1.d(parse, queryParameter3, (f74)this.g1);
        }
        catch (final NumberFormatException ex2) {}
    }
    
    public final void Z4(final qdw qdw) {
        hbg.a((Activity)super.G0, qdw, this.f1);
        hbg.b(this.f1, super.M0);
        final rdw rdw = (rdw)qdw;
        this.e5(rdw.k());
        if (!this.l1) {
            final Intent n0 = super.N0;
            final Intent a = this.v1.a((Context)super.G0, (ContentViewArgs)DispatchArgs.INSTANCE);
            if (LoginArgs.hasExtraIntent(n0)) {
                a.putExtra("android.intent.extra.INTENT", (Parcelable)LoginArgs.extractExtraIntent(n0));
            }
            else {
                a.putExtra("android.intent.extra.INTENT", (Parcelable)this.w1.a((Context)super.G0, (cn)((z4j)new fgg$a()).e()));
            }
            ((Context)super.G0).startActivity(a.setFlags(67108864));
        }
        final Intent intent = new Intent();
        intent.putExtra("AbsFragmentActivity_intent_origin", super.G0.getClass().getName());
        swj.m(intent, "AbsFragmentActivity_account_user_identifier", rdw.k());
        ((Activity)super.G0).setResult(-1, intent);
        com.twitter.analytics.tracking.a.b().h(3);
        final fg4 fg4 = new fg4();
        ((o1p)fg4).q(new String[] { "login::::success" });
        ((o1p)fg4).f("4", g6s.a());
        final nq a2 = pp.a();
        if (a2 != null) {
            ((o1p)fg4).f("6", a2.a);
            ((o1p)fg4).x(a2.b);
        }
        sbw.b((tlm)fg4);
        hbg.c(super.M0, "login", "identifier", this.Z0, "", "success");
        vq9.p((Context)super.G0, super.M0, "login::::success", false);
        this.x1.f(tjw.s((Context)super.G0, rdw.k()));
        ((Activity)super.G0).finish();
    }
    
    public final void a5(final String s, final String s2) {
        hdx.w((Context)super.G0, (View)this.j1, false, (ResultReceiver)null);
        if (!s.equals(this.a1)) {
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q(new String[] { "login", "identifier", this.Z0, "", "prefill_changed" });
            sbw.b((tlm)fg4);
        }
        final fg4 fg5 = new fg4();
        ((o1p)fg5).q(new String[] { "login:form:::submit" });
        sbw.b((tlm)fg5);
        this.b1 = this.t1.b(s, s2, (ibg)this.g1, this.m1.c);
        this.d5();
    }
    
    public final void afterTextChanged(final Editable editable) {
        ((View)this.k1).setEnabled(this.f5());
    }
    
    public final void b5() {
        if (this.f5()) {
            final String string = ((AppCompatEditText)this.i1).getText().toString();
            final String string2 = ((AppCompatEditText)this.j1).getText().toString();
            this.n1 = false;
            final a$c$a a$c$a = new a$c$a();
            a$c$a.a = string;
            a$c$a.b = string2;
            this.o1 = (a$c)((z4j)a$c$a).e();
            this.a5(string, string2);
        }
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void c5() {
        super.G0.startActivityForResult(this.v1.a((Context)super.G0, (ContentViewArgs)new PasswordResetArgs((String)null, ((AppCompatEditText)this.i1).getText().toString())), 3);
    }
    
    public final int d2(final zai zai) {
        final View inflate = ((Activity)super.G0).getLayoutInflater().inflate(2131624769, this.K4(), false);
        inflate.findViewById(2131431465).setOnClickListener((View$OnClickListener)new sy((Object)this, 7));
        zai.d().E(inflate);
        return 2;
    }
    
    public final void d5() {
        this.e1 = true;
        ((Activity)super.G0).showDialog(1);
    }
    
    public final void e5(final UserIdentifier userIdentifier) {
        final a$c o1 = this.o1;
        if (o1 != null) {
            if (!this.n1) {
                this.u1.a(o1);
            }
            fcu.d(userIdentifier).i().b("login_assist_logged_in_identifier", this.o1.a).e();
        }
    }
    
    public final boolean f2(final TwitterEditText twitterEditText) {
        final TwitterEditText j1 = this.j1;
        if (j1 == twitterEditText) {
            ((TextView)j1).removeTextChangedListener((TextWatcher)this);
            final int selectionStart = ((TextView)this.j1).getSelectionStart();
            final int selectionEnd = ((TextView)this.j1).getSelectionEnd();
            if (((TextView)this.j1).getInputType() != 145) {
                ((TextView)this.j1).setInputType(145);
                this.j1.setExtraState(LoginContentViewProvider.A1);
            }
            else {
                ((TextView)this.j1).setInputType(129);
                this.j1.setExtraState((int[])null);
            }
            ((EditText)this.j1).setSelection(selectionStart, selectionEnd);
            ((TextView)this.j1).addTextChangedListener((TextWatcher)this);
            return true;
        }
        return false;
    }
    
    public final boolean f5() {
        boolean b;
        if (((TextView)this.i1).length() > 0 && ((TextView)this.j1).length() > 0) {
            this.s1.k();
            ((AppCompatEditText)this.i1).getText().toString();
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean k() {
        if (this.f1) {
            final String accountAuthenticatorResponseKey = this.p1.getAccountAuthenticatorResponseKey();
            if (accountAuthenticatorResponseKey != null) {
                final AccountAuthenticatorResponse accountAuthenticatorResponse = ((HashMap<K, AccountAuthenticatorResponse>)((jbg)((n5j)cr0.a()).B((Class)jbg.class)).S1().a).remove(accountAuthenticatorResponseKey);
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onError(4, "");
                }
            }
        }
        return super.k();
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n != 2) {
            if (n != 3) {
                if (n == 4) {
                    if (n2 == -2) {
                        ((Context)super.G0).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.H4(2131955634))));
                    }
                }
            }
            else if (n2 == -2) {
                ((Context)super.G0).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.H4(2131954877))));
                final fg4 fg4 = new fg4();
                ((o1p)fg4).q(new String[] { "login::use_temporary_password_prompt:get_help:click" });
                sbw.b((tlm)fg4);
            }
        }
        else if (n2 == -1) {
            this.c5();
        }
    }
    
    @Override
    public final boolean n(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 2131429996) {
            super.T0.d((cn)new e7());
            return true;
        }
        if (itemId == 2131430023) {
            super.T0.b((ContentViewArgs)ProxySettingsViewArgs.INSTANCE);
            return true;
        }
        return super.n(menuItem);
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
