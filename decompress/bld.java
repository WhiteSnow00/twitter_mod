import android.widget.TextSwitcher;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.TextView;
import android.content.res.Configuration;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bld extends zkd
{
    public bld(final View view, final int n, final int n2, final Configuration configuration) {
        super(view, n, n2, configuration);
    }
    
    @Override
    public final void a(final View view) {
        final boolean b = super.a.getLayoutDirection() == 1;
        super.b = view.findViewById(2131431908);
        super.c = view.findViewById(2131431913);
        final vxj d = new vxj((TextView)view.findViewById(2131431910), (TextView)view.findViewById(2131431911), (FrescoMediaImageView)view.findViewById(2131431909), (ImageView)view.findViewById(2131431912));
        super.d = d;
        d.d.setImageDrawable((Drawable)new f1e(b));
        final FrescoMediaImageView c = super.d.c;
        final xw4$b e0 = xw4.E0;
        c.setRoundingStrategy((plo)e0);
        final vxj e2 = new vxj((TextView)view.findViewById(2131431915), (TextView)view.findViewById(2131431916), (FrescoMediaImageView)view.findViewById(2131431914), (ImageView)view.findViewById(2131431917));
        super.e = e2;
        e2.d.setImageDrawable((Drawable)new f1e(b ^ true));
        super.e.c.setRoundingStrategy((plo)e0);
        super.f = (TextSwitcher)view.findViewById(2131431229);
        super.g = view.findViewById(2131431929);
    }
}
