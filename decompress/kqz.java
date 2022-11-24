import java.util.Collections;
import android.net.Uri;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import android.os.BaseBundle;
import android.os.Parcel;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;
import android.os.RemoteException;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import java.util.Objects;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicLong;
import java.security.SecureRandom;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqz extends rcz
{
    public static final String[] L0;
    public static final String[] M0;
    public SecureRandom H0;
    public final AtomicLong I0;
    public int J0;
    public Integer K0;
    
    static {
        L0 = new String[] { "firebase_", "google_", "ga_" };
        M0 = new String[] { "_err" };
    }
    
    public kqz(final m9z m9z) {
        super(m9z);
        this.K0 = null;
        this.I0 = new AtomicLong(0L);
    }
    
    public static boolean V(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("_");
    }
    
    public static boolean W(final String s) {
        iuk.z(s);
        return s.charAt(0) != '_' || s.equals("_ep");
    }
    
    public static boolean X(final Context context) {
        Objects.requireNonNull(context, "null reference");
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean Y(final Context context) {
        Objects.requireNonNull(context, "null reference");
        if (Build$VERSION.SDK_INT >= 24) {
            return f0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return f0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }
    
    public static final boolean b0(final Bundle bundle, final int n) {
        if (((BaseBundle)bundle).getLong("_err") == 0L) {
            ((BaseBundle)bundle).putLong("_err", (long)n);
            return true;
        }
        return false;
    }
    
    public static boolean e0(final String s, final String[] array) {
        Objects.requireNonNull(array, "null reference");
        for (final String s2 : array) {
            if (s == s2 || (s != null && s.equals(s2))) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean f0(final Context context, final String s) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, s), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static long m0(final byte[] array) {
        Objects.requireNonNull(array, "null reference");
        int length = array.length;
        int n = 0;
        iuk.G(length > 0);
        --length;
        long n2 = 0L;
        while (length >= 0 && length >= array.length - 8) {
            n2 += ((long)array[length] & 0xFFL) << n;
            n += 8;
            --length;
        }
        return n2;
    }
    
    public static MessageDigest r() {
        int n = 0;
    Label_0022_Outer:
        while (true) {
            Label_0028: {
                if (n >= 2) {
                    break Label_0028;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        if (instance == null) {
                            ++n;
                            continue Label_0022_Outer;
                        }
                        return instance;
                        return null;
                    }
                    catch (final NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static ArrayList t(final List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        final ArrayList list2 = new ArrayList(list.size());
        for (final kby kby : list) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("app_id", kby.F0);
            ((BaseBundle)bundle).putString("origin", kby.G0);
            ((BaseBundle)bundle).putLong("creation_timestamp", kby.I0);
            ((BaseBundle)bundle).putString("name", kby.H0.G0);
            final Object p = kby.H0.p();
            Objects.requireNonNull(p, "null reference");
            zzz.p0(bundle, p);
            bundle.putBoolean("active", kby.J0);
            final String k0 = kby.K0;
            if (k0 != null) {
                ((BaseBundle)bundle).putString("trigger_event_name", k0);
            }
            final rhy l0 = kby.L0;
            if (l0 != null) {
                ((BaseBundle)bundle).putString("timed_out_event_name", l0.F0);
                final fhy g0 = l0.G0;
                if (g0 != null) {
                    bundle.putBundle("timed_out_event_params", g0.p());
                }
            }
            ((BaseBundle)bundle).putLong("trigger_timeout", kby.M0);
            final rhy n0 = kby.N0;
            if (n0 != null) {
                ((BaseBundle)bundle).putString("triggered_event_name", n0.F0);
                final fhy g2 = n0.G0;
                if (g2 != null) {
                    bundle.putBundle("triggered_event_params", g2.p());
                }
            }
            ((BaseBundle)bundle).putLong("triggered_timestamp", kby.H0.H0);
            ((BaseBundle)bundle).putLong("time_to_live", kby.O0);
            final rhy p2 = kby.P0;
            if (p2 != null) {
                ((BaseBundle)bundle).putString("expired_event_name", p2.F0);
                final fhy g3 = p2.G0;
                if (g3 != null) {
                    bundle.putBundle("expired_event_params", g3.p());
                }
            }
            list2.add(bundle);
        }
        return list2;
    }
    
    public static void x(final rhz rhz, final Bundle bundle, final boolean b) {
        boolean b2 = b;
        if (bundle != null) {
            b2 = b;
            if (rhz != null) {
                if (!((BaseBundle)bundle).containsKey("_sc") || b) {
                    final String a = rhz.a;
                    if (a != null) {
                        ((BaseBundle)bundle).putString("_sn", a);
                    }
                    else {
                        bundle.remove("_sn");
                    }
                    final String b3 = rhz.b;
                    if (b3 != null) {
                        ((BaseBundle)bundle).putString("_sc", b3);
                    }
                    else {
                        bundle.remove("_sc");
                    }
                    ((BaseBundle)bundle).putLong("_si", rhz.c);
                    return;
                }
                b2 = false;
            }
        }
        if (bundle != null && rhz == null && b2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }
    
    public final void A(final hqz hqz, final String s, final int n, final String s2, final String s3, final int n2) {
        final Bundle bundle = new Bundle();
        b0(bundle, n);
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3)) {
            ((BaseBundle)bundle).putString(s2, s3);
        }
        if (n == 6 || n == 7 || n == 2) {
            ((BaseBundle)bundle).putLong("_el", (long)n2);
        }
        hqz.J(s, bundle);
    }
    
    public final void B(final Bundle bundle, final String s, final Object o) {
        if (bundle == null) {
            return;
        }
        if (o instanceof Long) {
            ((BaseBundle)bundle).putLong(s, (long)o);
            return;
        }
        if (o instanceof String) {
            ((BaseBundle)bundle).putString(s, String.valueOf(o));
            return;
        }
        if (o instanceof Double) {
            ((BaseBundle)bundle).putDouble(s, (double)o);
            return;
        }
        if (o instanceof Bundle[]) {
            bundle.putParcelableArray(s, (Parcelable[])o);
            return;
        }
        if (s != null) {
            String simpleName;
            if (o != null) {
                simpleName = o.getClass().getSimpleName();
            }
            else {
                simpleName = null;
            }
            super.F0.b().P0.c("Not putting event parameter. Invalid value type. name, type", (Object)super.F0.R0.e(s), (Object)simpleName);
        }
    }
    
    public final void C(final aqy aqy, final boolean b) {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("r", b);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning boolean value to wrapper", (Object)ex);
        }
    }
    
    public final void D(final aqy aqy, final ArrayList list) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", list);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning bundle list to wrapper", (Object)ex);
        }
    }
    
    public final void E(final aqy aqy, final Bundle bundle) {
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning bundle value to wrapper", (Object)ex);
        }
    }
    
    public final void F(final aqy aqy, final byte[] array) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("r", array);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning byte array to wrapper", (Object)ex);
        }
    }
    
    public final void G(final aqy aqy, final int n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("r", n);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning int value to wrapper", (Object)ex);
        }
    }
    
    public final void H(final aqy aqy, final long n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("r", n);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning long value to wrapper", (Object)ex);
        }
    }
    
    public final void I(final aqy aqy, final String s) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("r", s);
        try {
            aqy.m(bundle);
        }
        catch (final RemoteException ex) {
            super.F0.b().N0.b("Error returning string value to wrapper", (Object)ex);
        }
    }
    
    public final void J(final String s, final String s2, final String s3, final Bundle bundle, final List list, final boolean b) {
        if (bundle == null) {
            return;
        }
        Objects.requireNonNull(super.F0);
        final Iterator iterator = new TreeSet(((BaseBundle)bundle).keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s4 = (String)iterator.next();
            int i0;
            if (list != null && list.contains(s4)) {
                i0 = 0;
            }
            else {
                int j0;
                if (!b) {
                    j0 = this.j0(s4);
                }
                else {
                    j0 = 0;
                }
                i0 = j0;
                if (j0 == 0) {
                    i0 = this.i0(s4);
                }
            }
            if (i0 != 0) {
                String s5;
                if (i0 == 3) {
                    s5 = s4;
                }
                else {
                    s5 = null;
                }
                this.v(bundle, i0, s4, s5);
                bundle.remove(s4);
            }
            else {
                int n2;
                if (this.T(((BaseBundle)bundle).get(s4))) {
                    super.F0.b().P0.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", (Object)s2, (Object)s3, (Object)s4);
                    n2 = 22;
                }
                else {
                    n2 = this.N(s, s2, s4, ((BaseBundle)bundle).get(s4), bundle, list, b, false);
                }
                if (n2 != 0 && !"_ev".equals(s4)) {
                    this.v(bundle, n2, s4, ((BaseBundle)bundle).get(s4));
                    bundle.remove(s4);
                }
                else {
                    if (!W(s4) || e0(s4, jty.M0)) {
                        continue;
                    }
                    final int n3 = n + 1;
                    if ((n = n3) <= 0) {
                        continue;
                    }
                    super.F0.b().M0.c("Item cannot contain custom parameters", (Object)super.F0.R0.d(s2), (Object)super.F0.R0.b(bundle));
                    b0(bundle, 23);
                    bundle.remove(s4);
                    n = n3;
                }
            }
        }
    }
    
    public final boolean K(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            Objects.requireNonNull(s, "null reference");
            if (!s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                if (super.F0.i()) {
                    super.F0.b().M0.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", o3z.s(s));
                }
                return false;
            }
        }
        else {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                if (super.F0.i()) {
                    super.F0.b().M0.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            Objects.requireNonNull(s2, "null reference");
            if (!s2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                super.F0.b().M0.b("Invalid admob_app_id. Analytics disabled.", o3z.s(s2));
                return false;
            }
        }
        return true;
    }
    
    public final boolean L(final String s, final int n, final String s2) {
        if (s2 == null) {
            super.F0.b().M0.b("Name is required and can't be null. Type", (Object)s);
            return false;
        }
        if (s2.codePointCount(0, s2.length()) > n) {
            super.F0.b().M0.d("Name is too long. Type, maximum supported length, name", (Object)s, (Object)n, (Object)s2);
            return false;
        }
        return true;
    }
    
    public final boolean M(final String s, final String[] array, final String[] array2, final String s2) {
        if (s2 == null) {
            super.F0.b().M0.b("Name is required and can't be null. Type", (Object)s);
            return false;
        }
        final String[] l0 = kqz.L0;
        for (int i = 0; i < 3; ++i) {
            if (s2.startsWith(l0[i])) {
                super.F0.b().M0.c("Name starts with reserved prefix. Type, name", (Object)s, (Object)s2);
                return false;
            }
        }
        if (array != null && e0(s2, array) && (array2 == null || !e0(s2, array2))) {
            super.F0.b().M0.c("Name is reserved. Type, name", (Object)s, (Object)s2);
            return false;
        }
        return true;
    }
    
    public final int N(String class1, final String s, final String s2, Object value, final Bundle bundle, final List list, final boolean b, final boolean b2) {
        this.g();
        int n2 = 0;
        Label_0273: {
            Label_0270: {
                if (this.T(value)) {
                    if (!b2) {
                        return 21;
                    }
                    if (!e0(s2, jty.L0)) {
                        return 20;
                    }
                    final fmz z = super.F0.z();
                    ((wxy)z).g();
                    z.h();
                    if (z.p()) {
                        if (((ocz)z).F0.B().l0() < 200900) {
                            return 25;
                        }
                    }
                    Objects.requireNonNull(super.F0);
                    final boolean b3 = value instanceof Parcelable[];
                    int n;
                    if (b3) {
                        n = ((Parcelable[])value).length;
                    }
                    else {
                        if (!(value instanceof ArrayList)) {
                            break Label_0270;
                        }
                        n = ((ArrayList)value).size();
                    }
                    if (n > 200) {
                        super.F0.b().P0.d("Parameter array is too long; discarded. Value kind, name, array length", (Object)"param", (Object)s2, (Object)n);
                        Objects.requireNonNull(super.F0);
                        if (b3) {
                            final Parcelable[] array = (Parcelable[])value;
                            if (array.length > 200) {
                                bundle.putParcelableArray(s2, (Parcelable[])Arrays.copyOf(array, 200));
                            }
                        }
                        else if (value instanceof ArrayList) {
                            final ArrayList list2 = (ArrayList)value;
                            if (list2.size() > 200) {
                                bundle.putParcelableArrayList(s2, new ArrayList(list2.subList(0, 200)));
                            }
                        }
                        n2 = 17;
                        break Label_0273;
                    }
                }
            }
            n2 = 0;
        }
        int n3;
        if ((super.F0.L0.t(class1, s0z.U) && V(s)) || V(s2)) {
            Objects.requireNonNull(super.F0);
            n3 = 256;
        }
        else {
            Objects.requireNonNull(super.F0);
            n3 = 100;
        }
        if (this.O("param", s2, n3, value)) {
            return n2;
        }
        if (b2) {
            if (value instanceof Bundle) {
                this.J(class1, s, s2, (Bundle)value, list, b);
            }
            else if (value instanceof Parcelable[]) {
                for (final Parcelable parcelable : (Parcelable[])value) {
                    if (!(parcelable instanceof Bundle)) {
                        super.F0.b().P0.c("All Parcelable[] elements must be of type Bundle. Value type, name", (Object)parcelable.getClass(), (Object)s2);
                        return 4;
                    }
                    this.J(class1, s, s2, (Bundle)parcelable, list, b);
                }
            }
            else {
                if (!(value instanceof ArrayList)) {
                    return 4;
                }
                final ArrayList list3 = (ArrayList)value;
                for (int size = list3.size(), j = 0; j < size; ++j) {
                    value = list3.get(j);
                    if (!(value instanceof Bundle)) {
                        final l2z p8 = super.F0.b().P0;
                        if (value != null) {
                            class1 = (String)value.getClass();
                        }
                        else {
                            class1 = "null";
                        }
                        p8.c("All ArrayList elements must be of type Bundle. Value type, name", (Object)class1, (Object)s2);
                        return 4;
                    }
                    this.J(class1, s, s2, (Bundle)value, list, b);
                }
            }
            return n2;
        }
        return 4;
    }
    
    public final boolean O(final String s, final String s2, final int n, final Object o) {
        if (o == null) {
            return true;
        }
        if (!(o instanceof Long) && !(o instanceof Float) && !(o instanceof Integer) && !(o instanceof Byte) && !(o instanceof Short) && !(o instanceof Boolean)) {
            if (!(o instanceof Double)) {
                if (!(o instanceof String) && !(o instanceof Character) && !(o instanceof CharSequence)) {
                    return false;
                }
                final String string = o.toString();
                if (string.codePointCount(0, string.length()) > n) {
                    super.F0.b().P0.d("Value is too long; discarded. Value kind, name, value length", (Object)s, (Object)s2, (Object)string.length());
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean P(final String s, final String s2) {
        if (s2 == null) {
            super.F0.b().M0.b("Name is required and can't be null. Type", (Object)s);
            return false;
        }
        if (s2.length() == 0) {
            super.F0.b().M0.b("Name is required and can't be empty. Type", (Object)s);
            return false;
        }
        int codePoint;
        final int n = codePoint = s2.codePointAt(0);
        if (!Character.isLetter(n)) {
            if (n != 95) {
                super.F0.b().M0.c("Name must start with a letter or _ (underscore). Type, name", (Object)s, (Object)s2);
                return false;
            }
            codePoint = 95;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                super.F0.b().M0.c("Name must consist of letters, digits or _ (underscores). Type, name", (Object)s, (Object)s2);
                return false;
            }
        }
        return true;
    }
    
    public final boolean Q(final String s, final String s2) {
        if (s2 == null) {
            super.F0.b().M0.b("Name is required and can't be null. Type", (Object)s);
            return false;
        }
        if (s2.length() == 0) {
            super.F0.b().M0.b("Name is required and can't be empty. Type", (Object)s);
            return false;
        }
        final int codePoint = s2.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            super.F0.b().M0.c("Name must start with a letter. Type, name", (Object)s, (Object)s2);
            return false;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                super.F0.b().M0.c("Name must consist of letters, digits or _ (underscores). Type, name", (Object)s, (Object)s2);
                return false;
            }
        }
        return true;
    }
    
    public final boolean R(final String s) {
        this.g();
        if (wux.a(super.F0.F0).a.checkCallingOrSelfPermission(s) == 0) {
            return true;
        }
        super.F0.b().R0.b("Permission not granted", (Object)s);
        return false;
    }
    
    public final boolean S(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final String i = super.F0.L0.i("debug.firebase.analytics.app");
        Objects.requireNonNull(super.F0);
        return i.equals(s);
    }
    
    public final boolean T(final Object o) {
        return o instanceof Parcelable[] || o instanceof ArrayList || o instanceof Bundle;
    }
    
    public final boolean U(final Context context, final String s) {
        final X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            final PackageInfo b = wux.a(context).b(s, 64);
            if (b != null) {
                final Signature[] signatures = b.signatures;
                if (signatures != null && signatures.length > 0) {
                    return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            super.F0.b().K0.b("Package name not found", (Object)ex);
        }
        catch (final CertificateException ex2) {
            super.F0.b().K0.b("Error obtaining certificate", (Object)ex2);
        }
        return true;
    }
    
    public final boolean Z(final String s, final String s2, final String s3, final String s4) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final boolean empty2 = TextUtils.isEmpty((CharSequence)s2);
        if (!empty && !empty2) {
            Objects.requireNonNull(s, "null reference");
            return !s.equals(s2);
        }
        if (empty && empty2) {
            if (!TextUtils.isEmpty((CharSequence)s3) && !TextUtils.isEmpty((CharSequence)s4)) {
                return !s3.equals(s4);
            }
            return !TextUtils.isEmpty((CharSequence)s4);
        }
        else {
            if (!empty) {
                return !TextUtils.isEmpty((CharSequence)s4) && (TextUtils.isEmpty((CharSequence)s3) || !s3.equals(s4));
            }
            return TextUtils.isEmpty((CharSequence)s3) || !s3.equals(s4);
        }
    }
    
    public final byte[] a0(final Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        }
        finally {
            obtain.recycle();
        }
    }
    
    public final int c0(final String s) {
        if ("_ldl".equals(s)) {
            Objects.requireNonNull(super.F0);
            return 2048;
        }
        if ("_id".equals(s)) {
            Objects.requireNonNull(super.F0);
            return 256;
        }
        if ("_lgclid".equals(s)) {
            Objects.requireNonNull(super.F0);
            return 100;
        }
        Objects.requireNonNull(super.F0);
        return 36;
    }
    
    public final Object d0(int i, final Object o, final boolean b, final boolean b2) {
        if (o == null) {
            return null;
        }
        if (o instanceof Long || o instanceof Double) {
            return o;
        }
        if (o instanceof Integer) {
            return o;
        }
        if (o instanceof Byte) {
            return o;
        }
        if (o instanceof Short) {
            return o;
        }
        if (o instanceof Boolean) {
            long n;
            if (!(boolean)o) {
                n = 0L;
            }
            else {
                n = 1L;
            }
            return n;
        }
        if (o instanceof Float) {
            return o;
        }
        if (o instanceof String || o instanceof Character || o instanceof CharSequence) {
            return this.q(o.toString(), i, b);
        }
        if (b2 && (o instanceof Bundle[] || o instanceof Parcelable[])) {
            final ArrayList list = new ArrayList();
            final Parcelable[] array = (Parcelable[])o;
            int length;
            Parcelable parcelable;
            Bundle q0;
            for (length = array.length, i = 0; i < length; ++i) {
                parcelable = array[i];
                if (parcelable instanceof Bundle) {
                    q0 = this.q0((Bundle)parcelable);
                    if (!((BaseBundle)q0).isEmpty()) {
                        list.add(q0);
                    }
                }
            }
            return list.toArray(new Bundle[list.size()]);
        }
        return null;
    }
    
    public final int g0(final String s, final Object o) {
        boolean b;
        if ("_ldl".equals(s)) {
            b = this.O("user property referrer", s, this.c0(s), o);
        }
        else {
            b = this.O("user property", s, this.c0(s), o);
        }
        if (b) {
            return 0;
        }
        return 7;
    }
    
    @Override
    public final void h() {
        this.g();
        final SecureRandom secureRandom = new SecureRandom();
        long n;
        if ((n = secureRandom.nextLong()) == 0L) {
            final long n2 = n = secureRandom.nextLong();
            if (n2 == 0L) {
                super.F0.b().N0.a("Utils falling back to Random for random id");
                n = n2;
            }
        }
        this.I0.set(n);
    }
    
    public final int h0(final String s) {
        if (!this.P("event", s)) {
            return 2;
        }
        if (!this.M("event", lp7.m1, lp7.n1, s)) {
            return 13;
        }
        Objects.requireNonNull(super.F0);
        if (!this.L("event", 40, s)) {
            return 2;
        }
        return 0;
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    public final int i0(final String s) {
        if (!this.P("event param", s)) {
            return 3;
        }
        if (!this.M("event param", null, null, s)) {
            return 14;
        }
        Objects.requireNonNull(super.F0);
        if (!this.L("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    public final int j0(final String s) {
        if (!this.Q("event param", s)) {
            return 3;
        }
        if (!this.M("event param", null, null, s)) {
            return 14;
        }
        Objects.requireNonNull(super.F0);
        if (!this.L("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    public final int k0(final String s) {
        if (!this.P("user property", s)) {
            return 6;
        }
        if (!this.M("user property", ix.P0, null, s)) {
            return 15;
        }
        Objects.requireNonNull(super.F0);
        if (!this.L("user property", 24, s)) {
            return 6;
        }
        return 0;
    }
    
    @EnsuresNonNull({ "this.apkVersion" })
    public final int l0() {
        if (this.K0 == null) {
            this.K0 = s5c.b.a(super.F0.F0) / 1000;
        }
        return this.K0;
    }
    
    public final Object n(final String s, final Object o) {
        final boolean equals = "_ev".equals(s);
        int n = 256;
        if (equals) {
            Objects.requireNonNull(super.F0);
            return this.d0(256, o, true, true);
        }
        if (V(s)) {
            Objects.requireNonNull(super.F0);
        }
        else {
            Objects.requireNonNull(super.F0);
            n = 100;
        }
        return this.d0(n, o, false, true);
    }
    
    public final long n0() {
        if (this.I0.get() == 0L) {
            synchronized (this.I0) {
                final long nanoTime = System.nanoTime();
                Objects.requireNonNull(super.F0.S0);
                final long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                final int j0 = this.J0 + 1;
                this.J0 = j0;
                final long n = j0;
                monitorexit(this.I0);
                return nextLong + n;
            }
        }
        synchronized (this.I0) {
            this.I0.compareAndSet(-1L, 1L);
            return this.I0.getAndIncrement();
        }
    }
    
    public final Object o(final String s, final Object o) {
        if ("_ldl".equals(s)) {
            return this.d0(this.c0(s), o, true, false);
        }
        return this.d0(this.c0(s), o, false, false);
    }
    
    public final long o0(final long n, final long n2) {
        return (n2 * 60000L + n) / 86400000L;
    }
    
    public final String p() {
        final byte[] array = new byte[16];
        this.s().nextBytes(array);
        return String.format(Locale.US, "%032x", new BigInteger(1, array));
    }
    
    public final Bundle p0(final Uri uri, final boolean b, final boolean b2) {
        if (uri != null) {
            try {
                String queryParameter;
                String queryParameter2;
                String queryParameter3;
                String queryParameter4;
                String s;
                String s2;
                String s3;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    String queryParameter5;
                    String queryParameter6;
                    if (b) {
                        queryParameter5 = uri.getQueryParameter("utm_id");
                        queryParameter6 = uri.getQueryParameter("dclid");
                    }
                    else {
                        queryParameter5 = null;
                        queryParameter6 = null;
                    }
                    if (b2) {
                        final String queryParameter7 = uri.getQueryParameter("srsltid");
                        s = queryParameter5;
                        s2 = queryParameter6;
                        s3 = queryParameter7;
                    }
                    else {
                        final String s4 = null;
                        s = queryParameter5;
                        s2 = queryParameter6;
                        s3 = s4;
                    }
                }
                else {
                    queryParameter = null;
                    final String s5;
                    queryParameter2 = (s5 = null);
                    queryParameter4 = (s = s5);
                    s2 = (s3 = s);
                    queryParameter3 = s5;
                }
                if (TextUtils.isEmpty((CharSequence)queryParameter) && TextUtils.isEmpty((CharSequence)queryParameter2) && TextUtils.isEmpty((CharSequence)queryParameter3) && TextUtils.isEmpty((CharSequence)queryParameter4) && (!b || (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2))) && (!b2 || TextUtils.isEmpty((CharSequence)s3))) {
                    return null;
                }
                final Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                    ((BaseBundle)bundle).putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter2)) {
                    ((BaseBundle)bundle).putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter3)) {
                    ((BaseBundle)bundle).putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty((CharSequence)queryParameter4)) {
                    ((BaseBundle)bundle).putString("gclid", queryParameter4);
                }
                final String queryParameter8 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty((CharSequence)queryParameter8)) {
                    ((BaseBundle)bundle).putString("term", queryParameter8);
                }
                final String queryParameter9 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty((CharSequence)queryParameter9)) {
                    ((BaseBundle)bundle).putString("content", queryParameter9);
                }
                final String queryParameter10 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter10)) {
                    ((BaseBundle)bundle).putString("aclid", queryParameter10);
                }
                final String queryParameter11 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty((CharSequence)queryParameter11)) {
                    ((BaseBundle)bundle).putString("cp1", queryParameter11);
                }
                final String queryParameter12 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty((CharSequence)queryParameter12)) {
                    ((BaseBundle)bundle).putString("anid", queryParameter12);
                }
                if (b) {
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        ((BaseBundle)bundle).putString("campaign_id", s);
                    }
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        ((BaseBundle)bundle).putString("dclid", s2);
                    }
                    final String queryParameter13 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter13)) {
                        ((BaseBundle)bundle).putString("source_platform", queryParameter13);
                    }
                    final String queryParameter14 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter14)) {
                        ((BaseBundle)bundle).putString("creative_format", queryParameter14);
                    }
                    final String queryParameter15 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty((CharSequence)queryParameter15)) {
                        ((BaseBundle)bundle).putString("marketing_tactic", queryParameter15);
                    }
                }
                if (b2 && !TextUtils.isEmpty((CharSequence)s3)) {
                    ((BaseBundle)bundle).putString("srsltid", s3);
                }
                return bundle;
            }
            catch (final UnsupportedOperationException ex) {
                super.F0.b().N0.b("Install referrer url isn't a hierarchical URI", (Object)ex);
            }
        }
        return null;
    }
    
    public final String q(final String s, final int n, final boolean b) {
        if (s == null) {
            return null;
        }
        if (s.codePointCount(0, s.length()) <= n) {
            return s;
        }
        if (b) {
            return String.valueOf(s.substring(0, s.offsetByCodePoints(0, n))).concat("...");
        }
        return null;
    }
    
    public final Bundle q0(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object n = this.n(s, ((BaseBundle)bundle).get(s));
                if (n == null) {
                    super.F0.b().P0.b("Param value can't be null", (Object)super.F0.R0.e(s));
                }
                else {
                    this.B(bundle2, s, n);
                }
            }
        }
        return bundle2;
    }
    
    public final Bundle r0(final String s, final String s2, final Bundle bundle, final List list, final boolean b) {
        final boolean e0 = e0(s2, lp7.p1);
        Bundle bundle3;
        if (bundle != null) {
            final Bundle bundle2 = new Bundle(bundle);
            final int l = super.F0.L0.l();
            final Iterator iterator = new TreeSet(((BaseBundle)bundle).keySet()).iterator();
            int n = 0;
            while (true) {
                bundle3 = bundle2;
                if (!iterator.hasNext()) {
                    break;
                }
                final String s3 = (String)iterator.next();
                int i0;
                if (list != null && list.contains(s3)) {
                    i0 = 0;
                }
                else {
                    int j0;
                    if (!b) {
                        j0 = this.j0(s3);
                    }
                    else {
                        j0 = 0;
                    }
                    i0 = j0;
                    if (j0 == 0) {
                        i0 = this.i0(s3);
                    }
                }
                int n2 = 0;
                Label_0391: {
                    if (i0 != 0) {
                        String s4;
                        if (i0 == 3) {
                            s4 = s3;
                        }
                        else {
                            s4 = null;
                        }
                        this.v(bundle2, i0, s3, s4);
                        bundle2.remove(s3);
                        n2 = n;
                    }
                    else {
                        final int n3 = this.N(s, s2, s3, ((BaseBundle)bundle).get(s3), bundle2, list, b, e0);
                        if (n3 == 17) {
                            this.v(bundle2, 17, s3, Boolean.FALSE);
                        }
                        else if (n3 != 0 && !"_ev".equals(s3)) {
                            String s5;
                            if (n3 == 21) {
                                s5 = s2;
                            }
                            else {
                                s5 = s3;
                            }
                            this.v(bundle2, n3, s5, ((BaseBundle)bundle).get(s3));
                            bundle2.remove(s3);
                            n2 = n;
                            break Label_0391;
                        }
                        n2 = n;
                        if (W(s3)) {
                            n2 = n + 1;
                            if (n2 > l) {
                                super.F0.b().M0.c(snp.a("Event can't contain more than ", l, " params").toString(), (Object)super.F0.R0.d(s2), (Object)super.F0.R0.b(bundle));
                                b0(bundle2, 5);
                                bundle2.remove(s3);
                            }
                        }
                    }
                }
                n = n2;
            }
        }
        else {
            bundle3 = null;
        }
        return bundle3;
    }
    
    @EnsuresNonNull({ "this.secureRandom" })
    public final SecureRandom s() {
        this.g();
        if (this.H0 == null) {
            this.H0 = new SecureRandom();
        }
        return this.H0;
    }
    
    public final rhy s0(final String s, final String s2, Bundle bundle, final String s3, final long n, final boolean b) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        if (this.h0(s2) == 0) {
            if (bundle != null) {
                bundle = new Bundle(bundle);
            }
            else {
                bundle = new Bundle();
            }
            ((BaseBundle)bundle).putString("_o", s3);
            Bundle bundle2;
            bundle = (bundle2 = this.r0(s, s2, bundle, Collections.singletonList("_o"), true));
            if (b) {
                bundle2 = this.q0(bundle);
            }
            iuk.C((Object)bundle2);
            return new rhy(s2, new fhy(bundle2), s3, n);
        }
        super.F0.b().K0.b("Invalid conditional property event name", (Object)super.F0.R0.f(s2));
        throw new IllegalArgumentException();
    }
    
    public final void u(final Bundle bundle, final long n) {
        long long1 = ((BaseBundle)bundle).getLong("_et");
        if (long1 != 0L) {
            super.F0.b().N0.b("Params already contained engagement", (Object)long1);
        }
        else {
            long1 = 0L;
        }
        ((BaseBundle)bundle).putLong("_et", n + long1);
    }
    
    public final void v(final Bundle bundle, final int n, final String s, final Object o) {
        if (b0(bundle, n)) {
            Objects.requireNonNull(super.F0);
            ((BaseBundle)bundle).putString("_ev", this.q(s, 40, true));
            if (o != null && (o instanceof String || o instanceof CharSequence)) {
                ((BaseBundle)bundle).putLong("_el", (long)o.toString().length());
            }
        }
    }
    
    public final void y(final Bundle bundle, final Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (final String s : ((BaseBundle)bundle2).keySet()) {
            if (!((BaseBundle)bundle).containsKey(s)) {
                super.F0.B().B(bundle, s, ((BaseBundle)bundle2).get(s));
            }
        }
    }
    
    public final void z(final s3z s3z, final int n) {
        final Iterator iterator = new TreeSet(((BaseBundle)s3z.d).keySet()).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (W(s)) {
                final int n3 = n2 + 1;
                if ((n2 = n3) <= n) {
                    continue;
                }
                super.F0.b().M0.c(snp.a("Event can't contain more than ", n, " params").toString(), (Object)super.F0.R0.d(s3z.a), (Object)super.F0.R0.b(s3z.d));
                b0(s3z.d, 5);
                s3z.d.remove(s);
                n2 = n3;
            }
        }
    }
}
