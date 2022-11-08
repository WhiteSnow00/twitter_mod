import androidx.preference.Preference;
import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import androidx.appcompat.app.e$a;
import androidx.preference.internal.AbstractMultiSelectListPreference;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;
import androidx.preference.c;

// 
// Decompiled by Procyon v0.6.0
// 

public class msh extends c
{
    public Set<String> X1;
    public boolean Y1;
    public CharSequence[] Z1;
    public CharSequence[] a2;
    
    public msh() {
        this.X1 = new HashSet();
    }
    
    @Override
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.X1));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.Y1);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.Z1);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.a2);
    }
    
    @Override
    public final void h2(final boolean b) {
        final AbstractMultiSelectListPreference abstractMultiSelectListPreference = (AbstractMultiSelectListPreference)this.f2();
        if (b && this.Y1) {
            final HashSet x1 = this.X1;
            if (((Preference)abstractMultiSelectListPreference).f((Object)x1)) {
                abstractMultiSelectListPreference.b0((Set)x1);
            }
        }
        this.Y1 = false;
    }
    
    @Override
    public final void i2(final e$a e$a) {
        final int length = this.a2.length;
        final boolean[] array = new boolean[length];
        for (int i = 0; i < length; ++i) {
            array[i] = this.X1.contains(this.a2[i].toString());
        }
        e$a.f(this.Z1, array, (DialogInterface$OnMultiChoiceClickListener)new DialogInterface$OnMultiChoiceClickListener() {
            public final void onClick(final DialogInterface dialogInterface, final int n, final boolean b) {
                if (b) {
                    final msh a = msh.this;
                    a.Y1 |= a.X1.add(a.a2[n].toString());
                }
                else {
                    final msh a2 = msh.this;
                    a2.Y1 |= a2.X1.remove(a2.a2[n].toString());
                }
            }
        });
    }
    
    @Override
    public final void k1(final Bundle bundle) {
        super.k1(bundle);
        if (bundle == null) {
            final AbstractMultiSelectListPreference abstractMultiSelectListPreference = (AbstractMultiSelectListPreference)this.f2();
            if (abstractMultiSelectListPreference.Y() == null || abstractMultiSelectListPreference.Z() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.X1.clear();
            this.X1.addAll(abstractMultiSelectListPreference.a0());
            this.Y1 = false;
            this.Z1 = abstractMultiSelectListPreference.Y();
            this.a2 = abstractMultiSelectListPreference.Z();
        }
        else {
            this.X1.clear();
            this.X1.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.Y1 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.Z1 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.a2 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
    }
}
