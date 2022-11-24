import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h79 implements g79
{
    public final Object a(final Object o, Object o2, final Object o3) {
        final h1 h1 = (h1)o;
        final ViewGroup viewGroup = (ViewGroup)o2;
        final acv acv = (acv)o3;
        ViewGroup viewGroup2;
        if (((View)viewGroup).getId() == 2131432553) {
            viewGroup2 = viewGroup;
        }
        else {
            viewGroup2 = (ViewGroup)((View)viewGroup).findViewById(2131432553);
        }
        final Context context = ((View)viewGroup).getContext();
        o2 = new x6r();
        final y6r y6r = new y6r();
        vmw.g((Object)viewGroup2);
        return new vkk(context, (cbf)o2, (k9x)y6r, viewGroup2, u0x.a(), egz.y(null), c4.c(), hd1.a().r1(), hd1.a().b7(), (uca)acv, h1, (View$OnClickListener)rl1.F0, true, (bn9)bn9.a, (zv1)null);
    }
}
