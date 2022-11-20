import android.app.Activity;
import android.view.View;
import java.util.regex.Pattern;
import android.content.pm.Signature;
import android.content.ComponentName;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Iterator;
import java.io.File;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.NoSuchElementException;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import android.view.accessibility.CaptioningManager$CaptioningChangeListener;
import android.view.View$OnClickListener;
import java.io.Closeable;
import java.util.Objects;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qbk implements oj
{
    public final int D0;
    public final Object E0;
    
    public qbk(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void run() {
        final int d0 = this.D0;
        final String s = "";
        final Object o = null;
        switch (d0) {
            default: {
                final WeakReference weakReference = (WeakReference)this.E0;
                final fl7$a companion = fl7.Companion;
                czd.f((Object)weakReference, "$conversationHandlerRef");
                final xr6 xr6 = (xr6)weakReference.get();
                if (xr6 != null) {
                    xr6.a();
                }
                return;
            }
            case 28: {
                final zln zln = (zln)this.E0;
                czd.f((Object)zln, "this$0");
                zln.f.g();
                return;
            }
            case 27: {
                final ran ran = (ran)this.E0;
                czd.f((Object)ran, "this$0");
                final iuc e = ran.E;
                if (e != null) {
                    e.b();
                }
                return;
            }
            case 26: {
                final m3k m3k = (m3k)this.E0;
                Objects.requireNonNull(m3k);
                h1e.a((Closeable)m3k);
                return;
            }
            case 25: {
                final l6j l6j = (l6j)this.E0;
                czd.f((Object)l6j, "this$0");
                h1e.Companion.b((Closeable)l6j);
                return;
            }
            case 24: {
                final vst vst = (vst)this.E0;
                czd.f((Object)vst, "this$0");
                vst.e.a();
                return;
            }
            case 23: {
                final jb2 jb2 = (jb2)this.E0;
                czd.f((Object)jb2, "$viewHolder");
                ((View)jb2.G0).setOnClickListener((View$OnClickListener)null);
                return;
            }
            case 22: {
                final hwi hwi = (hwi)this.E0;
                czd.f((Object)hwi, "this$0");
                hwi.g.dispose();
                return;
            }
            case 21: {
                final ep6 ep6 = (ep6)this.E0;
                final ep6$a companion2 = ep6.Companion;
                czd.f((Object)ep6, "this$0");
                ep6.m.dispose();
                return;
            }
            case 20: {
                final pw9 pw9 = (pw9)this.E0;
                if (pw9.U0) {
                    ((jvg)pw9.D0).a.delete();
                }
                final File o2 = pw9.O0;
                final i6d s2 = pw9.S0;
                if (o2 != null) {
                    o2.delete();
                }
                if (s2 != null) {
                    ((jvg)s2).a.delete();
                }
                return;
            }
            case 19: {
                final z2k z2k = (z2k)this.E0;
                czd.f((Object)z2k, "this$0");
                z2k.a.removeCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)z2k.e);
                z2k.c.onComplete();
                z2k.d.onComplete();
                return;
            }
            case 18: {
                final axf axf = (axf)this.E0;
                czd.f((Object)axf, "this$0");
                final zyf b = axf.b;
                b.a.onComplete();
                b.c.a();
                return;
            }
            case 17: {
                final kw1 kw1 = (kw1)this.E0;
                czd.f((Object)kw1, "this$0");
                kw1.e.f((jgd)null);
                kw1.e.d((UserIdentifier)null);
                kw1.f.c();
                kw1.j.dispose();
                return;
            }
            case 16: {
                final i83 i83 = (i83)this.E0;
                final i83$e companion3 = i83.Companion;
                czd.f((Object)i83, "this$0");
                i83.e.dispose();
                return;
            }
            case 15: {
                final jad jad = (jad)this.E0;
                czd.f((Object)jad, "this$0");
                final hcd h1 = jad.H1;
                for (final Map.Entry<Object, V> entry : h1.b.entrySet()) {
                    h1.c.e(entry.getKey(), (Object)entry.getValue());
                }
                h1.b.clear();
                jad.J1.dispose();
                jad.F1.a.set(null);
                return;
            }
            case 14: {
                final f9d f9d = (f9d)this.E0;
                czd.f((Object)f9d, "this$0");
                ((xkp)f9d.E0.getValue()).dispose();
                ((xkp)f9d.F0.getValue()).dispose();
                return;
            }
            case 13: {
                final aja aja = (aja)this.E0;
                czd.f((Object)aja, "this$0");
                if (aja.D1) {
                    final r9d c1 = aja.C1;
                    c1.b(r9d.a(c1, (String)null, (String)null, (String)null, "impression", 15), (Long)null);
                    aja.E1 = false;
                }
                return;
            }
            case 12: {
                final ok1 ok1 = (ok1)this.E0;
                final AtomicLong p0 = ok1.P0;
                ok1.k(false);
                return;
            }
            case 11: {
                ((yhm)this.E0).I0.a();
                return;
            }
            case 10: {
                final gf5 gf5 = (gf5)this.E0;
                czd.f((Object)gf5, "this$0");
                gf5.c((Throwable)new NoSuchElementException("Creating Community shortcut"));
                return;
            }
            case 9: {
                final eal eal = (eal)this.E0;
                czd.f((Object)eal, "this$0");
                eal.E0.e();
                return;
            }
            case 8: {
                final xn9 xn9 = (xn9)this.E0;
                czd.f((Object)xn9, "this$0");
                xn9.a.q().subscribe((lj6)new tg((qsb)new xn9$a(xn9), 13));
                xn9.a.p().subscribe((lj6)new ri4((qsb)new xn9$b(xn9), 9));
                return;
            }
            case 7: {
                final b28 b2 = (b28)this.E0;
                final b28.d companion4 = b28.Companion;
                czd.f((Object)b2, "this$0");
                b2.g.dispose();
                return;
            }
            case 6: {
                final flj flj = (flj)this.E0;
                flj.d.dispose();
                final coa c2 = flj.c;
                if (c2 != null) {
                    c2.run();
                }
                return;
            }
            case 5: {
                final b51 b3 = (b51)this.E0;
                Objects.requireNonNull(b3);
                cj1.e();
                final tqc$a tqc$a = new tqc$a();
                tqc$a.n("/oauth/request_token", "/");
                final int a = c5j.a;
                tqc$a.d("x_auth_mode", "reverse_auth");
                tqc$a.d("x_sso_version", "1");
                tqc$a.d("x_sso_source", "twitter_for_android");
                if (b3.i) {
                    tqc$a.d("return_json", "true");
                    tqc$a.d("oauth_permission_policy", "true");
                }
                final ComponentName d2 = b3.d;
                if (d2 != null) {
                    final String packageName = d2.getPackageName();
                    String c3 = null;
                    Label_1144: {
                        try {
                            final Signature[] signatures = b3.c.getPackageInfo(packageName, 64).signatures;
                            if (signatures != null) {
                                if (signatures.length != 0) {
                                    final byte[] d3 = lk1.d(signatures[0].toByteArray());
                                    if (d3 != null) {
                                        c3 = oi1.c(d3);
                                        break Label_1144;
                                    }
                                }
                            }
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            m8a.d((Throwable)ex);
                        }
                        c3 = null;
                    }
                    tqc$a.d("app_id", packageName);
                    if (c3 == null) {
                        c3 = s;
                    }
                    tqc$a.d("app_signature", c3);
                }
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                final jh8 j = new jh8((OutputStream)byteArrayOutputStream);
                final brc f = brc.f(UserIdentifier.getCurrent());
                ((gm1)f).d((CharSequence)tqc$a.k().a(lcv.a()));
                ((gm1)f).h = arc$b.G0;
                final int a2 = c5j.a;
                ((gm1)f).q = (mrc)new oms((i3j)new xev(b3.a, b3.b));
                ((gm1)f).j = (lrc)j;
                final arc e2 = f.e();
                e2.d();
                Object o3 = o;
                if (e2.z()) {
                    if (b3.i) {
                        o3 = gih.e(new String(byteArrayOutputStream.toByteArray()), (Class)l3j.class, false);
                    }
                    else {
                        final String a3 = new String(byteArrayOutputStream.toByteArray());
                        final Pattern b4 = evm.b;
                        final l3j$a l3j$a = new l3j$a();
                        l3j$a.a = a3;
                        final evm evm = new evm(a3);
                        while (evm.a.find()) {
                            final String group = evm.a.group(1);
                            Objects.requireNonNull(group);
                            int n = 0;
                            Label_1700: {
                                switch (group) {
                                    case "oauth_app_description": {
                                        n = 10;
                                        break Label_1700;
                                    }
                                    case "oauth_terms_and_conditions_url": {
                                        n = 9;
                                        break Label_1700;
                                    }
                                    case "oauth_allow_dm_read": {
                                        n = 8;
                                        break Label_1700;
                                    }
                                    case "oauth_allow_ads_campaign_management": {
                                        n = 7;
                                        break Label_1700;
                                    }
                                    case "oauth_image_url": {
                                        n = 6;
                                        break Label_1700;
                                    }
                                    case "oauth_privacy_policy_url": {
                                        n = 5;
                                        break Label_1700;
                                    }
                                    case "oauth_allow_write": {
                                        n = 4;
                                        break Label_1700;
                                    }
                                    case "oauth_allow_email": {
                                        n = 3;
                                        break Label_1700;
                                    }
                                    case "oauth_app_name": {
                                        n = 2;
                                        break Label_1700;
                                    }
                                    case "oauth_app_url": {
                                        n = 1;
                                        break Label_1700;
                                    }
                                    case "oauth_allow_ads_analytics": {
                                        n = 0;
                                        break Label_1700;
                                    }
                                    default:
                                        break;
                                }
                                n = -1;
                            }
                            switch (n) {
                                default: {
                                    continue;
                                }
                                case 10: {
                                    l3j$a.d = evm.a();
                                    continue;
                                }
                                case 9: {
                                    l3j$a.g = evm.a();
                                    continue;
                                }
                                case 8: {
                                    l3j$a.k = Boolean.parseBoolean(evm.a());
                                    continue;
                                }
                                case 7: {
                                    l3j$a.l = Boolean.parseBoolean(evm.a());
                                    continue;
                                }
                                case 6: {
                                    l3j$a.e = evm.a();
                                    continue;
                                }
                                case 5: {
                                    l3j$a.f = evm.a();
                                    continue;
                                }
                                case 4: {
                                    l3j$a.j = Boolean.parseBoolean(evm.a());
                                    continue;
                                }
                                case 3: {
                                    l3j$a.i = Boolean.parseBoolean(evm.a());
                                    continue;
                                }
                                case 2: {
                                    l3j$a.b = evm.a();
                                    continue;
                                }
                                case 1: {
                                    l3j$a.c = evm.a();
                                    continue;
                                }
                                case 0: {
                                    l3j$a.m = Boolean.parseBoolean(evm.a());
                                    continue;
                                }
                            }
                        }
                        o3 = ((n4j)l3j$a).e();
                    }
                }
                b3.e = (ynj<l3j>)ynj.b(o3);
                return;
            }
            case 4: {
                Objects.requireNonNull(this.E0);
                return;
            }
            case 3: {
                final gvf gvf = (gvf)this.E0;
                final axf i84 = gvf.i1;
                final pvf a4 = i84.a;
                a4.i.onComplete();
                a4.j.e();
                i84.c.a();
                gvf.g1.e();
                gvf.h1.a();
                if (((Activity)gvf.a1).isFinishing()) {
                    rw0.c((oj)gvf.b1);
                }
                return;
            }
            case 2: {
                final bqf bqf = (bqf)this.E0;
                czd.f((Object)bqf, "this$0");
                ec0.g(bqf.D0.E0.g(), 2000);
                return;
            }
            case 1: {
                final k00 k00 = (k00)this.E0;
                Objects.requireNonNull(k00);
                cj1.i((dpo)new j00((Object)k00, 0));
                return;
            }
            case 0: {
                final int b5 = ((rbk)this.E0).a.a().b;
                String s3;
                if (b5 != 0) {
                    if (b5 != 1) {
                        s3 = "";
                    }
                    else {
                        s3 = "source_google_contact";
                    }
                }
                else {
                    s3 = "source_telephonymanager";
                }
                String s4;
                if (s3.isEmpty()) {
                    s4 = "unavailable";
                }
                else {
                    s4 = "available";
                }
                final af4 af4 = new af4();
                ((u0p)af4).s = 2;
                final int a5 = c5j.a;
                ((u0p)af4).q(new String[] { "app", "", "phone_number", s3, s4 });
                cbw.b((elm)af4);
            }
        }
    }
}
