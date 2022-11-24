import android.app.Dialog;
import android.app.Activity;
import android.widget.TextView;
import androidx.appcompat.app.e;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awa extends kcv
{
    public final Button Z0;
    public final View a1;
    public final EditText b1;
    public final hwa c1;
    public final zj9 d1;
    public boolean e1;
    public final String f1;
    public final laj<bnr> g1;
    public final en7 h1;
    
    public awa(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final kcm kcm, final en7 h1, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        final String stringExtra = intent.getStringExtra("feedback_associated_user_name_key");
        final String stringExtra2 = intent.getStringExtra("feedback_scribe_component");
        this.f1 = stringExtra2;
        final hwa c1 = (hwa)intent.getParcelableExtra("feedback_request_params");
        this.c1 = c1;
        this.h1 = h1;
        (this.d1 = new zj9(UserIdentifier.getCurrent(), c1.F0)).c(stringExtra2, "comment_compose", "impression");
        final Button z0 = (Button)this.C4(2131427563);
        ((TextView)(this.Z0 = z0)).setText((CharSequence)resources.getString(2131954053, new Object[] { stringExtra }));
        ((View)z0).setEnabled(false);
        ((View)z0).setOnClickListener((View$OnClickListener)new quf(this, 10));
        final String stringExtra3 = intent.getStringExtra("feedback_associated_score_description_key");
        final EditText b1 = (EditText)this.C4(2131429097);
        ((TextView)(this.b1 = b1)).setHint((CharSequence)resources.getString(2131954039, new Object[] { stringExtra, stringExtra3 }));
        ((TextView)b1).addTextChangedListener((TextWatcher)new awa$a(this));
        (this.a1 = this.C4(2131427753)).setOnClickListener((View$OnClickListener)new f2p((Object)this, 7));
        final laj a = cbs.a((Class)bnr.class);
        this.g1 = (laj<bnr>)a;
        f.j(a.a(), (fa3)new qjl((Object)this, 9), (gba)kcm);
    }
    
    public final boolean W4() {
        return TextUtils.isEmpty((CharSequence)this.b1.getText().toString().trim()) ^ true;
    }
    
    public final void X4(final boolean b) {
        if (b) {
            this.d1.c(this.f1, "comment_compose", "dismiss");
            ((Activity)super.G0).setResult(0);
        }
        final View currentFocus = ((Activity)super.G0).getCurrentFocus();
        if (currentFocus != null) {
            final InputMethodManager inputMethodManager = (InputMethodManager)((Context)super.G0).getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        this.D4();
    }
    
    public final boolean Y4() {
        return !this.e1 && this.W4();
    }
    
    @Override
    public final boolean k() {
        if (this.W4()) {
            this.a1.setEnabled(false);
            ((View)this.Z0).setEnabled(false);
            final jng jng = new jng((Context)super.G0, 0);
            jng.s(2131954044);
            jng.m(2131951733);
            final e create = jng.p(2131953135, (DialogInterface$OnClickListener)new fs2((Object)this, 1)).n(2131952374, (DialogInterface$OnClickListener)yva.G0).create();
            ((Dialog)create).setOnDismissListener((DialogInterface$OnDismissListener)new zva((Object)this, 0));
            ((Dialog)create).show();
        }
        else {
            this.X4(true);
        }
        return true;
    }
}
