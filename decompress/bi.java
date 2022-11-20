import java.util.List;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bi implements ypa
{
    public final int a;
    public final Context b;
    public final Object c;
    
    public bi(final Context b, final Object c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                final Context b = this.b;
                final efv efv = (efv)this.c;
                final bo6 bo6 = (bo6)o;
                czd.f((Object)b, "$context");
                czd.f((Object)efv, "$scribeAssociation");
                czd.f((Object)bo6, "tweet");
                return new qht(b, efv, bo6);
            }
            case 0: {
                final Activity activity = (Activity)this.b;
                final o5w o5w = (o5w)this.c;
                final af4 af4 = (af4)o;
                czd.f((Object)activity, "$activity");
                czd.f((Object)o5w, "$uriNavigator");
                czd.f((Object)af4, "clientEvent");
                final id6 c = id6.c((Context)activity);
                ((List<bym>)c.a).add(ie4.a((Context)activity, (ie4$b)new ooo((Object)o5w, (Object)af4)));
                return c;
            }
        }
    }
}
