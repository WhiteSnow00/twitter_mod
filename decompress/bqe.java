import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import androidx.fragment.app.p;
import java.lang.reflect.Method;
import com.google.android.play.core.internal.zzbx;
import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.util.Pair;
import java.io.RandomAccessFile;
import android.content.Context;
import android.view.View;
import com.twitter.rooms.model.PodcastEpisode;
import com.twitter.rooms.subsystem.api.models.StationTrack$TrackData;
import java.util.List;
import android.view.KeyEvent;
import java.util.Objects;
import java.util.ArrayList;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public class bqe implements bjy, pyy, u16
{
    public static final int[] C0;
    public static final int[] D0;
    
    public static PointF c(final PointF pointF, final PointF pointF2, final float n) {
        final float x = pointF.x;
        final float x2 = pointF2.x;
        final double n2 = (x - x2) * n;
        final float y = pointF.y;
        final float y2 = pointF2.y;
        return new PointF((float)(x2 + n2), (float)(y2 + (double)((y - y2) * n)));
    }
    
    public static final int d(final Comparable comparable, final Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
    
    public static final int e(final Object o, final Object o2, final rtb... array) {
        if (array.length > 0) {
            return f(o, o2, array);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final int f(final Object o, final Object o2, final rtb[] array) {
        for (final rtb rtb : array) {
            final int d = d((Comparable)rtb.invoke(o), (Comparable)rtb.invoke(o2));
            if (d != 0) {
                return d;
            }
        }
        return 0;
    }
    
    public static void g(final Path path, final Rect rect) {
        h(path, rect, 6, 0.6f);
    }
    
    public static void h(final Path path, final Rect rect, int i, final float n) {
        final ArrayList list = new ArrayList();
        final float n2 = (float)Math.min(rect.width(), rect.height());
        final float n3 = n2 / 2.0f;
        final float n4 = n2 * n / 18.0f;
        for (int j = 0; j < i; ++j) {
            final double n5 = j * 360.0 / i;
            final double n6 = rect.centerX();
            final double n7 = n4 + n3;
            list.add(new PointF((float)(Math.cos(Math.toRadians(n5)) * n7 + n6), (float)(Math.sin(Math.toRadians(n5)) * n7 + rect.centerY())));
        }
        path.rewind();
        list.add(list.get(0));
        list.add(list.get(1));
        final PointF c = c(list.get(list.size() - 1), list.get(0), n);
        path.moveTo(c.x, c.y);
        i = 1;
        while (i < list.size() - 1) {
            final PointF pointF = list.get(i - 1);
            final PointF pointF2 = list.get(i);
            ++i;
            final PointF pointF3 = list.get(i);
            final PointF c2 = c(pointF, pointF2, n);
            path.lineTo(c2.x, c2.y);
            final PointF c3 = c(pointF3, pointF2, n);
            final float x = pointF2.x;
            final float y = pointF2.y;
            path.cubicTo(x, y, x, y, c3.x, c3.y);
        }
    }
    
    public static xm9 i() {
        final int a = an9.a;
        Objects.requireNonNull(bn9.Companion);
        return ((bn9)((v4j)jr0.Companion.a()).B((Class)bn9.class)).Z();
    }
    
    public static final f6j j(final glq glq, final h2d h2d) {
        zzd.f((Object)glq, "<this>");
        return (f6j)new f2d(glq, h2d);
    }
    
    public static final long k(final KeyEvent keyEvent) {
        return x3j.e(keyEvent.getKeyCode());
    }
    
    public static final StationTrack$TrackData l(final List list, int n) {
        zzd.f((Object)list, "<this>");
        final int size = list.size();
        final int n2 = 0;
        int n3;
        if (n == size - 1) {
            n3 = 0;
        }
        else {
            n3 = n + 1;
        }
        final StationTrack$TrackData stationTrack$TrackData = null;
        final String s = null;
        StationTrack$TrackData stationTrack$TrackData2 = stationTrack$TrackData;
        if (n3 != n) {
            final hvt hvt = list.get(n3);
            ++n3;
            zzd.f((Object)hvt, "<this>");
            final Object j = fk7.J(hvt);
            if (j instanceof PodcastEpisode) {
                stationTrack$TrackData2 = new StationTrack$TrackData(((PodcastEpisode)j).getShow().getArtUrl(), yvt.C0, n3);
            }
            else {
                stationTrack$TrackData2 = stationTrack$TrackData;
                if (j instanceof v21) {
                    final v21 v21 = (v21)j;
                    zzd.f((Object)v21, "<this>");
                    final xl2 b = xl2.b(v21.i);
                    zzd.e((Object)b, "safeValueOf(this.state)");
                    n = n2;
                    Label_0175: {
                        if (v21.J) {
                            if (b != xl2.F0) {
                                n = n2;
                                if (b != xl2.G0) {
                                    break Label_0175;
                                }
                            }
                            n = 1;
                        }
                    }
                    yvt yvt;
                    if (n != 0) {
                        yvt = yvt.E0;
                    }
                    else {
                        yvt = yvt.D0;
                    }
                    final w21 o = v21.O;
                    String b2 = s;
                    if (o != null) {
                        b2 = o.b();
                    }
                    stationTrack$TrackData2 = new StationTrack$TrackData(b2, yvt, n3);
                }
            }
        }
        return stationTrack$TrackData2;
    }
    
    public static q6 m() {
        final int a = r6.a;
        Objects.requireNonNull(t6.Companion);
        return ((t6)((v4j)jr0.Companion.a()).B((Class)t6.class)).Z3();
    }
    
    public static final int n(final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        int n = 1;
        if (action != 0) {
            if (action != 1) {
                Objects.requireNonNull(aqe.Companion);
                n = 0;
            }
            else {
                Objects.requireNonNull(aqe.Companion);
            }
        }
        else {
            Objects.requireNonNull(aqe.Companion);
            n = 2;
        }
        return n;
    }
    
    public static boolean o() {
        return dta.c().b("af_ui_chirp_enabled", false);
    }
    
    public static final boolean p(final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }
    
    public static final boolean q() {
        return dta.b().b("vibe_composer_enabled", false);
    }
    
    public static final boolean r() {
        return dta.b().b("vibe_tweet_context_enabled", false);
    }
    
    public static final void s(final View view, final otb otb) {
        zzd.f((Object)view, "<this>");
        zzd.f((Object)otb, "evaluateStringRes");
        p5x.z(view, (wf)new be4(otb));
    }
    
    public static boolean t(final Context context, final float n) {
        return (int)n >= context.getResources().getDimensionPixelSize(2131165839);
    }
    
    public static Context w(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
    
    public static Pair x(final RandomAccessFile randomAccessFile, int i) throws IOException {
        final long length = randomAccessFile.length();
        if (length < 22L) {
            return null;
        }
        final ByteBuffer allocate = ByteBuffer.allocate((int)Math.min(i, -22L + length) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        final long n = length - allocate.capacity();
        randomAccessFile.seek(n);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        y(allocate);
        i = allocate.capacity();
        Label_0168: {
            if (i >= 22) {
                final int n2 = i - 22;
                int min;
                int n3;
                for (min = Math.min(n2, 65535), i = 0; i < min; ++i) {
                    n3 = n2 - i;
                    if (allocate.getInt(n3) == 101010256 && (char)allocate.getShort(n3 + 20) == i) {
                        i = n3;
                        break Label_0168;
                    }
                }
            }
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        allocate.position(i);
        final ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create((Object)slice, (Object)(n + i));
    }
    
    public static void y(final ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
    
    public Object a() {
        final azy c = fzy.c;
        return fsz.D0.b().C();
    }
    
    public boolean b(Object class1, final File file, final File file2) {
        class1 = class1.getClass();
        final Method h = k3j.H((Class)class1, "optimizedPathFor", new Class[] { File.class, File.class });
        try {
            return new File(String.class.cast(h.invoke(null, file, file2))).exists();
        }
        catch (final Exception ex) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", class1), ex);
        }
    }
    
    public Object n0(final o16 o16) {
        final rrm rrm = (rrm)o16;
        return new yjz((vmz)rrm.f((Class)vmz.class), (yfa)rrm.f((Class)yfa.class));
    }
    
    public void u(final String b, final String b2, final String s, final p p4) {
        zzd.f((Object)b, "title");
        zzd.f((Object)b2, "summary");
        zzd.f((Object)s, "eventPage");
        zzd.f((Object)p4, "fragmentManager");
        final xur$a xur$a = new xur$a();
        final qur$a qur$a = new qur$a();
        qur$a.b = b2;
        qur$a.c = 2131954550;
        xur$a.i = Collections.singletonList(((h4j)qur$a).e());
        xur$a.h = nca.Companion.e(s, "", "disabled_engagement_education_sheet", "", "impression");
        ((u92$a)xur$a).b = b;
        final int a = w4j.a;
        ((u92$a)xur$a).f = true;
        final xur$b j = xur.j;
        final Bundle w = zi.w("twitter:id", 500);
        yvj.k(w, "serializer_fragment_arg", ((h4j)xur$a).e(), (alp)j);
        if (((BaseBundle)w).containsKey("twitter:id")) {
            final our our = new our();
            ((Fragment)our).N1(w);
            ((cl1)our).e2(p4, "summary_sheet_dialog");
            return;
        }
        throw new Fragment.InstantiationException("Missing fragment id", null);
    }
    
    public void v(final gob gob) {
        zzd.f((Object)gob, "activity");
        final qur$a qur$a = new qur$a();
        qur$a.a = ((Context)gob).getString(2131957364);
        qur$a.b = ((Context)gob).getString(2131957359);
        final qur qur = (qur)((h4j)qur$a).e();
        final qur$a qur$a2 = new qur$a();
        qur$a2.a = ((Context)gob).getString(2131957365);
        qur$a2.b = ((Context)gob).getString(2131957360);
        final qur qur2 = (qur)((h4j)qur$a2).e();
        final qur$a qur$a3 = new qur$a();
        qur$a3.a = ((Context)gob).getString(2131957366);
        qur$a3.b = ((Context)gob).getString(2131957361);
        final qur qur3 = (qur)((h4j)qur$a3).e();
        final xur$a xur$a = new xur$a();
        xur$a.i = tdy.v0((Object[])new qur[] { qur, qur2, qur3 });
        ((u92$a)xur$a).f = false;
        final int a = w4j.a;
        ((u92$a)xur$a).b = ((Context)gob).getString(2131957363);
        final fw8 fw8 = new fw8(gob.Q(), "summary_sheet_dialog");
        final xur$b j = xur.j;
        final Bundle w = zi.w("twitter:id", 500);
        yvj.k(w, "serializer_fragment_arg", ((h4j)xur$a).e(), (alp)j);
        if (((BaseBundle)w).containsKey("twitter:id")) {
            final our our = new our();
            ((Fragment)our).N1(w);
            fw8.a((cl1)our);
            return;
        }
        throw new Fragment.InstantiationException("Missing fragment id", null);
    }
}
