import android.annotation.SuppressLint;
import java.util.Locale;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.os.Build$VERSION;
import java.util.Calendar;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ta8 extends BaseAdapter
{
    public static final int F0;
    public final Calendar C0;
    public final int D0;
    public final int E0;
    
    static {
        int f0;
        if (Build$VERSION.SDK_INT >= 26) {
            f0 = 4;
        }
        else {
            f0 = 1;
        }
        F0 = f0;
    }
    
    public ta8() {
        final Calendar e = cmw.e((Calendar)null);
        this.C0 = e;
        this.D0 = e.getMaximum(7);
        this.E0 = e.getFirstDayOfWeek();
    }
    
    public final int getCount() {
        return this.D0;
    }
    
    public final Object getItem(int n) {
        final int d0 = this.D0;
        Object value;
        if (n >= d0) {
            value = null;
        }
        else {
            final int n2 = n + this.E0;
            if ((n = n2) > d0) {
                n = n2 - d0;
            }
            value = n;
        }
        return value;
    }
    
    public final long getItemId(final int n) {
        return 0L;
    }
    
    @SuppressLint({ "WrongConstant" })
    public final View getView(int n, final View view, final ViewGroup viewGroup) {
        TextView textView = (TextView)view;
        if (view == null) {
            textView = (TextView)w30.B(viewGroup, 2131624863, viewGroup, false);
        }
        final Calendar c0 = this.C0;
        final int n2 = n + this.E0;
        final int d0 = this.D0;
        if ((n = n2) > d0) {
            n = n2 - d0;
        }
        c0.set(7, n);
        textView.setText((CharSequence)this.C0.getDisplayName(7, ta8.F0, ((View)textView).getResources().getConfiguration().locale));
        ((View)textView).setContentDescription((CharSequence)String.format(((View)viewGroup).getContext().getString(2131955182), this.C0.getDisplayName(7, 2, Locale.getDefault())));
        return (View)textView;
    }
}
