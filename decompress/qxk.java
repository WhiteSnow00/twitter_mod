import java.util.LinkedHashMap;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qxk implements ilx<nc2, lc2, kc2>
{
    public final TypefacesTextView D0;
    public final rhh<nc2> E0;
    
    public qxk(final TypefacesTextView d0) {
        czd.f((Object)d0, "textView");
        this.D0 = d0;
        this.E0 = (rhh<nc2>)q3j.g0((qsb)new qsb<rhh$a<nc2>, fzv>(this) {
            public final qxk D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.a((ftb)rhh$a$c.D0, (qsb)new lxk(this.D0));
                final pxk pxk = new pxk(this.D0);
                final LinkedHashMap b = rhh$a.b;
                final rhh$a rhh$a2 = new rhh$a();
                pxk.invoke(rhh$a2);
                b.put(nc2$d.class, rhh$a2.b());
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final nc2 nc2 = (nc2)jbx;
        czd.f((Object)nc2, "state");
        this.E0.b((Object)nc2);
    }
    
    public final void q(final Object o) {
    }
    
    public final h5j w() {
        return zip.a();
    }
}
