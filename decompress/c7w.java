import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.android.widget.GapView;
import java.util.Objects;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c7w extends v3e<aov, b>
{
    public final Context d;
    public final int e;
    public final UserIdentifier f;
    public final lhd g;
    public final nkf h;
    
    public c7w(final Context d, final int e, final UserIdentifier f, final lhd g, final nkf h) {
        super((Class)aov.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final b b = (b)c7x;
        final aov aov = (aov)o;
        final GapView d0 = b.D0;
        d0.setSpinnerActive(this.g.a(aov.k));
        ((View)d0).setOnClickListener((View$OnClickListener)new b7w(this, d0, aov, b));
        final q97 c = aov.k.c;
        if (c != null) {
            final String a = c.a;
            if (a != null) {
                d0.setGapTextView(a);
            }
        }
        final j29 subscribe = ((b5j)this.g.b).ofType((Class)gyb.class).subscribe((fk6)new a7w((Object)this, (Object)d0, (Object)aov, 0));
        Objects.requireNonNull(subscribe);
        ibm.i((rj)new z6w(subscribe, 0));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new b(LayoutInflater.from(this.d).inflate(2131624581, viewGroup, false));
    }
    
    public final void m(final c7x c7x, final Object o) {
        final b b = (b)c7x;
        final aov aov = (aov)o;
        if (n7t.b(this.e)) {
            final zf4 zf4 = new zf4(this.f);
            zf4.T = nca.g("home", h5t$a.a(this.e).E0, "gap", "", "impression").toString();
            final int a = w4j.a;
            saw.b((okm)zf4);
        }
    }
    
    public static final class a extends v3e$a<aov>
    {
        public a(final fxe<c7w> fxe) {
            super((Class)aov.class, (fxe)fxe);
        }
        
        public final boolean a(final Object o) {
            return ((aov)o).k.b == 6;
        }
    }
    
    public static final class b extends el8 implements ork
    {
        public final GapView D0;
        public int E0;
        
        public b(final View view) {
            super(view);
            this.D0 = (GapView)view.findViewById(2131429319);
        }
        
        public final void k(final int e0) {
            this.E0 = e0;
        }
    }
}
