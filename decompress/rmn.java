import androidx.appcompat.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rmn extends ste implements qsb<hnn, fzv>
{
    public final omn D0;
    
    public rmn(final omn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hnn hnn = (hnn)o;
        czd.f((Object)hnn, "$this$distinct");
        final Toolbar i0 = this.D0.I0;
        final String a = hnn.a;
        CharSequence h;
        if (a == null || a.length() == 0) {
            h = null;
        }
        else {
            h = hmg.h("@", hnn.a);
        }
        i0.setSubtitle(h);
        return fzv.a;
    }
}
