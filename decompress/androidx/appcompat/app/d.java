// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.AbsListView;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

public final class d implements AdapterView$OnItemClickListener
{
    public final AlertController.RecycleListView F0;
    public final AlertController G0;
    public final AlertController.b H0;
    
    public d(final AlertController.b h0, final AlertController.RecycleListView f0, final AlertController g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        final boolean[] v = this.H0.v;
        if (v != null) {
            v[n] = ((AbsListView)this.F0).isItemChecked(n);
        }
        this.H0.z.onClick((DialogInterface)this.G0.b, n, ((AbsListView)this.F0).isItemChecked(n));
    }
}
