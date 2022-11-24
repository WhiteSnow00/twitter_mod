import android.app.Dialog;
import androidx.appcompat.app.e;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
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

public final class hs2 extends kcv implements TextWatcher, AdapterView$OnItemSelectedListener
{
    public final View Z0;
    public final EditText a1;
    public final EditText b1;
    public final EditText c1;
    public final ImageView d1;
    public final boolean e1;
    public final v1l[] f1;
    public final xk0 g1;
    public final Context h1;
    public MenuItem i1;
    public int j1;
    
    public hs2(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final xk0 g1, final Context h1, final fda<fo> fda2, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.j1 = 0;
        this.g1 = g1;
        this.h1 = h1;
        g1.d();
        g1.a();
        this.e1 = false;
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("summary")) == null) {
            stringExtra = "";
        }
        intent.getStringExtra("description");
        final Spinner spinner = (Spinner)this.C4(2131427971);
        final EditText a1 = (EditText)this.C4(2131427972);
        this.a1 = a1;
        if (!stringExtra.isEmpty()) {
            ((TextView)a1).setText((CharSequence)stringExtra);
        }
        g1.i();
        this.Z0 = this.C4(2131427970);
        this.d1 = (ImageView)this.C4(2131427969);
        ((TextView)a1).addTextChangedListener((TextWatcher)this);
        ((View)(this.b1 = (EditText)this.C4(2131427967))).setVisibility(8);
        ((View)(this.c1 = (EditText)this.C4(2131427968))).setVisibility(8);
        g1.r();
        g1.e();
        final v1l[] f1 = new v1l[0];
        Arrays.sort(this.f1 = f1, (Comparator<? super v1l>)rwe.L0);
        final ArrayAdapter<v1l> adapter = new ArrayAdapter<v1l>(this, dob, f1) {
            public final hs2 F0;
            
            public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
                dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
                final TextView textView = (TextView)dropDownView;
                final Resources o0 = this.F0.O0;
                if (n == 0) {
                    textView.setTextColor(b1b.B(this.getContext(), 2130969093));
                }
                else {
                    textView.setTextColor(b1b.B(this.getContext(), 2130968593));
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
        vo.a((fda)fda2, 8000, (fa3)new es2((Object)this, 0));
    }
    
    @Override
    public final boolean N2(final zai zai, final Menu menu) {
        zai.z(2131689541, menu);
        return true;
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        final ArrayList parcelableArrayListExtra = super.N0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (kr4.t((Collection)parcelableArrayListExtra)) {
            this.Z0.setVisibility(8);
            this.d1.setVisibility(8);
        }
        else {
            this.d1.setImageURI((Uri)null);
            this.d1.setAdjustViewBounds(true);
            this.d1.setImageURI((Uri)parcelableArrayListExtra.get(0));
        }
    }
    
    public final void W4() {
        String h4;
        if (!this.e1) {
            h4 = this.H4(2131957076);
        }
        else {
            h4 = "Your bug report has been generated. Make sure to use your @twitter.com email address when sending!";
        }
        ehk.c().a((CharSequence)h4, 1);
        final v1l v1l = this.f1[this.j1];
        final String trim = this.a1.getText().toString().trim();
        final String trim2 = this.c1.getText().toString().trim();
        Objects.requireNonNull(v1l);
        final Locale english = Locale.ENGLISH;
        final String a = v1l.a;
        final String format = String.format(english, "#project=\"%s\"", v1l.c);
        final String[] d = v1l.d;
        final String s = "";
        String format2;
        if (d == null) {
            format2 = "";
        }
        else {
            format2 = String.format(english, "#components=\"%s\"", flr.i((CharSequence)",", (Object[])d));
        }
        String format3;
        if (v1l.e == null && flr.e((CharSequence)trim2)) {
            format3 = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            final String[] e = v1l.e;
            if (e != null) {
                sb.append(flr.i((CharSequence)",", (Object[])e));
                if (!flr.e((CharSequence)trim2)) {
                    sb.append(",");
                }
            }
            if (!flr.e((CharSequence)trim2)) {
                sb.append(trim2);
            }
            format3 = String.format(english, "#labels=\"%s\"", sb.toString());
        }
        final String format4 = String.format(english, "%s in [%s] %s %s %s #issueType=\"Bug\"", trim, a, format, format2, format3);
        final xk0 b = po.b();
        b.e();
        b.r();
        final Intent n0 = super.N0;
        String stringExtra = n0.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            stringExtra = s;
        }
        final ArrayList parcelableArrayListExtra = super.N0.getParcelableArrayListExtra("android.intent.extra.STREAM");
        final CheckBox checkBox = (CheckBox)this.C4(2131427652);
        this.g1.t();
        final Intent setComponent = new Intent("android.intent.action.SEND_MULTIPLE").setType("text/xml").putExtras(n0).setComponent((ComponentName)null);
        this.g1.c();
        final Intent putExtra = setComponent.putExtra("android.intent.extra.SUBJECT", String.format(english, "%s #build=%s", format4, "9.65.6"));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b1.getText().toString().trim());
        sb2.append("\n\n");
        sb2.append(stringExtra);
        super.G0.startActivityForResult(Intent.createChooser(putExtra.putExtra("android.intent.extra.TEXT", sb2.toString()).putParcelableArrayListExtra("android.intent.extra.STREAM", parcelableArrayListExtra), (CharSequence)null), 8000);
    }
    
    public final void X4() {
        final MenuItem i1 = this.i1;
        if (i1 != null) {
            i1.setEnabled(flr.g((CharSequence)this.a1.getText().toString().trim()) && this.j1 != 0);
        }
    }
    
    public final void afterTextChanged(final Editable editable) {
        this.F4().invalidate();
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final int d2(final zai zai) {
        final MenuItem item = zai.findItem(2131430242);
        vmw.g((Object)item);
        this.i1 = item;
        this.X4();
        return 2;
    }
    
    @Override
    public final boolean n(final MenuItem menuItem) {
        if (menuItem.getItemId() == 2131430242) {
            Label_0183: {
                if (this.e1 && u7k.d().a((Context)super.G0, new String[] { "android.permission.GET_ACCOUNTS" })) {
                    final Account[] accountsByType = AccountManager.get((Context)super.G0).getAccountsByType("com.google");
                    final int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            if (accountsByType[i].name.endsWith("@twitter.com")) {
                                final boolean b = true;
                                if (!b) {
                                    final jng t = new jng((Context)super.G0, 0).t((CharSequence)"Twitter bug reporter");
                                    final AlertController.b a = ((e.a)t).a;
                                    a.g = "Setup your phone with your @twitter.com email address so we can follow up on your bug report.";
                                    Objects.requireNonNull(a);
                                    t.g((CharSequence)"Skip", (DialogInterface$OnClickListener)new gs2((Object)this, 0));
                                    ((e.a)t).i("Setup", (DialogInterface$OnClickListener)new fs2((Object)this, 0));
                                    ((Dialog)((e.a)t).create()).show();
                                    return true;
                                }
                                break Label_0183;
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
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int j1, final long n) {
        this.j1 = j1;
        this.X4();
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
