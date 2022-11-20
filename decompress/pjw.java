import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class pjw extends ztr<njw>
{
    public final int G0;
    public final ijw H0;
    public a I0;
    
    public pjw(final Context context, final int g0) {
        super(context);
        this.H0 = new ijw();
        this.G0 = g0;
    }
    
    public /* bridge */ void a(final View view, final Context context, final Object o) {
        this.g(view, context, (njw)o);
    }
    
    public final void c(final View view, final Context context, final Object o, final int n) {
        final njw njw = (njw)o;
        view.setOnClickListener((View$OnClickListener)new ojw(this, n, njw));
        this.a(view, context, (Object)njw);
    }
    
    public final View f(final Context context, final int n, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(this.G0, viewGroup, false);
        inflate.setTag((Object)new uaw(inflate));
        return inflate;
    }
    
    public void g(final View view, final Context context, final njw njw) {
        final uaw uaw = (uaw)view.getTag();
        uaw.a().L(njw.e);
        final TextView b = uaw.b;
        jee.l((Object)b);
        b.setText((CharSequence)njw.d);
        final boolean contains = this.H0.a.contains(njw.a);
        final int n = 0;
        if (contains) {
            uaw.c(uli.s(35), 2131953772);
        }
        else if (chw.c0(njw.g) && chw.d0(njw.g)) {
            uaw.c(uli.s(25), 2131958133);
        }
        else if (chw.c0(njw.g)) {
            uaw.c(uli.s(23), 2131958139);
        }
        else if (chw.d0(njw.g)) {
            uaw.c(uli.s(26), 2131958138);
        }
        else {
            uaw.d(false);
        }
        final ImageView c = uaw.c;
        jee.l((Object)c);
        final int f = njw.f;
        final int n2 = 1;
        int visibility;
        if ((f & 0x2) != 0x0 || (f & 0x200000) != 0x0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        c.setVisibility(visibility);
        final ImageView d = uaw.d;
        jee.l((Object)d);
        int n3;
        if ((njw.f & 0x1) != 0x0) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        int visibility2;
        if (n3 != 0) {
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        d.setVisibility(visibility2);
        final TextView e = uaw.e;
        jee.l((Object)e);
        e.setText((CharSequence)ikr.l(njw.b));
    }
    
    public final long getItemId(final int n) {
        final njw njw = (njw)((y2e)this).getItem(n);
        long a;
        if (njw != null) {
            a = njw.a;
        }
        else {
            a = -1L;
        }
        return a;
    }
    
    public interface a
    {
    }
}
