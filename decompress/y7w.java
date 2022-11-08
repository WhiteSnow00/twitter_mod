import android.content.Context;
import android.widget.ImageView;
import com.twitter.media.ui.image.UserImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y7w extends v3e<ecs, a>
{
    public final mbi<?> d;
    
    public y7w(final mbi<?> d) {
        super((Class)ecs.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final a a = (a)c7x;
        final ecs ecs = (ecs)o;
        final hfv a2 = ecs.a;
        final View c0 = a.C0;
        final Resources resources = c0.getResources();
        a.F0.H(a2);
        a.D0.setText((CharSequence)a2.c());
        a.E0.setText((CharSequence)pjr.l(a2.J0));
        final hfv b = ecs.b;
        if (b != null) {
            a.G0.H(b);
            ((View)a.G0).setVisibility(0);
        }
        if (ecs.c) {
            a.H0.setVisibility(0);
            a.H0.setColorFilter(resources.getColor(2131099946));
        }
        else if (ecs.d) {
            a.H0.setVisibility(0);
            a.H0.setColorFilter(goz.J(c0.getContext(), 2130969102));
        }
        else {
            a.H0.setVisibility(8);
        }
        if (a.I0 != null) {
            y9l.a(c0.getContext(), a.I0, a2.M0 || (a2.h() != null && a2.h()), a2.l1, a2.L0, goz.J(c0.getContext(), 2130968593));
        }
        c0.setOnClickListener((View$OnClickListener)new x7w((Object)this, (Object)a2, 0));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new a(w30.B(viewGroup, 2131624376, viewGroup, false));
    }
    
    public static final class a extends el8
    {
        public final TextView D0;
        public final TextView E0;
        public final UserImageView F0;
        public final UserImageView G0;
        public final ImageView H0;
        public final ViewGroup I0;
        
        public a(final View view) {
            super(view);
            this.D0 = (TextView)view.findViewById(2131427424);
            this.E0 = (TextView)view.findViewById(2131432510);
            final UserImageView f0 = (UserImageView)view.findViewById(2131432467);
            this.F0 = f0;
            final UserImageView g0 = (UserImageView)view.findViewById(2131428461);
            this.G0 = g0;
            this.H0 = (ImageView)view.findViewById(2131427518);
            this.I0 = (ViewGroup)view.findViewById(2131427766);
            final Context context = view.getContext();
            final Resources resources = view.getResources();
            f0.setSize(-3);
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131167547);
            f0.setPadding(0, 0, dimensionPixelSize, dimensionPixelSize);
            g0.F(eo6.b(context, 2131100880), 2131167547);
            view.setBackgroundColor(goz.J(context, 2130969110));
        }
    }
}
