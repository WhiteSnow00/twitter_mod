import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaq
{
    public final TextView a;
    public final TextView b;
    
    public aaq(final View view) {
        final View viewById = view.findViewById(2131432076);
        jee.l((Object)viewById);
        final int a = c5j.a;
        this.a = (TextView)viewById;
        final TextView textView = (TextView)view.findViewById(2131431801);
        this.b = (TextView)view.findViewById(2131428494);
    }
    
    public static View a(final ViewGroup viewGroup, final y8q y8q, final float n) {
        final View h = da8.h(viewGroup, 2131625638, viewGroup, false);
        final aaq tag = new aaq(h);
        h.setTag((Object)tag);
        if (n > 0.0f) {
            tag.a.setTextSize(0, n);
        }
        final aaq aaq = (aaq)h.getTag();
        aaq.a.setText((CharSequence)y8q.a);
        final TextView b = aaq.b;
        if (b != null) {
            ((View)b).setVisibility(8);
        }
        h.setContentDescription((CharSequence)y8q.a);
        return h;
    }
}
