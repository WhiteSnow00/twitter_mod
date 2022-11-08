// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.Context;

public final class b
{
    public static final String e;
    public final Context a;
    public final int b;
    public final d c;
    public final iqx d;
    
    static {
        e = y9g.g("ConstraintsCmdHandler");
    }
    
    public b(final Context a, final int b, final d c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new iqx(c.G0.j, null);
    }
}
