import android.app.Dialog;
import androidx.appcompat.app.e$a;
import androidx.appcompat.app.AlertController$b;
import android.accounts.Account;
import android.content.DialogInterface$OnClickListener;
import android.accounts.AccountManager;
import android.widget.AdapterView;
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

public final class zr2 extends abv implements TextWatcher, AdapterView$OnItemSelectedListener
{
    public final View W0;
    public final EditText X0;
    public final EditText Y0;
    public final EditText Z0;
    public final ImageView a1;
    public final boolean b1;
    public final y0l[] c1;
    public final cl0 d1;
    public final Context e1;
    public MenuItem f1;
    public int g1;
    
    public zr2(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final cl0 d1, final Context e1, final pca<bo> pca2, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        this.g1 = 0;
        this.d1 = d1;
        this.e1 = e1;
        d1.d();
        d1.a();
        this.b1 = false;
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("summary")) == null) {
            stringExtra = "";
        }
        intent.getStringExtra("description");
        final Spinner spinner = (Spinner)((x9)this).C4(2131427971);
        final EditText x0 = (EditText)((x9)this).C4(2131427972);
        this.X0 = x0;
        if (!stringExtra.isEmpty()) {
            ((TextView)x0).setText((CharSequence)stringExtra);
        }
        d1.i();
        this.W0 = ((x9)this).C4(2131427970);
        this.a1 = (ImageView)((x9)this).C4(2131427969);
        ((TextView)x0).addTextChangedListener((TextWatcher)this);
        ((View)(this.Y0 = (EditText)((x9)this).C4(2131427967))).setVisibility(8);
        ((View)(this.Z0 = (EditText)((x9)this).C4(2131427968))).setVisibility(8);
        d1.r();
        d1.e();
        final y0l[] c1 = new y0l[0];
        Arrays.sort(this.c1 = c1, (Comparator<? super y0l>)iwe.I0);
        final ArrayAdapter<y0l> adapter = new ArrayAdapter<y0l>(gob, c1) {
            public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
                final View dropDownView = super.getDropDownView(n, view, viewGroup);
                final TextView textView = (TextView)dropDownView;
                final Resources l0 = ((x9)zr2.this).L0;
                if (n == 0) {
                    textView.setTextColor(goz.J(this.getContext(), 2130969093));
                }
                else {
                    textView.setTextColor(goz.J(this.getContext(), 2130968593));
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
        ro.a((pca)pca2, 8000, (u93)new wr2((Object)this, 0));
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        fai.z(2131689541, menu);
        return true;
    }
    
    public final void Q4() {
        super.Q4();
        final ArrayList parcelableArrayListExtra = ((x9)this).K0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (hr4.t((Collection)parcelableArrayListExtra)) {
            this.W0.setVisibility(8);
            this.a1.setVisibility(8);
        }
        else {
            this.a1.setImageURI((Uri)null);
            this.a1.setAdjustViewBounds(true);
            this.a1.setImageURI((Uri)parcelableArrayListExtra.get(0));
        }
    }
    
    public final void W4() {
        String h4;
        if (!this.b1) {
            h4 = ((x9)this).H4(2131957076);
        }
        else {
            h4 = "Your bug report has been generated. Make sure to use your @twitter.com email address when sending!";
        }
        p88.f().e((CharSequence)h4, 1);
        final y0l y0l = this.c1[this.g1];
        final String trim = this.X0.getText().toString().trim();
        final String trim2 = this.Z0.getText().toString().trim();
        Objects.requireNonNull(y0l);
        final Locale english = Locale.ENGLISH;
        final String a = y0l.a;
        final String format = String.format(english, "#project=\"%s\"", y0l.c);
        final String[] d = y0l.d;
        final String s = "";
        String format2;
        if (d == null) {
            format2 = "";
        }
        else {
            format2 = String.format(english, "#components=\"%s\"", pjr.i((CharSequence)",", (Object[])d));
        }
        String format3;
        if (y0l.e == null && pjr.e((CharSequence)trim2)) {
            format3 = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final String[] e = y0l.e;
            if (e != null) {
                sb.append(pjr.i((CharSequence)",", (Object[])e));
                if (!pjr.e((CharSequence)trim2)) {
                    sb.append(",");
                }
            }
            if (!pjr.e((CharSequence)trim2)) {
                sb.append(trim2);
            }
            format3 = String.format(english, "#labels=\"%s\"", sb.toString());
        }
        final String format4 = String.format(english, "%s in [%s] %s %s %s #issueType=\"Bug\"", trim, a, format, format2, format3);
        final cl0 a2 = bl0.a();
        a2.e();
        a2.r();
        final Intent k0 = ((x9)this).K0;
        String stringExtra = k0.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            stringExtra = s;
        }
        final ArrayList parcelableArrayListExtra = ((x9)this).K0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        final CheckBox checkBox = (CheckBox)((x9)this).C4(2131427652);
        this.d1.t();
        final Intent setComponent = new Intent("android.intent.action.SEND_MULTIPLE").setType("text/xml").putExtras(k0).setComponent((ComponentName)null);
        this.d1.c();
        final Intent putExtra = setComponent.putExtra("android.intent.extra.SUBJECT", String.format(english, "%s #build=%s", format4, "9.65.3"));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.Y0.getText().toString().trim());
        sb2.append("\n\n");
        sb2.append(stringExtra);
        ((x9)this).D0.startActivityForResult(Intent.createChooser(putExtra.putExtra("android.intent.extra.TEXT", sb2.toString()).putParcelableArrayListExtra("android.intent.extra.STREAM", parcelableArrayListExtra), (CharSequence)null), 8000);
    }
    
    public final void X4() {
        final MenuItem f1 = this.f1;
        if (f1 != null) {
            f1.setEnabled(pjr.g((CharSequence)this.X0.getText().toString().trim()) && this.g1 != 0);
        }
    }
    
    public final void afterTextChanged(final Editable editable) {
        ((x9)this).F4().invalidate();
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final int d2(final fai fai) {
        final MenuItem item = fai.findItem(2131430239);
        pf8.r(item);
        this.f1 = item;
        this.X4();
        return 2;
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int g1, final long n) {
        this.g1 = g1;
        this.X4();
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final boolean q(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430239) {
            Label_0181: {
                if (this.b1 && y6k.d().a((Context)((x9)this).D0, new String[] { "android.permission.GET_ACCOUNTS" })) {
                    final Account[] accountsByType = AccountManager.get((Context)((x9)this).D0).getAccountsByType("com.google");
                    final int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            if (accountsByType[i].name.endsWith("@twitter.com")) {
                                final boolean b = true;
                                if (!b) {
                                    final qmg t = new qmg((Context)((x9)this).D0, 0).t((CharSequence)"Twitter bug reporter");
                                    final AlertController$b a = ((e$a)t).a;
                                    a.g = "Setup your phone with your @twitter.com email address so we can follow up on your bug report.";
                                    Objects.requireNonNull(a);
                                    t.g((CharSequence)"Skip", (DialogInterface$OnClickListener)new yr2((Object)this, 0));
                                    ((e$a)t).i((CharSequence)"Setup", (DialogInterface$OnClickListener)new xr2((Object)this, 0));
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
        return super.q(menuItem);
    }
}
