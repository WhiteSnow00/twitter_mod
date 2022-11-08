import android.net.Uri;
import android.os.Parcelable;
import com.twitter.database.legacy.provider.TwitterExternalFileProvider;
import android.content.Intent;
import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orl extends yp1<snj<File>>
{
    public final /* synthetic */ Context D0;
    
    public orl(final Context d0) {
        this.D0 = d0;
    }
    
    public final void b(final Object o) {
        final snj snj = (snj)o;
        if (snj.f()) {
            final Context d0 = this.D0;
            if (d0 != null) {
                final File file = (File)snj.c();
                final Uri a = url.a;
                d0.startActivity(new Intent("android.intent.action.SEND").setType("image/png").putExtra("android.intent.extra.STREAM", (Parcelable)TwitterExternalFileProvider.f(d0, file)));
            }
        }
    }
}
