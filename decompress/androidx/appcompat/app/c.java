// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

public final class c implements AdapterView$OnItemClickListener
{
    public final AlertController F0;
    public final AlertController.b G0;
    
    public c(final AlertController.b g0, final AlertController f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.G0.t.onClick((DialogInterface)this.F0.b, n);
        if (!this.G0.x) {
            this.F0.b.dismiss();
        }
    }
}
