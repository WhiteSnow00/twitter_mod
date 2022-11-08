import android.content.Context;
import android.content.res.Resources;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cf4
{
    public final tqm a;
    public final mbi<?> b;
    public final c7f c;
    public final Activity d;
    public final Resources e;
    public final z19 f;
    public final ya8 g;
    public final jev h;
    public cy0 i;
    public v3 j;
    
    public cf4(final Activity d, final Resources e, final tqm a, final mbi<?> b, final c7f c, final z19 f, final jev h) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = ya8.a();
        this.h = h;
    }
    
    public static cf4 a(final Activity activity, final tqm tqm, final z19 z19, final jev jev, final mbi<?> mbi) {
        return new cf4(activity, ((Context)activity).getResources(), tqm, mbi, c7f.a(), z19, jev);
    }
}
