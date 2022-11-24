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

public final class w8w extends b4e<rds, a>
{
    public final fci<?> d;
    
    public w8w(final fci<?> d) {
        super((Class)rds.class);
        this.d = d;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final rds rds = (rds)o;
        final qgv a2 = rds.a;
        final View f0 = a.F0;
        final Resources resources = f0.getResources();
        a.I0.H(a2);
        a.G0.setText((CharSequence)a2.c());
        a.H0.setText((CharSequence)flr.l(a2.M0));
        final qgv b = rds.b;
        if (b != null) {
            a.J0.H(b);
            ((View)a.J0).setVisibility(0);
        }
        if (rds.c) {
            a.K0.setVisibility(0);
            a.K0.setColorFilter(resources.getColor(2131099946));
        }
        else if (rds.d) {
            a.K0.setVisibility(0);
            a.K0.setColorFilter(b1b.B(f0.getContext(), 2130969102));
        }
        else {
            a.K0.setVisibility(8);
        }
        if (a.L0 != null) {
            xal.a(f0.getContext(), a.L0, a2.P0 || (a2.h() != null && a2.h()), a2.o1, a2.O0, b1b.B(f0.getContext(), 2130968593));
        }
        f0.setOnClickListener((View$OnClickListener)new v8w((Object)this, (Object)a2, 0));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new a(m51.w(viewGroup, 2131624376, viewGroup, false));
    }
    
    public static final class a extends sl8
    {
        public final TextView G0;
        public final TextView H0;
        public final UserImageView I0;
        public final UserImageView J0;
        public final ImageView K0;
        public final ViewGroup L0;
        
        public a(final View view) {
            super(view);
            this.G0 = (TextView)view.findViewById(2131427424);
            this.H0 = (TextView)view.findViewById(2131432514);
            final UserImageView i0 = (UserImageView)view.findViewById(2131432471);
            this.I0 = i0;
            final UserImageView j0 = (UserImageView)view.findViewById(2131428461);
            this.J0 = j0;
            this.K0 = (ImageView)view.findViewById(2131427518);
            this.L0 = (ViewGroup)view.findViewById(2131427766);
            final Context context = view.getContext();
            final Resources resources = view.getResources();
            i0.setSize(-3);
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131167547);
            i0.setPadding(0, 0, dimensionPixelSize, dimensionPixelSize);
            j0.F(qo6.b(context, 2131100880), 2131167547);
            view.setBackgroundColor(b1b.B(context, 2130969110));
        }
    }
}
