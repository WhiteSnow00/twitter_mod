import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.login.api.PasswordResetArgs;
import android.widget.EditText;
import android.os.ResultReceiver;
import android.content.Context;
import android.view.View;
import com.twitter.account.smartlock.a;
import android.text.Editable;
import com.twitter.account.smartlock.b;
import com.twitter.account.smartlock.a$c;
import com.twitter.account.smartlock.a$c$a;
import java.util.Objects;
import android.widget.TextView;
import com.twitter.app.account.changepassword.ChangePasswordContentViewArgs;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;
import com.twitter.account.smartlock.ActivityBasedLoginAssistResultResolver;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mp3 extends kcv implements TextWatcher, View$OnClickListener, View$OnFocusChangeListener
{
    public static final mp3.mp3$a Companion;
    public boolean Z0;
    public TwitterEditText a1;
    public TwitterEditText b1;
    public TwitterEditText c1;
    public Button d1;
    public laj<vop> e1;
    public ActivityBasedLoginAssistResultResolver f1;
    public UserIdentifier g1;
    public String h1;
    
    static {
        Companion = new mp3.mp3$a();
    }
    
    public mp3(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final ChangePasswordContentViewArgs changePasswordContentViewArgs, final kcm kcm, final m9p m9p) {
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)resources, "resources");
        e0e.f((Object)cbs, "requestRepositoryFactory");
        e0e.f((Object)mxe, "navManager");
        e0e.f((Object)nn, "activityFinisher");
        e0e.f((Object)cbg, "loginController");
        e0e.f((Object)layoutInflater, "layoutInflater");
        e0e.f((Object)userIdentifier, "currentUser");
        e0e.f((Object)mcv, "twitterFragmentActivityOptions");
        e0e.f((Object)mxe2, "fabPresenter");
        e0e.f((Object)a7g, "locationProducer");
        e0e.f((Object)o9p, "searchSuggestionController");
        e0e.f((Object)ibm, "registrableHeadsetPlugReceiver");
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)changePasswordContentViewArgs, "changePasswordContentViewArgs");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)m9p, "searchSuggestionCache");
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.g1 = UserIdentifier.UNDEFINED;
        final UserIdentifier accountId = changePasswordContentViewArgs.getAccountId();
        this.g1 = accountId;
        final qdw e = pdw.e(accountId);
        if (e != null) {
            this.h1 = e.c();
            final fg4 fg4 = new fg4(this.g1);
            ((o1p)fg4).q(new String[] { "settings:change_password:::impression" });
            sbw.b((tlm)fg4);
            final View c4 = this.C4(2131430447);
            e0e.c((Object)c4);
            this.a1 = (TwitterEditText)c4;
            final View c5 = this.C4(2131430238);
            e0e.c((Object)c5);
            this.b1 = (TwitterEditText)c5;
            final View c6 = this.C4(2131430239);
            e0e.c((Object)c6);
            this.c1 = (TwitterEditText)c6;
            final View c7 = this.C4(2131432444);
            e0e.c((Object)c7);
            ((View)(this.d1 = (Button)c7)).setOnClickListener((View$OnClickListener)this);
            ((TextView)this.a1).addTextChangedListener((TextWatcher)this);
            ((TextView)this.b1).addTextChangedListener((TextWatcher)this);
            ((TextView)this.c1).addTextChangedListener((TextWatcher)this);
            final TwitterEditText b1 = this.b1;
            boolean z0 = true;
            ((TextView)b1).setHint((CharSequence)resources.getString(2131958094, new Object[] { 8 }));
            ((TextView)this.c1).setHint((CharSequence)resources.getString(2131958094, new Object[] { 8 }));
            this.a1.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.b1.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            this.c1.setOnFocusChangeListener((View$OnFocusChangeListener)this);
            ((TextView)this.a1).setInputType(129);
            ((TextView)this.b1).setInputType(129);
            ((TextView)this.c1).setInputType(129);
            final TextView textView = (TextView)this.C4(2131430529);
            e0e.c((Object)textView);
            ((View)textView).setOnClickListener((View$OnClickListener)this);
            if (hdx.n() || !ita.d().b("android_smart_lock_passwords_enabled_for_change_password", false)) {
                z0 = false;
            }
            this.Z0 = z0;
            if (z0) {
                this.f1 = (ActivityBasedLoginAssistResultResolver)ActivityBasedLoginAssistResultResolver.a((vnd)dob);
            }
            final laj a = cbs.a((Class)vop.class);
            this.e1 = (laj<vop>)a;
            final t5j a2 = a.a();
            final e39 e2 = new e39();
            ((yz5)kcm.G0).q((sj)new mp3$b(e2));
            e2.c(a2.subscribe((rk6)new f$a0((stb)new stb<vop, vzv>(this) {
                public final mp3 F0;
                
                public final Object invoke(Object o) {
                    final vop vop = (vop)o;
                    if (vop != null && e0e.a((Object)this.F0.g1, (Object)((pnm)vop).S0)) {
                        final mp3 f0 = this.F0;
                        final xsc t = ((osc)vop).T();
                        e0e.e((Object)t, "response.result");
                        final Editable text = ((AppCompatEditText)f0.b1).getText();
                        Objects.requireNonNull(mp3.Companion);
                        final btc d = t.d();
                        boolean b = false;
                        Label_0107: {
                            if (d != null) {
                                if (e0e.a((Object)"OK", (Object)d.b) || d.a == 200) {
                                    b = true;
                                    break Label_0107;
                                }
                            }
                            b = false;
                        }
                        if (b && text != null) {
                            final String string = text.toString();
                            if (f0.Z0) {
                                final gcu d2 = fcu.d(f0.M0);
                                if (!flr.e((CharSequence)d2.j("login_assist_logged_in_identifier", ""))) {
                                    o = new a$c$a();
                                    final String j = d2.j("login_assist_logged_in_identifier", "");
                                    e0e.c((Object)j);
                                    ((a$c$a)o).a = j;
                                    ((a$c$a)o).b = string;
                                    final a$c a$c = (a$c)((z4j)o).e();
                                    ffe.h("settings", "save_credential", "begin");
                                    final a x3 = ((dj)((n5j)cr0.a()).B((Class)dj.class)).x3();
                                    final ActivityBasedLoginAssistResultResolver f2 = f0.f1;
                                    e0e.c((Object)f2);
                                    x3.e(a$c, (b)f2).c((bdq)new np3());
                                }
                            }
                            ((TextView)f0.b1).setText((CharSequence)"");
                            ((TextView)f0.a1).setText((CharSequence)"");
                            ((TextView)f0.c1).setText((CharSequence)"");
                            ehk.c().c(2131955631, 0);
                            o = new fg4(f0.g1);
                            ((o1p)o).q(new String[] { "settings:change_password::change_password:success" });
                            sbw.b((tlm)o);
                            f0.D4();
                        }
                        else {
                            final int[] f3 = n2v.f(t.a);
                            e0e.e((Object)f3, "getCustomErrorCodes(result.output)");
                            int n;
                            if (f3.length == 0) {
                                n = 0;
                            }
                            else {
                                n = f3[0];
                            }
                            String s;
                            String s2;
                            if (n != 60) {
                                if (n != 114) {
                                    if (n != 238) {
                                        if (n != 437) {
                                            if (n != 438) {
                                                s = f0.H4(2131955627);
                                                e0e.e((Object)s, "getString(R.string.password_change_failure)");
                                                s2 = "settings:change_password::change_password:failure";
                                            }
                                            else {
                                                s = f0.O0.getString(2131958087, new Object[] { 128 });
                                                e0e.e((Object)s, "resources.getString(\n   \u2026GTH\n                    )");
                                                s2 = "settings:change_password::change_password:maximum_length";
                                            }
                                        }
                                        else {
                                            s = f0.O0.getString(2131958088, new Object[] { 8 });
                                            e0e.e((Object)s, "resources.getString(\n   \u2026GTH\n                    )");
                                            s2 = "settings:change_password::change_password:minimum_length";
                                        }
                                    }
                                    else {
                                        s = f0.H4(2131955628);
                                        e0e.e((Object)s, "getString(R.string.passw\u2026_change_failure_too_week)");
                                        s2 = "settings:change_password::change_password:weak";
                                    }
                                }
                                else {
                                    s = f0.H4(2131955630);
                                    e0e.e((Object)s, "getString(R.string.passw\u2026change_failure_wrong_old)");
                                    s2 = "settings:change_password::change_password:wrong_old";
                                }
                            }
                            else {
                                s = f0.H4(2131955633);
                                e0e.e((Object)s, "getString(R.string.password_mismatch)");
                                s2 = "settings:change_password::change_password:mismatch";
                            }
                            ehk.c().a((CharSequence)s, 0);
                            final fg4 fg4 = new fg4(f0.g1);
                            ((o1p)fg4).q(new String[] { s2 });
                            sbw.b((tlm)fg4);
                        }
                    }
                    return vzv.a;
                }
            })));
            return;
        }
        throw new IllegalStateException("ChangePasswordActivity requires a valid account");
    }
    
    public final void afterTextChanged(final Editable editable) {
        e0e.f((Object)editable, "editable");
        if (editable == ((AppCompatEditText)this.b1).getText()) {
            this.b1.setError((CharSequence)null);
        }
        else if (editable == ((AppCompatEditText)this.c1).getText()) {
            this.c1.setError((CharSequence)null);
        }
        ((View)this.d1).setEnabled(((TextView)this.a1).length() > 0 && ((TextView)this.b1).length() > 0 && ((TextView)this.b1).length() >= 8 && ((TextView)this.c1).length() == ((TextView)this.b1).length() && ((TextView)this.b1).length() <= 128);
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        e0e.f((Object)charSequence, "sequence");
    }
    
    public final void onClick(final View view) {
        e0e.f((Object)view, "v");
        final int id = view.getId();
        if (id == 2131432444) {
            final fg4 fg4 = new fg4(this.g1);
            ((o1p)fg4).q(new String[] { "settings:change_password::change_password:click" });
            sbw.b((tlm)fg4);
            final dob g0 = super.G0;
            final TwitterEditText c1 = this.c1;
            boolean b = false;
            hdx.w((Context)g0, (View)c1, false, (ResultReceiver)null);
            final mp3.mp3$a companion = mp3.Companion;
            final String a = mp3.mp3$a.a(companion, (EditText)this.a1);
            final String a2 = mp3.mp3$a.a(companion, (EditText)this.b1);
            if (!e0e.a((Object)a2, (Object)mp3.mp3$a.a(companion, (EditText)this.c1))) {
                this.c1.setError(2131955633);
            }
            else if (e0e.a((Object)a2, (Object)a)) {
                this.b1.setError(2131955320);
            }
            else {
                b = true;
            }
            if (b) {
                final laj<vop> e1 = this.e1;
                final vop vop = new vop(this.g1, a, a2);
                vop.o1 = 1;
                e1.d((pnm)vop);
            }
        }
        else if (id == 2131430529) {
            final fg4 fg5 = new fg4(this.g1);
            ((o1p)fg5).q(new String[] { "settings:change_password::forgot_password:click" });
            sbw.b((tlm)fg5);
            super.T0.b((ContentViewArgs)new PasswordResetArgs((String)null, this.h1));
            this.D4();
        }
    }
    
    public final void onFocusChange(final View view, final boolean b) {
        e0e.f((Object)view, "view");
        final int id = view.getId();
        final Integer value = 128;
        final Integer value2 = 8;
        if (id == 2131430239) {
            if (!b && flr.g((CharSequence)((AppCompatEditText)this.c1).getText())) {
                if (((TextView)this.c1).length() < 8) {
                    this.c1.setError((CharSequence)super.O0.getString(2131958088, new Object[] { value2 }));
                }
                else if (((TextView)this.c1).length() > 128) {
                    this.c1.setError((CharSequence)super.O0.getString(2131958087, new Object[] { value }));
                }
            }
        }
        else if (id == 2131430238 && !b && flr.g((CharSequence)((AppCompatEditText)this.b1).getText())) {
            if (((TextView)this.b1).length() < 8) {
                this.b1.setError((CharSequence)super.O0.getString(2131958088, new Object[] { value2 }));
            }
            else if (((TextView)this.b1).length() > 128) {
                this.b1.setError((CharSequence)super.O0.getString(2131958087, new Object[] { value }));
            }
        }
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        e0e.f((Object)charSequence, "sequence");
    }
}
