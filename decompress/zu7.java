import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zu7 extends v3e<wx7$h, a>
{
    public final rtb<wx7$h, oyv> d;
    
    public zu7(final rtb<? super wx7$h, oyv> d) {
        super((Class)wx7$h.class);
        this.d = (rtb<wx7$h, oyv>)d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final wx7$h wx7$h = (wx7$h)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)wx7$h, "item");
        a.D0.setText(j2d.d((CharSequence)wx7$h.a));
        ((View)a.E0).setContentDescription((CharSequence)wx7$h.a);
        a.C0.setOnClickListener((View$OnClickListener)new x7w((Object)this, (Object)wx7$h, 4));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new a(viewGroup);
    }
    
    public static final class a extends el8
    {
        public final TextView D0;
        public final ImageView E0;
        
        public a(final ViewGroup viewGroup) {
            final View v = lf.v(viewGroup, "parent", 2131624340, viewGroup, false);
            super(v);
            final View viewById = v.findViewById(2131431940);
            zzd.e((Object)viewById, "heldView.findViewById(R.id.text)");
            this.D0 = (TextView)viewById;
            final View viewById2 = v.findViewById(2131429505);
            zzd.e((Object)viewById2, "heldView.findViewById(R.id.icon)");
            this.E0 = (ImageView)viewById2;
        }
    }
}
