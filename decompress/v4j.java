import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import java.util.Map;
import android.os.Build$VERSION;
import com.twitter.analytics.tracking.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v4j implements gnx, y2z, gry, oyg
{
    public Object D0;
    
    public v4j() {
        final a b = a.b();
        czd.e((Object)b, "get()");
        this.D0 = b;
    }
    
    public v4j(final int n) {
        if (n != 9) {
            Object d0;
            if (Build$VERSION.SDK_INT >= 28) {
                d0 = new oik();
            }
            else {
                d0 = new chw();
            }
            this.D0 = d0;
            return;
        }
        this();
    }
    
    public v4j(final Object d0) {
        this.D0 = d0;
    }
    
    public v4j(final sbu d0) {
        czd.f((Object)d0, "systemClock");
        this.D0 = d0;
    }
    
    public final /* bridge */ Object a() {
        return new fyy(((xyz)this.D0).b());
    }
    
    public final sy5 b() {
        return (sy5)cz5.D0;
    }
    
    public final void c(final String s, final int n, final Throwable t, final byte[] array, final Map map) {
        ((poz)this.D0).l(s, n, t, array, map);
    }
    
    public final void close() {
    }
    
    public final String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface)this.D0).getSupportedFeatures();
    }
    
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface)wa2.e((Class)WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.D0).getWebkitToCompatConverter());
    }
    
    public final boolean isDone() {
        return true;
    }
    
    public final jvg next() {
        return (jvg)this.D0;
    }
}
