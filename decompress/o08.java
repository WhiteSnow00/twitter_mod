import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o08 extends v3e<wx7$f, a>
{
    public final rtb<wx7$f, oyv> d;
    public final rtb<wx7$f, oyv> e;
    
    public o08(final rtb<? super wx7$f, oyv> d, final rtb<? super wx7$f, oyv> e) {
        super((Class)wx7$f.class);
        this.d = (rtb<wx7$f, oyv>)d;
        this.e = (rtb<wx7$f, oyv>)e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final wx7$f wx7$f = (wx7$f)o;
        zzd.f((Object)a, "viewHolder");
        zzd.f((Object)wx7$f, "item");
        final View c0 = a.C0;
        final boolean a2 = wx7$f.a;
        final boolean b = true;
        c0.setEnabled(a2 ^ true);
        final View f0 = a.F0;
        final boolean a3 = wx7$f.a;
        final int n = 8;
        int visibility;
        if (a3) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        f0.setVisibility(visibility);
        final TextView d0 = a.D0;
        int visibility2;
        if (wx7$f.b || wx7$f.a) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        ((View)d0).setVisibility(visibility2);
        final TextView e0 = a.E0;
        int n2 = b ? 1 : 0;
        if (!wx7$f.b) {
            if (wx7$f.a) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        int visibility3;
        if (n2 != 0) {
            visibility3 = n;
        }
        else {
            visibility3 = 0;
        }
        ((View)e0).setVisibility(visibility3);
        a.C0.setOnClickListener((View$OnClickListener)new ibg(this, wx7$f, 4));
        if (!wx7$f.a) {
            this.e.invoke((Object)wx7$f);
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new a(viewGroup);
    }
    
    public static final class a extends el8
    {
        public final TextView D0;
        public final TextView E0;
        public final View F0;
        
        public a(final ViewGroup viewGroup) {
            final View v = lf.v(viewGroup, "parent", 2131624346, viewGroup, false);
            super(v);
            final View viewById = v.findViewById(2131432088);
            zzd.e((Object)viewById, "heldView.findViewById(R.id.title_text)");
            this.D0 = (TextView)viewById;
            final View viewById2 = v.findViewById(2131427503);
            zzd.e((Object)viewById2, "heldView.findViewById(R.id.action_text)");
            this.E0 = (TextView)viewById2;
            final View viewById3 = v.findViewById(2131430775);
            zzd.e((Object)viewById3, "heldView.findViewById(R.id.progress_bar)");
            this.F0 = viewById3;
        }
    }
}
