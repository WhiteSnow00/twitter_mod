import android.content.Context;
import android.widget.EditText;
import android.view.View;
import android.view.View$OnClickListener;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.text.DateFormat;
import android.widget.ImageButton;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.view.LayoutInflater;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7q extends p8x
{
    public l7q(final k9x k9x, final Activity activity, final LayoutInflater layoutInflater, final scs scs, final qej qej, final NavigationHandler navigationHandler, final ddj ddj, final OcfEventReporter ocfEventReporter) {
        super(k9x);
        final View inflate = layoutInflater.inflate(2131625086, (ViewGroup)null);
        this.C1(inflate);
        final n7q n7q = (n7q)scs.h.b;
        final TextView textView = (TextView)inflate.findViewById(2131430698);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(2131430193);
        final TextInputLayout textInputLayout2 = (TextInputLayout)inflate.findViewById(2131430558);
        final TextInputLayout textInputLayout3 = (TextInputLayout)inflate.findViewById(2131427812);
        final HorizonComposeButton horizonComposeButton = (HorizonComposeButton)inflate.findViewById(2131428548);
        final TextView textView2 = (TextView)inflate.findViewById(2131431462);
        final TextView textView3 = (TextView)inflate.findViewById(2131428653);
        final ImageButton imageButton = (ImageButton)inflate.findViewById(2131427753);
        textView.setText((CharSequence)n7q.j);
        qej.a(textView2, (fym)n7q.q);
        qej.a(textView3, (fym)n7q.r);
        ((TextView)textInputLayout.getEditText()).setText((CharSequence)ddj.b(n7q.l));
        final String b = ddj.b(n7q.m);
        String b2 = ddj.b(n7q.n);
        final EditText editText = textInputLayout2.getEditText();
        if (flr.g((CharSequence)b)) {
            b2 = b;
        }
        ((TextView)editText).setText((CharSequence)b2);
        if (n7q.z) {
            ((View)textInputLayout3).setVisibility(8);
        }
        else {
            final sa8 a = ddj.a(n7q.o);
            vmw.g((Object)a);
            final EditText editText2 = textInputLayout3.getEditText();
            final DateFormat dateInstance = DateFormat.getDateInstance(1);
            Objects.requireNonNull(a);
            ((TextView)editText2).setText((CharSequence)dateInstance.format(new GregorianCalendar(a.a, a.b - 1, a.c).getTime()));
        }
        textInputLayout.setHintEnabled(true);
        textInputLayout.setHint((CharSequence)n7q.A);
        textInputLayout2.setHintEnabled(true);
        String hint;
        if (flr.g((CharSequence)b)) {
            hint = n7q.B;
        }
        else {
            hint = n7q.C;
        }
        textInputLayout2.setHint((CharSequence)hint);
        textInputLayout3.setHintEnabled(true);
        textInputLayout3.setHint((CharSequence)n7q.D);
        ((View)textInputLayout).setOnClickListener((View$OnClickListener)new zgk((Object)navigationHandler, (Object)n7q, 17));
        ((View)textInputLayout2).setOnClickListener((View$OnClickListener)new emw((Object)b, (Object)n7q, (Object)navigationHandler, 7));
        ((View)textInputLayout3).setOnClickListener((View$OnClickListener)new v8w((Object)navigationHandler, (Object)n7q, 13));
        dtv dtv;
        if (flr.g((CharSequence)b)) {
            dtv = n7q.s;
        }
        else {
            dtv = n7q.t;
        }
        final boolean i = p70.i(((Context)activity).getApplicationContext(), "com.whatsapp");
        if (i) {
            final fg4 fg4 = new fg4();
            ((o1p)fg4).T = dda.g("onboarding", "signup_review", "", "whatsapp", "eligible").toString();
            final int a2 = o5j.a;
            ocfEventReporter.b(fg4, null);
        }
        final boolean b3 = i && ita.d().b("android_ocf_whatsapp_verification_choice_enabled", false);
        horizonComposeButton.setText((CharSequence)dtv.c);
        horizonComposeButton.setOnClickListener((View$OnClickListener)new k7q(ddj, n7q, navigationHandler, b, b3));
        ((View)imageButton).setOnClickListener((View$OnClickListener)new mpa((Object)ocfEventReporter, (Object)activity, 18));
        ocfEventReporter.c();
    }
}
