import java.util.Iterator;
import android.widget.LinearLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aio extends pue implements stb<hio, vzv>
{
    public final yho F0;
    
    public aio(final yho f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hio hio = (hio)o;
        e0e.f((Object)hio, "$this$distinct");
        ((s71)this.F0.G0).d((p4e)new zkf((Iterable)hio.a));
        if (vjo.J()) {
            final yho f0 = this.F0;
            final boolean empty = hio.a.isEmpty();
            final LinearLayout b = f0.b();
            if (b != null) {
                int visibility;
                if (empty) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                ((View)b).setVisibility(visibility);
            }
            for (final View view : shw.y0((Object[])new View[] { (View)f0.a(), (View)f0.M0.getValue(), (View)f0.d(), (View)f0.c() })) {
                if (view == null) {
                    continue;
                }
                int visibility2;
                if (empty ^ true) {
                    visibility2 = 0;
                }
                else {
                    visibility2 = 8;
                }
                view.setVisibility(visibility2);
            }
        }
        return vzv.a;
    }
}
