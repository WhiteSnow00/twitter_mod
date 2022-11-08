import androidx.preference.Preference;
import android.os.BaseBundle;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.e$a;
import androidx.preference.ListPreference;
import android.os.Bundle;
import androidx.preference.c;

// 
// Decompiled by Procyon v0.6.0
// 

public class slf extends c
{
    public int X1;
    public CharSequence[] Y1;
    public CharSequence[] Z1;
    
    @Override
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        ((BaseBundle)bundle).putInt("ListPreferenceDialogFragment.index", this.X1);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.Y1);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.Z1);
    }
    
    @Override
    public final void h2(final boolean b) {
        final ListPreference listPreference = (ListPreference)this.f2();
        if (b) {
            final int x1 = this.X1;
            if (x1 >= 0) {
                final String string = this.Z1[x1].toString();
                if (((Preference)listPreference).f((Object)string)) {
                    listPreference.Z(string);
                }
            }
        }
    }
    
    @Override
    public final void i2(final e$a e$a) {
        e$a.j(this.Y1, this.X1, (DialogInterface$OnClickListener)new slf$a(this));
        e$a.i((CharSequence)null, (DialogInterface$OnClickListener)null);
    }
    
    @Override
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        if (bundle == null) {
            final ListPreference listPreference = (ListPreference)this.f2();
            if (listPreference.t1 == null || listPreference.u1 == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.X1 = listPreference.Y(listPreference.v1);
            this.Y1 = listPreference.t1;
            this.Z1 = listPreference.u1;
        }
        else {
            this.X1 = ((BaseBundle)bundle).getInt("ListPreferenceDialogFragment.index", 0);
            this.Y1 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.Z1 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
    }
}
