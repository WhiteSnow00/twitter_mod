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

public final class u9f
{
    public static final i99 b;
    public static u9f c;
    public ConcurrentHashMap<String, String> a;
    
    static {
        b = new i99("LibraryVersion", "");
        u9f.c = new u9f();
    }
    
    public u9f() {
        this.a = (ConcurrentHashMap<String, String>)new ConcurrentHashMap();
    }
    
    public final String a(final String s) {
        eli.o(s, "Please provide a valid libraryName");
        if (this.a.containsKey((Object)s)) {
            return (String)this.a.get((Object)s);
        }
        Serializable concat = new Properties();
        final String s2 = null;
        Object property = null;
        Object value = null;
        final StringBuilder sb = null;
        Label_0552: {
            Label_0498: {
                Object resourceAsStream;
                try {
                    try {
                        resourceAsStream = u9f.class.getResourceAsStream(String.format("/%s.properties", s));
                        Label_0355: {
                            Label_0255: {
                                if (resourceAsStream != null) {
                                    property = sb;
                                    Label_0383: {
                                        Label_0376: {
                                            try {
                                                ((Properties)concat).load((InputStream)resourceAsStream);
                                                property = sb;
                                                concat = (Serializable)(property = ((Properties)concat).getProperty("version", null));
                                                final i99 b = u9f.b;
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
                                                    Log.v("LibraryVersion", b.n(string));
                                                    value = concat;
                                                }
                                                break Label_0355;
                                            }
                                            catch (final IOException concat) {
                                                break Label_0383;
                                            }
                                            finally {
                                                break Label_0376;
                                            }
                                            break Label_0255;
                                        }
                                        property = resourceAsStream;
                                        break Label_0552;
                                    }
                                    value = property;
                                }
                            }
                            property = sb;
                            final i99 b2 = u9f.b;
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
                                Log.w("LibraryVersion", b2.n((String)concat));
                                value = s2;
                            }
                        }
                        property = value;
                        if (resourceAsStream != null) {
                            chw.B((Closeable)resourceAsStream);
                            property = value;
                        }
                        break Label_0498;
                    }
                    finally {}
                }
                catch (final IOException concat) {
                    final InputStream inputStream = null;
                    resourceAsStream = value;
                    value = inputStream;
                }
                final i99 b3 = u9f.b;
                final String value2 = String.valueOf(s);
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "Failed to get app version for libraryName: ".concat(value2);
                }
                else {
                    concat2 = new String("Failed to get app version for libraryName: ");
                }
                b3.f("LibraryVersion", concat2, (Throwable)concat);
                if (resourceAsStream != null) {
                    chw.B((Closeable)resourceAsStream);
                }
                property = value;
            }
            String s3;
            if ((s3 = (String)property) == null) {
                final i99 b4 = u9f.b;
                if (b4.b(3)) {
                    Log.d("LibraryVersion", b4.n(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"));
                }
                s3 = "UNKNOWN";
            }
            this.a.put((Object)s, (Object)s3);
            return s3;
        }
        if (property != null) {
            chw.B((Closeable)property);
        }
    }
}
