import android.os.Bundle;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rdz
{
    public final Context a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public long f;
    public ary g;
    public boolean h;
    public final Long i;
    public String j;
    
    public rdz(Context applicationContext, final ary g, final Long i) {
        this.h = true;
        Objects.requireNonNull(applicationContext, "null reference");
        applicationContext = applicationContext.getApplicationContext();
        iuk.C((Object)applicationContext);
        this.a = applicationContext;
        this.i = i;
        if (g != null) {
            this.g = g;
            this.b = g.K0;
            this.c = g.J0;
            this.d = g.I0;
            this.h = g.H0;
            this.f = g.G0;
            this.j = g.M0;
            final Bundle l0 = g.L0;
            if (l0 != null) {
                this.e = l0.getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}
