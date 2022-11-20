import androidx.recyclerview.widget.RecyclerView$c0;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnClickListener;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q3i extends a3e<p3i, s3i>
{
    public final nnl<s1i> d;
    
    public q3i(final nnl<s1i> d) {
        czd.f((Object)d, "clickSubject");
        super((Class)p3i.class);
        this.d = d;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final s3i s3i = (s3i)v7x;
        final p3i p3i = (p3i)o;
        czd.f((Object)s3i, "viewHolder");
        czd.f((Object)p3i, "item");
        ((TextView)s3i.X0).setText((CharSequence)p3i.a);
        ((TextView)s3i.Y0).setText((CharSequence)p3i.b);
        ((AppCompatTextView)s3i.Y0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        final String a = p3i.a;
        if (czd.a((Object)a, (Object)((RecyclerView$c0)s3i).D0.getContext().getString(2131955374))) {
            final TypefacesTextView y0 = s3i.Y0;
            final String b = p3i.b;
            final Locale root = Locale.ROOT;
            czd.e((Object)root, "ROOT");
            ((TextView)y0).setText((CharSequence)vkr.R(b, root));
        }
        else if (czd.a((Object)a, (Object)((RecyclerView$c0)s3i).D0.getContext().getString(2131955375))) {
            final String b2 = p3i.b;
            String j;
            if (b2 == null) {
                j = "";
            }
            else {
                j = b2;
                if (b2.length() > 10) {
                    final String o2 = alr.O0(b2, 6);
                    int n = 4;
                    final int length = b2.length();
                    if (4 > length) {
                        n = length;
                    }
                    final String substring = b2.substring(length - n);
                    czd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    j = da8.j(o2, "...", substring);
                }
            }
            ((TextView)s3i.Y0).setText((CharSequence)j);
            ((AppCompatTextView)s3i.Y0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231587, 0);
            final TypefacesTextView y2 = s3i.Y0;
            ((TextView)y2).setTextColor(kn6.b(((View)y2).getContext(), 2131100005));
            ((View)s3i.Y0).setOnClickListener((View$OnClickListener)new g8w((Object)this, (Object)p3i, 11));
        }
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131624973, viewGroup, false);
        czd.e((Object)e, "view");
        return (v7x)new s3i(e);
    }
}
