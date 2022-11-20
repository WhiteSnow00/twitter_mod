import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q21 extends a3e<mkc$b, b>
{
    public static final a Companion;
    public final lkc d;
    
    static {
        Companion = new a();
    }
    
    public q21(final lkc d) {
        czd.f((Object)d, "listEventDispatcher");
        super((Class)mkc$b.class);
        this.d = d;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final b b = (b)v7x;
        final mkc$b mkc$b = (mkc$b)o;
        czd.f((Object)b, "viewHolder");
        czd.f((Object)mkc$b, "item");
        final Resources resources = b.D0.getContext().getResources();
        b.X0.setText((CharSequence)mkc$b.b);
        final TextView y0 = b.Y0;
        final Long c = mkc$b.c;
        String u0;
        if (c != null && mkc$b.d != null) {
            u0 = ct0.U0((Object[])new String[] { yqs.n(resources, (long)c), yqs.l(mkc$b.d / 1000, resources) }, (CharSequence)" · ", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
        }
        else {
            u0 = null;
        }
        y0.setText((CharSequence)u0);
        b.D0.setOnClickListener((View$OnClickListener)new was((Object)this, (Object)mkc$b, 15));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131625520, viewGroup, false);
        czd.e((Object)e, "it");
        return (v7x)new b(e);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends RecyclerView$c0 implements v7x
    {
        public final TextView X0;
        public final TextView Y0;
        
        public b(View viewById) {
            super(viewById);
            final View viewById2 = viewById.findViewById(2131431972);
            czd.e((Object)viewById2, "view.findViewById(R.id.text_primary)");
            this.X0 = (TextView)viewById2;
            viewById = viewById.findViewById(2131431976);
            czd.e((Object)viewById, "view.findViewById(R.id.text_secondary)");
            this.Y0 = (TextView)viewById;
        }
        
        public final View getHeldView() {
            final View d0 = super.D0;
            czd.e((Object)d0, "itemView");
            return d0;
        }
    }
}
