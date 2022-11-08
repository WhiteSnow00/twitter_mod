import android.view.autofill.AutofillManager;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c20 implements vc1
{
    public final View a;
    public final bd1 b;
    public final AutofillManager c;
    
    public c20(final View a, final bd1 b) {
        zzd.f((Object)a, "view");
        zzd.f((Object)b, "autofillTree");
        this.a = a;
        this.b = b;
        final AutofillManager c = (AutofillManager)a.getContext().getSystemService((Class)AutofillManager.class);
        if (c != null) {
            this.c = c;
            a.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
