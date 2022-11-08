import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plf implements AdapterView$OnItemSelectedListener
{
    public final /* synthetic */ qlf C0;
    
    public plf(final qlf c0) {
        this.C0 = c0;
    }
    
    public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        if (n != -1) {
            final mj9 e0 = this.C0.E0;
            if (e0 != null) {
                e0.setListSelectionHidden(false);
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView<?> adapterView) {
    }
}
