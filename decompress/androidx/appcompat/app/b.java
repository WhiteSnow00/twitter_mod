// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.AbsListView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

public final class b extends ArrayAdapter<CharSequence>
{
    public final AlertController.RecycleListView F0;
    public final AlertController.b G0;
    
    public b(final AlertController.b g0, final Context context, final int n, final CharSequence[] array, final AlertController.RecycleListView f0) {
        this.G0 = g0;
        this.F0 = f0;
        super(context, n, 16908308, (Object[])array);
    }
    
    public final View getView(final int n, View view, final ViewGroup viewGroup) {
        view = super.getView(n, view, viewGroup);
        final boolean[] v = this.G0.v;
        if (v != null && v[n]) {
            ((AbsListView)this.F0).setItemChecked(n, true);
        }
        return view;
    }
}
