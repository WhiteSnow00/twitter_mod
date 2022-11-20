// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import androidx.fragment.app.Fragment;
import android.util.AttributeSet;
import android.content.Context;

public final class PreferenceScreen extends PreferenceGroup
{
    public boolean w1;
    
    public PreferenceScreen(final Context context, final AttributeSet set) {
        super(context, set, cmv.a(context, 2130970349, 16842891));
        this.w1 = true;
    }
    
    public final void D() {
        if (((Preference)this).P0 == null && ((Preference)this).Q0 == null) {
            if (this.b0() != 0) {
                final f$b j = ((Preference)this).E0.j;
                if (j != null) {
                    final d d = (d)j;
                    if (((Fragment)d).L0() instanceof d$f) {
                        ((d$f)((Fragment)d).L0()).a();
                    }
                }
            }
        }
    }
}
