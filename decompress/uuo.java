import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uuo extends v3e<ksh.a, uuo.uuo$a>
{
    public uuo() {
        super((Class)ksh.a.class);
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final uuo.uuo$a uuo$a = (uuo.uuo$a)c7x;
        final ksh.a a = (ksh.a)o;
        zzd.f((Object)uuo$a, "viewHolder");
        zzd.f((Object)a, "item");
        ((TextView)uuo$a.W0).setText((CharSequence)a.a);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131624885, viewGroup, false);
        zzd.e((Object)v, "it");
        return (c7x)new uuo.uuo$a(v);
    }
}
