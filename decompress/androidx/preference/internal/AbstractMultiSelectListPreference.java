// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference.internal;

import java.util.Set;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.DialogPreference;

public abstract class AbstractMultiSelectListPreference extends DialogPreference
{
    public AbstractMultiSelectListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public AbstractMultiSelectListPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, 0);
    }
    
    public abstract CharSequence[] Y();
    
    public abstract CharSequence[] Z();
    
    public abstract Set<String> a0();
    
    public abstract void b0(final Set<String> p0);
}
