import android.net.Uri;
import android.os.Parcelable;
import com.twitter.database.legacy.provider.TwitterExternalFileProvider;
import android.content.Intent;
import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsl extends tp1<ynj<File>>
{
    public final Context E0;
    
    public dsl(final Context e0) {
        this.E0 = e0;
    }
    
    public final void b(final Object o) {
        final ynj ynj = (ynj)o;
        if (ynj.f()) {
            final Context e0 = this.E0;
            if (e0 != null) {
                final File file = (File)ynj.c();
                final Uri a = jsl.a;
                e0.startActivity(new Intent("android.intent.action.SEND").setType("image/png").putExtra("android.intent.extra.STREAM", (Parcelable)TwitterExternalFileProvider.f(e0, file)));
            }
        }
    }
}
