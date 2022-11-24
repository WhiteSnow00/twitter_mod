import android.content.Intent;
import android.os.Parcelable;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rp2 extends aj1
{
    public static final rp2.rp2$a Companion;
    
    static {
        Companion = new rp2.rp2$a();
    }
    
    public rp2(final String s, final yp2 yp2) {
        e0e.f((Object)s, "url");
        final Intent mIntent = super.mIntent;
        mIntent.setData(Uri.parse(s));
        if (yp2 != null) {
            mIntent.putExtra("browser_data_source", (Parcelable)yp2);
        }
    }
}
