import android.text.SpannableStringBuilder;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohc extends htr<nhc>
{
    public final int F0;
    public final boolean G0;
    
    public ohc(final Context context) {
        super(context);
        this.F0 = 2131624603;
        this.G0 = dta.b().b("hashflags_in_composer_android_enabled", false);
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(this.F0, viewGroup, false);
    }
    
    public final void g(final View view, final nhc nhc) {
        final TextView textView = (TextView)view.findViewById(2131431809);
        final TextView textView2 = (TextView)view.findViewById(2131431808);
        if (this.G0 && nhc.c != null) {
            final SpannableStringBuilder text = new SpannableStringBuilder((CharSequence)nhc.a);
            dgc.c(view.getContext(), text, nhc.c, (View)textView);
            textView.setText((CharSequence)text);
        }
        else {
            textView.setText((CharSequence)nhc.a);
        }
        if (nhc.d != null) {
            ((View)textView2).setVisibility(0);
            textView2.setText((CharSequence)nhc.d.a);
        }
        else {
            ((View)textView2).setVisibility(8);
        }
    }
    
    public final long getItemId(final int n) {
        final nhc nhc = (nhc)((t3e)this).getItem(n);
        long b;
        if (nhc != null) {
            b = nhc.b;
        }
        else {
            b = -1L;
        }
        return b;
    }
}
