// 
// Decompiled by Procyon v0.6.0
// 

package androidx.startup;

import android.database.Cursor;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.os.Trace;
import java.util.Objects;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

public class InitializationProvider extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final String getType(final Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final boolean onCreate() {
        final Context context = this.getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                final zm0 c = zm0.c(context);
                Objects.requireNonNull(c);
                try {
                    try {
                        Trace.beginSection("Startup");
                        c.a(c.c.getPackageManager().getProviderInfo(new ComponentName(c.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                        Trace.endSection();
                    }
                    finally {}
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new StartupException((Throwable)ex);
                }
                Trace.endSection();
            }
            return true;
        }
        throw new StartupException();
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        throw new IllegalStateException("Not allowed.");
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new IllegalStateException("Not allowed.");
    }
}
