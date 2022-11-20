import android.app.Dialog;
import androidx.appcompat.app.e$a;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$b;
import android.accounts.Account;
import android.content.DialogInterface$OnClickListener;
import android.accounts.AccountManager;
import android.text.Editable;
import android.content.ComponentName;
import android.widget.CheckBox;
import java.util.Locale;
import java.util.Objects;
import java.util.ArrayList;
import android.net.Uri;
import java.util.Collection;
import android.view.Menu;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.Comparator;
import java.util.Arrays;
import android.widget.Spinner;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.view.MenuItem;
import android.content.Context;
import android.widget.ImageView;
import android.widget.EditText;
import android.view.View;
import android.widget.AdapterView$OnItemSelectedListener;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pr2 extends vbv implements TextWatcher, AdapterView$OnItemSelectedListener
{
    public final View X0;
    public final EditText Y0;
    public final EditText Z0;
    public final EditText a1;
    public final ImageView b1;
    public final boolean c1;
    public final h1l[] d1;
    public final xk0 e1;
    public final Context f1;
    public MenuItem g1;
    public int h1;
    
    public pr2(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xk0 e1, final Context f1, final xba<bo> xba2, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.h1 = 0;
        this.e1 = e1;
        this.f1 = f1;
        e1.d();
        e1.a();
        this.c1 = false;
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("summary")) == null) {
            stringExtra = "";
        }
        intent.getStringExtra("description");
        final Spinner spinner = (Spinner)((u9)this).C4(2131427971);
        final EditText y0 = (EditText)((u9)this).C4(2131427972);
        this.Y0 = y0;
        if (!stringExtra.isEmpty()) {
            ((TextView)y0).setText((CharSequence)stringExtra);
        }
        e1.i();
        this.X0 = ((u9)this).C4(2131427970);
        this.b1 = (ImageView)((u9)this).C4(2131427969);
        ((TextView)y0).addTextChangedListener((TextWatcher)this);
        ((View)(this.Z0 = (EditText)((u9)this).C4(2131427967))).setVisibility(8);
        ((View)(this.a1 = (EditText)((u9)this).C4(2131427968))).setVisibility(8);
        e1.r();
        e1.e();
        final h1l[] d1 = new h1l[0];
        Arrays.sort(this.d1 = d1, (Comparator<? super h1l>)uve.J0);
        final ArrayAdapter<h1l> adapter = new ArrayAdapter<h1l>(this, cnb, d1) {
            public final pr2 D0;
            
            public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
                dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
                final TextView textView = (TextView)dropDownView;
                final Resources m0 = ((u9)this.D0).M0;
                if (n == 0) {
                    textView.setTextColor(d4j.i(this.getContext(), 2130969093));
                }
                else {
                    textView.setTextColor(d4j.i(this.getContext(), 2130968593));
                }
                return dropDownView;
            }
            
            public final boolean isEnabled(final int n) {
                return n != 0;
            }
        };
        adapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter)adapter);
        ((AdapterView)spinner).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        ro.a(xba2, 8000, (n93<bo>)new mr2((Object)this, 0));
    }
    
    public final boolean N2(final hai hai, final Menu menu) {
        hai.z(2131689541, menu);
        return true;
    }
    
    public final void Q4() {
        super.Q4();
        final ArrayList parcelableArrayListExtra = ((u9)this).L0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (fq4.t((Collection)parcelableArrayListExtra)) {
            this.X0.setVisibility(8);
            this.b1.setVisibility(8);
        }
        else {
            this.b1.setImageURI((Uri)null);
            this.b1.setAdjustViewBounds(true);
            this.b1.setImageURI((Uri)parcelableArrayListExtra.get(0));
        }
    }
    
    public final void W4() {
        String h4;
        if (!this.c1) {
            h4 = ((u9)this).H4(2131957076);
        }
        else {
            h4 = "Your bug report has been generated. Make sure to use your @twitter.com email address when sending!";
        }
        m1f.e().a((CharSequence)h4, 1);
        final h1l h1l = this.d1[this.h1];
        final String trim = this.Y0.getText().toString().trim();
        final String trim2 = this.a1.getText().toString().trim();
        Objects.requireNonNull(h1l);
        final Locale english = Locale.ENGLISH;
        final String a = h1l.a;
        final String format = String.format(english, "#project=\"%s\"", h1l.c);
        final String[] d = h1l.d;
        final String s = "";
        String format2;
        if (d == null) {
            format2 = "";
        }
        else {
            format2 = String.format(english, "#components=\"%s\"", ikr.i((CharSequence)",", (Object[])d));
        }
        String format3;
        if (h1l.e == null && ikr.e((CharSequence)trim2)) {
            format3 = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final String[] e = h1l.e;
            if (e != null) {
                sb.append(ikr.i((CharSequence)",", (Object[])e));
                if (!ikr.e((CharSequence)trim2)) {
                    sb.append(",");
                }
            }
            if (!ikr.e((CharSequence)trim2)) {
                sb.append(trim2);
            }
            format3 = String.format(english, "#labels=\"%s\"", sb.toString());
        }
        final String format4 = String.format(english, "%s in [%s] %s %s %s #issueType=\"Bug\"", trim, a, format, format2, format3);
        final xk0 b = wk0.b();
        b.e();
        b.r();
        final Intent l0 = ((u9)this).L0;
        String stringExtra = l0.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            stringExtra = s;
        }
        final ArrayList parcelableArrayListExtra = ((u9)this).L0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        final CheckBox checkBox = (CheckBox)((u9)this).C4(2131427652);
        this.e1.t();
        final Intent setComponent = new Intent("android.intent.action.SEND_MULTIPLE").setType("text/xml").putExtras(l0).setComponent((ComponentName)null);
        this.e1.c();
        final Intent putExtra = setComponent.putExtra("android.intent.extra.SUBJECT", String.format(english, "%s #build=%s", format4, "9.65.5"));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.Z0.getText().toString().trim());
        sb2.append("\n\n");
        sb2.append(stringExtra);
        ((u9)this).E0.startActivityForResult(Intent.createChooser(putExtra.putExtra("android.intent.extra.TEXT", sb2.toString()).putParcelableArrayListExtra("android.intent.extra.STREAM", parcelableArrayListExtra), (CharSequence)null), 8000);
    }
    
    public final void X4() {
        final MenuItem g1 = this.g1;
        if (g1 != null) {
            g1.setEnabled(ikr.g((CharSequence)this.Y0.getText().toString().trim()) && this.h1 != 0);
        }
    }
    
    public final void afterTextChanged(final Editable editable) {
        ((u9)this).F4().invalidate();
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final int d2(final hai hai) {
        final MenuItem item = hai.findItem(2131430241);
        jee.l((Object)item);
        this.g1 = item;
        this.X4();
        return 2;
    }
    
    public final boolean n(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430241) {
            Label_0181: {
                if (this.c1 && g7k.d().a((Context)((u9)this).E0, new String[] { "android.permission.GET_ACCOUNTS" })) {
                    final Account[] accountsByType = AccountManager.get((Context)((u9)this).E0).getAccountsByType("com.google");
                    final int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            if (accountsByType[i].name.endsWith("@twitter.com")) {
                                final boolean b = true;
                                if (!b) {
                                    final pmg t = new pmg((Context)((u9)this).E0, 0).t((CharSequence)"Twitter bug reporter");
                                    final AlertController$b a = ((e$a)t).a;
                                    a.g = "Setup your phone with your @twitter.com email address so we can follow up on your bug report.";
                                    Objects.requireNonNull(a);
                                    t.g((CharSequence)"Skip", (DialogInterface$OnClickListener)new nr2((Object)this, 0));
                                    ((e$a)t).i((CharSequence)"Setup", (DialogInterface$OnClickListener)new or2((Object)this, 0));
                                    ((Dialog)((e$a)t).create()).show();
                                    return true;
                                }
                                break Label_0181;
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
            this.W4();
            return true;
        }
        return super.n(menuItem);
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int h1, final long n) {
        this.h1 = h1;
        this.X4();
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
