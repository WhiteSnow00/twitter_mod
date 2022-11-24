import android.widget.Adapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lng implements AdapterView$OnItemClickListener
{
    public final mng F0;
    
    public lng(final mng f0) {
        this.F0 = f0;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, int selectedItemPosition, long selectedItemId) {
        final mng f0 = this.F0;
        Object o;
        if (selectedItemPosition < 0) {
            final ylf j0 = f0.J0;
            if (!j0.isShowing()) {
                o = null;
            }
            else {
                o = ((AdapterView)j0.H0).getSelectedItem();
            }
        }
        else {
            o = ((Adapter)((AutoCompleteTextView)f0).getAdapter()).getItem(selectedItemPosition);
        }
        mng.a(this.F0, o);
        final AdapterView$OnItemClickListener onItemClickListener = ((AutoCompleteTextView)this.F0).getOnItemClickListener();
        Label_0208: {
            if (onItemClickListener != null) {
                while (true) {
                    Label_0089: {
                        if (view == null) {
                            break Label_0089;
                        }
                        final View selectedView = view;
                        final int n;
                        if ((n = selectedItemPosition) < 0) {
                            break Label_0089;
                        }
                        onItemClickListener.onItemClick((AdapterView)this.F0.J0.H0, selectedView, n, selectedItemId);
                        break Label_0208;
                    }
                    final ylf j2 = this.F0.J0;
                    if (!j2.isShowing()) {
                        final View selectedView = null;
                    }
                    else {
                        final View selectedView = ((AdapterView)j2.H0).getSelectedView();
                    }
                    final ylf j3 = this.F0.J0;
                    if (!j3.isShowing()) {
                        selectedItemPosition = -1;
                    }
                    else {
                        selectedItemPosition = ((AdapterView)j3.H0).getSelectedItemPosition();
                    }
                    final ylf j4 = this.F0.J0;
                    if (!j4.isShowing()) {
                        selectedItemId = Long.MIN_VALUE;
                        final int n = selectedItemPosition;
                        continue;
                    }
                    selectedItemId = ((AdapterView)j4.H0).getSelectedItemId();
                    int n = selectedItemPosition;
                    continue;
                }
            }
        }
        this.F0.J0.dismiss();
    }
}
