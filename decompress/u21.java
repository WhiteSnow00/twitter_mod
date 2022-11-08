import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u21 extends v3e<mlc$b, b>
{
    public static final u21.u21$a Companion;
    public final llc d;
    
    static {
        Companion = new u21.u21$a();
    }
    
    public u21(final llc d) {
        zzd.f((Object)d, "listEventDispatcher");
        super((Class)mlc$b.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final b b = (b)c7x;
        final mlc$b mlc$b = (mlc$b)o;
        zzd.f((Object)b, "viewHolder");
        zzd.f((Object)mlc$b, "item");
        final Resources resources = b.C0.getContext().getResources();
        b.W0.setText((CharSequence)mlc$b.b);
        final TextView x0 = b.X0;
        final Long c = mlc$b.c;
        String j0;
        if (c != null && mlc$b.d != null) {
            j0 = jt0.J0((Object[])new String[] { hqs.n(resources, (long)c), hqs.l(mlc$b.d / 1000, resources) }, (CharSequence)" · ", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
        }
        else {
            j0 = null;
        }
        x0.setText((CharSequence)j0);
        b.C0.setOnClickListener((View$OnClickListener)new sy((Object)this, (Object)mlc$b, 25));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131625518, viewGroup, false);
        zzd.e((Object)v, "it");
        return (c7x)new b(v);
    }
    
    public static final class b extends RecyclerView$c0 implements c7x
    {
        public final TextView W0;
        public final TextView X0;
        
        public b(View viewById) {
            super(viewById);
            final View viewById2 = viewById.findViewById(2131431969);
            zzd.e((Object)viewById2, "view.findViewById(R.id.text_primary)");
            this.W0 = (TextView)viewById2;
            viewById = viewById.findViewById(2131431973);
            zzd.e((Object)viewById, "view.findViewById(R.id.text_secondary)");
            this.X0 = (TextView)viewById;
        }
        
        public final View getHeldView() {
            final View c0 = super.C0;
            zzd.e((Object)c0, "itemView");
            return c0;
        }
    }
}
