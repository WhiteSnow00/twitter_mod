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

public final class evx extends RecyclerView$e<a>
{
    public final c<?> G0;
    
    public evx(final c<?> g0) {
        this.G0 = g0;
    }
    
    public final int C(final int n) {
        return n - this.G0.D1.D0.F0;
    }
    
    public final int c() {
        return this.G0.D1.H0;
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int n) {
        final a a = (a)recyclerView$c0;
        n += this.G0.D1.D0.F0;
        final String string = ((View)a.X0).getContext().getString(2131955187);
        a.X0.setText((CharSequence)String.format(Locale.getDefault(), "%d", n));
        ((View)a.X0).setContentDescription((CharSequence)String.format(string, n));
        final v83 g1 = this.G0.G1;
        final Calendar d = wmw.d();
        t83 t83;
        if (d.get(1) == n) {
            t83 = g1.f;
        }
        else {
            t83 = g1.d;
        }
        final Iterator iterator = this.G0.C1.h3().iterator();
        while (iterator.hasNext()) {
            d.setTimeInMillis((long)iterator.next());
            if (d.get(1) == n) {
                t83 = g1.e;
            }
        }
        t83.b(a.X0);
        ((View)a.X0).setOnClickListener((View$OnClickListener)new dvx(this, n));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return new a((TextView)da8.h(viewGroup, 2131624873, viewGroup, false));
    }
    
    public static final class a extends RecyclerView$c0
    {
        public final TextView X0;
        
        public a(final TextView x0) {
            super((View)x0);
            this.X0 = x0;
        }
    }
}
