import android.view.ViewGroup;
import android.view.View;
import android.graphics.drawable.Drawable;
import com.twitter.ui.view.GroupedRowView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvd extends b4e<ewd$a, nmh>
{
    public zvd() {
        super((Class)ewd$a.class);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final nmh nmh = (nmh)n8x;
        nmh.n0(((ewd$a)o).a);
        final View f0 = ((sl8)nmh).F0;
        final int a = o5j.a;
        final GroupedRowView groupedRowView = (GroupedRowView)f0;
        ((View)groupedRowView).setBackground((Drawable)null);
        groupedRowView.setStyle(1);
        groupedRowView.Q0 = true;
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        ((View)viewGroup).getContext();
        return (n8x)new nmh(viewGroup);
    }
}
