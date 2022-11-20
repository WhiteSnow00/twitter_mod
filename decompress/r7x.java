import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7x
{
    public static final View a(final ViewGroup viewGroup, final int n) {
        final View child = viewGroup.getChildAt(n);
        if (child != null) {
            return child;
        }
        final StringBuilder l = da8.l("Index: ", n, ", Size: ");
        l.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(l.toString());
    }
    
    public static final xjp<View> b(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "<this>");
        return (xjp<View>)new r7x$a(viewGroup);
    }
    
    public static final xjp<View> c(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "<this>");
        return (xjp<View>)wiy.U((ftb)new r7x$b(viewGroup, (go6)null));
    }
}
