import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$a;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Set;
import java.util.Iterator;
import android.graphics.Rect;
import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.RemoteException;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import android.graphics.Point;
import java.util.List;
import java.util.Arrays;
import android.util.SparseArray;
import android.os.Parcelable$Creator;
import android.os.IInterface;
import com.google.mlkit.common.MlKitException;
import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qoy implements biz
{
    public final Context a;
    public final dwz b;
    public boolean c;
    public wbz d;
    
    public qoy(final Context a) {
        this.b = new dwz((String)null);
        this.a = a;
    }
    
    public final cfs a(final yrd yrd) throws MlKitException {
        if (this.d == null) {
            this.c();
        }
        if (this.d != null) {
            final int e = yrd.e;
            Bitmap bitmap;
            int a;
            if (e == -1) {
                bitmap = yrd.a;
                a = yx4.a(yrd.d);
            }
            else if (e != -1) {
                if (e == 17) {
                    Objects.requireNonNull((Object)null, "null reference");
                    throw null;
                }
                if (e == 35) {
                    Objects.requireNonNull((Object)null, "null reference");
                    throw null;
                }
                if (e != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                Objects.requireNonNull((Object)null, "null reference");
                throw null;
            }
            else {
                final Bitmap a2 = yrd.a;
                Objects.requireNonNull(a2, "null reference");
                bitmap = v6d.a(a2, yrd.d, yrd.b, yrd.c);
                a = 0;
            }
            final p5j p5j = new p5j(bitmap);
            final ety ety = new ety(yrd.b, yrd.c, 0, 0L, a);
            try {
                final wbz d = this.d;
                Objects.requireNonNull(d, "null reference");
                final Parcel s = d.s();
                eoy.a(s, (IInterface)p5j);
                s.writeInt(1);
                ety.writeToParcel(s, 0);
                final Parcel x = d.x(1, s);
                final qoz[] array = (qoz[])x.createTypedArray((Parcelable$Creator)qoz.CREATOR);
                x.recycle();
                final kb8 a3 = gfz.a;
                final SparseArray sparseArray = new SparseArray();
                for (final qoz qoz : array) {
                    SparseArray sparseArray2;
                    if ((sparseArray2 = (SparseArray)sparseArray.get(qoz.O0)) == null) {
                        sparseArray2 = new SparseArray();
                        sparseArray.append(qoz.O0, (Object)sparseArray2);
                    }
                    sparseArray2.append(qoz.P0, (Object)qoz);
                }
                final nly g0 = wly.G0;
                Object[] copy = new Object[4];
                int j = 0;
                int n = 0;
                int n5;
                int n7;
                for (SparseArray sparseArray3 = sparseArray; j < sparseArray3.size(); j = n5 + 1, n = n7) {
                    final SparseArray sparseArray4 = (SparseArray)sparseArray3.valueAt(j);
                    Object[] array2 = new Object[4];
                    int k = 0;
                    int n2 = 0;
                    while (k < sparseArray4.size()) {
                        final qoz qoz2 = (qoz)sparseArray4.valueAt(k);
                        Objects.requireNonNull(qoz2);
                        final int n3 = n2 + 1;
                        final int length2 = array2.length;
                        Object[] copy2 = array2;
                        if (length2 < n3) {
                            int n4;
                            if ((n4 = length2 + (length2 >> 1) + 1) < n3) {
                                final int highestOneBit = Integer.highestOneBit(n3 - 1);
                                n4 = highestOneBit + highestOneBit;
                            }
                            if (n4 < 0) {
                                n4 = Integer.MAX_VALUE;
                            }
                            copy2 = Arrays.copyOf(array2, n4);
                        }
                        copy2[n2] = qoz2;
                        ++k;
                        n2 = n3;
                        array2 = copy2;
                    }
                    final nly g2 = wly.G0;
                    ppy j2;
                    if (n2 == 0) {
                        j2 = ppy.J0;
                    }
                    else {
                        j2 = new ppy(array2, n2);
                    }
                    final List a4 = v7q.A((List)j2, (f000)xi4.R0);
                    final r2z g3 = j2.get(0).G0;
                    final qqy m = j2.m(0);
                    int max = Integer.MIN_VALUE;
                    int max2 = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    int min2 = Integer.MAX_VALUE;
                    final List list = a4;
                    final qqy qqy = m;
                    n5 = j;
                    while (true) {
                        final nly nly = (nly)qqy;
                        if (!nly.hasNext()) {
                            break;
                        }
                        final r2z g4 = ((qoz)nly.next()).G0;
                        final int f0 = g3.F0;
                        final int g5 = g3.G0;
                        final double sin = Math.sin(Math.toRadians(g3.J0));
                        final double cos = Math.cos(Math.toRadians(g3.J0));
                        final Point[] array3 = new Point[4];
                        (array3[0] = new Point(g4.F0, g4.G0)).offset(-f0, -g5);
                        final int x2 = (int)(array3[0].y * sin + array3[0].x * cos);
                        final int y = (int)(array3[0].y * cos + -array3[0].x * sin);
                        array3[0].x = x2;
                        array3[0].y = y;
                        array3[1] = new Point(g4.H0 + x2, y);
                        array3[2] = new Point(g4.H0 + x2, g4.I0 + y);
                        array3[3] = new Point(x2, y + g4.I0);
                        for (int l = 0; l < 4; ++l) {
                            final Point point = array3[l];
                            min = Math.min(min, point.x);
                            max = Math.max(max, point.x);
                            min2 = Math.min(min2, point.y);
                            max2 = Math.max(max2, point.y);
                        }
                    }
                    final int f2 = g3.F0;
                    final int g6 = g3.G0;
                    final double sin2 = Math.sin(Math.toRadians(g3.J0));
                    final double cos2 = Math.cos(Math.toRadians(g3.J0));
                    final Point[] array4 = { new Point(min, min2), new Point(max, min2), new Point(max, max2), new Point(min, max2) };
                    for (int n6 = 0; n6 < 4; ++n6) {
                        final int x3 = array4[n6].x;
                        final int y2 = array4[n6].y;
                        final int x4 = array4[n6].x;
                        final int y3 = array4[n6].y;
                        array4[n6].x = (int)(x3 * cos2 - y2 * sin2);
                        array4[n6].y = (int)(y3 * cos2 + x4 * sin2);
                        array4[n6].offset(f2, g6);
                    }
                    final List<Point> list2 = Arrays.asList(array4);
                    final String a5 = gfz.a.a((Iterable)v7q.A(list, (f000)eg8.T0));
                    final Rect u0 = iuk.U0((List)list2);
                    final HashMap hashMap = new HashMap();
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        final String b = ((cfs.c)iterator.next()).b;
                        int intValue;
                        if (hashMap.containsKey(b)) {
                            intValue = (int)hashMap.get(b);
                        }
                        else {
                            intValue = 0;
                        }
                        hashMap.put(b, intValue + 1);
                    }
                    final Set entrySet = hashMap.entrySet();
                    String s2 = null;
                    Label_1344: {
                        if (!entrySet.isEmpty()) {
                            if (!egz.A(s2 = Collections.max((Collection<? extends Map.Entry<String, V>>)entrySet, (Comparator<? super Map.Entry<String, V>>)qbz.F0).getKey())) {
                                break Label_1344;
                            }
                        }
                        s2 = "und";
                    }
                    final cfs$d cfs$d = new cfs$d(a5, u0, (List)list2, s2, list);
                    n7 = n + 1;
                    final int length3 = copy.length;
                    if (length3 < n7) {
                        int n8;
                        if ((n8 = length3 + (length3 >> 1) + 1) < n7) {
                            final int highestOneBit2 = Integer.highestOneBit(n7 - 1);
                            n8 = highestOneBit2 + highestOneBit2;
                        }
                        if (n8 < 0) {
                            n8 = Integer.MAX_VALUE;
                        }
                        copy = Arrays.copyOf(copy, n8);
                    }
                    copy[n] = cfs$d;
                }
                final nly g7 = wly.G0;
                ppy j3;
                if (n == 0) {
                    j3 = ppy.J0;
                }
                else {
                    j3 = new ppy(copy, n);
                }
                return new cfs(gfz.a.a((Iterable)v7q.A((List)j3, (f000)zjd.H0)), j3);
            }
            catch (final RemoteException ex) {
                throw new MlKitException("Failed to run legacy text recognizer.", (Throwable)ex);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }
    
    public final void c() throws MlKitException {
        if (this.d == null) {
            try {
                final IBinder b = DynamiteModule.c(this.a, (DynamiteModule$a)DynamiteModule.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
                final int a = giz.a;
                Object o;
                if (b == null) {
                    o = null;
                }
                else {
                    final IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
                    if (queryLocalInterface instanceof tlz) {
                        o = queryLocalInterface;
                    }
                    else {
                        o = new mfz(b);
                    }
                }
                final wbz u = ((tlz)o).U((l3d)new p5j(this.a), this.b);
                this.d = u;
                if (u == null && !this.c) {
                    Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                    poj.a(this.a);
                    this.c = true;
                }
            }
            catch (final DynamiteModule$LoadingException ex) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", (Throwable)ex);
            }
            catch (final RemoteException ex2) {
                throw new MlKitException("Failed to create legacy text recognizer.", (Throwable)ex2);
            }
        }
    }
    
    public final void d() {
        final wbz d = this.d;
        if (d != null) {
            try {
                d.U0(2, d.s());
            }
            catch (final RemoteException ex) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", (Throwable)ex);
            }
            this.d = null;
        }
    }
}
