import android.os.BaseBundle;
import android.database.Cursor;
import android.content.ContentUris;
import android.os.CancellationSignal;
import android.provider.MediaStore$Images$Media;
import android.os.Bundle;
import android.os.Build$VERSION;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import android.webkit.MimeTypeMap;
import android.net.Uri;
import android.content.ContentResolver;
import java.io.File;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyo implements eyo
{
    @SuppressLint({ "InlinedApi" })
    public static final String h;
    public final gyo.gyo$a b;
    public final Context c;
    public final y6k d;
    public final hlr<n5r> e;
    public String f;
    public String g;
    
    static {
        final StringBuilder g = w48.g(" CASE WHEN datetaken == 0 THEN datetaken ELSE date_added * ");
        g.append(TimeUnit.SECONDS.toMillis(1L));
        g.append(" END DESC");
        h = g.toString();
    }
    
    public gyo(final Context c, final Handler handler, final er0 er0, final y6k d) {
        this.e = new zml();
        this.c = c;
        this.d = d;
        this.b = new gyo.gyo$a(this, handler);
        f.i(er0.i(), (u93)new lg1((Object)this, 25));
    }
    
    public final b5j<File> a() {
        final t3s a = mq1.a;
        return (b5j<File>)((b5j)this.e).ofType((Class)njj.class).filter((ptk)new fyo(System.currentTimeMillis())).map((qtb)orf.N0);
    }
    
    public final b5j<pmi> b() {
        return (b5j<pmi>)((b5j)this.e).ofType((Class)zij.class).map((qtb)qc3.N0);
    }
    
    public final File c() {
        final dyo e = this.e();
        if (e != null) {
            return e.a;
        }
        return null;
    }
    
    public final File d(final ContentResolver contentResolver, final Uri uri) {
        try {
            final InputStream openInputStream = contentResolver.openInputStream(uri);
            try {
                final MimeTypeMap singleton = MimeTypeMap.getSingleton();
                final StringBuilder sb = new StringBuilder();
                sb.append(".");
                sb.append(singleton.getExtensionFromMimeType(contentResolver.getType(uri)));
                final File tempFile = File.createTempFile("screenshot", sb.toString(), this.c.getCacheDir());
                if (openInputStream == null) {
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return null;
                }
                final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = openInputStream.read(array, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                }
                fileOutputStream.close();
                tempFile.deleteOnExit();
                openInputStream.close();
                return tempFile;
            }
            finally {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)contentResolver).addSuppressed(t);
                    }
                }
            }
        }
        catch (final IOException ex) {
            e9a.d((Throwable)ex);
            return null;
        }
    }
    
    public final dyo e() {
        if (!this.d.a(this.c, eyo.a)) {
            return null;
        }
        final ContentResolver contentResolver = this.c.getContentResolver();
        final int sdk_INT = Build$VERSION.SDK_INT;
        Cursor cursor;
        if (sdk_INT >= 26) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("android:query-arg-sql-selection", "_display_name like 'Screenshot%'");
            ((BaseBundle)bundle).putString("android:query-arg-sql-sort-order", gyo.h);
            ((BaseBundle)bundle).putInt("android:query-arg-limit", 1);
            cursor = contentResolver.query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, (String[])null, bundle, (CancellationSignal)null);
        }
        else {
            cursor = contentResolver.query(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, (String[])null, "_display_name like 'Screenshot%'", (String[])null, xa0.B(new StringBuilder(), gyo.h, " ", "LIMIT 1"));
        }
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    long long1 = 0L;
                    Label_0164: {
                        if (sdk_INT >= 29) {
                            final int columnIndex = cursor.getColumnIndex("datetaken");
                            if (columnIndex >= 0) {
                                long1 = cursor.getLong(columnIndex);
                                break Label_0164;
                            }
                        }
                        long1 = 0L;
                    }
                    final int columnIndex2 = cursor.getColumnIndex("date_added");
                    long millis;
                    if (columnIndex2 >= 0) {
                        millis = TimeUnit.SECONDS.toMillis(cursor.getLong(columnIndex2));
                    }
                    else {
                        millis = 0L;
                    }
                    final int columnIndex3 = cursor.getColumnIndex("_id");
                    String string;
                    if (columnIndex3 >= 0) {
                        string = cursor.getString(columnIndex3);
                    }
                    else {
                        string = null;
                    }
                    if (string != null && string.equals(this.g)) {
                        cursor.close();
                        return null;
                    }
                    this.g = string;
                    final File d = this.d(contentResolver, ContentUris.withAppendedId(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, (long)Long.valueOf(string)));
                    if (d != null) {
                        if (long1 <= 0L) {
                            long1 = millis;
                        }
                        final dyo dyo = new dyo(d, long1);
                        cursor.close();
                        return dyo;
                    }
                    cursor.close();
                    return null;
                }
            }
            finally {
                try {
                    cursor.close();
                }
                finally {
                    final Throwable t;
                    t.addSuppressed((Throwable)cursor);
                }
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }
}
