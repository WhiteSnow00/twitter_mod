import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uc1 extends AutofillManager$AutofillCallback
{
    public static final uc1 a;
    
    static {
        a = new uc1();
    }
    
    public final void a(final b20 b20) {
        czd.f((Object)b20, "autofill");
        b20.c.registerCallback((AutofillManager$AutofillCallback)this);
    }
    
    public final void b(final b20 b20) {
        czd.f((Object)b20, "autofill");
        b20.c.unregisterCallback((AutofillManager$AutofillCallback)this);
    }
    
    public final void onAutofillEvent(final View view, final int n, final int n2) {
        czd.f((Object)view, "view");
        super.onAutofillEvent(view, n, n2);
        String s;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    s = "Unknown status event.";
                }
                else {
                    s = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            }
            else {
                s = "Autofill popup was hidden.";
            }
        }
        else {
            s = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", s);
    }
}
