import java.io.Serializable;
import java.io.Closeable;
import java.io.IOException;
import android.util.Log;
import java.io.InputStream;
import java.util.Properties;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iaf
{
    public static final aiq b;
    public static iaf c;
    public ConcurrentHashMap<String, String> a;
    
    static {
        b = new aiq("LibraryVersion", "");
        iaf.c = new iaf();
    }
    
    public iaf() {
        this.a = (ConcurrentHashMap<String, String>)new ConcurrentHashMap();
    }
    
    public final String a(final String s) {
        xd.r(s, (Object)"Please provide a valid libraryName");
        if (this.a.containsKey((Object)s)) {
            return (String)this.a.get((Object)s);
        }
        Serializable concat = new Properties();
        final String s2 = null;
        Object property = null;
        Object value = null;
        final StringBuilder sb = null;
        Label_0524: {
            Label_0470: {
                Object resourceAsStream;
                try {
                    try {
                        resourceAsStream = iaf.class.getResourceAsStream(String.format("/%s.properties", s));
                        Label_0331: {
                            Label_0236: {
                                if (resourceAsStream != null) {
                                    property = sb;
                                    Label_0359: {
                                        Label_0352: {
                                            try {
                                                ((Properties)concat).load((InputStream)resourceAsStream);
                                                property = sb;
                                                concat = (Serializable)(property = ((Properties)concat).getProperty("version", null));
                                                final aiq b = iaf.b;
                                                property = concat;
                                                final int length = String.valueOf(s).length();
                                                property = concat;
                                                final int length2 = String.valueOf(concat).length();
                                                property = concat;
                                                value = new(java.lang.StringBuilder.class)();
                                                property = concat;
                                                new StringBuilder(length + 12 + length2);
                                                property = concat;
                                                ((StringBuilder)value).append(s);
                                                property = concat;
                                                ((StringBuilder)value).append(" version is ");
                                                property = concat;
                                                ((StringBuilder)value).append((String)concat);
                                                property = concat;
                                                final String string = ((StringBuilder)value).toString();
                                                property = concat;
                                                value = concat;
                                                if (b.b(2)) {
                                                    property = concat;
                                                    Log.v("LibraryVersion", b.g(string));
                                                    value = concat;
                                                }
                                                break Label_0331;
                                            }
                                            catch (final IOException concat) {
                                                break Label_0359;
                                            }
                                            finally {
                                                break Label_0352;
                                            }
                                            break Label_0236;
                                        }
                                        property = resourceAsStream;
                                        break Label_0524;
                                    }
                                    value = property;
                                }
                            }
                            property = sb;
                            final aiq b2 = iaf.b;
                            property = sb;
                            value = String.valueOf(s);
                            property = sb;
                            if (((String)value).length() != 0) {
                                property = sb;
                                concat = "Failed to get app version for libraryName: ".concat((String)value);
                            }
                            else {
                                property = sb;
                                concat = new String("Failed to get app version for libraryName: ");
                            }
                            property = sb;
                            value = s2;
                            if (b2.b(5)) {
                                property = sb;
                                Log.w("LibraryVersion", b2.g((String)concat));
                                value = s2;
                            }
                        }
                        property = value;
                        if (resourceAsStream != null) {
                            ck1.d((Closeable)resourceAsStream);
                            property = value;
                        }
                        break Label_0470;
                    }
                    finally {}
                }
                catch (final IOException concat) {
                    final InputStream inputStream = null;
                    resourceAsStream = value;
                    value = inputStream;
                }
                final aiq b3 = iaf.b;
                final String value2 = String.valueOf(s);
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "Failed to get app version for libraryName: ".concat(value2);
                }
                else {
                    concat2 = new String("Failed to get app version for libraryName: ");
                }
                b3.d("LibraryVersion", concat2, (Throwable)concat);
                if (resourceAsStream != null) {
                    ck1.d((Closeable)resourceAsStream);
                }
                property = value;
            }
            String s3;
            if ((s3 = (String)property) == null) {
                final aiq b4 = iaf.b;
                if (b4.b(3)) {
                    Log.d("LibraryVersion", b4.g(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"));
                }
                s3 = "UNKNOWN";
            }
            this.a.put((Object)s, (Object)s3);
            return s3;
        }
        if (property != null) {
            ck1.d((Closeable)property);
        }
    }
}
