import android.view.View;
import android.os.Parcel;
import android.view.MotionEvent;
import org.checkerframework.dataflow.qual.Pure;
import com.google.android.exoplayer2.ParserException;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.EOFException;
import com.twitter.analytics.tracking.a;
import java.util.Objects;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import com.twitter.util.user.UserIdentifier;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import java.util.Locale;
import java.util.regex.Pattern;
import androidx.fragment.app.Fragment;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;
import java.net.Socket;
import android.annotation.SuppressLint;
import com.google.android.exoplayer2.n;
import java.nio.ByteBuffer;
import java.util.List;
import android.media.MediaFormat;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.media.ui.image.UserImageView;
import tv.periscope.model.chat.b;

// 
// Decompiled by Procyon v0.6.0
// 

public class poa implements bsl, ke3, ujv, pyy, u16
{
    public static final byte[] C0;
    public static final String[] D0;
    public static final poa E0;
    public static final rnx F0;
    public static final rnx G0;
    public static final rnx H0;
    public static final rnx I0;
    public static final float[] J0;
    public static final aw8 K0;
    public static final i3s L0;
    public static final i3s M0;
    public static final i3s N0;
    public static final b2a O0;
    public static final b2a P0;
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public static final int[] T0;
    
    public static final wxc$h A(final b b, final boolean b2) {
        final wxc$h p2 = wxc$h.P0;
        final wxc$h c0 = wxc$h.C0;
        zzd.f((Object)b, "status");
        switch (((Enum)b).ordinal()) {
            default: {
                return c0;
            }
            case 12: {
                wxc$h wxc$h;
                if (b2) {
                    wxc$h = wxc$h.I0;
                }
                else {
                    wxc$h = wxc$h.H0;
                }
                return wxc$h;
            }
            case 9: {
                wxc$h wxc$h2;
                if (b2) {
                    wxc$h2 = wxc$h.O0;
                }
                else {
                    wxc$h2 = wxc$h.N0;
                }
                return wxc$h2;
            }
            case 7: {
                wxc$h wxc$h3;
                if (b2) {
                    wxc$h3 = wxc$h.K0;
                }
                else {
                    wxc$h3 = wxc$h.J0;
                }
                return wxc$h3;
            }
            case 4:
            case 10: {
                return p2;
            }
            case 3:
            case 8: {
                return wxc$h.L0;
            }
            case 2: {
                return wxc$h.F0;
            }
            case 1: {
                wxc$h wxc$h4;
                if (b2) {
                    wxc$h4 = wxc$h.E0;
                }
                else {
                    wxc$h4 = wxc$h.D0;
                }
                return wxc$h4;
            }
            case 0: {
                return c0;
            }
        }
    }
    
    public static void A0(final UserImageView userImageView, final adu adu) {
        z0(userImageView, l8w.a(adu));
    }
    
    public static final int B(final wxc$h wxc$h) {
        zzd.f((Object)wxc$h, "status");
        switch (((Enum)wxc$h).ordinal()) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                return 5;
            }
            case 7:
            case 8: {
                return 4;
            }
            case 5:
            case 6: {
                return 3;
            }
            case 1:
            case 2: {
                return 2;
            }
            case 0:
            case 3:
            case 4:
            case 9:
            case 13: {
                return 1;
            }
        }
    }
    
    public static void B0(final MediaFormat mediaFormat, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            mediaFormat.setByteBuffer(q1a.f(15, "csd-", i), ByteBuffer.wrap((byte[])list.get(i)));
        }
    }
    
    @SuppressLint({ "InlinedApi" })
    public static MediaFormat C(final n n) {
        final MediaFormat mediaFormat = new MediaFormat();
        s0(mediaFormat, "bitrate", n.J0);
        s0(mediaFormat, "channel-count", n.a1);
        r0(mediaFormat, n.Z0);
        t0(mediaFormat, "mime", n.N0);
        t0(mediaFormat, "codecs-string", n.K0);
        final float u0 = n.U0;
        if (u0 != -1.0f) {
            mediaFormat.setFloat("frame-rate", u0);
        }
        s0(mediaFormat, "width", n.S0);
        s0(mediaFormat, "height", n.T0);
        B0(mediaFormat, n.P0);
        final int c1 = n.c1;
        final int n2 = 0;
        Label_0212: {
            if (c1 != -1) {
                s0(mediaFormat, "exo-pcm-encoding-int", c1);
                int n3 = 3;
                if (c1 != 0) {
                    if (c1 != 536870912) {
                        if (c1 != 805306368) {
                            if (c1 != 2) {
                                if (c1 != 3) {
                                    if (c1 != 4) {
                                        break Label_0212;
                                    }
                                    n3 = 4;
                                }
                            }
                            else {
                                n3 = 2;
                            }
                        }
                        else {
                            n3 = 22;
                        }
                    }
                    else {
                        n3 = 21;
                    }
                }
                else {
                    n3 = 0;
                }
                mediaFormat.setInteger("pcm-encoding", n3);
            }
        }
        t0(mediaFormat, "language", n.E0);
        s0(mediaFormat, "max-input-size", n.O0);
        s0(mediaFormat, "sample-rate", n.b1);
        s0(mediaFormat, "caption-service-number", n.f1);
        mediaFormat.setInteger("rotation-degrees", n.V0);
        final int f0 = n.F0;
        final int n4 = 1;
        int n5;
        if ((f0 & 0x4) != 0x0) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        mediaFormat.setInteger("is-autoselect", n5);
        int n6;
        if ((f0 & 0x1) != 0x0) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        mediaFormat.setInteger("is-default", n6);
        int n7 = n2;
        if ((f0 & 0x2) != 0x0) {
            n7 = 1;
        }
        mediaFormat.setInteger("is-forced-subtitle", n7);
        mediaFormat.setInteger("encoder-delay", n.d1);
        mediaFormat.setInteger("encoder-padding", n.e1);
        final float w0 = n.W0;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", w0);
        int n8 = 1073741824;
        int n9;
        if (w0 < 1.0f) {
            n9 = (int)(w0 * 1073741824);
        }
        else if (w0 > 1.0f) {
            n8 = (int)(1073741824 / w0);
            n9 = 1073741824;
        }
        else {
            n8 = 1;
            n9 = n4;
        }
        mediaFormat.setInteger("sar-width", n9);
        mediaFormat.setInteger("sar-height", n8);
        return mediaFormat;
    }
    
    public static final boolean C0(final ocw ocw) {
        zzd.f((Object)ocw, "userInfo");
        return ocw.g() && c0();
    }
    
    public static final e3v D() {
        final k7v e0 = k7v.E0;
        final l7v e2 = l7v.E0;
        final j7v j7v = new j7v(e0, "I am a cat dad... believe it or not", tdy.u0((Object)new m7v(e2, Integer.valueOf(18), Integer.valueOf(35))), (List)null);
        final k7v d0 = k7v.D0;
        final l7v d2 = l7v.D0;
        final Integer value = 0;
        final j7v j7v2 = new j7v(d0, "Had to update it y'all!", tdy.u0((Object)new m7v(d2, value, Integer.valueOf(23))), (List)null);
        final j7v j7v3 = new j7v(d0, "I should probably update my LinkedIn about these new skills now.", (List)null, tdy.u0((Object)new i7v((g7v)new t7v("https://www.linkedin.com/in/perronjones"), Integer.valueOf(28), Integer.valueOf(36))));
        final Integer value2 = 13;
        final j7v j7v4 = new j7v(d0, "Scratch that. Probably won't do that.", tdy.v0((Object[])new m7v[] { new m7v(e2, value, value2), new m7v(l7v.F0, value, value2) }), (List)null);
        final j7v j7v5 = new j7v(d0, "These are skills I perform in the morning.", (List)null, (List)null);
        final k7v g0 = k7v.G0;
        final j7v j7v6 = new j7v(g0, "Feeding them", (List)null, (List)null);
        final j7v j7v7 = new j7v(g0, "Medicating them", (List)null, (List)null);
        final j7v j7v8 = new j7v(g0, "Cleaning their Sh!t", (List)null, (List)null);
        final j7v j7v9 = new j7v(d0, "Things I'm highly jealous of", (List)null, (List)null);
        final k7v h0 = k7v.H0;
        final j7v j7v10 = new j7v(h0, "The dominance of someone cleaning your poop for minutes while you lay in front of them and sleep #CatsOfTwitter", tdy.u0((Object)new m7v(d2, Integer.valueOf(87), Integer.valueOf(96))), tdy.u0((Object)new i7v((g7v)new g3v("CatsOfTwitter"), Integer.valueOf(97), Integer.valueOf(111))));
        final j7v j7v11 = new j7v(h0, "That's about it", (List)null, (List)null);
        final j7v j7v12 = new j7v(d0, "I make so many trips to Petco, I should probably invest in some $WOOF.", (List)null, tdy.u0((Object)new i7v((g7v)new f7v("WOOF"), Integer.valueOf(64), Integer.valueOf(69))));
        final j7v j7v13 = new j7v(d0, "But for now... I'll just \ud83e\udd23 at @CatsVideosDaily", (List)null, tdy.u0((Object)new i7v((g7v)new u7v(Long.valueOf(3029926678L)), Integer.valueOf(31), Integer.valueOf(47))));
        final f4v e3 = f4v.E0;
        final e4v e4v = new e4v(e3, tdy.u0((Object)new o7v(Long.valueOf(149920883845L))));
        final e4v e4v2 = new e4v(e3, tdy.u0((Object)new o7v(Long.valueOf(1566746966586839042L))));
        final e4v e4v3 = new e4v(e3, tdy.u0((Object)new o7v(Long.valueOf(1567262158295076866L))));
        final k7v f0 = k7v.F0;
        final j7v j7v14 = new j7v(f0, "Fun Stuff to look at", (List)null, (List)null);
        final j7v j7v15 = new j7v(f0, "Mine", (List)null, (List)null);
        final f4v d3 = f4v.D0;
        final dtg.a a = new dtg.a();
        a.g = 1546973841607610371L;
        final fwg.a companion = fwg.Companion;
        a.B = companion.a("7_1546973841607610371");
        a.D = new frg("Available", null, null);
        a.A = false;
        a.q = null;
        a.l = dtg$c.G0;
        a.o = new h2h(1.78f, 14.768f, tdy.v0((Object[])new i2h[] { new i2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/1280x720/Y52B84zIS_M5ISkw.mp4?tag=12", "video/mp4", 2176000), new i2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/pl/ozmoDYzGYwu40j0F.m3u8?tag=12&container=fmp4", "application/x-mpegURL", 0), new i2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/480x270/fPIXExk_FvmX76IA.mp4?tag=12", "video/mp4", 256000), new i2h("https://video.twimg.com/ext_tw_video/1546973841607610371/pu/vid/640x360/JfLrpyo9aEm0R2aA.mp4?tag=12", "video/mp4", 832000) }));
        a.w = "Test Video";
        a.j = "https://pbs.twimg.com/ext_tw_video_thumb/1546973841607610371/pu/img/GFzHvrjzVhs171k3.jpg";
        final ncq$a companion2 = ncq.Companion;
        a.m = companion2.b(1920, 1080);
        final e4v e4v4 = new e4v(d3, tdy.u0((Object)new x3v((dtg)((h4j)a).e())));
        final j7v j7v16 = new j7v(f0, "Not Mine", (List)null, (List)null);
        final dtg.a a2 = new dtg.a();
        a2.g = 1506323550545887236L;
        a2.B = companion.a("3_1506323550545887236");
        a2.D = new frg("Available", null, null);
        final dtg$c e4 = dtg$c.E0;
        a2.l = e4;
        a2.w = "Test Image";
        a2.j = "https://pbs.twimg.com/media/FOeJSdMXwAQY1bc.jpg";
        a2.m = companion2.b(1000, 667);
        final e4v e4v5 = new e4v(d3, tdy.u0((Object)new x3v((dtg)((h4j)a2).e())));
        final dtg.a a3 = new dtg.a();
        a3.g = 1506323550545887237L;
        a3.B = companion.a("3_1506323550545887236");
        a3.D = new frg("Available", null, null);
        a3.l = e4;
        a3.j = "https://pbs.twimg.com/media/FOe1bc.jpg";
        a3.m = companion2.b(1000, 667);
        final e4v e4v6 = new e4v(d3, tdy.u0((Object)new x3v((dtg)((h4j)a3).e())));
        final dtg.a a4 = new dtg.a();
        a4.g = 1506323647723679745L;
        a4.B = companion.a("16_1506323647723679745");
        a4.D = new frg("Available", null, null);
        a4.A = false;
        a4.q = null;
        a4.l = dtg$c.F0;
        a4.o = new h2h(1.0f, 3.0f, tdy.u0((Object)new i2h("https://video.twimg.com/tweet_video/FOeJYHNXMAEussh.mp4", "video/mp4", 0)));
        a4.w = "Test GIF";
        a4.j = "https://pbs.twimg.com/tweet_video_thumb/FOeJYHNXMAEussh.jpg";
        a4.m = companion2.b(498, 498);
        return new e3v(tdy.v0((Object[])new c7v[] { (c7v)j7v, (c7v)j7v2, (c7v)j7v3, (c7v)j7v4, (c7v)j7v5, (c7v)j7v6, (c7v)j7v7, (c7v)j7v8, (c7v)j7v9, (c7v)j7v10, (c7v)j7v11, (c7v)j7v12, (c7v)j7v13, (c7v)e4v, (c7v)j7v14, (c7v)j7v15, (c7v)e4v2, (c7v)e4v3, (c7v)e4v4, (c7v)j7v16, (c7v)e4v5, (c7v)e4v6, (c7v)new e4v(d3, tdy.u0((Object)new x3v((dtg)((h4j)a4).e()))) }), (String)null, Integer.valueOf(250));
    }
    
    public static final lcq D0(final Socket socket) throws IOException {
        final Logger a = fgj.a;
        zzd.f((Object)socket, "<this>");
        final gjq gjq = new gjq(socket);
        final OutputStream outputStream = socket.getOutputStream();
        zzd.e((Object)outputStream, "getOutputStream()");
        return ((qw0)gjq).sink((lcq)new rpj(outputStream, (c9t)gjq));
    }
    
    public static boolean E(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            equals = (o2 == null);
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static lcq E0(final File file) throws FileNotFoundException {
        final Logger a = fgj.a;
        zzd.f((Object)file, "<this>");
        return (lcq)new rpj((OutputStream)new FileOutputStream(file, false), new c9t());
    }
    
    public static Double F(final String s, final d78 d78) {
        Double value = null;
        try {
            final String s2 = d78.d(s, String.class);
            if (s2 != null) {
                value = Double.valueOf(s2);
            }
            return value;
        }
        catch (final NumberFormatException ex) {
            e9a.d((Throwable)ex);
        }
        catch (final ClassCastException ex2) {
            try {
                return d78.d(s, Double.class);
            }
            catch (final ClassCastException ex3) {
                e9a.d((Throwable)ex3);
            }
        }
        return null;
    }
    
    public static final zkq F0(final File file) throws FileNotFoundException {
        final Logger a = fgj.a;
        zzd.f((Object)file, "<this>");
        return (zkq)new csd((InputStream)new FileInputStream(file), c9t.NONE);
    }
    
    public static final zkq G0(final InputStream inputStream) {
        final Logger a = fgj.a;
        zzd.f((Object)inputStream, "<this>");
        return (zkq)new csd(inputStream, new c9t());
    }
    
    public static final elo H(final ezd ezd) {
        final Object m = ezd.m();
        elo elo;
        if (m instanceof elo) {
            elo = (elo)m;
        }
        else {
            elo = null;
        }
        return elo;
    }
    
    public static final zkq H0(final Socket socket) throws IOException {
        final Logger a = fgj.a;
        zzd.f((Object)socket, "<this>");
        final gjq gjq = new gjq(socket);
        final InputStream inputStream = socket.getInputStream();
        zzd.e((Object)inputStream, "getInputStream()");
        return ((qw0)gjq).source((zkq)new csd(inputStream, (c9t)gjq));
    }
    
    public static final nw8 I(Fragment fragment) {
        zzd.f((Object)fragment, "<this>");
        final Fragment x0 = fragment.X0;
        if (!(x0 instanceof okn) && !(x0 instanceof pio)) {
            if (x0 != null) {
                fragment = x0.X0;
            }
            else {
                fragment = null;
            }
            if (!(fragment instanceof okn)) {
                if (x0 != null) {
                    fragment = x0.X0;
                }
                else {
                    fragment = null;
                }
                if (!(fragment instanceof pio)) {
                    return null;
                }
            }
            return (nw8)x0.X0;
        }
        return (nw8)x0;
    }
    
    public static final String I0(String lowerCase) {
        zzd.f((Object)lowerCase, "query");
        final int length = lowerCase.length();
        boolean matches;
        if (length > 1) {
            final Pattern a = xzj.a;
            final String substring = lowerCase.substring(length - 1);
            zzd.e((Object)substring, "this as java.lang.String).substring(startIndex)");
            matches = a.matcher(substring).matches();
        }
        else {
            matches = false;
        }
        final Locale d = t4s.d();
        zzd.e((Object)d, "getLocale()");
        lowerCase = lowerCase.toLowerCase(d);
        zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int n = lowerCase.length() - 1;
        int i = 0;
        int n2 = 0;
        while (i <= n) {
            int n3;
            if (n2 == 0) {
                n3 = i;
            }
            else {
                n3 = n;
            }
            final boolean b = zzd.h((int)lowerCase.charAt(n3), 32) <= 0;
            if (n2 == 0) {
                if (!b) {
                    n2 = 1;
                }
                else {
                    ++i;
                }
            }
            else {
                if (!b) {
                    break;
                }
                --n;
            }
        }
        final String string = lowerCase.subSequence(i, n + 1).toString();
        if (matches) {
            lowerCase = " ";
        }
        else {
            lowerCase = "";
        }
        return l7k.c(string, lowerCase);
    }
    
    public static String J(final boolean b) {
        if (b) {
            return "on";
        }
        return "off";
    }
    
    public static final void J0(final TabLayout tabLayout, final esj esj) {
        if (esj != null) {
            final int j = esj.j;
            if (tabLayout != null) {
                final Context context = ((View)tabLayout).getContext();
                if (j != 0) {
                    tabLayout.setSelectedTabIndicatorColor(eo6.b(context, j));
                }
                else {
                    tabLayout.setSelectedTabIndicatorColor(eo6.b(context, 2131100824));
                }
            }
        }
    }
    
    public static final int K() {
        return dta.b().f("dm_conversation_labels_max_pinned_count", 6);
    }
    
    public static int K0(@NullableDecl final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return (int)(Integer.rotateLeft((int)(hashCode * -862048943L), 15) * 461845907L);
    }
    
    public static final int L() {
        int a;
        if (j0()) {
            a = (int)dta.b().h("dm_share_sheet_send_individually_max_count", 20L);
        }
        else {
            a = hhv.a();
        }
        return a;
    }
    
    public static CharSequence M(final Context context, final List list, final int n, final int n2) {
        final UserIdentifier current = UserIdentifier.getCurrent();
        final Resources resources = context.getResources();
        if (list.isEmpty()) {
            return "";
        }
        String s;
        if (list.size() == 1) {
            final s0h s0h = list.get(0);
            int n3;
            if (current.hasId(s0h.a)) {
                n3 = 2131954992;
            }
            else {
                n3 = 2131954990;
            }
            s = resources.getString(n3, new Object[] { s0h.b });
        }
        else {
            final s0h d = d1h.d(list, current);
            if (list.size() == 2) {
                int n4;
                int n5;
                int n6;
                if (d != null) {
                    n4 = ((current.hasId(list.get(0).a) ^ true) ? 1 : 0);
                    n5 = (n4 ^ 0x1);
                    n6 = 2131954994;
                }
                else {
                    n6 = 2131954989;
                    n4 = 0;
                    n5 = 1;
                }
                s = resources.getString(n6, new Object[] { list.get(n4).b, list.get(n5).b });
            }
            else {
                String s2;
                int n7;
                if (d != null) {
                    s2 = d.b;
                    n7 = 2131954993;
                }
                else {
                    s2 = list.get(0).b;
                    n7 = 2131954986;
                }
                s = resources.getString(n7, new Object[] { s2, list.size() - 1 });
            }
        }
        Object append = s;
        if (n != 0) {
            append = new SpannableStringBuilder((CharSequence)"  ").append((CharSequence)s);
            final Object a = eo6.a;
            final Drawable b = eo6$c.b(context, n);
            if (b != null) {
                xd9.b(b, resources.getDimensionPixelSize(2131165846), n2);
            }
            ((SpannableStringBuilder)append).setSpan((Object)new ImageSpan(b, 1), 0, 1, 18);
        }
        return (CharSequence)append;
    }
    
    public static final boolean N() {
        final boolean b0 = b0();
        boolean b2 = false;
        if (b0) {
            b2 = b2;
            if (dta.b().b("dm_inbox_search_message_results_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean O() {
        final boolean n = N();
        boolean b = false;
        if (n) {
            b = b;
            if (dta.b().b("dm_inbox_search_message_attachment_previews_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean P() {
        return dta.b().b("dm_inbox_search_modular_results_enabled", false);
    }
    
    public static float Q(final ncq ncq, ncq n) {
        final int a = n.a;
        final int b = n.b;
        int n2 = 0;
        final boolean b2 = a > b;
        if (ncq.a > ncq.b) {
            n2 = 1;
        }
        if (n2 != (b2 ? 1 : 0)) {
            n = n.n(90);
        }
        return ncq.q(n).a / (float)ncq.a;
    }
    
    public static final nca R(final Intent intent) {
        final byte[] byteArrayExtra = intent.getByteArrayExtra("arg_referring_event_namespace");
        Objects.requireNonNull(nca.Companion);
        final nca nca = (nca)tkp.a(byteArrayExtra, (alp)nca.b.b);
        if (nca != null) {
            final nca j = nca;
            if (!zzd.a((Object)nca, (Object)nca.f)) {
                return j;
            }
        }
        nca j = nca;
        if (a.d(intent)) {
            j = a.j;
        }
        return j;
    }
    
    public static final long S() {
        return dta.b().h("dm_inbox_search_debounce_ms", 200L);
    }
    
    public static final String T(int n) {
        k1b.i(n, "status");
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return "Unknown";
        }
        if (n == 1) {
            return "Pending";
        }
        if (n == 2) {
            return "Connecting";
        }
        if (n == 3) {
            return "Countdown";
        }
        if (n == 4) {
            return "Added";
        }
        if (n == 5) {
            return "Removed";
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public static final skt U(d4t d4t) {
        final int a = w4j.a;
        if (!skt.class.isInstance(d4t)) {
            d4t = null;
        }
        return (skt)d4t;
    }
    
    public static final rev V(d4t d4t) {
        final int a = w4j.a;
        if (!rev.class.isInstance(d4t)) {
            d4t = null;
        }
        return (rev)d4t;
    }
    
    public static final float W(final elo elo) {
        float a;
        if (elo != null) {
            a = elo.a;
        }
        else {
            a = 0.0f;
        }
        return a;
    }
    
    public static int X(final int n, final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return n * 37 + hashCode;
    }
    
    public static final boolean Y(final AssertionError assertionError) {
        final Logger a = fgj.a;
        final Throwable cause = assertionError.getCause();
        boolean b = false;
        if (cause != null) {
            final String message = assertionError.getMessage();
            final boolean b2 = message != null && gkr.o1((CharSequence)message, (CharSequence)"getsockname failed", false);
            b = b;
            if (b2) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean Z() {
        return dta.b().b("view_counts_everywhere_api_enabled", false);
    }
    
    public static final boolean a0() {
        return dta.b().b("view_counts_author_visibility_enabled", false);
    }
    
    public static final boolean b0() {
        return dta.b().b("direct_messages_incremental_holdback_2022h1", false);
    }
    
    public static final boolean c0() {
        return dta.d().b("responsive_web_delegate_enabled", false);
    }
    
    public static boolean d0(final String s) {
        return s.equals("on");
    }
    
    public static boolean e0() {
        return dta.b().b("home_timeline_engagement_nudge_enabled", false);
    }
    
    public static final boolean f0() {
        final giw a = ncw.d().A();
        zzd.e((Object)a, "getCurrent().userSettings");
        final boolean b = a.b();
        final boolean a2 = a.a();
        return b && a2;
    }
    
    public static final boolean g0() {
        return dta.b().b("dm_conversations_nsfw_media_filter_enabled", false);
    }
    
    public static final boolean h0() {
        return dta.b().b("view_counts_public_visibility_enabled", false);
    }
    
    public static final boolean i0() {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("dm_inbox_search_server_enabled", false)) {
            b2 = b2;
            if (dta.b().b("dm_inbox_search_quick_share_server_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean j0() {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("dm_share_sheet_send_individually_enabled", false)) {
            b2 = b2;
            if (b0()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean k0(final izq izq) {
        return ((v0k)izq).Q() || ((v0k)izq).P();
    }
    
    public static boolean l0(final CharSequence charSequence, final kju kju) {
        final int length = charSequence.length();
        boolean b2;
        final boolean b = b2 = false;
        if (length != 0) {
            if (!jgw.y(charSequence)) {
                b2 = b;
            }
            else {
                final kju h = kju.h;
                kju kju2;
                if ((kju2 = kju) == null) {
                    kju2 = h;
                }
                int d = kju.d(charSequence, kju2);
                int n;
                int n2;
                int n3;
                int n4;
                int n5;
                for (n = (int)Math.ceil(d * 0.3f), n2 = 0, n3 = 0; n2 < length && n3 < n; ++n2, n3 = n4, d = n5) {
                    final char char1 = charSequence.charAt(n2);
                    if (jgw.S(char1)) {
                        n4 = n3 + 1;
                        n5 = d;
                    }
                    else {
                        n4 = n3;
                        n5 = d;
                        if (Character.getType(char1) == 16) {
                            n5 = d - 1;
                            n = (int)Math.ceil(n5 * 0.3f);
                            n4 = n3;
                        }
                    }
                }
                b2 = b;
                if (n3 >= n) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final boolean m0() {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("dm_vdl_enabled", false)) {
            b2 = b2;
            if (dta.b().b("dm_vdl_chat_p0_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static txh o() {
        return (txh)new uxh(false);
    }
    
    public static final boolean o0() {
        final hlv b = dta.b();
        boolean b2 = false;
        if (b.b("dm_vdl_enabled", false)) {
            b2 = b2;
            if (dta.b().b("dm_vdl_inbox_p0_enabled", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final int p(final List list, final gub gub, final gub gub2, int n, int n2, int i, int j) {
        final int n3 = 1;
        final int n4 = 0;
        if (i == j) {
            final int size = list.size();
            i = 0;
            j = 0;
            float n5 = 0.0f;
            int n6 = 0;
            while (i < size) {
                final ezd ezd = list.get(i);
                final float w = W(H(ezd));
                final int intValue = ((Number)gub.invoke((Object)ezd, (Object)n)).intValue();
                int n7;
                float n8;
                int max;
                if (w == 0.0f) {
                    n7 = n6 + intValue;
                    n8 = n5;
                    max = j;
                }
                else {
                    n8 = n5;
                    n7 = n6;
                    max = j;
                    if (w > 0.0f) {
                        n8 = n5 + w;
                        max = Math.max(j, q0b.p(intValue / w));
                        n7 = n6;
                    }
                }
                ++i;
                n5 = n8;
                n6 = n7;
                j = max;
            }
            n = q0b.p(j * n5);
            n = (list.size() - 1) * n2 + (n + n6);
        }
        else {
            i = Math.min((list.size() - 1) * n2, n);
            final int size2 = list.size();
            j = 0;
            float n9 = 0.0f;
            n2 = 0;
            while (j < size2) {
                final ezd ezd2 = list.get(j);
                final float w2 = W(H(ezd2));
                int n10;
                int max2;
                float n11;
                if (w2 == 0.0f) {
                    final int min = Math.min(((Number)gub2.invoke((Object)ezd2, (Object)Integer.MAX_VALUE)).intValue(), n - i);
                    n10 = i + min;
                    max2 = Math.max(n2, ((Number)gub.invoke((Object)ezd2, (Object)min)).intValue());
                    n11 = n9;
                }
                else {
                    n11 = n9;
                    max2 = n2;
                    n10 = i;
                    if (w2 > 0.0f) {
                        n11 = n9 + w2;
                        n10 = i;
                        max2 = n2;
                    }
                }
                ++j;
                n9 = n11;
                n2 = max2;
                i = n10;
            }
            if (n9 == 0.0f) {
                j = n3;
            }
            else {
                j = 0;
            }
            if (j != 0) {
                n = 0;
            }
            else if (n == Integer.MAX_VALUE) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = q0b.p(Math.max(n - i, 0) / n9);
            }
            int size3;
            ezd ezd3;
            float w3;
            for (size3 = list.size(), i = n4; i < size3; ++i, n2 = j) {
                ezd3 = list.get(i);
                w3 = W(H(ezd3));
                j = n2;
                if (w3 > 0.0f) {
                    if (n != Integer.MAX_VALUE) {
                        j = q0b.p(n * w3);
                    }
                    else {
                        j = Integer.MAX_VALUE;
                    }
                    j = Math.max(n2, ((Number)gub.invoke((Object)ezd3, (Object)j)).intValue());
                }
            }
            n = n2;
        }
        return n;
    }
    
    public static final boolean p0() {
        return dta.b().b("dm_voice_creation_enabled", false);
    }
    
    public static final int q0() {
        return dta.b().f("dm_max_group_size", 20);
    }
    
    public static final int r(final qgk qgk, int n) {
        if (n == 1) {
            n = qgk.C0;
        }
        else {
            n = qgk.D0;
        }
        return n;
    }
    
    public static void r0(final MediaFormat mediaFormat, final tr4 tr4) {
        if (tr4 != null) {
            s0(mediaFormat, "color-transfer", tr4.E0);
            s0(mediaFormat, "color-standard", tr4.C0);
            s0(mediaFormat, "color-range", tr4.D0);
            final byte[] f0 = tr4.F0;
            if (f0 != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(f0));
            }
        }
    }
    
    public static final lcq s(final File file) throws FileNotFoundException {
        final Logger a = fgj.a;
        zzd.f((Object)file, "<this>");
        return (lcq)new rpj((OutputStream)new FileOutputStream(file, true), new c9t());
    }
    
    public static void s0(final MediaFormat mediaFormat, final String s, final int n) {
        if (n != -1) {
            mediaFormat.setInteger(s, n);
        }
    }
    
    public static final kr2 t(final lcq lcq) {
        zzd.f((Object)lcq, "<this>");
        return (kr2)new w1m(lcq);
    }
    
    public static void t0(final MediaFormat mediaFormat, final String s, final String s2) {
        if (s2 != null) {
            mediaFormat.setString(s, s2);
        }
    }
    
    public static final mr2 u(final zkq zkq) {
        zzd.f((Object)zkq, "<this>");
        return (mr2)new x1m(zkq);
    }
    
    public static boolean u0(final koa koa, final byte[] array, final int n, final boolean b) throws IOException {
        try {
            return koa.c(array, 0, n, b);
        }
        catch (final EOFException ex) {
            if (b) {
                return false;
            }
            throw ex;
        }
    }
    
    public static String v(final int n, final int n2, final int n3) {
        return String.format("avc1.%02X%02X%02X", n, n2, n3);
    }
    
    public static String w(int length, final boolean b, int i, final int n, final int[] array, final int n2) {
        final String s = poa.D0[length];
        char c;
        if (b) {
            length = (c = 'H');
        }
        else {
            length = (c = 'L');
        }
        final StringBuilder sb = new StringBuilder(imw.m("hvc1.%s%d.%X.%c%d", new Object[] { s, i, n, c, n2 }));
        for (length = array.length; length > 0 && array[length - 1] == 0; --length) {}
        for (i = 0; i < length; ++i) {
            sb.append(String.format(".%02X", array[i]));
        }
        return sb.toString();
    }
    
    public static jeu w0(final jeu jeu) {
        if (!jeu.H0.h()) {
            return jeu;
        }
        final StringBuilder sb = new StringBuilder(((xwm)jeu).C0);
        final Map d = wxm.d(((xwm)jeu).D0);
        final SparseArray sparseArray = new SparseArray();
        final Iterator iterator = ((n5e)jeu.H0.b()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final w5w w5w = iterator.next();
            final int c = ((xwm)jeu).c((xes)w5w);
            final euh euh = (euh)sparseArray.get(c);
            if (euh != null) {
                final euh euh2 = d.get(w5w);
                euh2.a = euh.a;
                euh2.b = euh.b;
                sparseArray.put(c, (Object)euh2);
            }
            else {
                final int a = c - n;
                final int n2 = ((xwm)jeu).a((xes)w5w) - n;
                int n3 = 0;
                int n4 = 0;
                Label_0309: {
                    if (a >= 0 && n2 <= sb.length()) {
                        final String j0 = w5w.J0;
                        if (!TextUtils.isEmpty((CharSequence)j0)) {
                            sb.replace(a, n2, j0);
                            final int b = j0.length() + a;
                            n3 = n2 - b;
                            n4 = n + n3;
                            final euh euh3 = d.get(w5w);
                            euh3.a = a;
                            euh3.b = b;
                            sparseArray.put(((xwm)jeu).c((xes)w5w), (Object)euh3);
                            break Label_0309;
                        }
                    }
                    else {
                        ((euh)d.get(w5w)).a = -1;
                        ((euh)d.get(w5w)).b = -1;
                    }
                    n3 = 0;
                    n4 = n;
                }
                final Iterator iterator2 = d.keySet().iterator();
                while (true) {
                    n = n4;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final d7a d7a = (d7a)iterator2.next();
                    final euh euh4 = d.get(w5w);
                    final euh euh5 = d.get(d7a);
                    if (d7a instanceof w5w) {
                        continue;
                    }
                    final int a2 = euh4.a;
                    if (a2 < 0) {
                        continue;
                    }
                    final int a3 = euh5.a;
                    if (a2 >= a3) {
                        continue;
                    }
                    euh5.a = a3 - n3;
                    euh5.b -= n3;
                }
            }
        }
        final Map a4 = tth.a(0);
        for (final d7a d7a2 : ((xwm)jeu).D0.keySet()) {
            final euh euh6 = d.get(d7a2);
            ((HashMap<d7a, Object>)a4).put(d7a2, new ewl(euh6.a, euh6.b));
        }
        return new jeu(sb.toString(), jeu.H0, ged.c(a4));
    }
    
    public static final boolean x(final llq llq) {
        zzd.f((Object)llq, "<this>");
        return llq != llq.E0;
    }
    
    public static String x0(final StringBuilder sb, final kju kju) {
        if (kju == null) {
            return sb.toString();
        }
        if (!kju.h()) {
            return sb.toString();
        }
        final SparseArray sparseArray = new SparseArray();
        int n = 0;
        final Iterator iterator = ((n5e)kju.b()).iterator();
        while (((p5e)iterator).hasNext()) {
            final w5w w5w = (w5w)((bgz)iterator).next();
            final int d0 = ((d7a)w5w).D0;
            if (sparseArray.get(d0) != null) {
                continue;
            }
            sparseArray.put(d0, (Object)w5w);
            final int n2 = d0 - n;
            final int n3 = ((d7a)w5w).E0 - n;
            if (n2 < 0 || n3 > sb.length()) {
                continue;
            }
            final String j0 = w5w.J0;
            if (TextUtils.isEmpty((CharSequence)j0)) {
                continue;
            }
            sb.replace(n2, n3, j0);
            n += n3 - (j0.length() + n2);
        }
        return sb.toString();
    }
    
    @Pure
    public static void y(final boolean b, final String s) throws ParserException {
        if (b) {
            return;
        }
        throw ParserException.a(s, (Throwable)null);
    }
    
    public static final gqg y0(final int n, final nub nub, final float n2, final k77 k77) {
        k1b.i(n, "orientation");
        zzd.f((Object)nub, "arrangement");
        k1b.i(1, "crossAxisSize");
        return (gqg)new dlo(n, n2, nub, k77);
    }
    
    public static final int z(final int n) {
        if (n != 0) {
            if (n == 1) {
                return 2;
            }
            if (n != 2) {
                if (n != 4 && n != 9) {
                    if (n != 10) {
                        switch (n) {
                            default: {
                                return 1;
                            }
                            case 15: {
                                return 4;
                            }
                            case 16:
                            case 17: {
                                break;
                            }
                        }
                    }
                    return 5;
                }
                return 3;
            }
        }
        return 1;
    }
    
    public static void z0(final UserImageView userImageView, final l8w l8w) {
        if (l8w.a) {
            userImageView.setShape((hrp)new wko());
        }
        else {
            userImageView.setShape((hrp)rp2.D0);
        }
    }
    
    public void G(final arp arp, final float n, final float n2) {
        throw null;
    }
    
    public Object a() {
        final azy c = fzy.c;
        return fsz.D0.b().B();
    }
    
    public void c() {
    }
    
    public void g(final MotionEvent motionEvent) {
        zzd.f((Object)motionEvent, "e");
    }
    
    public void i() {
    }
    
    public Object k(final Parcel parcel) {
        final int int1 = parcel.readInt();
        Object o;
        if (int1 == -1) {
            o = null;
        }
        else {
            final char[] array = new char[int1];
            parcel.readCharArray(array);
            o = array;
        }
        return o;
    }
    
    public zrl$a l(final Object o) {
        final long longValue = ((Number)o).longValue();
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).t("lists_ev_id=?", new Object[] { longValue });
        ((jp1$a)zrl$a).q("1");
        return zrl$a;
    }
    
    public void n(final Object o, final Parcel parcel) {
        final char[] array = (char[])o;
        if (array == null) {
            parcel.writeInt(-1);
        }
        else {
            parcel.writeInt(array.length);
            parcel.writeCharArray(array);
        }
    }
    
    public Object n0(final o16 o16) {
        return new ddm$a(((rrm)o16).I((Class)c6z.class));
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        zzd.f((Object)motionEvent, "e1");
        zzd.f((Object)motionEvent2, "e2");
        return false;
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
    
    public void v0(final long n) {
        final lnr.a companion = lnr.Companion;
        final kba a = kba.a;
        lnr.a.a(companion, kba.h, n, cor.Companion.a(), null, null, null, null, null, null, null, null, 1048568);
    }
}
