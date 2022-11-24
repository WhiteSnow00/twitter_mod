import java.util.LinkedHashMap;
import com.twitter.ui.components.text.legacy.TypefacesTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyk implements xlx<ad2, yc2, xc2>
{
    public final TypefacesTextView F0;
    public final fih<ad2> G0;
    
    public hyk(final TypefacesTextView f0) {
        e0e.f((Object)f0, "textView");
        this.F0 = f0;
        this.G0 = (fih<ad2>)ma7.S((stb)new stb<fih$a<ad2>, vzv>(this) {
            public final hyk F0;
            
            public final Object invoke(final Object o) {
                final fih$a fih$a = (fih$a)o;
                e0e.f((Object)fih$a, "$this$watch");
                fih$a.a((hub)fih$a$c.F0, (stb)new cyk(this.F0));
                final gyk gyk = new gyk(this.F0);
                final LinkedHashMap b = fih$a.b;
                final fih$a fih$a2 = new fih$a();
                gyk.invoke(fih$a2);
                b.put(ad2$d.class, fih$a2.b());
                return vzv.a;
            }
        });
    }
    
    public final void T(final ccx ccx) {
        final ad2 ad2 = (ad2)ccx;
        e0e.f((Object)ad2, "state");
        this.G0.b((Object)ad2);
    }
    
    public final void r(final Object o) {
    }
    
    public final t5j w() {
        return ffe.b();
    }
}
