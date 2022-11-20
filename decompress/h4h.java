import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h4h extends iol
{
    public final Context b;
    
    public h4h(final k4h k4h, final Context b) {
        super((ori)k4h);
        this.b = b;
    }
    
    public final Object a(final Object o) {
        final lsi a = (lsi)o;
        final ejq$a ejq$a = new ejq$a();
        czd.f((Object)a, "notificationInfo");
        ejq$a.a = a;
        ejq$a.p(this.b.getString(2131955026, new Object[] { a.i }));
        ejq$a.g = 30;
        ejq$a.f = (View$OnClickListener)new k1p((Object)a, 21);
        return ((n4j)ejq$a).e();
    }
}
