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

public final class n3i extends v3e<m3i, p3i>
{
    public final zml<p1i> d;
    
    public n3i(final zml<p1i> d) {
        zzd.f((Object)d, "clickSubject");
        super((Class)m3i.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final p3i p3i = (p3i)c7x;
        final m3i m3i = (m3i)o;
        zzd.f((Object)p3i, "viewHolder");
        zzd.f((Object)m3i, "item");
        ((TextView)p3i.W0).setText((CharSequence)m3i.a);
        ((TextView)p3i.X0).setText((CharSequence)m3i.b);
        ((AppCompatTextView)p3i.X0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        final String a = m3i.a;
        if (zzd.a((Object)a, (Object)p3i.C0.getContext().getString(2131955374))) {
            final TypefacesTextView x0 = p3i.X0;
            final String b = m3i.b;
            final Locale root = Locale.ROOT;
            zzd.e((Object)root, "ROOT");
            ((TextView)x0).setText((CharSequence)ckr.d1(b, root));
        }
        else if (zzd.a((Object)a, (Object)p3i.C0.getContext().getString(2131955375))) {
            final String b2 = m3i.b;
            String y;
            if (b2 == null) {
                y = "";
            }
            else {
                y = b2;
                if (b2.length() > 10) {
                    final String a2 = hkr.a2(b2, 6);
                    int n = 4;
                    final int length = b2.length();
                    if (4 > length) {
                        n = length;
                    }
                    final String substring = b2.substring(length - n);
                    zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                    y = zi.y(a2, "...", substring);
                }
            }
            ((TextView)p3i.X0).setText((CharSequence)y);
            ((AppCompatTextView)p3i.X0).setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231587, 0);
            final TypefacesTextView x2 = p3i.X0;
            ((TextView)x2).setTextColor(eo6.b(((View)x2).getContext(), 2131100005));
            ((View)p3i.X0).setOnClickListener((View$OnClickListener)new ggk((Object)this, (Object)m3i, 11));
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131624971, viewGroup, false);
        zzd.e((Object)v, "view");
        return (c7x)new p3i(v);
    }
}
