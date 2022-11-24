import java.io.IOException;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wcc extends d1p
{
    public static final nmp<wcc> e;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    static {
        wcc.e = new wcc.wcc$b();
    }
    
    public wcc() {
        this.a = Build.MANUFACTURER;
        this.b = Build.PRODUCT;
        this.c = Build.MODEL;
        this.d = Build.HARDWARE;
    }
    
    public wcc(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    public final void a(final yfe yfe) throws IOException {
        final String a = this.a;
        if (a != null) {
            yfe.u0("device_manufacturer", a);
        }
        final String b = this.b;
        if (b != null) {
            yfe.u0("device_product", b);
        }
        final String c = this.c;
        if (c != null) {
            yfe.u0("device_model", c);
        }
        final String d = this.d;
        if (d != null) {
            yfe.u0("device_hardware", d);
        }
    }
    
    public static final class a extends z4j<wcc>
    {
        public String a;
        public String b;
        public String c;
        public String d;
        
        public final Object i() {
            return new wcc(this);
        }
    }
}
