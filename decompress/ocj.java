import android.app.Activity;
import com.twitter.onboarding.ocf.OcfDateViewDelegate;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocj implements yqa<TextInputLayout, DatePicker, snj<ea8>, OcfDateViewDelegate>
{
    public final Activity a;
    public final sso b;
    
    public ocj(final Activity a, final sso b) {
        zzd.f((Object)a, "activity");
        zzd.f((Object)b, "savedStateHandler");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3) {
        final TextInputLayout textInputLayout = (TextInputLayout)o;
        final DatePicker datePicker = (DatePicker)o2;
        final snj snj = (snj)o3;
        zzd.f((Object)textInputLayout, "dateField");
        zzd.f((Object)datePicker, "datePicker");
        zzd.f((Object)snj, "date");
        return new OcfDateViewDelegate(this.a, textInputLayout, datePicker, (ea8)snj.h((Object)null), this.b);
    }
}
