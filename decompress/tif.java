import android.net.Uri$Builder;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tif extends hoa
{
    private static final tif.tif$a Companion;
    
    static {
        Companion = new tif.tif$a();
    }
    
    public tif() {
        super(shw.x0((Object)"com.linkedin.android"));
    }
    
    @Override
    public final Uri d() {
        final Uri build = new Uri$Builder().scheme("https").authority("www.linkedin.com").appendPath("share").build();
        e0e.e((Object)build, "Builder()\n            .s\u2026ARE)\n            .build()");
        return build;
    }
    
    @Override
    public final Uri e(ayp a, final String s) {
        e0e.f((Object)a, "sharedItemContent");
        e0e.f((Object)s, "sessionToken");
        a = a.a(21, s);
        final Uri build = this.d().buildUpon().appendQueryParameter("url", a.a).appendQueryParameter("linkSrc", "twitter").appendQueryParameter("linkOrigin", "DEEPLINK_SOCIAL").build();
        e0e.e((Object)build, "getBaseUri().buildUpon()\u2026AL\")\n            .build()");
        return build;
    }
}
