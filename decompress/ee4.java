import android.content.Context;
import android.content.res.Resources;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ee4
{
    public final krm a;
    public final obi<?> b;
    public final m6f c;
    public final Activity d;
    public final Resources e;
    public final j19 f;
    public final ka8 g;
    public final efv h;
    public xx0 i;
    public y3 j;
    
    public ee4(final Activity d, final Resources e, final krm a, final obi<?> b, final m6f c, final j19 f, final efv h) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = ka8.a();
        this.h = h;
    }
    
    public static ee4 a(final Activity activity, final krm krm, final j19 j19, final efv efv, final obi<?> obi) {
        return new ee4(activity, ((Context)activity).getResources(), krm, obi, m6f.a(), j19, efv);
    }
}
