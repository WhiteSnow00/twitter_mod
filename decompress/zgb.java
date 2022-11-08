import android.widget.TextView;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zgb implements okx<ahb, Object, ygb>
{
    public final View C0;
    public final gob D0;
    public final ImageView E0;
    public final TypefacesTextView F0;
    public final TypefacesTextView G0;
    
    public zgb(View viewById, final gob d0) {
        zzd.f((Object)viewById, "rootView");
        this.C0 = viewById;
        this.D0 = d0;
        final View viewById2 = viewById.findViewById(2131429211);
        zzd.e((Object)viewById2, "rootView.findViewById(R.id.folders_empty_image)");
        this.E0 = (ImageView)viewById2;
        final View viewById3 = viewById.findViewById(2131432082);
        zzd.e((Object)viewById3, "rootView.findViewById(R.id.title_empty_text)");
        this.F0 = (TypefacesTextView)viewById3;
        viewById = viewById.findViewById(2131430049);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.message_empty_text)");
        this.G0 = (TypefacesTextView)viewById;
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
    }
    
    public final void s(final Object o) {
        final ygb ygb = (ygb)o;
        zzd.f((Object)ygb, "effect");
        if (ygb instanceof ygb.a) {
            final fba.c a = fba.c.a;
            lux.j(fba.c.c);
            final ImageView e0 = this.E0;
            final ygb.a a2 = (ygb.a)ygb;
            final int c = a2.c;
            final int n = 0;
            int visibility;
            if (c != -1) {
                visibility = n;
            }
            else {
                visibility = 8;
            }
            ((View)e0).setVisibility(visibility);
            final int c2 = a2.c;
            if (c2 != -1) {
                final ImageView e2 = this.E0;
                final gob d0 = this.D0;
                final Object a3 = eo6.a;
                ((View)e2).setBackground(eo6$c.b((Context)d0, c2));
            }
            ((TextView)this.F0).setText((CharSequence)((Context)this.D0).getString(a2.a));
            ((TextView)this.G0).setText((CharSequence)((Context)this.D0).getString(a2.b));
        }
    }
    
    public interface a
    {
        zgb a(final View p0);
    }
}
