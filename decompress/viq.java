import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.io.File;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class viq implements uiq
{
    public final boolean a;
    public final String b;
    public final String c;
    public final Runtime d;
    public final Method e;
    
    public viq(final boolean a, final String b, final String c, final Runtime d, final Method e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final String a(String ex) {
        try {
            final File file = new File((String)ex);
            ex = (NoSuchAlgorithmException)MessageDigest.getInstance("MD5");
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final byte[] array = new byte[4096];
                while (true) {
                    final int read = fileInputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    ((MessageDigest)ex).update(array, 0, read);
                }
                ex = (NoSuchAlgorithmException)String.format("%32x", new BigInteger(1, ((MessageDigest)ex).digest()));
                fileInputStream.close();
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    ex.addSuppressed(t);
                }
            }
        }
        catch (final NoSuchAlgorithmException ex) {}
        catch (final SecurityException ex) {}
        catch (final IOException ex2) {}
        ex = (NoSuchAlgorithmException)ex.toString();
        return (String)ex;
    }
    
    public final void b(final String s, int n) {
        if (this.a) {
            if ((n & 0x4) == 0x4) {
                n = 1;
            }
            else {
                n = 0;
            }
            Serializable s2;
            if (n != 0) {
                s2 = this.b;
            }
            else {
                s2 = this.c;
            }
            Serializable string = null;
            String s6 = null;
            Label_0262: {
                Object d = null;
                final Throwable t2;
                try {
                    d = this.d;
                    monitorenter(d);
                    Serializable y;
                    try {
                        y = (String)this.e.invoke(this.d, s, SoLoader.class.getClassLoader(), s2);
                        Label_0157: {
                            if (y != null) {
                                break Label_0157;
                            }
                            String s3 = (String)y;
                            string = s2;
                            try {
                                monitorexit(d);
                                if (y != null) {
                                    y = pd.y("Error when loading lib: ", (String)y, " lib hash: ");
                                    ((StringBuilder)y).append(this.a(s));
                                    ((StringBuilder)y).append(" search path is ");
                                    ((StringBuilder)y).append((String)s2);
                                    Log.e("SoLoader", ((StringBuilder)y).toString());
                                    return;
                                }
                                return;
                                s3 = (String)y;
                                string = s2;
                                s3 = (String)y;
                                string = s2;
                                final UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError((String)y);
                                s3 = (String)y;
                                string = s2;
                                throw unsatisfiedLinkError;
                            }
                            finally {
                                y = s3;
                                s2 = string;
                            }
                        }
                    }
                    finally {
                        y = null;
                    }
                    string = s2;
                    monitorexit(d);
                    string = y;
                    d = s2;
                    try {
                        throw t2;
                    }
                    catch (final InvocationTargetException s4) {}
                    catch (final IllegalArgumentException s4) {}
                    catch (final IllegalAccessException s4) {}
                }
                catch (final InvocationTargetException y) {
                    break Label_0262;
                }
                catch (final IllegalArgumentException y) {
                    break Label_0262;
                }
                catch (final IllegalAccessException ex) {}
                finally {
                    break Label_0262;
                }
                try {
                    throw t2;
                    while (true) {
                        final Serializable y;
                        string = y;
                        d = s2;
                        string = y;
                        d = s2;
                        final StringBuilder sb = new StringBuilder();
                        string = y;
                        d = s2;
                        sb.append("Error: Cannot load ");
                        string = y;
                        d = s2;
                        sb.append(s);
                        string = y;
                        d = s2;
                        final String s5 = (String)(string = sb.toString());
                        d = s2;
                        string = s5;
                        d = s2;
                        final String s4;
                        final RuntimeException ex2 = new RuntimeException(s5, (Throwable)s4);
                        string = s5;
                        d = s2;
                        throw ex2;
                        string = null;
                        s4 = (String)y;
                        y = string;
                        continue;
                    }
                }
                finally {
                    s6 = (String)d;
                }
            }
            if (string != null) {
                final StringBuilder y2 = pd.y("Error when loading lib: ", (String)string, " lib hash: ");
                y2.append(this.a(s));
                y2.append(" search path is ");
                y2.append(s6);
                Log.e("SoLoader", y2.toString());
            }
        }
        else {
            System.load(s);
        }
    }
}
