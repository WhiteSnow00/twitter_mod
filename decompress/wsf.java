import com.twitter.weaver.mvi.MviViewModel;
import java.util.HashMap;
import tv.periscope.android.api.PsRequest;
import java.util.Iterator;
import com.twitter.android.liveevent.landing.carousel.d;
import com.twitter.app.dm.search.page.DMSearchPageViewModel;
import java.util.Collections;
import com.twitter.util.user.UserIdentifier;
import com.twitter.onboarding.ocf.topicselector.b;
import android.content.Context;
import java.util.Collection;
import com.twitter.tweetview.core.ui.birdwatch.BirdwatchIconViewDelegateBinder;
import tv.periscope.android.api.service.payman.pojo.Gift;
import java.util.ArrayList;
import java.util.List;
import tv.periscope.android.api.UnfollowRequest;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wsf implements rtb
{
    public final int F0;
    public final Object G0;
    
    public wsf(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object apply(Object o) {
        final int f0 = this.F0;
        boolean b = true;
        switch (f0) {
            default: {
                final njb njb = (njb)this.G0;
                final String s = (String)o;
                final ojb b2 = njb.b;
                Objects.requireNonNull(b2);
                final UnfollowRequest unfollowRequest = new UnfollowRequest(s);
                ((PsRequest)unfollowRequest).cookie = b2.a.b();
                return t5j.just((Object)unfollowRequest).subscribeOn(b2.c).flatMap((rtb)new jv4((Object)b2, 10)).flatMap((rtb)fkc.R0).observeOn(b2.d);
            }
            case 15: {
                final h2r h2r = (h2r)this.G0;
                final List list = (List)o;
                Objects.requireNonNull(h2r);
                final ArrayList list2 = new ArrayList<String>(list.size());
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(((Gift)iterator.next()).style);
                }
                final dzr k0 = h2r.K0;
                Objects.requireNonNull(k0);
                final t5j map = ((mzr)k0.b).c((List)list2).subscribeOn(jxo.a()).map((rtb)new i89((stb)czr.F0, 10));
                e0e.e((Object)map, "superHeartRepository.get\u2026p { it.superHeartStyles }");
                return map;
            }
            case 14: {
                final j7i j7i = (j7i)this.G0;
                final String s2 = (String)o;
                final String b3 = j7i.b;
                String substring = s2;
                if (b3 != null) {
                    substring = s2.substring(b3.length() + 1);
                }
                return substring;
            }
            case 13: {
                return noj.b(((wbw)o).d((String)this.G0, false));
            }
            case 12: {
                final BirdwatchIconViewDelegateBinder birdwatchIconViewDelegateBinder = (BirdwatchIconViewDelegateBinder)this.G0;
                final xzu xzu = (xzu)o;
                Objects.requireNonNull(birdwatchIconViewDelegateBinder);
                if (xzu.f != null) {
                    final vg3 f2 = xzu.a.F0;
                    if (f2.f1 && f2.h1 == null && ita.b().b("birdwatch_consumption_enabled", false)) {
                        return b;
                    }
                }
                b = false;
                return b;
            }
            case 11: {
                return ((c5c)this.G0).a((List)o);
            }
            case 10: {
                final jfo jfo = (jfo)this.G0;
                final Throwable t = (Throwable)o;
                e0e.f((Object)jfo, "this$0");
                e0e.f((Object)t, "it");
                jfo.l.accept((Object)lol.c.a);
                return kni.a;
            }
            case 9: {
                return ((tnm<List, Object, osc>)((d4k)this.G0).K0).S(ojf.u((Iterable)o)).P();
            }
            case 8: {
                final Context context = (Context)this.G0;
                final Boolean b4 = (Boolean)o;
                String string;
                if (!b4) {
                    string = context.getString(2131954194);
                }
                else {
                    string = null;
                }
                return new xlw$a(false, (boolean)b4, string);
            }
            case 7: {
                final b b5 = (b)this.G0;
                final List list3 = (List)o;
                final luh$a a = b5.a;
                final nuh$a n = b5.n;
                final bgt p = b5.p;
                final ojf h = ojf.H();
                if (p != null) {
                    h.p((Object)p);
                }
                if (!kr4.t((Collection)a)) {
                    final Iterator iterator2 = ((List)a).iterator();
                    while (iterator2.hasNext()) {
                        final ult ult = ((HashMap<K, ult>)n).get(iterator2.next());
                        if (ult != null) {
                            h.p((Object)new n2u(ult, 0));
                        }
                    }
                }
                return new b.b((List<ort>)((z4j)h).e());
            }
            case 6: {
                final z94 z94 = (z94)this.G0;
                final zvj zvj = (zvj)o;
                Objects.requireNonNull(z94);
                o = ((z2j)zvj).a;
                vmw.g(o);
                List e;
                if (((String)o).isEmpty()) {
                    o = ((z2j)zvj).b;
                    vmw.g(o);
                    e = (List)o;
                }
                else {
                    o = ((z2j)zvj).a;
                    vmw.g(o);
                    e = kr4.e((Iterable)kr4.c(z94.h, (lub)scf.B), (nuk)new izw((String)o, 1));
                }
                return e;
            }
            case 5: {
                return new zvj((Object)this.G0, (Object)o);
            }
            case 4: {
                final uu8 uu8 = (uu8)this.G0;
                final zvj zvj2 = (zvj)o;
                final li a2 = uu8.a;
                final Object b6 = ((z2j)zvj2).b;
                vmw.g(b6);
                final UserIdentifier userIdentifier = (UserIdentifier)b6;
                final Object a3 = ((z2j)zvj2).a;
                vmw.g(a3);
                return ((bbq)new hcq((idq)a2.b.a(userIdentifier), (rtb)new ki(a2, userIdentifier, (String)a3))).P();
            }
            case 3: {
                final m5b m5b = (m5b)this.G0;
                e0e.f((Object)m5b, "this$0");
                e0e.f(o, "it");
                final bbq<Object> s3 = ((rbq<a6b, Object>)m5b.b).S((a6b)o);
                final mr0 mr0 = new mr0((stb)new p5b(m5b), 16);
                Objects.requireNonNull(s3);
                return new hcq((idq)s3, (rtb)mr0);
            }
            case 2: {
                final eas eas = (eas)this.G0;
                final noj noj = (noj)o;
                Objects.requireNonNull(eas);
                List<Object> emptyList;
                if (noj.f()) {
                    emptyList = (List)noj.c();
                }
                else {
                    emptyList = Collections.emptyList();
                }
                final List d = eas.d((List)emptyList);
                noj noj2;
                if (noj.e()) {
                    noj2 = noj.b;
                    final int a4 = o5j.a;
                }
                else {
                    noj2 = noj.b((Object)d);
                }
                return noj2;
            }
            case 1: {
                final DMSearchPageViewModel dmSearchPageViewModel = (DMSearchPageViewModel)this.G0;
                final Throwable t2 = (Throwable)o;
                e0e.f((Object)dmSearchPageViewModel, "this$0");
                e0e.f((Object)t2, "it");
                final e08$e a5 = e08$e.a;
                final ape[] c1 = DMSearchPageViewModel.c1;
                ((MviViewModel)dmSearchPageViewModel).V((Object)a5);
                return ws7$b.a;
            }
            case 0: {
                final d d2 = (d)this.G0;
                final mm3 mm3 = (mm3)o;
                final s4e s4e = (s4e)d2.N0.get();
                e0e.f((Object)mm3, "carouselItem");
                e0e.f((Object)s4e, "collectionProvider");
                final p4e f3 = s4e.f();
                e0e.e((Object)f3, "collectionProvider.items");
                return new fba(mm3, f3, false, false, false, false);
            }
        }
    }
}
