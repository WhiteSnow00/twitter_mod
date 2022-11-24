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

public final class cmd extends amd
{
    public cmd(final View view, final int n, final int n2, final Configuration configuration) {
        super(view, n, n2, configuration);
    }
    
    @Override
    public final void a(final View view) {
        final boolean b = super.a.getLayoutDirection() == 1;
        super.b = view.findViewById(2131431909);
        super.c = view.findViewById(2131431914);
        final kyj d = new kyj((TextView)view.findViewById(2131431911), (TextView)view.findViewById(2131431912), (FrescoMediaImageView)view.findViewById(2131431910), (ImageView)view.findViewById(2131431913));
        super.d = d;
        d.d.setImageDrawable((Drawable)new h2e(b));
        final FrescoMediaImageView c = super.d.c;
        final ey4$b g0 = ey4.G0;
        c.setRoundingStrategy((jmo)g0);
        final kyj e = new kyj((TextView)view.findViewById(2131431916), (TextView)view.findViewById(2131431917), (FrescoMediaImageView)view.findViewById(2131431915), (ImageView)view.findViewById(2131431918));
        super.e = e;
        e.d.setImageDrawable((Drawable)new h2e(b ^ true));
        super.e.c.setRoundingStrategy((jmo)g0);
        super.f = (TextSwitcher)view.findViewById(2131431230);
        super.g = view.findViewById(2131431930);
    }
}
