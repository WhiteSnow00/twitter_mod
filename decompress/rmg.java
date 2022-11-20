import android.widget.Adapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmg implements AdapterView$OnItemClickListener
{
    public final smg D0;
    
    public rmg(final smg d0) {
        this.D0 = d0;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, int selectedItemPosition, long selectedItemId) {
        final smg d0 = this.D0;
        Object o;
        if (selectedItemPosition < 0) {
            final blf h0 = d0.H0;
            if (!h0.isShowing()) {
                o = null;
            }
            else {
                o = ((AdapterView)h0.F0).getSelectedItem();
            }
        }
        else {
            o = ((Adapter)((AutoCompleteTextView)d0).getAdapter()).getItem(selectedItemPosition);
        }
        smg.a(this.D0, o);
        final AdapterView$OnItemClickListener onItemClickListener = ((AutoCompleteTextView)this.D0).getOnItemClickListener();
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
                        onItemClickListener.onItemClick((AdapterView)this.D0.H0.F0, selectedView, n, selectedItemId);
                        break Label_0208;
                    }
                    final blf h2 = this.D0.H0;
                    if (!h2.isShowing()) {
                        final View selectedView = null;
                    }
                    else {
                        final View selectedView = ((AdapterView)h2.F0).getSelectedView();
                    }
                    final blf h3 = this.D0.H0;
                    if (!h3.isShowing()) {
                        selectedItemPosition = -1;
                    }
                    else {
                        selectedItemPosition = ((AdapterView)h3.F0).getSelectedItemPosition();
                    }
                    final blf h4 = this.D0.H0;
                    if (!h4.isShowing()) {
                        selectedItemId = Long.MIN_VALUE;
                        final int n = selectedItemPosition;
                        continue;
                    }
                    selectedItemId = ((AdapterView)h4.F0).getSelectedItemId();
                    int n = selectedItemPosition;
                    continue;
                }
            }
        }
        this.D0.H0.dismiss();
    }
}
