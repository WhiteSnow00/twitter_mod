import android.view.View;
import android.content.res.Resources;
import android.view.ViewGroup;
import java.util.List;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class eek extends v3e<gek, tlh>
{
    public final Context d;
    public final olh e;
    public final mbi<?> f;
    public final a g;
    
    public eek(final Context d, final olh e, final mbi<?> f) {
        super((Class)gek.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new a();
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final tlh tlh = (tlh)c7x;
        final gek gek = (gek)o;
        final a g = this.g;
        this.d.getResources();
        Objects.requireNonNull(g);
        final amh b = gek.b;
        pf8.r(b);
        tlh.n0(nlh.h(b));
        Objects.requireNonNull(this.g);
        tlh.l0(0);
        final boolean k = gek.k();
        final rev rev = null;
        List s;
        if (k) {
            s = gek.c().s;
        }
        else {
            s = null;
        }
        tlh.p0((nws)gek, (View$OnClickListener)this.e, s);
        Objects.requireNonNull(this.g);
        final amh b2 = gek.b;
        pf8.r(b2);
        final mlh a = b2.a;
        rev c = rev;
        if (a != null) {
            c = a.c;
        }
        tlh.m0(c);
        Objects.requireNonNull(this.g);
        tlh.r0(false);
        h6q.Y((TextView)tlh.L0, (CharSequence)this.d.getString(2131953684));
        ((View)tlh.L0).setOnClickListener((View$OnClickListener)new ry((Object)this, 10));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new tlh(viewGroup);
    }
    
    public static final class a extends qic$a<gek>
    {
        public final String b(final Resources resources, final nws nws) {
            final amh b = nws.b;
            pf8.r(b);
            return nlh.h(b);
        }
        
        public final rev c(final nws nws) {
            final amh b = nws.b;
            pf8.r(b);
            final mlh a = b.a;
            rev c;
            if (a != null) {
                c = a.c;
            }
            else {
                c = null;
            }
            return c;
        }
    }
    
    public static final class b extends v3e$a<gek>
    {
        public b(final fxe<eek> fxe) {
            super((Class)gek.class, (fxe)fxe);
        }
    }
}
