import androidx.appcompat.widget.AppCompatEditText;
import android.widget.Filter$FilterResults;
import android.widget.Filter;
import android.view.ViewStub;
import android.view.LayoutInflater;
import android.app.Activity;
import com.twitter.ui.widget.PopupEditText;
import android.widget.Filterable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7g extends pis implements Filterable
{
    public final PopupEditText J0;
    
    public k7g(final Activity activity, final LayoutInflater layoutInflater) {
        super(activity, layoutInflater);
        final ViewStub viewStub = (ViewStub)super.F0.findViewById(2131431960);
        viewStub.setLayoutResource(2131625090);
        this.J0 = (PopupEditText)viewStub.inflate().findViewById(2131431959);
    }
    
    public final Filter getFilter() {
        return new Filter(this) {
            public final k7g a;
            
            public final CharSequence convertResultToString(final Object o) {
                return this.a.s0();
            }
            
            public final Filter$FilterResults performFiltering(final CharSequence charSequence) {
                return null;
            }
            
            public final void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
            }
        };
    }
    
    public final String s0() {
        return ((AppCompatEditText)this.J0).getText().toString();
    }
}
