import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Iterator;
import java.io.Serializable;
import android.content.pm.Signature;
import java.util.List;
import java.security.cert.CertificateException;
import android.util.Log;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.Constructor;
import com.google.android.play.core.internal.zzbx;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import java.util.Objects;
import android.content.res.AssetManager;
import android.os.Build$VERSION;
import java.io.File;
import android.content.pm.PackageInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciy
{
    public final zxy a;
    public final Context b;
    public final xhy c;
    public PackageInfo d;
    
    public ciy(final Context b, final zxy a) {
        final xhy c = new xhy(new bay(a));
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final File[] array) throws IOException, XmlPullParserException {
        final PackageInfo c = this.c();
        long longVersionCode;
        if (Build$VERSION.SDK_INT >= 28) {
            longVersionCode = c.getLongVersionCode();
        }
        else {
            longVersionCode = c.versionCode;
        }
        try {
            final Constructor<AssetManager> declaredConstructor = AssetManager.class.getDeclaredConstructor((Class<?>[])new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            final AssetManager assetManager = declaredConstructor.newInstance(new Object[0]);
            int length = array.length;
        Label_0078:
            while (--length >= 0) {
                final xhy c2 = this.c;
                final File file = array[length];
                Objects.requireNonNull(c2);
                c2.b = assetManager.openXmlResourceParser(bay.b(assetManager, file), "AndroidManifest.xml");
                final xhy c3 = this.c;
                if (c3.b != null) {
                    while (true) {
                        final int next = ((XmlPullParser)c3.b).next();
                        if (next != 2) {
                            if (next != 1) {
                                continue;
                            }
                            break;
                        }
                        else {
                            if (((XmlPullParser)c3.b).getName().equals("manifest")) {
                                final String attributeValue = ((XmlPullParser)c3.b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                                final String attributeValue2 = ((XmlPullParser)c3.b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                                if (attributeValue != null) {
                                    try {
                                        final int int1 = Integer.parseInt(attributeValue);
                                        Label_0274: {
                                            if (attributeValue2 == null) {
                                                final long n = int1;
                                                break Label_0274;
                                            }
                                            try {
                                                final long n = ((long)int1 & 0xFFFFFFFFL) | (long)Integer.parseInt(attributeValue2) << 32;
                                                if (longVersionCode != n) {
                                                    return false;
                                                }
                                                continue Label_0078;
                                            }
                                            catch (final NumberFormatException ex) {
                                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", ex.getMessage()));
                                            }
                                        }
                                    }
                                    catch (final NumberFormatException ex2) {
                                        throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", ex2.getMessage()));
                                    }
                                }
                                throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                            }
                            break;
                        }
                    }
                    throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
                }
                throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
            }
            return true;
        }
        catch (final Exception ex3) {
            throw new zzbx(String.format("Failed to invoke default constructor on class %s", AssetManager.class.getName()), (Throwable)ex3);
        }
    }
    
    public final boolean b(final File[] array) {
        final PackageInfo c = this.c();
        List list2;
        final List list = list2 = null;
        if (c != null) {
            if (c.signatures == null) {
                list2 = list;
            }
            else {
                final ArrayList list3 = new ArrayList();
                for (final Signature signature : c.signatures) {
                    X509Certificate x509Certificate;
                    try {
                        x509Certificate = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    }
                    catch (final CertificateException ex) {
                        Log.e("SplitCompat", "Cannot decode certificate.", (Throwable)ex);
                        x509Certificate = null;
                    }
                    if (x509Certificate != null) {
                        list3.add(x509Certificate);
                    }
                }
                list2 = list3;
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int length2 = array.length;
        Label_0162:
            while (true) {
                final int n = length2 - 1;
                if (n >= 0) {
                    final File file = array[n];
                    try {
                        Serializable absolutePath = file.getAbsolutePath();
                        try {
                            final X509Certificate[][] l0 = lp7.L0((String)absolutePath);
                            if (l0 != null && l0.length != 0 && l0[0].length != 0) {
                                if (list2.isEmpty()) {
                                    Log.e("SplitCompat", "No certificates found for app.");
                                }
                                else {
                                    final Iterator iterator = list2.iterator();
                                Label_0241:
                                    while (true) {
                                        length2 = n;
                                        if (iterator.hasNext()) {
                                            absolutePath = (X509Certificate)iterator.next();
                                            for (int length3 = l0.length, j = 0; j < length3; ++j) {
                                                if (l0[j][0].equals(absolutePath)) {
                                                    continue Label_0241;
                                                }
                                            }
                                            break;
                                        }
                                        continue Label_0162;
                                    }
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                }
                            }
                            else {
                                final StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                                sb.append("Downloaded split ");
                                sb.append((String)absolutePath);
                                sb.append(" is not signed.");
                                Log.e("SplitCompat", sb.toString());
                            }
                        }
                        catch (final Exception ex2) {
                            final StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                            sb2.append("Downloaded split ");
                            sb2.append((String)absolutePath);
                            sb2.append(" is not signed.");
                            Log.e("SplitCompat", sb2.toString(), (Throwable)ex2);
                        }
                        Log.e("SplitCompat", "Split verification failure.");
                        return false;
                    }
                    catch (final Exception ex3) {
                        Log.e("SplitCompat", "Split verification error.", (Throwable)ex3);
                        return false;
                    }
                    break;
                }
                break;
            }
            return true;
        }
        Log.e("SplitCompat", "No app certificates found.");
        return false;
    }
    
    public final PackageInfo c() {
        if (this.d == null) {
            try {
                this.d = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                return null;
            }
        }
        return this.d;
    }
}
