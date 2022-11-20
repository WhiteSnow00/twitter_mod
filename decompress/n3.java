import com.twitter.app.safety.mutedkeywords.composer.b;
import android.widget.CompoundButton;
import java.util.List;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.net.Uri;
import com.twitter.app.safety.mutedkeywords.composer.CheckboxListChoiceView;
import java.util.Iterator;
import android.content.Intent;
import com.twitter.android.login.LoginContentViewProvider;
import com.twitter.navigation.media.ProfilePhotoEditImageSuccess;
import com.twitter.android.qrcodes.QRCodeContentViewProvider;
import com.twitter.android.settings.country.CountryListContentViewProvider;
import com.twitter.profiles.editbirthdate.UpdateBirthdateContentViewResult;
import com.twitter.profiles.editbirthdate.EditBirthdateContentViewResult;
import com.twitter.app.safety.mutedkeywords.composer.a;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.os.Handler;
import android.os.Looper;
import com.twitter.app.safety.mutedkeywords.composer.c;
import com.twitter.app.users.UsersContentViewProvider;
import com.twitter.onboarding.ocf.OcfContentViewResult;
import com.twitter.permissions.PermissionContentViewResult;
import androidx.work.c$a$a;
import java.util.Collection;
import com.twitter.onboarding.ocf.media.SelectAvatarSubtaskViewProvider;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.e;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.f;
import com.twitter.ui.view.GroupedRowView;
import com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist.UserRecommendationsListViewHost;
import android.database.ContentObserver;
import android.provider.MediaStore$Images$Media;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3 implements n93
{
    public final int a;
    public final Object b;
    
    public n3(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(Object o) {
        final int a = this.a;
        final zdj zdj = null;
        switch (a) {
            default: {
                final qmi qmi = (qmi)this.b;
                final Exception ex = (Exception)o;
                czd.f((Object)qmi, "this$0");
                if (ex != null) {
                    ((qpg)qmi.D0).onError((Throwable)ex);
                }
                return;
            }
            case 25: {
                final AtomicReference atomicReference = (AtomicReference)this.b;
                final Exception ex2 = (Exception)o;
                jee.l((Object)ex2);
                atomicReference.set(ex2);
                return;
            }
            case 24: {
                final wyo wyo = (wyo)this.b;
                final Boolean b = (Boolean)o;
                final String h = wyo.h;
                Objects.requireNonNull(wyo);
                if (b) {
                    wyo.c.getContentResolver().registerContentObserver(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, true, (ContentObserver)wyo.b);
                }
                else {
                    wyo.c.getContentResolver().unregisterContentObserver((ContentObserver)wyo.b);
                }
                return;
            }
            case 23: {
                final UserRecommendationsListViewHost userRecommendationsListViewHost = (UserRecommendationsListViewHost)this.b;
                final b3e$b b3e$b = (b3e$b)o;
                Objects.requireNonNull(userRecommendationsListViewHost);
                if (b3e$b.b.getHeldView() instanceof GroupedRowView) {
                    ((GroupedRowView)b3e$b.b.getHeldView()).setStyle(((f)b3e$b.c).a);
                }
                final Object c = b3e$b.c;
                if (c instanceof e) {
                    final e e = (e)c;
                    userRecommendationsListViewHost.W0.e(b3e$b.b.getHeldView(), (Object)e);
                    userRecommendationsListViewHost.M0.add(e.b.a.D0);
                }
                return;
            }
            case 22: {
                final SelectAvatarSubtaskViewProvider selectAvatarSubtaskViewProvider = (SelectAvatarSubtaskViewProvider)this.b;
                final ynj ynj = (ynj)o;
                final String[] t0 = SelectAvatarSubtaskViewProvider.T0;
                Objects.requireNonNull(selectAvatarSubtaskViewProvider);
                if (!ynj.e()) {
                    selectAvatarSubtaskViewProvider.b(((jw9)ynj.c()).D0);
                    return;
                }
                throw new IllegalStateException("Expected extra ${CameraActivityArgs.EXTRA_EDITABLE_MEDIA} not found");
            }
            case 21: {
                final c5s c5s = (c5s)this.b;
                final h1c h1c = (h1c)o;
                czd.f((Object)c5s, "this$0");
                czd.c((Object)h1c);
                if (c5s.g == h1c) {
                    if (((wv0)h1c).O()) {
                        final xrc t2 = ((orc)h1c).T();
                        czd.e((Object)t2, "request.result");
                        if (t2.b) {
                            final Object g = t2.g;
                            if (g != null) {
                                c5s.f = (Collection)g;
                            }
                        }
                        if (!c5s.f.isEmpty()) {
                            rw0.c((oj)new coa((Object)c5s, (Object)h1c, 7));
                        }
                        c5s.g = null;
                    }
                }
                return;
            }
            case 20: {
                final ibq ibq = (ibq)this.b;
                final Void void1 = (Void)o;
                czd.f((Object)ibq, "$emitter");
                s9g.k("MediaRepo:MetadataWorker", "Metadata upload cancelled");
                ((paq$a)ibq).b((Object)new c$a$a());
                return;
            }
            case 19: {
                final j2c j2c = (j2c)this.b;
                final bo bo = (bo)o;
                Objects.requireNonNull(j2c);
                if (bo.b == -1) {
                    final Intent c2 = bo.c;
                    if (c2 != null) {
                        ((Activity)((u9)j2c).E0).setResult(-1, c2);
                        ((Activity)((u9)j2c).E0).finish();
                        return;
                    }
                }
                j2c.i1(false);
                return;
            }
            case 18: {
                final xpb xpb = (xpb)this.b;
                final u3u u3u = (u3u)o;
                Objects.requireNonNull(xpb);
                final int a2 = u3u.a;
                e4h e4h;
                if (a2 != 20 && a2 != 40) {
                    if (a2 != 60 && a2 != 80) {
                        e4h = e4h.E0;
                    }
                    else {
                        e4h = e4h.F0;
                    }
                }
                else {
                    e4h = e4h.G0;
                }
                synchronized (xpb.D0) {
                    final Iterator iterator = xpb.D0.iterator();
                    while (iterator.hasNext()) {
                        ((f4h)iterator.next()).f(e4h);
                    }
                }
            }
            case 17: {
                final qak qak = (qak)this.b;
                final PermissionContentViewResult permissionContentViewResult = (PermissionContentViewResult)o;
                qak.T1();
                return;
            }
            case 16: {
                final w86 w86 = (w86)this.b;
                final kzw kzw = (kzw)o;
                final int h2 = w86.h2;
                Objects.requireNonNull(w86);
                if (kzw.a != null) {
                    w86.k2(w86.g2, new vqg(new r89((jw9)kzw.a)), false, (lw9)null);
                }
                return;
            }
            case 15: {
                final nsb nsb = (nsb)this.b;
                final OcfContentViewResult ocfContentViewResult = (OcfContentViewResult)o;
                czd.f((Object)nsb, "$action");
                nsb.invoke();
                return;
            }
            case 14: {
                final UsersContentViewProvider usersContentViewProvider = (UsersContentViewProvider)this.b;
                final tmi tmi = (tmi)o;
                if (usersContentViewProvider.A1.equalsIgnoreCase("spheres_create_members_summary")) {
                    ffz.o0(kaa.c);
                }
                return;
            }
            case 13: {
                final c n2 = (c)this.b;
                final tmi tmi2 = (tmi)o;
                if (n2.b1.f()) {
                    n2.f1 = 2;
                }
                else {
                    n2.f1 = 1;
                }
                final klb z0 = new klb();
                n2.Z0 = z0;
                z0.e = (klb.g)n2;
                final int f1 = n2.f1;
                if (f1 == 1) {
                    final sl8 sl8 = new sl8(new ebv(n2.Y0.b), new Handler(Looper.getMainLooper()));
                    final ycs ycs = new ycs();
                    final mcg mcg = new mcg((Object)sds.a());
                    final klb z2 = n2.Z0;
                    z2.b(n2.Y0.b, (hlb)mcg, 2131958086);
                    z2.b(n2.Y0.b, (hlb)c.g1, 2131955263);
                    z2.a((klb.c)sl8, (hlb)c.h1, 2131955280);
                    n2.Z0.a((klb.c)sl8, (hlb)c.i1, 2131955262);
                    n2.Z0.b(n2.Y0.b, (hlb)ycs, 0);
                    n2.Z0.d = (klb.b)new b5w((Object)n2);
                    final String z3 = v68.z(((gml$a$b)((u9)n2).c()).E0.getResources().getConfiguration().locale);
                    final nxh a3 = n2.b1.a;
                    final fbq fbq = new fbq((lcq)a3.E0.R((Object)z3), (lj6)new exw((Object)a3, (Object)z3, 2));
                    final eaq value = a3.F0.get((Object)String.valueOf(z3.hashCode()));
                    final soo v0 = soo.V0;
                    Objects.requireNonNull(value);
                    n2.e1.a(((kog)new hpg((ppg)new yog((lcq)value, (ytk)v0), (psb)cjc.F0)).s().concatWith((lcq)fbq).firstOrError().G((lj6)new z0p((Object)n2, 19), (lj6)jub.e));
                    ((TextView)n2.Y0.b).setText((CharSequence)n2.b1.c.c);
                }
                else if (f1 == 2) {
                    n2.Y0.j.setVisibility(0);
                    n2.Y0.k.setVisibility(0);
                    n2.Y0.k.setOnClickListener((View$OnClickListener)new ji2((Object)n2, 13));
                    n2.Y0.l.setText((CharSequence)n2.b1.c.c);
                    ((View)n2.Y0.l).setVisibility(0);
                    ((View)n2.Y0.b).setVisibility(8);
                    ((View)n2.Y0.c).setVisibility(8);
                }
                final klb z4 = n2.Z0;
                o = n2.new c();
                ((List<Object>)z4.a).add(o);
                ((List<c.b>)n2.Z0.a).add(n2.new b());
                final CheckboxListChoiceView.a z5 = n2.Z4();
                final CheckboxListChoiceView i = n2.Y0.i;
                i.G0 = z5;
                i.setCurrentEntryValue(z5.H0);
                ((View)i).setOnClickListener((View$OnClickListener)new j1p((Object)n2, 5));
                ((CompoundButton)n2.Y0.e).setChecked(n2.b1.c.f.contains(tvh.G0));
                ((CompoundButton)n2.Y0.e).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new rwh((Object)n2, 0));
                n2.Y0.d.setOnClickListener((View$OnClickListener)new esk((Object)n2, 11));
                n2.Y0.g.setChecked(n2.b1.c.f.contains(tvh.F0));
                n2.Y0.g.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new z9((Object)n2, 1));
                n2.Y0.f.setOnClickListener((View$OnClickListener)new epf((Object)n2, 9));
                if (n2.b1.c.g.isEmpty()) {
                    n2.Y0.h.check(2131430179);
                }
                else {
                    n2.Y0.h.check(2131430180);
                }
                if (!n2.Y0.g.isChecked()) {
                    ((View)n2.Y0.h).setVisibility(8);
                }
                n2.Y0.h.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)new swh(n2));
                final j0w j0w = (j0w)n2.X0.H("unmute_confirm_dialog");
                if (j0w != null) {
                    j0w.n2 = (j0w.j0w$a)n2;
                }
                final com.twitter.app.safety.mutedkeywords.composer.e e2 = (com.twitter.app.safety.mutedkeywords.composer.e)n2.X0.H("confirm_dialog");
                if (e2 != null) {
                    e2.n2 = (com.twitter.app.safety.mutedkeywords.composer.e.a)n2;
                }
                final a a4 = (a)n2.X0.H("key_choices_fragment");
                if (a4 != null) {
                    a4.q2 = (b.a)new y4w((Object)n2, (Object)a4, 5);
                }
                if (n2.b1.e == 1) {
                    n2.e5(n2.Y0.i, n2.Z4());
                }
                n2.W4();
                return;
            }
            case 12: {
                final jn jn = (jn)this.b;
                final rsm rsm = (rsm)o;
                final String[] g2 = ls9.g1;
                jn.a();
                return;
            }
            case 11: {
                final ks9 ks9 = (ks9)this.b;
                final EditBirthdateContentViewResult editBirthdateContentViewResult = (EditBirthdateContentViewResult)o;
                final int c3 = ks9.c2;
                Objects.requireNonNull(ks9);
                if (editBirthdateContentViewResult instanceof UpdateBirthdateContentViewResult) {
                    final oma extendedProfile = ((UpdateBirthdateContentViewResult)editBirthdateContentViewResult).getExtendedProfile();
                    if (extendedProfile != null) {
                        ks9.p5(ks9.M1 = (oma)((n4j)new oma$a(extendedProfile)).e());
                    }
                }
                else {
                    final oma$a oma$a = new oma$a();
                    oma$a.b = 0;
                    oma$a.c = 0;
                    oma$a.d = 0;
                    ks9.p5(ks9.M1 = (oma)((n4j)new oma$a((oma)((n4j)oma$a).e())).e());
                }
                return;
            }
            case 10: {
                final d9l d9l = (d9l)this.b;
                final u37 u37 = (u37)o;
                final Uri y3 = d9l.Y3;
                Objects.requireNonNull(d9l);
                if (!((orc)u37).T().b) {
                    d9l.a2 = chw.N0(d9l.a2, 1);
                }
                else {
                    final cgv o2 = d9l.O1;
                    if (o2 != null && !o2.M0 && !u37.o1) {
                        d9l.A3.d();
                    }
                }
                return;
            }
            case 9: {
                ucv.g0((ucv)this.b, (pjf$c)o);
                return;
            }
            case 8: {
                final u9 u38 = (u9)this.b;
                final q4h$c q4h$c = (q4h$c)o;
                Objects.requireNonNull(u38);
                if (p0f.o("scribe_api_sample_size", uro.g).b()) {
                    final af4 af4 = new af4();
                    ((u0p)af4).q(new String[] { ":navigation_bar:overflow::click" });
                    cbw.b((elm)af4);
                }
                return;
            }
            case 7: {
                final b48 b2 = (b48)this.b;
                final bo bo2 = (bo)o;
                ((sl1)b2.X0).h1(bo2.a, bo2.b, bo2.c);
                return;
            }
            case 6: {
                ((yba)this.b).e((Object)o);
                return;
            }
            case 5: {
                final CountryListContentViewProvider countryListContentViewProvider = (CountryListContentViewProvider)this.b;
                final bo bo3 = (bo)o;
                Objects.requireNonNull(countryListContentViewProvider);
                if (bo3.a == 1) {
                    if (bo3.b == -1 && countryListContentViewProvider.X0 != null) {
                        final Intent c4 = bo3.c;
                        zdj zdj2;
                        if (c4 == null) {
                            zdj2 = zdj;
                        }
                        else {
                            zdj2 = (zdj)klp.a(c4.getByteArrayExtra("extra_result"), (rlp)zdj.b);
                        }
                        if (zdj2 != null) {
                            if (zdj2.a == 1) {
                                ((u9)countryListContentViewProvider).F0.b((zsm)zy6.D0, (Object)countryListContentViewProvider.X0).a();
                            }
                        }
                    }
                    else {
                        countryListContentViewProvider.X0 = null;
                    }
                }
                return;
            }
            case 4: {
                final QRCodeContentViewProvider qrCodeContentViewProvider = (QRCodeContentViewProvider)this.b;
                final bo bo4 = (bo)o;
                Objects.requireNonNull(qrCodeContentViewProvider);
                if (bo4 != null && bo4.b == -1) {
                    final Intent c5 = bo4.c;
                    if (c5 != null) {
                        qrCodeContentViewProvider.Y4(c5.getData());
                    }
                }
                return;
            }
            case 3: {
                final kcl kcl = (kcl)this.b;
                final rsm rsm2 = (rsm)o;
                ((u9)kcl).F0.c((bn6)ProfilePhotoEditImageSuccess.INSTANCE);
                return;
            }
            case 2: {
                final LoginContentViewProvider loginContentViewProvider = (LoginContentViewProvider)this.b;
                final bo bo5 = (bo)o;
                Objects.requireNonNull(loginContentViewProvider);
                loginContentViewProvider.Y4(bo5.c.getData());
                return;
            }
            case 1: {
                final jpv jpv = (jpv)this.b;
                final tmi tmi3 = (tmi)o;
                ((eus)jpv).d1(2);
                return;
            }
            case 0: {
                final w4 w87 = (w4)this.b;
                final tmi tmi4 = (tmi)o;
                czd.f((Object)w87, "$attachment");
                w87.k();
            }
        }
    }
}
