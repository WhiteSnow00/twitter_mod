import androidx.fragment.app.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.rooms.subsystem.api.args.RoomMultiScheduledSpacesArgs;
import androidx.fragment.app.p;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g6o implements ilx<h6o, Object, e6o>
{
    public final obi<?> D0;
    public final asq E0;
    public final Toolbar F0;
    public final rhh<h6o> G0;
    
    public g6o(final View view, final ul1 ul1, final adw adw, final p p7, final aob aob, final obi<?> d0, final asq e0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)adw, "userInfo");
        czd.f((Object)aob, "fragmentProvider");
        czd.f((Object)d0, "navigator");
        czd.f((Object)e0, "spacesLauncher");
        this.D0 = d0;
        this.E0 = e0;
        final Toolbar f0 = (Toolbar)view.findViewById(2131429433);
        this.F0 = f0;
        final RoomMultiScheduledSpacesArgs roomMultiScheduledSpacesArgs = new RoomMultiScheduledSpacesArgs(false);
        if (!p7.T() && p7.H("RoomMultiScheduledSpacesArgs") == null) {
            final Fragment b = aob.b(roomMultiScheduledSpacesArgs);
            final a a = new a(p7);
            ((s)a).g(2131430164, b, "RoomMultiScheduledSpacesArgs");
            a.c();
        }
        f0.setTitle((CharSequence)view.getResources().getString(2131955210));
        final String c = adw.c();
        if (c != null) {
            f0.setSubtitle((CharSequence)c);
        }
        ul1.a0(f0);
        final androidx.appcompat.app.a t = ul1.T();
        if (t != null) {
            t.r();
            t.o(true);
        }
        this.G0 = (rhh<h6o>)q3j.g0((qsb)g6o$c.D0);
    }
    
    public final void T(final jbx jbx) {
        final h6o h6o = (h6o)jbx;
        czd.f((Object)h6o, "state");
        this.G0.b((Object)h6o);
    }
    
    public final void q(final Object o) {
        final e6o e6o = (e6o)o;
        czd.f((Object)e6o, "effect");
        if (e6o instanceof e6o$a) {
            this.D0.j();
        }
        else if (e6o instanceof e6o$b) {
            this.E0.k(((e6o$b)e6o).a);
        }
    }
    
    public final h5j<Object> w() {
        final Toolbar f0 = this.F0;
        czd.e((Object)f0, "toolbar");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)d4j.h(f0).map((psb)new wtn((qsb)g6o$b.D0, 12)) });
        czd.e((Object)mergeArray, "mergeArray(\n        tool\u2026NavigationClicked }\n    )");
        return (h5j<Object>)mergeArray;
    }
}
