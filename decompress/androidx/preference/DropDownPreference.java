// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class DropDownPreference extends ListPreference
{
    public final ArrayAdapter B1;
    public Spinner C1;
    public final DropDownPreference$a D1;
    
    public DropDownPreference(final Context context, final AttributeSet set) {
        this(context, set, 2130969274, 0);
    }
    
    public DropDownPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, 2130969274, 0);
        this.D1 = new DropDownPreference$a(this);
        this.B1 = new ArrayAdapter(context, 17367049);
        this.a0();
    }
    
    public final void C(final kwk kwk) {
        (this.C1 = (Spinner)kwk.F0.findViewById(2131431673)).setAdapter((SpinnerAdapter)this.B1);
        ((AdapterView)this.C1).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this.D1);
        final Spinner c1 = this.C1;
        final String y1 = super.y1;
        final CharSequence[] x1 = super.x1;
        int selection;
        final int n = selection = -1;
        if (y1 != null) {
            selection = n;
            if (x1 != null) {
                int n2 = x1.length - 1;
                while (true) {
                    selection = n;
                    if (n2 < 0) {
                        break;
                    }
                    if (x1[n2].equals(y1)) {
                        selection = n2;
                        break;
                    }
                    --n2;
                }
            }
        }
        ((AdapterView)c1).setSelection(selection);
        super.C(kwk);
    }
    
    public final void D() {
        this.C1.performClick();
    }
    
    public final void a0() {
        this.B1.clear();
        final CharSequence[] w1 = super.w1;
        if (w1 != null) {
            for (int length = w1.length, i = 0; i < length; ++i) {
                this.B1.add((Object)w1[i].toString());
            }
        }
    }
    
    public final void x() {
        super.x();
        this.B1.notifyDataSetChanged();
    }
}
