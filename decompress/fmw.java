import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.content.Context;
import android.view.View;
import android.widget.AbsListView$RecyclerListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmw extends z3e<icw> implements AbsListView$RecyclerListener
{
    public final b4e I0;
    public mhj<View, icw> J0;
    public final tz5<icw> K0;
    
    public fmw(final Context context, final b4e i0, final tz5<icw> k0) {
        super(context, (s4e)new vpi());
        this.I0 = i0;
        this.K0 = k0;
    }
    
    public final /* bridge */ void a(final View view, final Context context, final Object o) {
        final icw icw = (icw)o;
    }
    
    public final void c(final View view, final Context context, final Object o, final int n) {
        final icw icw = (icw)o;
        view.setOnClickListener((View$OnClickListener)new emw((Object)this, (Object)icw, (Object)view, 0));
        final b4e i0 = this.I0;
        final Object tag = view.getTag(2131432589);
        final int a = o5j.a;
        final n8x n8x = (n8x)tag;
        final y06 y06 = new y06();
        view.setTag(2131432579, (Object)y06);
        final kcm a2 = kcm.Companion.a((yz5)y06);
        final ged$b g0 = ged.G0;
        f4e.a(n8x, i0, (Object)icw, n, a2, (Iterable)g0, (gda)null);
        f4e.d((n8x)view.getTag(2131432589), this.I0, (Object)icw, this.getCount(), n, (Iterable)g0, (gda)null);
        final mhj<View, icw> j0 = this.J0;
        if (j0 != null) {
            j0.g(view, (Object)icw, n);
        }
    }
    
    public final View f(final Context context, int a, final ViewGroup viewGroup) {
        final b4e i0 = this.I0;
        a = o5j.a;
        final n8x b = f4e.b(i0, viewGroup, 0, (Iterable)ged.G0, (gda)null);
        final View heldView = b.getHeldView();
        heldView.setTag(2131432589, (Object)b);
        heldView.setTag(2131432577, (Object)i0);
        return heldView;
    }
    
    public final int getViewTypeCount() {
        return 1;
    }
    
    public final void onMovedToScrapHeap(final View view) {
        final Object tag = view.getTag(2131432577);
        final Object tag2 = view.getTag(2131432589);
        final Object tag3 = view.getTag(2131432579);
        if (tag != null && tag2 != null) {
            final int a = o5j.a;
            f4e.c((n8x)tag2, (b4e)tag, (y06)tag3, (Iterable)ged.G0, (gda)null);
        }
    }
}
