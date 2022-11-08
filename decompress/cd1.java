import android.annotation.SuppressLint;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import android.app.Activity;
import android.view.autofill.AutofillManager;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cd1
{
    public final boolean a;
    public final TextInputLayout b;
    public final TextInputLayout c;
    public AutofillManager d;
    
    @SuppressLint({ "InlinedApi", "NewApi" })
    public cd1(final Activity activity, final i6q i6q) {
        final TextInputLayout f0 = i6q.F0;
        this.b = f0;
        final TextInputLayout g0 = i6q.G0;
        this.c = g0;
        if (tbx.n()) {
            final AutofillManager d = (AutofillManager)activity.getSystemService((Class)AutofillManager.class);
            this.d = d;
            if (d != null && d.isEnabled()) {
                c("form", "eligible");
                this.d.registerCallback((AutofillManager$AutofillCallback)new AutofillManager$AutofillCallback() {
                    public final void onAutofillEvent(final View view, final int n) {
                        super.onAutofillEvent(view, n);
                        final String string = view.getTag().toString();
                        if ("name".equals(string)) {
                            if (n == 1) {
                                cd1.c("name", "success");
                            }
                            else if (n == 3) {
                                cd1.c("name", "unavailable");
                            }
                        }
                        else if ("phone_or_email".equals(string)) {
                            if (n == 1) {
                                cd1.c("phone_or_email", "success");
                            }
                            else if (n == 3) {
                                cd1.c("phone_or_email", "unavailable");
                            }
                        }
                    }
                });
                f0.setAutofillHints(new String[] { "name" });
                g0.setAutofillHints(new String[] { "phone" });
                this.b(f0);
                this.b(g0);
                this.a = true;
            }
            else {
                this.a = false;
            }
        }
        else {
            this.a = false;
        }
        if (!this.a) {
            tbx.d((View)g0);
            tbx.d((View)f0);
        }
    }
    
    public static void c(final String s, final String s2) {
        saw.a().c((okm)new zf4(new String[] { "onboarding", "signup", s, "autofill", s2 }));
    }
    
    @SuppressLint({ "InlinedApi", "NewApi" })
    public final void a() {
        if (tbx.n() && this.a) {
            final AutofillManager d = this.d;
            if (d != null) {
                d.notifyViewExited((View)this.b);
                this.d.notifyViewExited((View)this.c);
            }
        }
    }
    
    @SuppressLint({ "InlinedApi", "NewApi" })
    public final void b(final TextInputLayout textInputLayout) {
        if (tbx.n() && this.d != null) {
            tbx.o((View)textInputLayout);
            this.d.notifyViewEntered((View)textInputLayout);
            this.d.requestAutofill((View)textInputLayout);
        }
    }
}
