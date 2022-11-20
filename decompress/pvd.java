import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pvd implements ypa
{
    public final LayoutInflater a;
    public final nvd b;
    public final vvd c;
    public final dej d;
    
    public pvd(final LayoutInflater a, final nvd b, final vvd c, final dej d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final Object o) {
        return new wvd(new xvd(this.a.inflate(2131625065, (ViewGroup)o, false)), this.b, this.c, this.d);
    }
}
