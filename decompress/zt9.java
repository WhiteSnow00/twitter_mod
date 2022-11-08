import androidx.preference.Preference;
import android.widget.TextView;
import androidx.preference.EditTextPreference;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import androidx.preference.c;

// 
// Decompiled by Procyon v0.6.0
// 

public class zt9 extends c
{
    public EditText X1;
    public CharSequence Y1;
    
    @Override
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.Y1);
    }
    
    @Override
    public final void g2(final View view) {
        super.g2(view);
        ((View)(this.X1 = (EditText)view.findViewById(16908291))).requestFocus();
        final EditText x1 = this.X1;
        if (x1 != null) {
            ((TextView)x1).setText(this.Y1);
            final EditText x2 = this.X1;
            x2.setSelection(((CharSequence)x2.getText()).length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }
    
    @Override
    public final void h2(final boolean b) {
        if (b) {
            final String string = this.X1.getText().toString();
            if (((Preference)this.j2()).f((Object)string)) {
                this.j2().Y(string);
            }
        }
    }
    
    public final EditTextPreference j2() {
        return (EditTextPreference)this.f2();
    }
    
    @Override
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        if (bundle == null) {
            this.Y1 = this.j2().t1;
        }
        else {
            this.Y1 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}
