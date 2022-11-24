import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odn implements xlx<rdn, Object, mdn>
{
    public final TextView F0;
    public final fih<rdn> G0;
    
    public odn(final View view) {
        e0e.f((Object)view, "rootView");
        final View viewById = view.findViewById(2131428610);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.decline_description)");
        this.F0 = (TextView)viewById;
        this.G0 = (fih<rdn>)ma7.S((stb)new odn$b(this, view));
    }
    
    public final void T(final ccx ccx) {
        final rdn rdn = (rdn)ccx;
        e0e.f((Object)rdn, "state");
        this.G0.b((Object)rdn);
    }
    
    public final void r(final Object o) {
        e0e.f((Object)o, "effect");
    }
    
    public final t5j<Object> w() {
        final t5j empty = t5j.empty();
        e0e.e((Object)empty, "empty()");
        return (t5j<Object>)empty;
    }
}
