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

public final class vua extends vbv
{
    public final Button X0;
    public final View Y0;
    public final EditText Z0;
    public final cva a1;
    public final dva b1;
    public boolean c1;
    public final String d1;
    public final z9j<emr> e1;
    public final bm7 f1;
    
    public vua(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xbm xbm, final bm7 f1, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final String stringExtra = intent.getStringExtra("feedback_associated_user_name_key");
        final String stringExtra2 = intent.getStringExtra("feedback_scribe_component");
        this.d1 = stringExtra2;
        final cva a1 = (cva)intent.getParcelableExtra("feedback_request_params");
        this.a1 = a1;
        this.f1 = f1;
        (this.b1 = new dva(UserIdentifier.getCurrent(), a1.D0)).a(stringExtra2, "comment_compose", "impression");
        final Button x0 = (Button)((u9)this).C4(2131427563);
        ((TextView)(this.X0 = x0)).setText((CharSequence)resources.getString(2131954053, new Object[] { stringExtra }));
        ((View)x0).setEnabled(false);
        ((View)x0).setOnClickListener((View$OnClickListener)new ji2((Object)this, 9));
        final String stringExtra3 = intent.getStringExtra("feedback_associated_score_description_key");
        final EditText z0 = (EditText)((u9)this).C4(2131429097);
        ((TextView)(this.Z0 = z0)).setHint((CharSequence)resources.getString(2131954039, new Object[] { stringExtra, stringExtra3 }));
        ((TextView)z0).addTextChangedListener((TextWatcher)new vua$a(this));
        (this.Y0 = ((u9)this).C4(2131427753)).setOnClickListener((View$OnClickListener)new esk((Object)this, 8));
        final z9j<emr> a2 = kas.a(emr.class);
        this.e1 = a2;
        f.j((h5j)a2.a(), (n93)new so3((Object)this, 10), (z9a)xbm);
    }
    
    public final boolean W4() {
        return TextUtils.isEmpty((CharSequence)this.Z0.getText().toString().trim()) ^ true;
    }
    
    public final void X4(final boolean b) {
        if (b) {
            this.b1.a(this.d1, "comment_compose", "dismiss");
            ((Activity)((u9)this).E0).setResult(0);
        }
        final View currentFocus = ((Activity)((u9)this).E0).getCurrentFocus();
        if (currentFocus != null) {
            final InputMethodManager inputMethodManager = (InputMethodManager)((Context)((u9)this).E0).getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        ((u9)this).D4();
    }
    
    public final boolean Y4() {
        return !this.c1 && this.W4();
    }
    
    public final boolean j() {
        if (this.W4()) {
            this.Y0.setEnabled(false);
            ((View)this.X0).setEnabled(false);
            final pmg pmg = new pmg((Context)((u9)this).E0, 0);
            pmg.s(2131954044);
            pmg.m(2131951733);
            final e create = pmg.p(2131953135, (DialogInterface$OnClickListener)new rua((vbv)this, 0)).n(2131952374, (DialogInterface$OnClickListener)tua.E0).create();
            ((Dialog)create).setOnDismissListener((DialogInterface$OnDismissListener)new uua((Object)this, 0));
            ((Dialog)create).show();
        }
        else {
            this.X4(true);
        }
        return true;
    }
}
