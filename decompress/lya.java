import org.xmlpull.v1.XmlPullParser;
import android.content.pm.PackageItemInfo;
import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Map;
import android.database.MatrixCursor;
import android.database.Cursor;
import android.annotation.SuppressLint;
import java.io.FileNotFoundException;
import android.os.ParcelFileDescriptor;
import android.content.ContentValues;
import android.webkit.MimeTypeMap;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import android.os.Environment;
import android.net.Uri;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.content.Context;
import java.util.HashMap;
import java.io.File;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public class lya extends ContentProvider
{
    public static final String[] G0;
    public static final File H0;
    public static final HashMap<String, b> I0;
    public b F0;
    
    static {
        G0 = new String[] { "_display_name", "_size" };
        H0 = new File("/");
        I0 = new HashMap<String, b>();
    }
    
    public static b a(final Context context, final String s) {
        final HashMap<String, b> i0 = lya.I0;
        synchronized (i0) {
            b c;
            if ((c = i0.get(s)) == null) {
                try {
                    c = c(context, s);
                    i0.put(s, c);
                }
                catch (final XmlPullParserException ex) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)ex);
                }
                catch (final IOException ex2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ex2);
                }
            }
            return c;
        }
    }
    
    public static Uri b(final Context context, final String s, final File file) {
        return a(context, s).a(file);
    }
    
    public static b c(final Context context, String o) throws IOException, XmlPullParserException {
        final c c = new c((String)o);
        final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider((String)o, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(mqb.l("Couldn't find meta-data for provider with authority ", (String)o));
        }
        final Bundle metaData = resolveContentProvider.metaData;
        final XmlResourceParser loadXmlMetaData = ((PackageItemInfo)resolveContentProvider).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            while (true) {
                final int next = ((XmlPullParser)loadXmlMetaData).next();
                if (next == 1) {
                    return (b)c;
                }
                if (next != 2) {
                    continue;
                }
                final String name = ((XmlPullParser)loadXmlMetaData).getName();
                final Object o2 = null;
                final String attributeValue = ((XmlPullParser)loadXmlMetaData).getAttributeValue((String)null, "name");
                final String attributeValue2 = ((XmlPullParser)loadXmlMetaData).getAttributeValue((String)null, "path");
                final boolean equals = "root-path".equals(name);
                int i = 0;
                if (equals) {
                    o = lya.H0;
                }
                else if ("files-path".equals(name)) {
                    o = context.getFilesDir();
                }
                else if ("cache-path".equals(name)) {
                    o = context.getCacheDir();
                }
                else if ("external-path".equals(name)) {
                    o = Environment.getExternalStorageDirectory();
                }
                else if ("external-files-path".equals(name)) {
                    final Object a = qo6.a;
                    final File[] b = qo6$b.b(context, (String)null);
                    o = o2;
                    if (b.length > 0) {
                        o = b[0];
                    }
                }
                else if ("external-cache-path".equals(name)) {
                    final Object a2 = qo6.a;
                    final File[] a3 = qo6$b.a(context);
                    o = o2;
                    if (a3.length > 0) {
                        o = a3[0];
                    }
                }
                else {
                    o = o2;
                    if ("external-media-path".equals(name)) {
                        final File[] a4 = a.a(context);
                        o = o2;
                        if (a4.length > 0) {
                            o = a4[0];
                        }
                    }
                }
                if (o == null) {
                    continue;
                }
                while (i < 1) {
                    final String s = (new String[] { attributeValue2 })[i];
                    Object o3 = o;
                    if (s != null) {
                        o3 = new File((File)o, s);
                    }
                    ++i;
                    o = o3;
                }
                if (!TextUtils.isEmpty((CharSequence)attributeValue)) {
                    try {
                        c.b.put(attributeValue, ((File)o).getCanonicalFile());
                        continue;
                    }
                    catch (final IOException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to resolve canonical path for ");
                        sb.append(o);
                        throw new IllegalArgumentException(sb.toString(), ex);
                    }
                    break;
                }
                break;
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }
    
    public final void attachInfo(final Context context, ProviderInfo i0) {
        super.attachInfo(context, i0);
        if (!i0.exported) {
            if (i0.grantUriPermissions) {
                final String s = i0.authority.split(";")[0];
                i0 = (ProviderInfo)lya.I0;
                synchronized (i0) {
                    ((HashMap<Object, Object>)i0).remove(s);
                    monitorexit(i0);
                    this.F0 = a(context, s);
                    return;
                }
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        return this.F0.b(uri).delete() ? 1 : 0;
    }
    
    public String getType(final Uri uri) {
        final File b = this.F0.b(uri);
        final int lastIndex = b.getName().lastIndexOf(46);
        if (lastIndex >= 0) {
            final String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndex + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    @SuppressLint({ "UnknownNullness" })
    public ParcelFileDescriptor openFile(final Uri uri, final String s) throws FileNotFoundException {
        final File b = this.F0.b(uri);
        int n;
        if ("r".equals(s)) {
            n = 268435456;
        }
        else if (!"w".equals(s) && !"wt".equals(s)) {
            if ("wa".equals(s)) {
                n = 704643072;
            }
            else if ("rw".equals(s)) {
                n = 939524096;
            }
            else {
                if (!"rwt".equals(s)) {
                    throw new IllegalArgumentException(mqb.l("Invalid mode: ", s));
                }
                n = 1006632960;
            }
        }
        else {
            n = 738197504;
        }
        return ParcelFileDescriptor.open(b, n);
    }
    
    public Cursor query(final Uri uri, final String[] array, String queryParameter, final String[] array2, final String s) {
        final File b = this.F0.b(uri);
        queryParameter = uri.getQueryParameter("displayName");
        String[] g0 = array;
        if (array == null) {
            g0 = lya.G0;
        }
        final String[] array3 = new String[g0.length];
        final Object[] array4 = new Object[g0.length];
        final int length = g0.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s2 = g0[i];
            int n4 = 0;
            Label_0163: {
                int n3;
                if ("_display_name".equals(s2)) {
                    array3[n] = "_display_name";
                    final int n2 = n + 1;
                    String name;
                    if (queryParameter == null) {
                        name = b.getName();
                    }
                    else {
                        name = queryParameter;
                    }
                    array4[n] = name;
                    n3 = n2;
                }
                else {
                    n4 = n;
                    if (!"_size".equals(s2)) {
                        break Label_0163;
                    }
                    array3[n] = "_size";
                    final int n5 = n + 1;
                    array4[n] = b.length();
                    n3 = n5;
                }
                n4 = n3;
            }
            ++i;
            n = n4;
        }
        final String[] array5 = new String[n];
        System.arraycopy(array3, 0, array5, 0, n);
        final Object[] array6 = new Object[n];
        System.arraycopy(array4, 0, array6, 0, n);
        final MatrixCursor matrixCursor = new MatrixCursor(array5, 1);
        matrixCursor.addRow(array6);
        return (Cursor)matrixCursor;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("No external updates");
    }
    
    public static final class a
    {
        public static File[] a(final Context context) {
            return context.getExternalMediaDirs();
        }
    }
    
    public interface b
    {
        Uri a(final File p0);
        
        File b(final Uri p0);
    }
    
    public static final class c implements b
    {
        public final String a;
        public final HashMap<String, File> b;
        
        public c(final String a) {
            this.b = new HashMap<String, File>();
            this.a = a;
        }
        
        @Override
        public final Uri a(File string) {
            try {
                final String canonicalPath = string.getCanonicalPath();
                string = null;
                for (final Map.Entry<?, File> entry : this.b.entrySet()) {
                    final String path = entry.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (string == null || path.length() > ((Map.Entry<K, File>)string).getValue().getPath().length())) {
                        string = (File)entry;
                    }
                }
                if (string != null) {
                    final String path2 = ((Map.Entry<K, File>)string).getValue().getPath();
                    String s;
                    if (path2.endsWith("/")) {
                        s = canonicalPath.substring(path2.length());
                    }
                    else {
                        s = canonicalPath.substring(path2.length() + 1);
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode((String)((Map.Entry<String, V>)string).getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(s, "/"));
                    string = (File)sb.toString();
                    return new Uri$Builder().scheme("content").authority(this.a).encodedPath((String)string).build();
                }
                throw new IllegalArgumentException(mqb.l("Failed to find configured root that contains ", canonicalPath));
            }
            catch (final IOException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to resolve canonical path for ");
                sb2.append(string);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        
        @Override
        public final File b(Uri uri) {
            final String encodedPath = uri.getEncodedPath();
            final int index = encodedPath.indexOf(47, 1);
            final String decode = Uri.decode(encodedPath.substring(1, index));
            final String decode2 = Uri.decode(encodedPath.substring(index + 1));
            final File file = this.b.get(decode);
            if (file != null) {
                uri = (Uri)new File(file, decode2);
                try {
                    final File canonicalFile = ((File)uri).getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                catch (final IOException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to resolve canonical path for ");
                    sb.append(uri);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            throw new IllegalArgumentException(i2f.j("Unable to find configured root for ", uri));
        }
    }
}
