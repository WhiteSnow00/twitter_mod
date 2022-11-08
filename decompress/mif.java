import android.net.Uri$Builder;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mif extends aoa
{
    private static final mif.mif$a Companion;
    
    static {
        Companion = new mif.mif$a();
    }
    
    public mif() {
        super(tdy.u0((Object)"com.linkedin.android"));
    }
    
    @Override
    public final Uri d() {
        final Uri build = new Uri$Builder().scheme("https").authority("www.linkedin.com").appendPath("share").build();
        zzd.e((Object)build, "Builder()\n            .s\u2026ARE)\n            .build()");
        return build;
    }
    
    @Override
    public final Uri e(mwp a, final String s) {
        zzd.f((Object)a, "sharedItemContent");
        zzd.f((Object)s, "sessionToken");
        a = a.a(21, s);
        final Uri build = this.d().buildUpon().appendQueryParameter("url", a.a).appendQueryParameter("linkSrc", "twitter").appendQueryParameter("linkOrigin", "DEEPLINK_SOCIAL").build();
        zzd.e((Object)build, "getBaseUri().buildUpon()\u2026AL\")\n            .build()");
        return build;
    }
}
