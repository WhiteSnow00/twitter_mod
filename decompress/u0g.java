import java.util.WeakHashMap;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u0g extends hzw
{
    public u0g(final Context context, final k69 k69, final ViewGroup viewGroup, final t69 t69) {
        super(context, k69, viewGroup, t69);
        final ViewStub viewStub = (ViewStub)((View)viewGroup).findViewById(2131432553);
        viewStub.setLayoutResource(2131625981);
        final View inflate = viewStub.inflate();
        final int a = o5j.a;
        final ViewGroup viewGroup2 = (ViewGroup)inflate;
        final ViewGroup viewGroup3 = (ViewGroup)((View)viewGroup2).findViewById(2131432553);
        final float n = (float)((View)viewGroup2).getResources().getDimensionPixelSize(2131167439);
        final WeakHashMap a2 = b7x.a;
        b7x$i.s((View)viewGroup3, n);
    }
}
