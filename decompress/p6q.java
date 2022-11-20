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

public final class p6q extends x7x
{
    public p6q(final r8x r8x, final Activity activity, final LayoutInflater layoutInflater, final acs acs, final dej dej, final NavigationHandler navigationHandler, final qcj qcj, final OcfEventReporter ocfEventReporter) {
        super(r8x);
        final View inflate = layoutInflater.inflate(2131625086, (ViewGroup)null);
        this.C1(inflate);
        final r6q r6q = (r6q)acs.h.b;
        final TextView textView = (TextView)inflate.findViewById(2131430697);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(2131430192);
        final TextInputLayout textInputLayout2 = (TextInputLayout)inflate.findViewById(2131430557);
        final TextInputLayout textInputLayout3 = (TextInputLayout)inflate.findViewById(2131427812);
        final HorizonComposeButton horizonComposeButton = (HorizonComposeButton)inflate.findViewById(2131428548);
        final TextView textView2 = (TextView)inflate.findViewById(2131431461);
        final TextView textView3 = (TextView)inflate.findViewById(2131428653);
        final ImageButton imageButton = (ImageButton)inflate.findViewById(2131427753);
        textView.setText((CharSequence)r6q.j);
        dej.a(textView2, (oxm)r6q.q);
        dej.a(textView3, (oxm)r6q.r);
        ((TextView)textInputLayout.getEditText()).setText((CharSequence)qcj.b(r6q.l));
        final String b = qcj.b(r6q.m);
        String b2 = qcj.b(r6q.n);
        final EditText editText = textInputLayout2.getEditText();
        if (ikr.g((CharSequence)b)) {
            b2 = b;
        }
        ((TextView)editText).setText((CharSequence)b2);
        if (r6q.z) {
            ((View)textInputLayout3).setVisibility(8);
        }
        else {
            final o98 a = qcj.a(r6q.o);
            jee.l((Object)a);
            final EditText editText2 = textInputLayout3.getEditText();
            final DateFormat dateInstance = DateFormat.getDateInstance(1);
            Objects.requireNonNull(a);
            ((TextView)editText2).setText((CharSequence)dateInstance.format(new GregorianCalendar(a.a, a.b - 1, a.c).getTime()));
        }
        textInputLayout.setHintEnabled(true);
        textInputLayout.setHint((CharSequence)r6q.A);
        textInputLayout2.setHintEnabled(true);
        String hint;
        if (ikr.g((CharSequence)b)) {
            hint = r6q.B;
        }
        else {
            hint = r6q.C;
        }
        textInputLayout2.setHint((CharSequence)hint);
        textInputLayout3.setHintEnabled(true);
        textInputLayout3.setHint((CharSequence)r6q.D);
        ((View)textInputLayout).setOnClickListener((View$OnClickListener)new ty((Object)navigationHandler, (Object)r6q, 16));
        ((View)textInputLayout2).setOnClickListener((View$OnClickListener)new avd(b, r6q, navigationHandler));
        ((View)textInputLayout3).setOnClickListener((View$OnClickListener)new was((Object)navigationHandler, (Object)r6q, 12));
        ssv ssv;
        if (ikr.g((CharSequence)b)) {
            ssv = r6q.s;
        }
        else {
            ssv = r6q.t;
        }
        final boolean i = o70.i(((Context)activity).getApplicationContext(), "com.whatsapp");
        if (i) {
            final af4 af4 = new af4();
            ((u0p)af4).T = vba.g("onboarding", "signup_review", "", "whatsapp", "eligible").toString();
            final int a2 = c5j.a;
            ocfEventReporter.b(af4, (String)null);
        }
        final boolean b3 = i && asa.d().b("android_ocf_whatsapp_verification_choice_enabled", false);
        horizonComposeButton.setText((CharSequence)ssv.c);
        horizonComposeButton.setOnClickListener((View$OnClickListener)new o6q(qcj, r6q, navigationHandler, b, b3));
        ((View)imageButton).setOnClickListener((View$OnClickListener)new dip((Object)ocfEventReporter, (Object)activity, 15));
        ocfEventReporter.c();
    }
}
