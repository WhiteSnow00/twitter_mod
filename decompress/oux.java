import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Calendar;
import android.view.View$OnClickListener;
import java.util.Locale;
import androidx.recyclerview.widget.RecyclerView$c0;
import com.google.android.material.datepicker.c;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oux extends RecyclerView$e<a>
{
    public final c<?> F0;
    
    public oux(final c<?> f0) {
        this.F0 = f0;
    }
    
    public final int C(final int n) {
        return n - this.F0.C1.C0.E0;
    }
    
    public final int c() {
        return this.F0.C1.G0;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int n) {
        final a a = (a)recyclerView$c0;
        n += this.F0.C1.C0.E0;
        final String string = ((View)a.W0).getContext().getString(2131955187);
        a.W0.setText((CharSequence)String.format(Locale.getDefault(), "%d", n));
        ((View)a.W0).setContentDescription((CharSequence)String.format(string, n));
        final c93 f1 = this.F0.F1;
        final Calendar d = cmw.d();
        a93 a2;
        if (d.get(1) == n) {
            a2 = f1.f;
        }
        else {
            a2 = f1.d;
        }
        final Iterator iterator = this.F0.B1.i3().iterator();
        while (iterator.hasNext()) {
            d.setTimeInMillis((long)iterator.next());
            if (d.get(1) == n) {
                a2 = f1.e;
            }
        }
        a2.b(a.W0);
        ((View)a.W0).setOnClickListener((View$OnClickListener)new nux(this, n));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return new a((TextView)w30.B(viewGroup, 2131624871, viewGroup, false));
    }
    
    public static final class a extends RecyclerView$c0
    {
        public final TextView W0;
        
        public a(final TextView w0) {
            super((View)w0);
            this.W0 = w0;
        }
    }
}
