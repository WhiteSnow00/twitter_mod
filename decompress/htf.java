import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.media.av.ui.ClosedCaptionsView;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htf extends ryw
{
    public final mg3 M0;
    public final wc6 N0;
    public final ViewStub O0;
    public ClosedCaptionsView P0;
    public boolean Q0;
    public boolean R0;
    
    public htf(final Context context, final d59 d59, final ViewGroup viewGroup, final m59 m59, final mg3 m60) {
        super(context, d59, viewGroup, m59);
        this.N0 = new wc6();
        this.M0 = m60;
        final ViewStub viewStub = (ViewStub)((View)viewGroup).findViewById(2131432552);
        viewStub.setLayoutResource(2131625981);
        final View inflate = viewStub.inflate();
        final int a = c5j.a;
        final ViewGroup viewGroup2 = (ViewGroup)inflate;
        final ViewStub o0 = new ViewStub(context, 2131624736);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -1);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167439);
        frameLayout$LayoutParams.topMargin = dimensionPixelSize;
        frameLayout$LayoutParams.leftMargin = dimensionPixelSize;
        frameLayout$LayoutParams.bottomMargin = dimensionPixelSize;
        frameLayout$LayoutParams.rightMargin = dimensionPixelSize;
        ((ViewGroup)((e59)this).E0).addView((View)o0, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.O0 = o0;
        final float dimension = ((View)viewGroup2).getResources().getDimension(2131166092);
        final WeakHashMap a2 = j6x.a;
        j6x$i.s((View)viewGroup2, dimension);
    }
}
